package ru.vending.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MatrixDetailsDto {

    @JsonProperty(value = "ChoiceNumber")
    private String choiceNumber;

    @JsonProperty(value = "DetailId")
    private Long detailId;

    @JsonProperty(value = "FormulationId")
    private Long formulationId;

    @JsonProperty(value = "GoodsName")
    private String goodsName;

    @JsonProperty(value = "LineNumber")
    private Integer lineNumber;

    @JsonProperty(value = "MaxCount")
    private Integer maxCount;

    @JsonProperty(value = "Price")
    private Double price;

    @JsonProperty(value = "Price2")
    private Double price2;

    @JsonProperty(value = "Price3")
    private Double price3;

    @JsonProperty(value = "Price4")
    private Double price4;

    @JsonProperty(value = "TaxType")
    private String taxType;
}
