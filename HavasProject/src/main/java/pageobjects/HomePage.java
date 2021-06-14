package pageobjects;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void link(String linktext) {

		driver.findElement(By.xpath("//ul[@class='menu']/li/a[contains(text(),'" + linktext + "')]"))
				.sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

	}

	public WebDriver getChildWindow() {

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		it.next();
		String childId = it.next();
		return driver.switchTo().window(childId);

	}

}
