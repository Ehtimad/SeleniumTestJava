import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Abstract {
    public static WebDriver driver;
    public static String baseUrl="https://yeniemlak.az/";

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_TESTS\\YeniEmlakSeleniumTest\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }


   @AfterClass
    public static void tearDown() throws InterruptedException {
    Thread.sleep(5000);
       driver.quit();
    }
}