package ru.vending.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Auth {
    private Integer companyId;
    private Long requestId;
    private String userLogin;
    private String sign;

}