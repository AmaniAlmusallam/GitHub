package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.HomePaths.*;

public class HomePage {
    WebDriver driver = null;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void profileImg() {
        WebElement Imgprofile = driver.findElement(profileImg);
        Imgprofile.click();
    }

    //Create New Repos
    public void CreateNew(){
        WebElement CreateNew = driver.findElement(createNewRepos);
        CreateNew.click();
    }
    public void NewReops(){
        WebElement NewReops = driver.findElement(newRepos);
        NewReops.click();
    }
    public void ReposName(){
        WebElement ReposName = driver.findElement(reposName);
        ReposName.sendKeys("New Auto Repos");
    }
    public void ReposDescr(){
        WebElement ReposDescr = driver.findElement(reposDesc);
        ReposDescr.sendKeys("This Repos in created by auto .... ");
    }
    public void publicRepos(){
        WebElement publicRepos = driver.findElement(radioPublic);
        publicRepos.click();
    }
    public void privateRepos(){
        WebElement privateRepos = driver.findElement(radioPrivate);
        privateRepos.click();
    }
    public void CreateReposBtn(){
        WebElement CreateReposBtn = driver.findElement(createReposBtn);
        CreateReposBtn.click();
    }


    //Search a Repos
    public void SearchRepos(){
        WebElement SearchRepos = driver.findElement(searchRepos);
        SearchRepos.sendKeys("AmaniAlmusallam/New-Auto-Repos");
    }
    public void OpenSearchRepos(){
        WebElement OpenSearchRepos = driver.findElement(getRepos);
        OpenSearchRepos.click();
    }

    //Delete a Repos
    public void OpenReposSettings(){
        WebElement OpenReposSettings = driver.findElement(reposSettings);
        OpenReposSettings.click();
    }
    public void DeleteReposBtn(){
        WebElement DeleteReposBtn = driver.findElement(deleteReposBtn);
        DeleteReposBtn.click();
    }
    public void DeleteReposBtnConf(){
        WebElement DeleteReposBtnConf = driver.findElement(deleteReposBtnConf);
        DeleteReposBtnConf.click();
    }
    public void verificationReposField(){
        WebElement verificationReposField = driver.findElement(verificationField);
        verificationReposField.sendKeys("AmaniAlmusallam/New-Auto-Repos");
    }


    public void scrollDown(){
        WebElement Body = driver.findElement(body);
        Body.sendKeys(Keys.END);
    }
    public void scrollUp(){
        WebElement Body = driver.findElement(body);
        Body.sendKeys(Keys.HOME);
    }
    public void logoutMethod() {
        WebElement Logout = driver.findElement(logout);
        Logout.click();
    }
}
