package se.kry.demo.quarkus.producer.web;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class FraudCheckResourceTest {

  @Test
  void testFraudcheckEndpoint() {
    given()
        .when().put("/fraudcheck")
        .then()
        .statusCode(200)
        .body(is("{\"fraudCheckStatus\":\"FRAUD\",\"rejection\":\"Amount too high\"}"));
  }
}
