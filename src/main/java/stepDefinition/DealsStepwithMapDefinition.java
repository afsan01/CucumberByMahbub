package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealsStepwithMapDefinition {
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void User_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
	}
	
	@When("^Title of Login page is Free CRM$")
	public void Title_of_Login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small",title );
		
	}
	@Then("^User clicks on login button$")
	public void user_clicks_on_login_button(){
	   driver.findElement(By.xpath("//span[contains(text(), 'Log In')]")).click(); 
	}
	@Then("^User enters username and password$")
	public void user_enters_username_and_password(DataTable credientials) {
		for(Map<String,String> data : credientials.asMaps(String.class, String.class)) {
	    driver.findElement(By.name("email")).sendKeys(data.get("username"));
	    driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}
	@Then ("^User clicks on submit button$")
	public void User_clicks_on_submit_button() {
	    driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page Title :: "+title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	@Then("^user click on Deals link$")
	public void user_click_on_Deals_link() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[5]/span")).click();
	}
	@Then("^user click on New Deals$")
	public void user_click_on_New_Deals() {
	    driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]/button")).click();
	}
	@Then("^user enter deal details$")
	public void user_enter_deal_details(DataTable dealData) {
		for(Map<String,String> data : dealData.asMaps(String.class, String.class)) {	    
		driver.findElement(By.name("title")).sendKeys(data.get("title"));
	    driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
	    driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(data.get("probability"));
	    driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(data.get("commission"));
	    
	    driver.findElement(By.xpath("//*[contains(text(),'Save')]")).click();
	    
		}	

	}
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
	

}
