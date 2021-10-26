package org.example;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.object.page.*;

public class MyStepDefs extends Utils {
    Homepage homepage = new Homepage();
    Jewellery_Page jewellery_page = new Jewellery_Page();
    Select_Product_page selectProductpage = new Select_Product_page();
    Basket_Page basket_page = new Basket_Page();
    Secure_Checkout_Page secure_checkout_page = new Secure_Checkout_Page();
    Delivery_Page delivery_page = new Delivery_Page();
    Payment_Page payment_page = new Payment_Page();


    @Given("^User on home page$")
    public void user_on_home_page() {
        homepage.click_On_Allow_All();
    }
    @When("^User search product jewellery$")
    public void user_search_product_jewellery() {
        homepage.search_Product();
    }

    @When("^User click on product$")
    public void userClickOnProduct() {
        jewellery_page.click_On_Heart_Slider_Beaded_Bracelet();
    }
    @When("^user click on Add to your basket$")
    public void user_click_on_Add_to_your_basket() {
        selectProductpage.click_On_Add_Basket();
    }
    @When("^User click on Go to basket$")
    public void user_click_on_Go_to_basket() {
        selectProductpage.click_On_Go_To_Basket();
    }
    @When("^User click on Continue to checkout$")
    public void user_click_on_Continue_to_checkout() {
        basket_page.click_On_Continue_Checkout();
    }
    @When("^User click on Guest checkout$")
    public void user_click_on_Guest_checkout() {
        secure_checkout_page.click_On_Guest_Checkout();
    }
    @When("^User Type email address,Click on continue$")
    public void user_Type_email_address_Click_on_continue() {
        secure_checkout_page.enter_Email();
    }
    @When("^User click on Delivery option$")
    public void user_click_on_Delivery_option() {
        delivery_page.click_On_Delivery();
    }
    @When("^User type all personal details$")
    public void user_type_all_personal_details() {
        delivery_page.enter_Delivery_Details();
    }

    @When("^User click on Use this address and click on Next or names day UK delivery$")
    public void user_click_on_Use_this_address_and_click_on_Next_or_names_day_UK_delivery() {
        delivery_page.User_Click_On_Next_Day_UK_Delivery();
    }
    @When("^User click on Tuesday and Continue to payment$")
    public void user_click_on_Oct_Tuesday_and_Continue_to_payment() {
        delivery_page.selectDeliveryDate();
    }
    @Then("^User able to see review and pay page successfully$")
    public void user_able_to_see_review_and_pay_page_successfully() {
        payment_page.assert_Payment_Page();
    }

    }

