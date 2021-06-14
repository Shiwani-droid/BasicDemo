package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,
features="src/test/java/features",
glue="stepdefinitons",
//tags = "@SmokeTest",
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome=true,
publish=true
)
		

public class TestRunner  {

}
