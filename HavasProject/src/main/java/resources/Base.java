package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();

		// Reading the prop file
		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");

		// Load the file
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			// firefox code

		} else if (browserName.equals("IE")) {

			// IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		return driver;

	}

}
