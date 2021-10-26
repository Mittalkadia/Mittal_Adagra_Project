package page.object.page;

import org.example.LoadProperty;
import org.example.Utils;
import org.openqa.selenium.By;

public class Secure_Checkout_Page extends Utils {
    LoadProperty loadProperty=new LoadProperty();
    private By _guest_Checkout = By.xpath("(//div[@class=\"_3IRx7\"])[2]");
    private By _email = By.cssSelector("input#email");
    private By _continue_As_Guest = By.xpath("//button[@type=\"submit\"]");

    public void click_On_Guest_Checkout() {
        //Click on guest checkout
        clickOnElement(_guest_Checkout);
    }

    public void enter_Email() {
        //Enter email address
        enterText(_email, loadProperty.getProperty("EmailAddress"));
        //Click on continue as guest
        clickOnElement(_continue_As_Guest);
    }

}
