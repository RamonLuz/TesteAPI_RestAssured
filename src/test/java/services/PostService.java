package services;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class PostService {

    public Response getPost(int id) {
        return given()
                .log().all()
        .when()
                .get("/posts/" + id);
    }
}