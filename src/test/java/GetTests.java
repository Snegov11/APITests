import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.example.CreatedSuccess;
import static io.restassured.RestAssured.given;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

public class GetTests {

    @ParameterizedTest
    @ValueSource(strings = { "1", "45", "100" })
    @Story(value = "Параметризированные проверки сценариев метода Get")
    @Description(value = "Проверка ответов со статусом кода 200 ОК")
    public void PositiveGetTest(String url) {
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecOK200());
        CreatedSuccess createdSuccess = given()
                .when()
                .get("posts/" + url)
                .then().log().body()
                .statusCode(200)
                .extract().as(CreatedSuccess.class);
        UtilsAsserts.checkBodyAfterGet(createdSuccess, url);
    }

    @ParameterizedTest
    @ArgumentsSource(GetDataProvider.class)
    @Story(value = "Параметризированные проверки сценариев метода Get")
    @Description(value = "Проверка ответов со статусом кода 404 Not Found")
    public void GetTest404(String url) throws IllegalAccessException {
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecNotFound404());
        CreatedSuccess createdSuccess = given()
                .when()
                .get("posts/" + url)
                .then().log().all()
                .statusCode(404)
                .extract().as(CreatedSuccess.class);
        UtilsAsserts.checkBodyIsNull(createdSuccess);
    }
}