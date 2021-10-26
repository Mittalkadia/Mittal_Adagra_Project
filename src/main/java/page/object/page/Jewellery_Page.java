package page.object.page;

import org.example.Utils;
import org.openqa.selenium.By;

public class Jewellery_Page extends Utils {

    private By _heart_Beaded_Bracelet=By.xpath("(//a[@class=\"product-card_c-product-card__link__3ZBF4\"])[3]");

    public void click_On_Heart_Slider_Beaded_Bracelet(){
        //Click on heart slider beaded bracelet
        clickOnElement(_heart_Beaded_Bracelet);
    }
}
