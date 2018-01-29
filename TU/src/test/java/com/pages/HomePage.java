package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CucumberRunner.AbstractMain;

public class HomePage extends AbstractMain {
	public void start() {
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.tuclothing.sainsburys.co.uk");
	}

	public void i_Serach_with_valid_data() {
		driver.findElement(By.cssSelector("#search")).clear();
		driver.findElement(By.cssSelector("#search")).sendKeys("jeans");
	}

	public void iSelectSearchButton() {
		driver.findElement(By.cssSelector(".searchButton")).click();
	}
}
