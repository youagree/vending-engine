package ru.vending.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GetGoodsMatricesDto {

    @JsonProperty(value = "ResultCode")
    private int resultCode;

    @JsonProperty(value = "GoodsMatrices")
    private List<GoodsMatricesDto> goodsMatrices;
}
