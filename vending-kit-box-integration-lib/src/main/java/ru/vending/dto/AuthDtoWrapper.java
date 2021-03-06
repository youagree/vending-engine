package ru.vending.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import ru.vending.component.Auth;

@Data
@Accessors(chain = true)
public class AuthDtoWrapper {
    @JsonProperty(value = "Auth")
    private AuthDto auth;
}
