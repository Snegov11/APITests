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
public class GetTests extends TestData {

    @Test
    @UseDataProvider("PositiveGetTestData")
    public void PositiveGetTest(String url, Integer iD) {

        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecOK200());

        CreatedSuccess createdSuccess = given()
                .when()
                .get("posts/" + url)
                .then().log().body()
                .statusCode(200)
                .extract().as(CreatedSuccess.class);
        Assertions.assertAll(
                "Checking the response body",
                () -> Assert.assertEquals(iD, createdSuccess.getId()),
                () -> Assert.assertNotNull(createdSuccess.getUserId()),
                () -> Assert.assertNotNull(createdSuccess.getBody()),
                () -> Assert.assertNotNull(createdSuccess.getTitle())
        );
    }

    @Test
    @UseDataProvider("GetTestData404")
    public void GetTest404(String url, Integer iD) {

        Specification.initSpec(Specification.requestSpec(), Specification.responseSpecNotFound404());

        CreatedSuccess createdSuccess = given()
                .when()
                .get("posts/" + url)
                .then().log().body()
                .statusCode(404)
                .extract().as(CreatedSuccess.class);
        Assertions.assertAll(
                "Checking the response body",
                () -> Assert.assertEquals(iD, createdSuccess.getId()),
                () -> Assert.assertNotNull(createdSuccess.getUserId()),
                () -> Assert.assertNotNull(createdSuccess.getBody()),
                () -> Assert.assertNotNull(createdSuccess.getTitle())
        );
    }


}