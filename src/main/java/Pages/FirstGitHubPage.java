package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.FirstPagePaths.*;
import static ObjectsPath.HomePaths.body;

public class FirstGitHubPage {
    WebDriver driver = null;
    public FirstGitHubPage(WebDriver driver) {
        this.driver = driver;
    }
    public void OpenURL() {
        driver.get("https://github.com/");
    }
    public void openLoginPage() {
        WebElement loginPage = driver.findElement(signin);
        loginPage.click();
    }
    public void product() {
        WebElement Product = driver.findElement(product);
        Product.click();
    }
    public void openProductActions() {
        WebElement ProductAction = driver.findElement(productAction);
        ProductAction.click();
    }
    public void logo() {
        WebElement Logo = driver.findElement(logo);
        Logo.click();
    }
    public void scrollDown(){
        WebElement Body = driver.findElement(body);
        Body.sendKeys(Keys.END);
    }
    public void scrollUp(){
        WebElement Body = driver.findElement(body);
        Body.sendKeys(Keys.HOME);
    }

}
