package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void sendIdAndPaymentTypeOnPaymentModule (@PathVariable Long id, @RequestParam String paymentType) {
        paymentService.reset();
        productService.sendIdAndPaymentType(id, paymentType);
    }

    @GetMapping("/{id}/payStatus")
    @ResponseStatus(HttpStatus.OK)
    public PayStatusResponse getCurrentMoneyOnPaymentModule (@RequestParam Integer price) {
        return paymentService.paymentComportMoneyListenerWithCashlessPayment(price);
    }

    @GetMapping("/{id}/status")
    @ResponseStatus(HttpStatus.OK)
    public PayStatusResponse getTransactionStatus(@PathVariable Long id) {
        return paymentService.getStatusOfCurrentOperation();
    }

    @GetMapping("/paymentCancel")
    @ResponseStatus(HttpStatus.OK)
    public PaymentCancelStatus paymentCancel(@RequestParam String currentMoneyCount) {
        paymentService.paymentCancel(currentMoneyCount);
        return new PaymentCancelStatus().setPaymentCancelStatus("payment canceled");
    }
}
