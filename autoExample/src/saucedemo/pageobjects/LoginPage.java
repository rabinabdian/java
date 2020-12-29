package saucedemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	WebElement userName;
	WebElement password;
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		super(driver);

		userName = driver.findElement(By.cssSelector("#user-name"));
		password = driver.findElement(By.cssSelector("#password"));
		loginBtn = driver.findElement(By.cssSelector("#login-button"));
	}
	
	// actions 
	public void login() {
		fillText(userName, "standard_user");
		fillText(password, "secret_sauce");
		click(loginBtn);
	}

}
