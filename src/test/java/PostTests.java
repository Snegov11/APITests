import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.example.CreatedSuccess;
import org.example.PostData;
import org.example.Specification;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;


@RunWith(DataProviderRunner.class)
public class PostTests extends TestData {

    public static Integer ID = 101;

    @Test
    @UseDataProvider("PositivePostTestData")
    public void PositivePostTest(PostData postData) {
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecCreated201());
        CreatedSuccess createdSuccess = given()
                .body(postData)
                .when()
                .post("posts")
                .then().log().body()
                .statusCode(201)
                .extract().as(CreatedSuccess.class);
        Assertions.assertAll(
                "Checking the response body",
                () -> Assert.assertEquals(ID, createdSuccess.getId()),
                () -> Assert.assertEquals(postData.getUserID(), createdSuccess.getUserID()),
                () -> Assert.assertEquals(postData.getBody(), createdSuccess.getBody()),
                () -> Assert.assertEquals(postData.getTitle(), createdSuccess.getTitle())
        );
    }

    @Test
    @UseDataProvider("PostTestData500")
    public void PostTest500(PostData postData) {
        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecInternalServerError500());
        CreatedSuccess createdSuccess = given()
                .body(postData)
                .when()
                .post("posts")
                .then().log().body()
                .statusCode(500)
                .extract().as(CreatedSuccess.class);
        Assertions.assertAll(
                "Checking the response body",
                () -> Assert.assertEquals(ID, createdSuccess.getId()),
                () -> Assert.assertEquals(postData.getUserID(), createdSuccess.getUserID()),
                () -> Assert.assertEquals(postData.getBody(), createdSuccess.getBody()),
                () -> Assert.assertEquals(postData.getTitle(), createdSuccess.getTitle())
        );
    }


}
