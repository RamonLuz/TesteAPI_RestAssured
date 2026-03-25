package utils;

import io.restassured.RestAssured;

public class BaseTest {

    public static void setup() {
        RestAssured.baseURI = ConfigReader.get("base.url");
    }
}