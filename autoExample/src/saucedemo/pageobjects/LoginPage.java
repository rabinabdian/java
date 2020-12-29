package saucedemo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(css = "#user-name")
	WebElement userName;
	@FindBy(css = "#password")
	WebElement password;
	@FindBy(css = "#login-button")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		super(driver);
//
//		userName = driver.findElement(By.cssSelector("#user-name"));
//		password = driver.findElement(By.cssSelector("#password"));
//		loginBtn = driver.findElement(By.cssSelector("#login-button"));
	}
	
	// actions 
	public void login() {
		fillText(userName, "standard_user");
		fillText(password, "secret_sauce");
		click(loginBtn);
	}

}
