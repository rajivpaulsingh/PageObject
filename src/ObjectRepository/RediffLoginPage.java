package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

    WebDriver driver;

    public RediffLoginPage(WebDriver driver) {

        this.driver = driver;
    }

    By username = By.xpath(".//*[@id='login1']");
    By password = By.id("password");
    By go = By.name("proceed");


    public WebElement EmailID() {
        return driver.findElement(username);
    }

    public WebElement Password() {
        return driver.findElement(password);
    }

    public WebElement ClickGo() {
        return driver.findElement(go);
    }

}
