package ru.vending.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AuthDtoWrapperWithId {

    @JsonProperty(value = "Auth")
    private AuthDto auth;

    @JsonProperty(value = "Id")
    private Long id;
}
