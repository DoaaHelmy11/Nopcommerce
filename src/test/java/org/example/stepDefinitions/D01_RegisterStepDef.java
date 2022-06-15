package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.example.pages.P03_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_RegisterStepDef {

    P01_Home home = new P01_Home();
    P03_Register register = new P03_Register();

    @Given("user go to register page")
    public void user_open_register_page()
    {
        //Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]")).click();
        home.registerLink().click();
    }

    @When("user select gender type")
    public void user_select_gender_type()
    {
        register.gender_female().click();
    }

    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void valid_Fname_and_Lname(String fName, String lName)
    {
        register.first_name().clear();
        register.first_name().sendKeys(fName);
        register.last_name().clear();
        register.last_name().sendKeys(lName);
    }

    @And("user enter date of birth")
    public void date_of_birth()
    {
        Select select = new Select(register.birth_day());
        select.selectByIndex(7);

        select = new Select(register.birth_month());
        select.selectByIndex(5);

        select = new Select(register.birth_year());
        select.selectByVisibleText("1997");
    }

    @And("^user enter email field \"(.*)\"$")
    public void enter_email(String email)
    {
        register.email().clear();
        register.email().sendKeys(email);
    }

    @And("^user fills Password fields \"(.*)\" \"(.*)\"$")
    public void enter_password_fields(String password, String confirm_password)
    {
        register.password().clear();
        register.password().sendKeys(password);
        register.confirm_password().clear();
        register.confirm_password().sendKeys(confirm_password);
    }

    @And("user clicks on register button")
    public void register_btn()
    {
        register.register_btn().click();
    }

    @Then("success message is displayed")
    public void register_completed_successfully()
    {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(register.success_register_message().isDisplayed(),"First assertion message displayed");

       String font_color = register.success_register_message().getCssValue("color");
        soft.assertEquals(font_color,"rgba(76, 177, 124, 1)","second asserion color");

        soft.assertAll();
    }

}
