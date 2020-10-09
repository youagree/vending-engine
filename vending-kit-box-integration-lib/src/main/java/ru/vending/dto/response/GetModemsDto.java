package ru.vending.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetModemsDto {

    @JsonProperty(value = "ResultCode")
    private int resultCode;

    @JsonProperty(value = "Modems")
    private List<ModemDto> modems;
}
