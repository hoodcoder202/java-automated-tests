package com.saucedemo.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.pages.BankAppLoginPage;
import com.saucedemo.pages.BankAppMainPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class BasicUserBankAppStepDefinitions {
	
	WebDriver driver;
	
	BankAppLoginPage bankAppLoginPage;
	BankAppMainPage bankAppMainPage;
	
	
	
	@Given("^basic user open browser$")
	public void basic_user_open_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\ChromeDriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		bankAppLoginPage = new BankAppLoginPage(driver);
		bankAppLoginPage.getBroswer();
	}
	
	
	@And("^basic user input username$")
	public void basic_user_input_username(String username) {
		bankAppLoginPage.sendValidUserName(username);
	}
	
	@And("^basic user input password$")
	public void basic_user_input_password(String password) {
		bankAppLoginPage.sendValidPassword(password);
	}
	
	
	@And("^basic user clicks login button$")
	public void basic_user_clicks_login_button() {
		bankAppLoginPage.clickingLoginButton();
	}

	
	@And("^basic user click add account$")
	public void basic_user_click_add_account() {
		bankAppMainPage = new BankAppMainPage(driver);
		bankAppMainPage.clickBankAddAccount();
	}
	
	@And("^basic user navigates to checking account$")
	public void basic_user_navigates_to_checking_account() {
		bankAppMainPage.clickBankAppViewStatement();
	}
	
	
	@And("^basic user validates restuarant cafe category$")
	public void basic_user_validates_restuarant_cafe_category() {
		bankAppMainPage.clickBankAppRestuarantCafe();
	}
	
}
