package ru.vending.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.vending.dto.AuthDtoWrapper;
import ru.vending.dto.AuthDtoWrapperWithId;
import ru.vending.dto.response.GetGoodsMatricesDto;
import ru.vending.dto.response.GetModemsDto;

import java.net.URI;

@Component
public class RestTemplateUtil {
    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;

    @Autowired
    public RestTemplateUtil(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @SneakyThrows
    public ResponseEntity<GetModemsDto> getModemsDtoResponse(AuthDtoWrapper body) {
        HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(body));
        return restTemplate.postForEntity(new URI(UrlConstant.GET_MODEMS_DTO_RESPONSE_URL), entity, GetModemsDto.class);
    }

    @SneakyThrows
    public ResponseEntity<GetGoodsMatricesDto> getGoodsMatricesDtoResponse (AuthDtoWrapper body) {
        HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(body));
        return restTemplate.postForEntity(new URI(UrlConstant.GET_GOODS_MATRICES_DTO_URL), entity, GetGoodsMatricesDto.class);
    }

    @SneakyThrows
    public ResponseEntity<GetGoodsMatricesDto> getGoodsMatricesDtoResponseById (AuthDtoWrapperWithId body) {
        HttpEntity<String> entity = new HttpEntity<>(objectMapper.writeValueAsString(body));
        return restTemplate.postForEntity(new URI(UrlConstant.GET_GOODS_MATRIX_DTO_BY_ID_URL), entity, GetGoodsMatricesDto.class);
    }



}
