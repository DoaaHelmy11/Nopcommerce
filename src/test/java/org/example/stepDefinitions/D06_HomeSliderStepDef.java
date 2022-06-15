package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_Home;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D06_HomeSliderStepDef {
    P01_Home home =new P01_Home();

    @Given("user clicks on first slider")
    public void first_Slider() throws InterruptedException {
        Thread.sleep(3000);
        // System.out.println("iam starting the method");
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")).click();
       // Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[1]")).click();
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/a[1]")).click();
        //System.out.println("i found the xpath");
        //home.slider("1");
    }

    @Then("relative product for first slider is displayed")
    public void display_First_Slider_product() throws InterruptedException {
        Thread.sleep(2000);

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/nokia-lumia-1020");
    }



    @Given("user clicks on second slider")
    public void second_Slider() throws InterruptedException {
        Thread.sleep(3000);
        //Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[2]")).click();
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]")).click();
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/a[2]")).click();
    }

    @Then("relative product for second slider is displayed")
    public void display_second_Slider_product() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = Hooks.driver.getCurrentUrl();
        System.out.println("actual equals: "+ actualResult);

        Assert.assertEquals(actualResult,"https://demo.nopcommerce.com/iphones6");
    }

}
