package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.LoginPaths.*;

public class LoginPage {
    WebDriver driver = null;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void usernameFiled() {
        WebElement Username = driver.findElement(username);
        Username.sendKeys("AlmusallamAmani@gmail.com");
    }
    public void passwordFiled() {
        WebElement Password = driver.findElement(password);
        Password.sendKeys("XXXXXXXXXXX");
    }
    public void loginBtn() {
        WebElement BtnLogin = driver.findElement(loginBtn);
        BtnLogin.click();
    }
}