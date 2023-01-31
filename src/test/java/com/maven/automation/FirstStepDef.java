package com.maven.automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDef {
	
	WebDriver wd;
	
	@Given("^user is on saucedemo login pages$")
	public void userOnLoginPage () throws InterruptedException { 
		
		wd = new ChromeDriver();
		wd.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(5000);
}
   @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$") 
   public void enterCreds(String user , String pass) {
	   wd.findElement(By.id("user-name")).sendKeys(user);
	   wd.findElement(By.id("password")).sendKeys(pass);
   }

   @When("^user enters invalid username and password$")
   public void enterInvalidCreds() {
    wd.findElement(By.id("user-name")).sendKeys("user");
    wd.findElement(By.id("password")).sendKeys("pass");
   }
   @When ("^user click login button$")
   public void clickLogin() {
	   wd.findElement(By.id("login-button")).click();
   }
	 @Then ("^user Should be on homepage$")
	 public void userOnHomePage() {
	 Assert.assertTrue(wd.findElement (By.className("title")). isDisplayed());
	 }
}
				  


