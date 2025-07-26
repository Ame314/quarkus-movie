package org.ame.movie;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class MovieResourceTest {

    @Test
    public void testGetAllMoviesEndpoint() {
        given()
          .when().get("/movies")
          .then()
             .statusCode(200);
    }
}