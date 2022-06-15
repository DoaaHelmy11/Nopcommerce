package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Home;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_FollowUsStepDef {

    P01_Home home = new P01_Home();

    @When("user clicks on facebook icon")
    public void user_clicks_on_facebook()
    {
        home.facebookBtn().click();
    }

    @Then("user is redirected to the facebook page of the website")
    public void redirect_to_facebook_page_of_the_website() throws InterruptedException {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user clicks on twitter icon")
    public void user_clicks_on_twitter()
    {
        home.twitterBtn().click();
    }

    @Then("user is redirected to the twitter page of the website")
    public void redirect_to_twitter_page_of_the_website() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

    }

    @When("user clicks on news rss icon")
    public void user_clicks_on_news_rss()
    {
        home.newsrssBtn().click();
    }

    @Then("user is redirected to the news rss page of the website")
    public void redirect_to_news_rss_page_of_the_website() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://newsrss.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user clicks on youtube icon")
    public void user_clicks_on_youtube()
    {
        home.youtubeBtn().click();
    }

    @Then("user is redirected to the youtube channel of the website")
    public void redirect_to_youtube_channel_of_the_website() throws InterruptedException {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));







    }



}
