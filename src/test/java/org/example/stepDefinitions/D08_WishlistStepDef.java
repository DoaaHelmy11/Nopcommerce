package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.example.pages.P07_Wishlist;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D08_WishlistStepDef {

    P01_Home home = new P01_Home();
    P07_Wishlist wishlist_page = new P07_Wishlist();
    int num;

    @When("user add product to wishlist")
    public void user_add_product_to_wishlist() throws InterruptedException {

        Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
        home.wishlistBtns().get(2).click();
        Thread.sleep(2000);
    }

    @Then("success message notification is visible")
    public void success_message_is_visible_for_wishlist()
    {
       // Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
        Assert.assertTrue(home.successMessage().isDisplayed());
        System.out.println(home.successMessage().getText());
    }

    @And("user gets the number of wishlist items after adding the product")
    public void user_get_num_of_items_wishlist()
    {
       String text = Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText();

       //need to convert from string to integer and remove the brackets (1)
        text = text.replaceAll("[^0-9]",""); //removes the brackets 1
        num = Integer.parseInt(text); //convert to int
        Assert.assertTrue(num>0);
    }

    @And("number of items in wishlist is increased")
    public void number_of_items_is_increased()
    {
        Assert.assertTrue(num>0);
    }

    @And("user clicks on wishlist link")
    public void user_clicks_on_wishlist_link()
    {
        //explicit wait
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(home.successMessage()));

        home.wishlist().click();
    }

    @Then("user is redirected to wishlist page")
    public void user_is_redirected_to_wishlist_page()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/wishlist");
    }

    @And("the product exists in wishlist page")
    public void the_product_exists_in_wishlist_page()
    {
       Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]")).isDisplayed());
    }

    @And("quantity attribute is larger than zero")
    public void quantity_attribute_is_larger_than_zero()
    {
        String quantity_value_string = wishlist_page.qtn_attribute().getAttribute("value");
        int quantity_value_int = Integer.parseInt(quantity_value_string);
        //System.out.println("the quantity is: "+ quantity_value_int);

        Assert.assertTrue(quantity_value_int>0);
    }












}
