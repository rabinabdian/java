package saucedemo.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	
	
	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void fillText(WebElement el,String text) {
	try {
		if (el !=null) {
			el.clear();
		}
			
			el.sendKeys(text);
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println(e);
	}
		
	}

	public void click(WebElement el) {
		el.click();
	}

	public String getText(WebElement el) {
		return el.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



