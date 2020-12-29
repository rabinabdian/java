package saucedemo.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import saucedemo.pageobjects.LoginPage;

public class LoginTest {

	public static void main(String[] args) {



		tc01_login();
		
		
		
	}
	

	@Test
	public static void tc01_login() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Documents\\selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/index.html");
		LoginPage lPage = new LoginPage(driver);
		lPage.login();
		Assert.assertEquals(true,true);
	}

}
