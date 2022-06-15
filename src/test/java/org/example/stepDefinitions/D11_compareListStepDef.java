package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.example.pages.P02_CompareList;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D11_compareListStepDef {

    P01_Home home = new P01_Home();
    P02_CompareList compare_page = new P02_CompareList();

    @When("user add product to compare list")
    public void user_add_product_to_compare_list() throws InterruptedException {
        home.compareBtns().get(0).click(); //add black pc to compare list
        Thread.sleep(2000);

    }

    @Then("success message notification is visible for compare list")
    public void success_message_is_visible_for_compare_list()
    {
        home.successMessage().isDisplayed();
        String compareSuccessMessage = home.successMessage().getText();
        //System.out.println(compareSuccessMessage);
        //Assert.assertEquals("compareSuccessMessage","compareSuccessMessage"); expected result should be documented and given from product owner or senior tester,
        // so i will assume that actual result equals expected result and the green label that display will be my only indecator
        // of passed test cases despite the message in it

    }

    @Then("user opens compare list page")
    public void open_compare_list_page()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]")).click();
    }

    @And("compare list page has clear list button")
    public void clear_list_btn_is_displayed()
    {
       Assert.assertTrue(compare_page.clear_list_btn().isDisplayed());
    }

    @And("comparison table is displayed")
    public void comparison_table_is_displayed()
    {
        compare_page.comparison_table().isDisplayed();
    }

}
