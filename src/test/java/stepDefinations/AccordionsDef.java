package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccordionsPage;

public class AccordionsDef {
	
	@When("User clicks on Click to see more")
	public void user_clicks_on_click_to_see_more() throws InterruptedException {
		AccordionsPage.clickToSeeMore();
		Thread.sleep(1000);
	}
	
	@Then("User verify the accordion message")
	public void user_verify_the_accordion_message() {
		String text = AccordionsPage.getAccordionMessage();
		Assert.assertTrue(text.equals("This is an accordion item."));
	}
}
