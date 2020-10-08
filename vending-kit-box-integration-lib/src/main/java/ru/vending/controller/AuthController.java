package ru.vending.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.vending.dto.AuthDtoWrapper;
import ru.vending.service.AuthService;

@Service
public class AuthController {

//    private RestTemplate restTemplate;
//
//    @Autowired
//    public void setRestTemplate(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

    private AuthService authService;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    // TODO Настроить работу запросов через RestTemplate, попробовать поработать с списком продуктов или матрицей товаров.

//    public AuthDtoWrapper getAuthDto() {
//        String url = "http://localhost:8080/ui/vending/categories/test";
//
//        HttpEntity<AuthDtoWrapper> entity = new HttpEntity<AuthDtoWrapper>(null, null);
//        ResponseEntity<AuthDtoWrapper> response = restTemplate
//                .exchange(url, HttpMethod.GET, entity, AuthDtoWrapper.class);
//
//        return response.getBody();
//    }
}
