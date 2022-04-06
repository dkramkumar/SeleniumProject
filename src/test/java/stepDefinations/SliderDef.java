package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SliderPage;

public class SliderDef {
	
	@When("User slids the bar")
	public void user_slids_the_bar() throws InterruptedException {
		SliderPage.dragAndDropSliderBar();
		Thread.sleep(1000);
	}
	
	@Then("Verify the value of slider")
	public void verify_the_value_of_slider() {
		SliderPage.getSliderValue();
	}
}
