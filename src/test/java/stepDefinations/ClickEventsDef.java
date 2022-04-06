package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClickEventsPage;

public class ClickEventsDef {
	
	@When("User clicks on {string} button in click events")
	public void user_clicks_on_button_in_click_events(String string) throws InterruptedException {
		ClickEventsPage.clickOnButtonSounds(string);
		Thread.sleep(1000);
	}
	
	@Then("Verify the {string} sound {string} text")
	public void verify_the_sound_text(String string, String string2) {
		String text = ClickEventsPage.getSoundText(string);
		Assert.assertTrue(text.equals(string2));
	}
}
