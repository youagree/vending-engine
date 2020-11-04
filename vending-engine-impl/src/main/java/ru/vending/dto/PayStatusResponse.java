package ru.vending.dto;

import lombok.Data;

@Data
public class PayStatusResponse {
    private String currentMoney;
    private String paymentStatus;
}
