package com.saucedemo.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinitions {

	
	WebDriver driver;
	
	LoginPage homepage = new LoginPage(driver);
	
	
	@Given("open browser")
	public void open_browser() {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\tevin\\Chrome driver");
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@Given("user send keys to login")
	public void do_something(String username) {
		homepage.sendValidUserName(username);
	}
	
	@When("user send keys to password")
	public void I_add_do_something(String password) {
		homepage.sendValidPassword(password);
	}
	
	@Then("user clicks login")
	public void the_I_verify_something() {
		homepage.clickingLoginButton();
	}
	
}
