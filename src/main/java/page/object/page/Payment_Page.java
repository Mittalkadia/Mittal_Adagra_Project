package page.object.page;

import org.example.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Payment_Page extends Utils {
    private By _ReviewAndPay = By.xpath("//p[@data-test=\"delivery-details-message\"]");

    public void assert_Payment_Page() {
        // Actual message
        String _message = get_Text_From_Element(_ReviewAndPay);
        //Print output
        System.out.println("Verification Message :"+" "+_message);

    }
}
