package ru.netology.rest;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
class PostmanEcho {
    @Test
    void Test() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("некоторые данные") // отправляемые данные (заголовки и query можно выставлять аналогично)
                 // Выполняемые действия
                .when()
                .post("/post")
                 // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("некоторые данные"));
    }
}