$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Buy_product.feature");
formatter.feature({
  "line": 2,
  "name": "Purchase Product",
  "description": "",
  "id": "purchase-product",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Purchase"
    }
  ]
});
formatter.before({
  "duration": 20563099400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User able to see review and pay page",
  "description": "",
  "id": "purchase-product;user-able-to-see-review-and-pay-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User search product jewellery",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on product",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on Add to your basket",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Go to basket",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on Continue to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click on Guest checkout",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Type email address,Click on continue",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click on Delivery option",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User type all personal details",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User click on Use this address and click on Next or names day UK delivery",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click on Tuesday and Continue to payment",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User able to see review and pay page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_on_home_page()"
});
formatter.result({
  "duration": 1141783700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_search_product_jewellery()"
});
formatter.result({
  "duration": 8935281900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.userClickOnProduct()"
});
formatter.result({
  "duration": 4512622800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Add_to_your_basket()"
});
formatter.result({
  "duration": 466598700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Go_to_basket()"
});
formatter.result({
  "duration": 4729795000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Continue_to_checkout()"
});
formatter.result({
  "duration": 2925045000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Guest_checkout()"
});
formatter.result({
  "duration": 2033906000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_Type_email_address_Click_on_continue()"
});
formatter.result({
  "duration": 2481512800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Delivery_option()"
});
formatter.result({
  "duration": 6461757600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_type_all_personal_details()"
});
formatter.result({
  "duration": 8697283400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Use_this_address_and_click_on_Next_or_names_day_UK_delivery()"
});
formatter.result({
  "duration": 6476916200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Oct_Tuesday_and_Continue_to_payment()"
});
formatter.result({
  "duration": 429710600,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d95.0.4638.54)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027E5570\u0027, ip: \u0027192.168.0.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 95.0.4638.54, chrome: {chromedriverVersion: 95.0.4638.17 (a9d0719444d4b..., userDataDir: C:\\Users\\Dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:58072}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7f212e9863378ef4e22c4dd44bbd3f7b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:106)\r\n\tat page.object.page.Delivery_Page.selectDeliveryDate(Delivery_Page.java:64)\r\n\tat org.example.MyStepDefs.user_click_on_Oct_Tuesday_and_Continue_to_payment(MyStepDefs.java:67)\r\n\tat ✽.And User click on Tuesday and Continue to payment(src/test/resources/features/Buy_product.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepDefs.user_able_to_see_review_and_pay_page_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 8387015900,
  "status": "passed"
});
});