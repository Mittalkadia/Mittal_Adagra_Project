package page.object.page;

import org.example.LoadProperty;
import org.example.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Delivery_Page extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _delivery = By.xpath("//button[@data-id=\"delivery\"]");
    private By _title = By.xpath("//input[@name=\"title\"]");
    private By _firstname = By.cssSelector("input#firstName");
    private By _lastname = By.cssSelector("input#lastName");
    private By _phoneNumber = By.xpath("//input[@name=\"phoneNumber\"]");
    private By _enter_Postcode = By.xpath("//input[@name=\"address-search-input\"]");
    private By _42address = By.className("address-search-input_c-results__list__item__button__text__address_count__5e049");
    private By _select_Address = By.xpath("//span[text()='127B, Mitcham Road']");
    private By _use_Address = By.xpath("//button[text()='Use this address']");
    private By _nextDay_Delivery = By.xpath("(//input[@type='radio']/following-sibling::label)[2]");
    private By _select_Delivery_Date = By.xpath("(//span[text()='Oct'])[3]");
    private By _continue_Payment = By.xpath("//button[text()='Continue to payment']");

    public void click_On_Delivery() {
        //Click on delivery
        clickOnElement(_delivery);
    }

    public void enter_Delivery_Details() {
        //Enter Title
        enterText(_title, loadProperty.getProperty("Title"));
        //Enter firstname
        enterText(_firstname, loadProperty.getProperty("FirstName"));
        //Enter lastname
        enterText(_lastname, loadProperty.getProperty("LastName"));
        //Enter phone number
        enterText(_phoneNumber, loadProperty.getProperty("PhoneNumber"));
        //Enter postcode
        enterText(_enter_Postcode, loadProperty.getProperty("PostCode"));
        //Click o address
        clickOnElement(_42address);
        //Click on select address
        clickOnElement(_select_Address);
        //Click on use address
        clickOnElement(_use_Address);
    }
    public void User_Click_On_Next_Day_UK_Delivery() {
        //Click on next day UK delivery
        clickOnElement(_nextDay_Delivery);
    }
    public void selectDeliveryDate() {
        //Select date for delivery
        clickOnElement(_select_Delivery_Date);
        //Click on continue payment
        clickOnElement(_continue_Payment);
    }
}
