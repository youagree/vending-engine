package ru.vending.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.vending.api.ComportInterfaceIntegration;

@Slf4j
@Service
public class PaymentService {

    private ComportInterfaceIntegration comportInterfaceIntegration;
    private int currentMoneyCount;
    private String status;

    @Autowired
    public PaymentService(ComportInterfaceIntegration comportInterfaceIntegration) {
        this.comportInterfaceIntegration = comportInterfaceIntegration;
    }

    @Transactional
    public String paymentComportMoneyListenerWithCashlessPayment(Integer price) {
        if (currentMoneyCount < price) {
            status = comportInterfaceIntegration.kitBoxWaiting();
            currentMoneyCount += Integer.parseInt(status);
            log.info("Current money count has been incremented on {}", status);
        } else {
            status = comportInterfaceIntegration.kitBoxWaiting();
            log.info("Return status: {}", status);
            return status;
        }

        log.info("Return current money count: {}", currentMoneyCount);
        return String.valueOf(currentMoneyCount);
    }

    public void paymentCancel () {
        comportInterfaceIntegration.paymentCancel();
        log.info("Payment cancel completed!");
    }

    public String getStatusOfCurrentOperation() {
        return status;
    }

    public void reset() {
        currentMoneyCount = 0;
        status = null;
        log.info("Counter and status reset!");
    }
}
