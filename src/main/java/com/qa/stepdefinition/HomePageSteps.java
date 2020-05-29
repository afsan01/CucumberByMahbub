package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {
	LoginPage loginpage;
	HomePage homePage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
	    TestBase.initialization();
	}

	@Then("^user is on login Page$")
	public void user_is_on_login_Page() {
		loginpage = new LoginPage();
		String title =loginpage.validateLoginPageTitle();
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}


	@Then("^validate home page title$")
	public void validate_home_page_title() {
		String homeTitle =homePage.verifyHomePageTitle();
	    Assert.assertEquals("Cogmento CRM", homeTitle);
	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() {
	   boolean flag = homePage.VerifyCorrectUserName();
	   Assert.assertTrue(flag);
	}
	@Then("^close the browser$")
	public void close_the_browser(){
	    driver.quit();
	}

}
