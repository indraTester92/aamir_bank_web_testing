package Bank_Web_Testing.basicUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CommonTest {
    
    public static WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://para.testar.org/parabank/services.htm");
        driver.manage().window().maximize();
    }
}
