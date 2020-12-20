import com.alafita.gradlesample.beans.Banner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BannerTest {

    @Test
    @DisplayName("Constructor without parameters")
    public void testDefaultConstructor() {
        String url = "http://someurl";
        Banner bannerUnderTest = new Banner();
        bannerUnderTest.setUrl(url);
        bannerUnderTest.setName("Principal");
        bannerUnderTest.setActive(true);
        Assertions.assertAll("",
                () -> Assertions.assertEquals(bannerUnderTest.getUrl(), url),
                () -> Assertions.assertEquals(bannerUnderTest.getName(), "Principal"),
                () -> Assertions.assertTrue(bannerUnderTest.getActive())
        );
    }

    @Test
    @DisplayName("Constructor with parameters")
    public void testDefaultConstructor2() {
        String url = "http://someurl";
        Banner bannerUnderTest = new Banner(url, "Principal", true);
        Assertions.assertAll("",
                () -> Assertions.assertTrue(bannerUnderTest.getUrl().equals(url)),
                () -> Assertions.assertTrue(bannerUnderTest.getName().equals("Principal")),
                () -> Assertions.assertTrue(bannerUnderTest.getActive())
        );
    }
}
