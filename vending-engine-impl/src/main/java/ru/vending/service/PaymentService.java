package ru.vending.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cash.control.client.CashControlClientInterface;
import ru.vending.api.ComportInterfaceIntegration;
import ru.vending.dto.CanDispenseDto;
import ru.vending.dto.PayStatusResponse;
import ru.vending.entity.Product;
import ru.vending.repository.ProductRepository;

import javax.persistence.EntityNotFoundException;

import static java.lang.String.valueOf;

@Slf4j
@Service
public class PaymentService {

    private ProductRepository productRepository;
    private ComportInterfaceIntegration comportInterfaceIntegration;
    private CashControlClientInterface cashControlClientInterface;
    private int currentMoneyCount;
    private String status;

    @Autowired
    public PaymentService(ProductRepository productRepository, ComportInterfaceIntegration comportInterfaceIntegration,
                          CashControlClientInterface cashControlClientInterface) {
        this.productRepository = productRepository;
        this.comportInterfaceIntegration = comportInterfaceIntegration;
        this.cashControlClientInterface = cashControlClientInterface;
    }

    @Transactional
    public PayStatusResponse paymentComportMoneyListenerWithCashlessPayment(Long id) {
        Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        log.info("Product price: {}", product.getPrice());
        currentMoneyCount = cashControlClientInterface.getStatus();
        String status = null;
        if (currentMoneyCount >= product.getPrice()) {
            status = "s";
        }
        return new PayStatusResponse().setCurrentMoney(valueOf(currentMoneyCount))
                .setPaymentStatus(status);
    }

    public String paymentCancel(String currentMoney) {
        if (cashControlClientInterface.paymentCancel(Integer.parseInt(currentMoney))) {
            log.info("Payment cancel completed!");
            return "Payment cancel completed!";
        }
        return "Error! Payment not canceled!";
    }

    public PayStatusResponse getStatusOfCurrentOperation() {
        return new PayStatusResponse().setPaymentStatus(status).setCurrentMoney(null);
    }

    public CanDispenseDto canCashOperation() {
        return new CanDispenseDto().setCanDispense(cashControlClientInterface.canDispenseCoins());
    }

    public void reset() {
        currentMoneyCount = 0;
        status = null;
        log.info("Counter and status reset!");
    }

    public Integer getChannelsSum() {
        return cashControlClientInterface.getTubesStatus();
    }

    public String dispenseCash(Integer dispenseValue) {
        return cashControlClientInterface.dispence(dispenseValue);
    }
}
