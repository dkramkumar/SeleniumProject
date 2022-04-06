package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GesturesPage;

public class GesturesDef {

	@When("User drags on the map")
	public void user_drags_on_the_map() throws InterruptedException {
		GesturesPage.dragOnCanvas();
		Thread.sleep(1000);
	}
	
	@When("User clicks on full screen")
	public void user_clicks_on_full_screen() throws InterruptedException {
		GesturesPage.clickOnFullScreenButton();
	}
	
	@When("User clicks on Zoom In button")
	public void user_clicks_on_zoom_in_button() throws InterruptedException {
		GesturesPage.clickOnZoomInButton();
	}
	
	@Then("User verify the Zoom In functionality working successfully")
	public void user_verify_the_zoom_in_functionality_working_successfully() {
		Assert.assertNotEquals(GesturesPage.beforeZoomIn, GesturesPage.afterZoomIn);
	}
	
	@When("User clicks on Zoom Out button")
	public void user_clicks_on_zoom_out_button() throws InterruptedException {
		GesturesPage.clickOnZoomOutButton();
	}
	
	@Then("User verify the Zoom Out functionality working successfully")
	public void user_verify_the_zoom_out_functionality_working_successfully() {
		Assert.assertNotEquals(GesturesPage.beforeZoomOut, GesturesPage.afterZoomOut);
	}
}
