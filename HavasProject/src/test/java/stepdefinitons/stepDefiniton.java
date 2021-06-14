package stepdefinitons;

import org.junit.Assert;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.SignUpToNewsLetterPage;
import resources.Base;

@RunWith(Cucumber.class)
public class stepDefiniton extends Base {

	private String homePageTitle;
	private HomePage homePage;
	private SignUpToNewsLetterPage signUp;

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializeDriver();
		homePage = new HomePage(driver);
		signUp = new SignUpToNewsLetterPage(driver);

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.get(strArg1);
	}

	@When("^user gets the title of the Home page$")
	public void user_gets_the_title_of_the_home_page() throws Throwable {
		homePageTitle = driver.getTitle();

		System.out.println(homePageTitle);
	}

	@When("^user click on elements (.+)$")
	public void user_click_on_elements(String elements) throws InterruptedException {

		homePage.link(elements);
	}

	@Then("^Elements page title should be (.+)$")
	public void elements_page_title_should_be(String title) throws Throwable {

		String actualTitle = homePage.getChildWindow().getTitle();
		Assert.assertTrue(actualTitle.contains(title));
		System.out.println(actualTitle);

	}

	@Then("^Home Page title should be \"([^\"]*)\"$")
	public void home_page_title_should_be_something(String strArg1) {
		Assert.assertTrue(homePageTitle.contains(strArg1));
	}

	@And("^close browsers$")
	public void close_browsers() throws Throwable {
		driver.quit();
	}

	@When("^user clicks on Subscribe button$")
	public void user_clicks_on_subscribe_button() throws Throwable {

		signUp.getSubscribeButton().click();
	}

//	@And("^user click on \"([^\"]*)\"$")
//	public void user_click_on_something(String strArg1) throws Throwable {
//
//		homePage.link(strArg1);
//		homePage.getChildWindow();
//
//	}

	@And("^user enter the email address \"([^\"]*)\"$")
	public void user_enter_the_email_address_something(String strArg1) {

		signUp.getEmailAddress().sendKeys(strArg1);

	}

	@And("^user enter the FirstName \"([^\"]*)\" and LastName \"([^\"]*)\"$")
	public void user_enter_the_firstname_something_and_lastname_something(String strArg1, String strArg2)
			throws Throwable {

		signUp.getFirstName().sendKeys(strArg1);
		signUp.getLastName().sendKeys(strArg2);
	}

}