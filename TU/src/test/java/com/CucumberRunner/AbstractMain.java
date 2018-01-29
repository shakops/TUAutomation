package com.CucumberRunner;

import org.openqa.selenium.WebDriver;

import com.pages.BasketPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.OrderConfirmationPage;
import com.pages.PaymentPage;
import com.pages.ProductDetailsPage;
import com.pages.ProductListingPage;
import com.pages.SearchResultsPage;

public class AbstractMain  {
	
	public static WebDriver driver;
	
	
	public static HomePage hp=new HomePage();
	public static BasketPage bp1=new BasketPage();
	public static LoginPage lp=new LoginPage();
	public static OrderConfirmationPage ocp=new OrderConfirmationPage();
	public static PaymentPage pp=new PaymentPage();
	public static ProductDetailsPage pdp=new ProductDetailsPage();
	public static SearchResultsPage srp=new SearchResultsPage();
	public static ProductListingPage plp=new ProductListingPage();
	
	
	
}
