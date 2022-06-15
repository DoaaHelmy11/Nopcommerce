package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P03_Register {

    public WebElement gender_female()
    {
       return Hooks.driver.findElement(By.cssSelector("input[id=\"gender-female\"]"));
    }

    public WebElement first_name()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement last_name()
    {
        return Hooks.driver.findElement(By.id("LastName"));

    }

//    public void steps_Fname_Lname(String fName, String lName)
//    {
//        first_name().clear();
//        first_name().sendKeys(fName);
//        last_name().clear();
//        last_name().sendKeys(lName);
//    }

    public WebElement birth_day()
    {
       return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birth_month()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birth_year()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirm_password()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement register_btn()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement success_register_message()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }



}
