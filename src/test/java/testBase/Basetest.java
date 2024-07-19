package testBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//Base test class to set up and tear down the WebDriver//
 
public class Basetest {
    public WebDriver driver;

    @BeforeClass
    public void setUp() {
       // Creating instance for launching chromedriver
    	driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://edcontrols.com");
    }

   @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
