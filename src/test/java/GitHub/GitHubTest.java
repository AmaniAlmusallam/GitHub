package GitHub;

import Base.BaseClass;
import Pages.FirstGitHubPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass {

    @Test
    public void GitHub() throws InterruptedException{
        FirstGitHubPage firstPage = new FirstGitHubPage(driver);
        firstPage.OpenURL();
        Thread.sleep(1000);
        firstPage.openLoginPage();
        Thread.sleep(1000);
        LoginMethod();
        Thread.sleep(1000);
        LogoutMethod();
        LogoutCon();
        Thread.sleep(1000);
        createNewRepos();
        searchRepos();
        DeleteRepos();
        Thread.sleep(3000);

    }
    public void createNewRepos() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        homePage.CreateNew();
        Thread.sleep(1000);
        homePage.NewReops();
        homePage.ReposName();
        Thread.sleep(1000);
        homePage.ReposDescr();
        Thread.sleep(1000);
        homePage.privateRepos();
        Thread.sleep(1000);
        homePage.publicRepos();
        Thread.sleep(1000);
        homePage.CreateReposBtn();
        Thread.sleep(1000);
    }
    public void searchRepos() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        homePage.SearchRepos();
        Thread.sleep(1000);
        homePage.OpenSearchRepos();
        Thread.sleep(1000);
    }
    public void DeleteRepos() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        homePage.OpenReposSettings();
        Thread.sleep(1000);
        homePage.DeleteReposBtn();
        Thread.sleep(1000);
        homePage.DeleteReposBtnConf();
        Thread.sleep(1000);
        homePage.DeleteReposBtnConf();
        Thread.sleep(1000);
        homePage.verificationReposField();
        Thread.sleep(1000);
        homePage.DeleteReposBtnConf();
    }
    public void LoginMethod() throws InterruptedException{
        LoginPage loginpage = new LoginPage(driver);
        loginpage.passwordFiled();
        Thread.sleep(1000);
        loginpage.usernameFiled();
        Thread.sleep(1000);
        loginpage.loginBtn();
        Thread.sleep(1000);
    }
    public void LogoutMethod() throws InterruptedException{
        HomePage homePage = new HomePage(driver);
        homePage.profileImg();
        Thread.sleep(1000);
        homePage.logoutMethod();
        Thread.sleep(1000);
    }
    public void LogoutCon() throws InterruptedException{
        LogoutPage logoutpage = new LogoutPage(driver);
        logoutpage.logoutConfirm();
        Thread.sleep(1000);
    }
}