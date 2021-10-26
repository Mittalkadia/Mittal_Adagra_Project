package page.object.page;

import org.example.Utils;
import org.openqa.selenium.By;

public class Basket_Page extends Utils {
    private By _continue_Checkout=By.xpath("(//div[@class=\"checkout-button-container\"])[2]");

    public void click_On_Continue_Checkout(){
        //Click on continue checkout
        clickOnElement(_continue_Checkout);
    }
}
