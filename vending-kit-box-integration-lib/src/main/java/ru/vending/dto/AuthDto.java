package ru.vending.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AuthDto {
    private Integer companyId;
    private Long requestId;
    private String userLogin;
    private String sign;
}
