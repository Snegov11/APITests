import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.example.*;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class PostTests {

    public static Integer ID = 101;

    @ParameterizedTest
    @ArgumentsSource(PostDataProvider.class)
    @Story(value = "Параметризированные проверки сценариев метода Post")
    @Description(value = "Проверка ответов со статусом кода 201 Created")
    public void PositiveTest(PostData postData) {
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecCreated201());
        CreatedSuccess createdSuccess = given()
                .body(postData)
                .when()
                .post("posts")
                .then().log().body()
                .statusCode(201)
                .extract().as(CreatedSuccess.class);
        UtilsAsserts.checkBodyAfterPost(createdSuccess, ID, postData);
    }

    @Test
    @Story(value = "Параметризированные проверки сценариев метода Post")
    @Description(value = "Проверка ответов со статусом кода 201 Created, в request отправляем только поле UserId")
    public void OnlyUserIdFieldTest() {
        UserIdData userIdData = new UserIdData(12);
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecCreated201());
        CreatedSuccess createdSuccess = given()
                .body(userIdData)
                .when()
                .post("posts")
                .then().log().body()
                .statusCode(201)
                .extract().as(CreatedSuccess.class);
        Assertions.assertAll(
                "Checking the response body",
                () -> UtilsAsserts.checkTitleFieldIsNull(createdSuccess),
                () -> UtilsAsserts.checkBodyFieldIsNull(createdSuccess),
                () -> UtilsAsserts.checkId(createdSuccess, ID),
                () -> UtilsAsserts.checkUserId(userIdData, createdSuccess)
        );
    }

    @Test
    @Story(value = "Параметризированные проверки сценариев метода Post")
    @Description(value = "Проверка ответов со статусом кода 201 Created, в request отправляем только поле Body")
    public void OnlyBodyFieldTest() {
        BodyData bodyData = new BodyData("test");
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecCreated201());
        CreatedSuccess createdSuccess = given()
                .body(bodyData)
                .when()
                .post("posts")
                .then().log().body()
                .statusCode(201)
                .extract().as(CreatedSuccess.class);
        Assertions.assertAll(
                "Checking the response body",
                () -> UtilsAsserts.checkTitleFieldIsNull(createdSuccess),
                () -> UtilsAsserts.checkUserIdFieldIsNull(createdSuccess),
                () -> UtilsAsserts.checkId(createdSuccess, ID),
                () -> UtilsAsserts.checkBody(bodyData, createdSuccess)
        );
    }

    @Test
    @Story(value = "Параметризированные проверки сценариев метода Post")
    @Description(value = "Проверка ответов со статусом кода 201 Created, в request отправляем только поле Title")
    public void OnlyTitleFieldTest() {
        TitleData titleData = new TitleData("test");
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecCreated201());
        CreatedSuccess createdSuccess = given()
                .body(titleData)
                .when()
                .post("posts")
                .then().log().body()
                .statusCode(201)
                .extract().as(CreatedSuccess.class);
        Assertions.assertAll(
                "Checking the response body",
                () -> UtilsAsserts.checkBodyFieldIsNull(createdSuccess),
                () -> UtilsAsserts.checkUserIdFieldIsNull(createdSuccess),
                () -> UtilsAsserts.checkId(createdSuccess, ID),
                () -> UtilsAsserts.checkTitle(titleData, createdSuccess)
        );
    }

}
