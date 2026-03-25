package services;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetService {
	public Response getGet(int id) {
        return given()
                .log().all()
        .when()
                .get("/users/" + id);
    }
}
