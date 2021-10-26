package page.object.page;

import org.example.Utils;
import org.openqa.selenium.By;

public class Select_Product_page extends Utils {
    private By _add_Basket = By.id("add-to-basket-button");
    private By _go_To_Basket = By.cssSelector("a.button_c-button__3_-bh.button_c-button--primary__33dEi");

    public void click_On_Add_Basket() {
        //Click add to basket
        clickOnElement(_add_Basket);
    }
    public void click_On_Go_To_Basket() {
        //Click on go to basket
        clickOnElement(_go_To_Basket);
    }

}
