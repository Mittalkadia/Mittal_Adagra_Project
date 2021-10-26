package org.example;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{
    @Before
    public void open_Browser(){
        //Setting up chrome driver from WebDriver manager
        WebDriverManager.chromedriver().setup();
        //Create object for chrome driver
        driver=new ChromeDriver();
        //Maximize the browser window
        driver.manage().window().maximize();
        //Apply implicitlyWait to driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Open URL
        driver.get("https://www.johnlewis.com/");
    }
    @After
    public void close_Browser() throws IOException {
       //taking screenshot
        captureScreenshot("screenshotName");
        //close browser
        driver.quit();
    }
}
