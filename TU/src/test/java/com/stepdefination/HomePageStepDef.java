package com.stepdefination;

import com.CucumberRunner.AbstractMain;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef extends AbstractMain {

	@Given("^i am in home page$")
	public void i_am_in_home_page() throws Throwable {
		hp.start();
	}

	@When("^i enter valid product details$")
	public void i_enter_valid_product_details() throws Throwable {
		hp.i_Serach_with_valid_data();
	}

	@When("^i select search button$")
	public void i_select_search_button() throws Throwable {
		hp.iSelectSearchButton();
	}

}
