package ru.netology.postman;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostman {

    @Test
    void shouldTestPostman() {

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Привет,Андрей!")
            .when()
                .post("/post")
            .then()
                .statusCode(200)
                .body("data", equalTo("Привет, Андрей!"));
    }
}