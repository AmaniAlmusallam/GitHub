package ObjectsPath;

import org.openqa.selenium.By;

public class HomePaths {

    public static final By body = By.tagName("body");


    //Create New Repos
    public static final By createNewRepos = By.id("global-create-menu-anchor");
    public static final By newRepos = By.id(":r6:");
    public static final By reposName = By.xpath("//input[@aria-describedby='RepoNameInput-is-available RepoNameInput-message']");
    public static final By reposDesc = By.xpath("//input[@aria-label='Description']");
    public static final By radioPublic = By.xpath("//input[@type='radio' and @value='public']");
    public static final By radioPrivate = By.xpath("//input[@type='radio' and @value='private']");
    public static final By createReposBtn = By.xpath("//span[text()='Create repository']");

    //Search Repos By name
    public static final By searchRepos = By.xpath("//input[@id='dashboard-repos-filter-left']");
    public static final By getRepos = By.xpath("//input[@id='dashboard-repos-filter-left']//following::ul");

    //Delete Repos
    public static final By reposSettings = By.id("settings-tab");
    public static final By deleteReposBtn = By.id("dialog-show-repo-delete-menu-dialog");
    public static final By deleteReposBtnConf = By.id("repo-delete-proceed-button");
    public static final By verificationField = By.id("verification_field");


    public static final By profileImg = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[3]/deferred-side-panel/include-fragment/react-partial-anchor/button/span/span/img");
    public static final By logout = By.xpath("//span[text()='Sign out']");
}
