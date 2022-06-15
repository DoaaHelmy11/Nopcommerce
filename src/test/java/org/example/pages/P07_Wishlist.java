package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_Wishlist {

    public WebElement qtn_attribute()
    {
        return Hooks.driver.findElement(By.className("qty-input"));
    }

}
