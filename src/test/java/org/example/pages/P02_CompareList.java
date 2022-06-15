package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_CompareList {

    public WebElement clear_list_btn()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"clear-list\"]"));
    }

    public WebElement comparison_table()
    {
        return Hooks.driver.findElement(By.cssSelector("table[class=\"compare-products-table\"]"));
    }
}
