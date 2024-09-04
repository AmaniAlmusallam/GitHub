package ObjectsPath;

import org.openqa.selenium.By;

public class FirstPagePaths {

    public static final By signin = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a");
    public static final By logo = By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/a");
    public static final By product = By.xpath("//button[contains(text(),'Product')]");
    public static final By productAction = By.xpath("//div[text()='Actions']");

}