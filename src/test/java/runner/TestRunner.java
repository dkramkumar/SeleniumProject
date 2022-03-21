package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				tags = "@Table",
				features = "src/test/resources/Features",
				glue = "stepDefinations",
				plugin = {"json:target/output/cucumber.json",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				monochrome = true
				)

public class TestRunner {

}
