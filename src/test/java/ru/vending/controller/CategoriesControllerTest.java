package ru.vending.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ru.vending.dto.CategoryDto;
import ru.vending.entity.Category;
import ru.vending.entity.Product;
import ru.vending.mapper.CategoryMapper;
import ru.vending.service.CategoriesService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CategoriesController.class)
class CategoriesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CategoriesService categoriesService;

    @MockBean
    private CategoryMapper categoryMapper;

    @Test
    void getAllCategories() throws Exception {
        Category mockCategory1 = new Category();
        mockCategory1.setId(1L);
        mockCategory1.setName("drinks");
        mockCategory1.setImage("C:\\Users\\user\\Desktop\\category1.jpg");
        mockCategory1.setProducts(Arrays.asList(
                new Product(
                        1L,
                        mockCategory1,
                        "water",
                        "mineral water",
                        50,
                        "C:\\Users\\user\\Desktop\\product1.jpg",
                        5),
                new Product(
                        2L,
                        mockCategory1,
                        "coca-cola",
                        "carbonated drink",
                        55,
                        "C:\\Users\\user\\Desktop\\product2.jpg",
                        2)));

        Category mockCategory2 = new Category();
        mockCategory2.setId(1L);
        mockCategory2.setName("chocolate");
        mockCategory2.setImage("C:\\Users\\user\\Desktop\\category2.jpg");
        mockCategory1.setProducts(Arrays.asList(
                new Product(
                        3L,
                        mockCategory2,
                        "ritter sport",
                        "chocolate bar",
                        110,
                        "C:\\Users\\user\\Desktop\\product3.jpg",
                        15),
                new Product(
                        4L,
                        mockCategory2,
                        "mars minis",
                        "chocolate candies",
                        40,
                        "C:\\Users\\user\\Desktop\\product4.jpg",
                        3)));

        List<CategoryDto> categoriesDto = new ArrayList<>();
        categoriesDto.add(categoryMapper.map(mockCategory1));
        categoriesDto.add(categoryMapper.map(mockCategory2));

        Mockito.when(categoriesService.getCategories()).thenReturn(categoriesDto);

        String URI = "/ui/vending/categories";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        String expectedJson = mapToJson(categoriesDto);
        String outputInJson = result.getResponse().getContentAsString();
        assertThat(outputInJson).isEqualTo(expectedJson);
    }

    @Test
    void getCategory() {

    }

    private String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}