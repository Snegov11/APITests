import com.tngtech.java.junit.dataprovider.DataProvider;
import org.example.PostData;

public class TestData {
    @DataProvider
    public static Object[][] PositivePostTestData() {
        return new Object[][]{
                {new PostData(-1,"test", "test")},
                {new PostData(0,"test", "test")},
                {new PostData(1,"test", "test")},
                {new PostData(50,"test", "test")},
                {new PostData(1000000000,"test", "test")},
                {new PostData(78,"eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam", "test")},
                {new PostData(45,"eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam", "eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam")},
                {new PostData(89,"", "")},
                {new PostData(89," ", " ")},
                {new PostData(89,null, "test")},
                {new PostData(89,null, null)},
                {new PostData(null,null, null)}
        };
    }

    @DataProvider
    public static Object[][] PostTestData500() {
        return new Object[][]{
                {new PostData(-1,"test", "test")},
                {new PostData(0,"test", "test")},
                {new PostData(1,"test", "test")},
                {new PostData(50,"test", "test")},
                {new PostData(1000000000,"test", "test")},
                {new PostData(78,"eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam", "test")},
                {new PostData(45,"eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam", "eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam eum non blanditiis soluta porro quibusdam voluptas\\nvel voluptatem qui placeat dolores qui velit aut\\nvel inventore aut cumque culpa explicabo aliquid at\\nperspiciatis est et voluptatem dignissimos dolor itaque sit nam")},
                {new PostData(89,"", "")},
                {new PostData(89," ", " ")},
                {new PostData(89,null, "test")},
                {new PostData(89,null, null)},
                {new PostData(null,null, null)}
        };
    }

    @DataProvider
    public static Object[][] PositiveGetTestData() {
        return new Object[][]{
                {"1", 1},
                {"45", 45},
                {"100", 100}
        };
    }

    @DataProvider
    public static Object[][] GetTestData404() {
        return new Object[][]{
                {"0"},
                {"101"},
                {"-1"},
                {"1000000000"},
                {"!@#$%^&*()"},
                {"!@#$%^&*()100"},
                {"98!@#$%^&*()"},
                {" 76"},
                {" 77 "},
                {"44sgrgsrgsrsrh"},
                {"rhfkgukgukgyky75"},
                {"gsgsgs75segesges"},
                {null}
        };
    }

}


