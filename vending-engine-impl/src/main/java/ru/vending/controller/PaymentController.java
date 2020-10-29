package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.vending.dto.ProductDto;
import ru.vending.entity.Product;
import ru.vending.repository.ProductRepository;
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
    public void sendIdAndPaymentTypeOnPaymentModule (@PathVariable Long id, @RequestParam String paymentType) {
        productService.sendIdAndPaymentType(id, paymentType);
    }

    @GetMapping("/{id}/payStatus")
    public String getCurrentMoneyOnPaymentModule (@RequestParam Integer price) {
        return paymentService.paymentComportMoneyListenerWithCashlessPayment(price);
    }

    @GetMapping("/{id}/status")
    public String getTransactionStatus () {
        return paymentService.getStatusOfCurrentOperation();
    }
}
