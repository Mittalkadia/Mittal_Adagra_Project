package page.object.page;

import org.example.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Payment_Page extends Utils {
    private By _ReviewAndPay = By.xpath("//p[@data-test=\"delivery-details-message\"]");

    public void assert_Payment_Page() {
        // Actual message
        String actual_message = get_Text_From_Element(_ReviewAndPay);
        //expected message
        String expected_massage = "Arriving on Friday 29 October between 7.30am - 6pm";
        //Verify Actual ans Expected
        Assert.assertEquals(actual_message,expected_massage,"Expected and Actual result is not match");
        //Print output
        System.out.println("Expected and Actual is match");

    }
}
