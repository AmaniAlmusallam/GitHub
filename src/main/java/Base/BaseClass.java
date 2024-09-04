package Base;

import org.openqa.selenium.WebDriver; // Main interface for interacting with browser
import org.openqa.selenium.chrome.ChromeDriver; // Class that implements WebDriver interface for Chrome browsers
import java.util.concurrent.TimeUnit; // To use set a wait() in seconds
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    // Declare a WebDriver object
    public WebDriver driver;

    // Execute this method before the first test method in the current class
    @BeforeClass
    public void setUp() {
        // Set the system property to use ChromeDriver executable from a specific location
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        // Create a new instance of ChromeDriver
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Set an implicit wait of 60 seconds for WebDriver operations
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // Navigate to the specified URL
        driver.get("https://github.com/");
    }

    @AfterClass
    public void tearDown(){
        // Close all browser windows and end the WebDriver session
        driver.quit();
    }
}

