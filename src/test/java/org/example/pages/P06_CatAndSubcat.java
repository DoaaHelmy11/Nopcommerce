package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class P06_CatAndSubcat {

    public WebElement computers_category ()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
    }

    public WebElement desktop_subcategory ()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
    }

    public WebElement subcategory_header()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }





}
