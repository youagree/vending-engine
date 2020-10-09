package ru.vending.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class GoodsMatricesDto {

    @JsonProperty(value = "Details")
    private List<MatrixDetailsDto> details;

    @JsonProperty(value = "MatrixId")
    private Long matrixId;

    @JsonProperty(value = "MatrixName")
    private String matrixName;

    @JsonProperty(value = "MatrixType")
    private Integer matrixType;



}
