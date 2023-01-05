import io.qameta.allure.Story;
import org.example.CreatedSuccess;
import org.example.Specification;
import static io.restassured.RestAssured.given;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

public class GetTests {

    @ParameterizedTest
    @ValueSource(strings = { "1", "45", "100" })
    @Story("Параметризированные проверки позитивных сценариев метода Get")
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
    @Story("Расширенные параметризированные проверки сценариев метода Get на ответ с кодом 404")
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