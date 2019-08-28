package TestCases;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplication {


    @Test
    public void Login() {

        System.setProperty("webdriver.chrome.driver", "/Users/singh2_rajiv/Automation/Selenium/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Login page
        RediffLoginPage rd = new RediffLoginPage(driver);

        rd.EmailID().sendKeys("hello");
        rd.Password().sendKeys("password");
        rd.ClickGo().click();


        //Home page
        RediffHomePage rh = new RediffHomePage(driver);
        rh.Search().sendKeys("rediff");
        rh.Submit().click();

    }
}
