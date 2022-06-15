package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_Login {

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement login_btn()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public WebElement my_account()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }

    public WebElement invalid_login_message()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

}
