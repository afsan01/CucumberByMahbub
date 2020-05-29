package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
/*
public class LoginStepDefinition {
	
	WebDriver driver;
	
	
	@Given("^User is already on Login Page$")
	public void User_is_already_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
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
	/*@Then("^User enters username and password$")
	public void user_enters_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys("afsan0403@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("Al112101");
	}*/
	//data driven without and with Examples keyword
	/*@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
	    driver.findElement(By.name("email")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
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
	@Then("^user click on contact link$")
	public void user_click_on_contact_link() throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
	}

	@Then("^user click on New link$")
	public void user_click_on_New_link() {
	    driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
	}

	@Then("^user enter contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_contact_details(String firstname, String lastname, String company) throws InterruptedException {
		Thread.sleep(5000);
	    driver.findElement(By.name("first_name")).sendKeys(firstname);
	    driver.findElement(By.name("last_name")).sendKeys(lastname);
	    driver.findElement(By.name("company")).sendKeys(company);
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() {
	    driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}
	
	
	

}*/
