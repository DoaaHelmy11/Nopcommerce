package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_Search {

    public List<WebElement> titles_of_search_products()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
}
