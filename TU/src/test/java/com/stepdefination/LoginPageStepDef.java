package com.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
//import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;

public class LoginPageStepDef {

	public static WebDriver driver;

	@Given("^I am in Home page$")
	public void i_am_in_home_page() throws Throwable {

		System.setProperty("webdriver.gecko.driver",
				"./src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.tuclothing.sainsburys.co.uk");
	}

	@When("^I Select on Login Link$")
	public void i_Select_on_login_link() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.findElement (By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
	}

	@Then("^i should see the welcome page$")
	public void i_should_see_the_welcome_page() throws Throwable {
		//Assert.assertEquals("Hello Chandan Rauniyar",
				//driver.findElement(By.cssSelector("li[class='logged_in']")).getText());
	}

	@And("^I should see the login page$")
	public void i_should_see_the_login_page() throws Throwable {
		Assert.assertEquals("Returning Tu customers", driver.findElements(By.cssSelector("h2")).get(2).getText());
	}

	@And("^I enter the valid email address and valid password$")
	public void i_enter_the_valid_email_address_and_valid_password() throws Throwable {
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("shashikops@gmail.com");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("shashi123");
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		driver.findElement(By.className("loginButtonMain")).click();
   
	}
	}



	
	

	
