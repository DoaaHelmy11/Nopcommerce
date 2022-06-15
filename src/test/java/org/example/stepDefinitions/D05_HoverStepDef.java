package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_CatAndSubcat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;

public class D05_HoverStepDef {

    P06_CatAndSubcat category = new P06_CatAndSubcat();
    String subcategory_name;

    @When("user hovers on category and select subcategory")
    public void hover_on_category_and_select_subcategory() throws InterruptedException {

        //1- hover on the category "computers"
        Actions action = new Actions(Hooks.driver);;
        action.moveToElement(category.computers_category()).perform(); // hover function
        Thread.sleep(1000);

        subcategory_name = category.desktop_subcategory().getText().toLowerCase().trim();
        System.out.println("desktop subcategory text from first method : "+ subcategory_name);

        //2- select subcategory "desktop"
        category.desktop_subcategory().click();

    }

    @Then("user is redirected to the subcategory page with title equals to subcategory value and url contains desktop")
    public void user_redirected_to_subcategory_page()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("desktop"), "first assertion(url does not contain desktop)"); //assertion on the url


        //System.out.println("desktop subcategory text : "+ subcategory_name);
        String desktop_subcategory_header = category.subcategory_header().getText().toLowerCase().trim();
        //System.out.println("desktop subcategory header : "+ desktop_subcategory_header);
        soft.assertEquals(desktop_subcategory_header, subcategory_name, "second assertion(headers are not the same)");
        soft.assertAll();
    }
}
