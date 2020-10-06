package ru.vending.dto;

import lombok.Data;

@Data
public class AuthDto {

    private Integer companyId;
    private Long requestId;
    private String userLogin;
    private String sign;
}
