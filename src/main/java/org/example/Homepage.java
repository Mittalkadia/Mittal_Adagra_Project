package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utils {
    LoadProperty loadProperty=new LoadProperty();
    private By _allow_All = By.xpath("(//button[@type=\"button\"])[1]");
    private By _search_Bar = By.cssSelector("input#mobileSearch");
    private By _search_Button = By.xpath("//button[@type=\"submit\"]");


    public void click_On_Allow_All() {
        //Click all allow
        clickOnElement(_allow_All);
    }

    public void search_Product() {
        //Type jewellery product
        enterText(_search_Bar,loadProperty.getProperty("SearchProduct"));
        //Click on search
        clickOnElement(_search_Button);

    }
}
