package BaseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseURL {
    public static RequestSpecification spec;
    static {



        spec=new RequestSpecBuilder().setBaseUri("https://catfact.ninja").setContentType("application/json")
                .build();


     }
}
