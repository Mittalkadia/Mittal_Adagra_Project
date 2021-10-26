package org.example;


import org.openqa.selenium.By;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Utils extends Base_Page {
    // method for enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    // method for click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }
    //method to  get text
    public static String get_Text_From_Element(By by) {
        return driver.findElement(by).getText();
    }
    //method for dateStamp
    public static String dateStamp() {
        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
        return format.format(new Date());
    }
    //method for capturing screenshot
    public static void captureScreenshot(String screenshotName) throws IOException {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "jpg", new File("src\\test\\resources\\Screenshot" + screenshotName + dateStamp() + ".jpg"));
    }

}


