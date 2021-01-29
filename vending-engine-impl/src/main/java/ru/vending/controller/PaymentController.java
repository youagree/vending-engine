package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.vending.dto.CanDispenseDto;
import ru.vending.dto.CurrentMoneyCountDto;
import ru.vending.dto.PayStatusResponse;
import ru.vending.dto.PaymentCancelStatus;
import ru.vending.service.PaymentService;
import ru.vending.service.ProductService;

@RestController
@RequestMapping(path = "ui/vending/payment")
public class PaymentController {

    private PaymentService paymentService;
    private ProductService productService;

    @Autowired
    public PaymentController(PaymentService paymentService, ProductService productService) {
        this.paymentService = paymentService;
        this.productService = productService;
    }

    @GetMapping("/dispense/tubes")
    @ResponseStatus(HttpStatus.OK)
    public Integer getChannelsCashSum() {
        return paymentService.getChannelsSum();
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void sendIdAndPaymentTypeOnPaymentModule (@PathVariable Long id, @RequestBody String payMethod) {
        paymentService.reset();
        productService.sendIdAndPaymentType(id, payMethod);
    }

    @GetMapping("/{id}/payStatus")
    @ResponseStatus(HttpStatus.OK)
    public PayStatusResponse getCurrentMoneyOnPaymentModule (@PathVariable Long id) {
        return paymentService.paymentComportMoneyListenerWithCashlessPayment(id);
    }

    @GetMapping("/{id}/status")
    @ResponseStatus(HttpStatus.OK)
    public PayStatusResponse getTransactionStatus(@PathVariable Long id) {
        return paymentService.getStatusOfCurrentOperation();
    }

    @PostMapping("/paymentCancel")
    @ResponseStatus(HttpStatus.OK)
    public PaymentCancelStatus paymentCancel(@RequestBody CurrentMoneyCountDto currentMoneyCount) {
        return new PaymentCancelStatus().
                setPaymentCancelStatus(paymentService.paymentCancel(currentMoneyCount.getCurrentMoneyCount().toString()));
    }

    @GetMapping("/dispense/canDispense")
    @ResponseStatus(HttpStatus.OK)
    public CanDispenseDto paymentCancel() {
        return paymentService.canCashOperation();
    }

    @GetMapping("/tubesStatus")
    @ResponseStatus(HttpStatus.OK)
    public Integer tubesStatus() {
        return paymentService.getChannelsSum();
    }

    @PostMapping("/dispense/{dispenseValue}")
    @ResponseStatus(HttpStatus.OK)
    public String dispenseCash(@PathVariable Integer dispenseValue) {
        return paymentService.dispenseCash(dispenseValue);
    }
}
