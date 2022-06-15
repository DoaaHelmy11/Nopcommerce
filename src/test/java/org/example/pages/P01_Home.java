package org.example.pages;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class P01_Home {

    public WebElement registerLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public List<WebElement> productCurrency()
    {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        //[webelement0, webelement1, webelement2, webelement3]

    }

    public WebElement currenciesList()
    {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement searchBar()
    {
        return Hooks.driver.findElement(By.name("q"));
    }


    public List<WebElement> wishlistBtns()
    {
      return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishlist()
    {
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }


    public List<WebElement> compareBtns()
    {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-compare-list-button\"]"));
    }

    public WebElement successMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement facebookBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitterBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement newsrssBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }

    public WebElement youtubeBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }







}
