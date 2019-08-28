package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

    WebDriver driver;

    public RediffLoginPagePF(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this); //additional step for Page Object Factory
    }

//    By username = By.xpath(".//*[@id='login1']");
//    By password = By.id("password");
//    By go = By.name("proceed");
//
//    public WebElement EmailID() {
//        return driver.findElement(username);
//    }
//
//    public WebElement Password() {
//        return driver.findElement(password);
//    }
//
//    public WebElement ClickGo() {
//        return driver.findElement(go);
//    }


    //Page Object Factory
    @FindBy(xpath = ".//*[@id='login1']")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(name = "proceed")
    WebElement go;


    public WebElement EmailID() {
        return username;
    }

    public WebElement Password() {
        return password;
    }

    public WebElement ClickGo() {
        return go;
    }

}
