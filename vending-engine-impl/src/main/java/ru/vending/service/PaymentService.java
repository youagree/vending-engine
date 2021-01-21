package ru.vending.service;

import static java.lang.String.valueOf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cash.control.client.CashControlClientInterface;
import ru.vending.api.ComportInterfaceIntegration;
import ru.vending.dto.CanDispenseDto;
import ru.vending.dto.PayStatusResponse;

@Slf4j
@Service
public class PaymentService {

    private ComportInterfaceIntegration comportInterfaceIntegration;
    private CashControlClientInterface cashControlClientInterface;
    private int currentMoneyCount;
    private String status;

    @Autowired
    public PaymentService(ComportInterfaceIntegration comportInterfaceIntegration,
                          CashControlClientInterface cashControlClientInterface) {
        this.comportInterfaceIntegration = comportInterfaceIntegration;
        this.cashControlClientInterface = cashControlClientInterface;
    }

    @Transactional
    public PayStatusResponse paymentComportMoneyListenerWithCashlessPayment(Integer price) {
        log.info("Product price: {}", price);
        if (currentMoneyCount < price) {
            status = comportInterfaceIntegration.kitBoxWaiting();
            currentMoneyCount += Integer.parseInt(status);
            log.info("Current money count has been incremented on {}", status);
        } else {
            status = comportInterfaceIntegration.kitBoxWaiting();
            log.info("Return status: {}", status);
            return new PayStatusResponse().setPaymentStatus(status).setCurrentMoney(String.valueOf(currentMoneyCount));
        }

        log.info("Return current money count: {}", currentMoneyCount);
        return new PayStatusResponse().setCurrentMoney(valueOf(currentMoneyCount))
                                      .setPaymentStatus(null);
    }

    public void paymentCancel (String currentMoney) {
        comportInterfaceIntegration.paymentCancel(currentMoney);
        log.info("Payment cancel completed!");
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
}
