package ru.vending.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.vending.dto.AuthDtoWrapper;
import ru.vending.dto.CategoryDto;
import ru.vending.dto.response.GetGoodsMatricesDto;
import ru.vending.dto.response.GetModemsDto;
import ru.vending.service.AuthService;
import ru.vending.service.CategoriesService;
import ru.vending.util.RestTemplateUtil;

import java.util.List;

@RestController
@RequestMapping(path = "ui/vending/categories")
public class CategoriesController {

    private final CategoriesService categoriesService;
    private final AuthService authService;
    private RestTemplate restTemplate;
    private ObjectMapper objectMapper;
    private RestTemplateUtil restTemplateUtil;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Autowired
    public CategoriesController(CategoriesService categoriesService, AuthService authService, ObjectMapper objectMapper, RestTemplateUtil restTemplateUtil) {
        this.categoriesService = categoriesService;
        this.authService = authService;
        this.objectMapper = objectMapper;
        this.restTemplateUtil = restTemplateUtil;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        // TODO получать все категории из текущей матрицы продуктов
        return ResponseEntity.ok(categoriesService.getCategories());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable Long id) {
        // TODO Получать определенную категорию из списка категорий по идентификатору
        return ResponseEntity.ok(categoriesService.getCategoryById(id));
    }

    @GetMapping("/test")
    public ResponseEntity<AuthDtoWrapper> getAuthDto() {
        // TODO Перенести в модуль работы с Kit-Box или создать отдельный контроллер для запросов
        return ResponseEntity.ok(authService.getAuthDto());
    }

    @GetMapping("/1")
    @SneakyThrows
    public void getKitBoxModems() {
        ResponseEntity<GetModemsDto> exchange = restTemplateUtil.getModemsDtoResponse(authService.getAuthDto());

        System.out.println();
        System.out.println(exchange.getBody());
        System.out.println(exchange.getStatusCode().toString());
    }

    @GetMapping("/getGoodsMatrices")
    @SneakyThrows
    public void getGoodMatrices() {
        ResponseEntity<GetGoodsMatricesDto> exchange = restTemplateUtil
                .getGoodsMatricesDtoResponse(authService.getAuthDto());
        System.out.println();
        System.out.println(exchange.getBody());
        System.out.println(exchange.getStatusCode().toString());
    }

    @GetMapping("/getGoodsMatrixById")
    @SneakyThrows
    public void getGoodMatrixById() {
        ResponseEntity<GetGoodsMatricesDto> exchange = restTemplateUtil
                .getGoodsMatricesDtoResponseById(authService.getAuthDtoWithId((long) 18570));
        System.out.println();
        System.out.println(exchange.getBody());
        System.out.println(exchange.getStatusCode().toString());
    }
}
