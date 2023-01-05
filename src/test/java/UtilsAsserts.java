import org.example.CreatedSuccess;
import org.junit.Assert;
import java.lang.reflect.Field;

public class UtilsAsserts {

    public static void checkBodyIsNull(CreatedSuccess createdSuccess) throws IllegalAccessException {
        for (Field f : createdSuccess.getClass().getFields()) {
            if (f.get(createdSuccess) == null) {
                break;
            } else {
                Assert.assertNull(f.get(createdSuccess));
            }
        }
    }

}
