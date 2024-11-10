package ru.netology.rest;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class EchoTest {
   @Test
    void shouleReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Ciao")
                .when().log().all()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data",org.hamcrest.Matchers.equalTo("Ciao"));
    }
}