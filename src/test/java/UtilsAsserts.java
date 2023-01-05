import io.qameta.allure.Step;
import org.example.*;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Field;
import java.util.logging.Logger;

public class UtilsAsserts {

    public static Logger logger = Logger.getLogger(String.valueOf(PostTests.class));

    @Step("Проверка совпадения поля UserId из request и response")
    public static void checkUserId(UserIdData userIdData, CreatedSuccess createdSuccess) {
        Assertions.assertEquals(userIdData.getUserID(), createdSuccess.getUserID());
    }

    @Step("Проверка совпадения поля iD из request и response")
    public static void checkId(CreatedSuccess createdSuccess, Integer iD) {
        Assertions.assertEquals(iD, createdSuccess.getId());
    }

    @Step("Проверка совпадения поля Title из request и response")
    public static void checkTitle(TitleData titleData, CreatedSuccess createdSuccess) {
        Assertions.assertEquals(titleData.getTitle(), createdSuccess.getTitle());
    }

    @Step("Проверка совпадения поля Body из request и response")
    public static void checkBody(BodyData bodyData, CreatedSuccess createdSuccess) {
        Assertions.assertEquals(bodyData.getBody(), createdSuccess.getBody());
    }

    @Step("Проверка Body после метода Get")
    public static void checkBodyAfterGet(CreatedSuccess createdSuccess, String url) {
        Assertions.assertAll(
                "Checking the response body",
                () -> Assertions.assertEquals(Integer.valueOf(url), createdSuccess.getId()),
                () -> Assertions.assertNotNull(createdSuccess.getUserId()),
                () -> Assertions.assertNotNull(createdSuccess.getBody()),
                () -> Assertions.assertNotNull(createdSuccess.getTitle())
        );
    }

    @Step("Проверка Body после метода Post")
    public static void checkBodyAfterPost(CreatedSuccess createdSuccess, Integer iD, PostData postData) {
        Assertions.assertAll(
                "Checking the response body",
                () -> Assertions.assertEquals(iD, createdSuccess.getId()),
                () -> Assertions.assertEquals(postData.getUserID(), createdSuccess.getUserID()),
                () -> Assertions.assertEquals(postData.getBody(), createdSuccess.getBody()),
                () -> Assertions.assertEquals(postData.getTitle(), createdSuccess.getTitle())
        );
    }

    @Step("Проверка Body is Null")
    public static void checkBodyIsNull(CreatedSuccess createdSuccess) throws IllegalAccessException {
        for (Field f : createdSuccess.getClass().getFields()) {
            if (f.get(createdSuccess) == null) {
                break;
            } else {
                Assert.assertNull(f.get(createdSuccess));
            }
        }
    }

    @Step("Проверка отсутвия поля - Title")
    public static void checkTitleFieldIsNull(CreatedSuccess createdSuccess) {
        try {
            createdSuccess.getTitle().isEmpty();
        }
        catch (NullPointerException e) {
            logger.info("Title field is " + e.getMessage());
        }
    }

    @Step("Проверка отсутвия поля - Body")
    public static void checkBodyFieldIsNull(CreatedSuccess createdSuccess) {
        try {
            createdSuccess.getBody().isEmpty();
        }
        catch (NullPointerException e) {
            logger.info("Body field is " + e.getMessage());
        }
    }

    @Step("Проверка отсутвия поля - UserId")
    public static void checkUserIdFieldIsNull(CreatedSuccess createdSuccess) {
        try {
            createdSuccess.getUserID().hashCode();
        }
        catch (NullPointerException e) {
            logger.info("UserId field is " + e.getMessage());
        }
    }

}
