package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.example.pages.P04_Login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class D02_LoginStepDef {

    P01_Home home = new P01_Home();
    P04_Login login = new P04_Login();

    @And("user logout")
    public void user_logout()
    {
        Hooks.driver.findElement(By.className("ico-logout")).click();
    }

    @Given("user go to login page")
    public void user_open_login_page()
    {
        home.loginLink().click();
    }

    @When("^user login with email \"(.*)\" and password \"(.*)\"$")
    public void login_steps(String email, String password)
    {
        login.email().clear();
        login.email().sendKeys(email);

        login.password().clear();
        login.password().sendKeys(password);
    }

    @And("user press on login button")
    public void user_press_loginBtn()
    {
        login.login_btn().click();
    }

    @Then("user login to the system successfully")
    public void valid_login()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","url is not the home page");

        soft.assertTrue(login.my_account().isDisplayed(),"my account is not displayed in the top");

        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void invalid_login()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(login.invalid_login_message().isDisplayed());

        String invalid_login_message = login.invalid_login_message().getText();
        //System.out.println("the message is:" + invalid_login_message);

        soft.assertTrue(invalid_login_message.contains("Login was unsuccessful."),"second assertion:message is wrong");

        String message_color = login.invalid_login_message().getCssValue("color");
        //System.out.println("message color is:" + message_color);
        soft.assertEquals(message_color,"rgba(228, 67, 75, 1)","third assertion message: color is not red ");

        soft.assertAll();
    }

}
