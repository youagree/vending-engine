package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void sendIdAndPaymentTypeOnPaymentModule (@PathVariable Long id, @RequestParam String paymentType) {
        paymentService.reset();
        productService.sendIdAndPaymentType(id, paymentType);
    }

    @GetMapping("/{id}/payStatus")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentMoneyOnPaymentModule (@RequestParam Integer price) {
        return paymentService.paymentComportMoneyListenerWithCashlessPayment(price);
    }

    @GetMapping("/{id}/status")
    @ResponseStatus(HttpStatus.OK)
    public String getTransactionStatus(@PathVariable Long id) {
        return paymentService.getStatusOfCurrentOperation();
    }

    @GetMapping("/paymentCancel")
    @ResponseStatus(HttpStatus.OK)
    public void paymentCancel() {
        paymentService.paymentCancel();
    }
}
