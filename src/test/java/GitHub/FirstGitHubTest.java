package GitHub;

import Base.BaseClass;
import Pages.FirstGitHubPage;
import org.testng.annotations.Test;
import io.qameta.allure.*;

public class FirstGitHubTest extends BaseClass {

    //This is the updated branch to make some changes
    @Test(groups = {"Smoke"})
    @Epic("GitHub First interface")
    @Feature("GitHub Page Interaction")
    @Story("Interact with GitHub Page")
    @Severity(SeverityLevel.CRITICAL)
    @Owner("Amani")
    @Description("This test opens the GitHub page, interacts with products, and performs various actions on the page.")
    public void firstGitHubTest() throws InterruptedException {
        openPage();
        interactWithProducts();
        performPageActions();
        scrollDownPage();
    }

    @Step("Open the GitHub page URL")
    public void openPage() throws InterruptedException {
        FirstGitHubPage firstPage = new FirstGitHubPage(driver);
        firstPage.OpenURL();

    }

    @Step("Interact with products")
    public void interactWithProducts() throws InterruptedException {
        FirstGitHubPage firstPage = new FirstGitHubPage(driver);
        firstPage.product();

    }

    @Step("Open product actions and logo")
    public void performPageActions() throws InterruptedException {
        FirstGitHubPage firstPage = new FirstGitHubPage(driver);
        firstPage.openProductActions();

        firstPage.logo();

    }

    @Step("Scroll down the page")
    public void scrollDownPage() throws InterruptedException {
        FirstGitHubPage firstPage = new FirstGitHubPage(driver);
        firstPage.scrollDown();

    }
}
