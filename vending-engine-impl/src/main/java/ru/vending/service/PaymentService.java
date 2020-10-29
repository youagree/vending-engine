package ru.vending.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vending.api.ComportInterfaceIntegration;

@Service
public class PaymentService {

    private ComportInterfaceIntegration comportInterfaceIntegration;
    private int currentMoneyCount;
    private String status;

    @Autowired
    public PaymentService(ComportInterfaceIntegration comportInterfaceIntegration) {
        this.comportInterfaceIntegration = comportInterfaceIntegration;
    }

    public String paymentComportMoneyListenerWithCashPayment() {
        try {
            status = comportInterfaceIntegration.kitBoxWaiting();
            currentMoneyCount += Integer.parseInt(status);
        } catch (NumberFormatException e) {
            return String.valueOf(currentMoneyCount);
        }

        return String.valueOf(currentMoneyCount);
    }

    public String paymentComportMoneyListenerWithCashlessPayment(Integer price) {
        if (currentMoneyCount < price) {
            status = comportInterfaceIntegration.kitBoxWaiting();
            currentMoneyCount += Integer.parseInt(status);
        } else {
            status = comportInterfaceIntegration.kitBoxWaiting();
            return status;
        }

        return String.valueOf(currentMoneyCount);
    }

    public String getStatusOfCurrentOperation() {
        return status;
    }

    public void reset() {
        currentMoneyCount = 0;
        status = null;
    }
}
