package com.saucedemo.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrindChromeValidation {

	
	
	
public static void main(String[] args) throws MalformedURLException {
		
		
		
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.merge(capabilities);
		
		
		String hubUrl = "http://10.0.0.181:4444";
		
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("The page title is " + driver.getTitle());
		
		
		
		driver.close();
		
	}
	
	
	
	
	
}
