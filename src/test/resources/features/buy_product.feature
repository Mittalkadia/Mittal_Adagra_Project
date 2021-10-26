@Purchase
Feature: Purchase Product

  Scenario: User able to see review and pay page
    Given   User on home page
    When    User search product jewellery
    And     User click on product
    And     user click on Add to your basket
    And     User click on Go to basket
    And     User click on Continue to checkout
    And     User click on Guest checkout
    And     User Type email address,Click on continue
    And     User click on Delivery option
    And     User type all personal details
    And     User click on Use this address and click on Next or names day UK delivery
    And     User click on Tuesday and Continue to payment
    Then    User able to see review and pay page successfully



