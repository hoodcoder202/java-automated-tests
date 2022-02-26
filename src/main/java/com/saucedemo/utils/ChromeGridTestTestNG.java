package com.saucedemo.utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ChromeGridTestTestNG {

	

		
		WebDriver driver;
		String hubUrl;
		String baseUrl;
		
		
		
		@BeforeTest
		 public void setUpEnviroment() throws MalformedURLException {


			hubUrl = "http://10.0.0.181:4444";
			baseUrl = "https://www.saucedemo.com/";
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.WIN10);
			
			ChromeOptions options = new ChromeOptions();
			options.merge(capabilities);
			
			driver = new RemoteWebDriver(new URL(hubUrl), options);
			
		}
		
		
		
		
		@Test
		public void executeTestOnGrid() {
			driver.get(baseUrl);
			System.out.println("The actual page title from remote execution is " + driver.getTitle());
			
			
			
		}
		
		
		
		
		@AfterTest
		public void afterTest() {
			driver.quit();
			
			System.out.println("Test actual title complete! session closed");
		}
		
		
		
	}


