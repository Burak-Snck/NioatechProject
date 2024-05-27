package StepDefinitions;

import BaseUrl.BaseURL;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

import java.util.logging.Logger;

import static io.restassured.RestAssured.given;

public class StepDefinitions {

    Response response;
    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(StepDefinitions.class);


    @Test
    public void test() {
        RequestSpecification spec = BaseURL.spec;

        Response response = RestAssured.given(spec)
                .when()
                .get();
        logger.info("Go to URL: https://catfact.ninja");
        String jsonResponse = response.asString();
        System.out.println(jsonResponse);
    }
    public void user_assert_that_status_code(){

        response.then().assertThat().statusCode(200);
        logger.info("Status code 200 Test passed");


    }






}