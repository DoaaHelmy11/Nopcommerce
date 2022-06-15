package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_Home;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_CurrenciesStepDef {

    P01_Home home = new P01_Home();

    @Given("user choose euro from currencies list")
    public void choose_currency()
    {
        Select select = new Select(home.currenciesList());
        select.selectByIndex(1); //select euro
    }
    @Then("the price of four products on home page is changed to euro")
    public void price_currency_is_changed()
    {
        int count = home.productCurrency().size();

        for (int i =0; i<count; i++)
        {
            //String text = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(i).getText(); //€1032.00
            String text = home.productCurrency().get(i).getText();
            Assert.assertTrue(text.contains("€"));
        }

    }
}
