import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {

    public static RequestSpecification requestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri("https://jsonplaceholder.typicode.com/")
                .setContentType(ContentType.JSON.withCharset("UTF-8"))
                .build();
    }

    public static ResponseSpecification responseSpecCreated201() {
        return new ResponseSpecBuilder()
                .expectStatusCode(201)
                .build();
    }

    public static ResponseSpecification responseSpecOK200() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    public static ResponseSpecification responseSpecNotFound404() {
        return new ResponseSpecBuilder()
                .expectStatusCode(404)
                .build();
    }

    public static ResponseSpecification responseSpecInternalServerError500() {
        return new ResponseSpecBuilder()
                .expectStatusCode(500)
                .build();
    }

    @Step("Устанавливаем специафикацию для request и response - {response}")
    public static void initSpec(RequestSpecification request, ResponseSpecification response) {
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }
}
