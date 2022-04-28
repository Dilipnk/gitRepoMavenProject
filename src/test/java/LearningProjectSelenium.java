import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LearningProjectSelenium {

    WebDriver driver=null;
    @BeforeSuite
    public void openBrowser(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
    }

    @Test
    public void executionPart(){

        //This is comment for latest change
        driver.get("https://accounts.google.com/");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test.test@gmail.com");

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
