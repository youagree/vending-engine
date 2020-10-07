package ru.vending.dto;

import lombok.Data;
import ru.vending.component.Auth;

@Data
public class AuthDtoWrapper {
    private Auth auth;
}
