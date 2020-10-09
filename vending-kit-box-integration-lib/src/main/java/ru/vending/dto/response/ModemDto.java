package ru.vending.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ModemDto {

    @JsonProperty(value = "CompanyId")
    private Long companyId;

    @JsonProperty(value = "ModemType")
    private Integer modemType;

    @JsonProperty(value = "SerialNumber")
    private String serialNumber;

    @JsonProperty(value = "VendingMachineId")
    private Long vendingMachineId;
}
