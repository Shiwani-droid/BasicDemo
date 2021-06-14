package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpToNewsLetterPage {

	WebDriver driver;

	private By emailAddress = By.id("mce-EMAIL");
	private By firstName = By.id("mce-FNAME");
	private By lastName = By.id("mce-LNAME");
	private By subscribeButton = By.xpath("//input[@name='subscribe']");

	public SignUpToNewsLetterPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getEmailAddress() {

		return driver.findElement(emailAddress);

	}

	public WebElement getFirstName() {

		return driver.findElement(firstName);

	}

	public WebElement getLastName() {

		return driver.findElement(lastName);

	}

	public WebElement getSubscribeButton() {

		return driver.findElement(subscribeButton);

	}

}
