package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.LogoutPaths.logout;

public class LogoutPage {
    WebDriver driver = null;
    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void logoutConfirm() {
        WebElement Logout = driver.findElement(logout);
        Logout.click();
    }

}
