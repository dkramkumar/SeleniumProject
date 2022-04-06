package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.When;
import pages.IFramesPage;

public class IFramesDef {
	
	@When("User switch to iframe and gets the header")
	public void user_switch_to_iframe_and_gets_the_header() {
		IFramesPage.getIFrame();
	}

	@When("User scroll down to second frame")
	public void user_scroll_down_to_second_frame() throws InterruptedException {
		IFramesPage.scrollDownToSecondFrame();
		Thread.sleep(1000);
	}
	
	@When("User switch to second iframe and gets the header")
	public void user_switch_to_second_iframe_and_gets_the_header() {
		String text = IFramesPage.getSecondIFrame();
		Assert.assertEquals(text, "Introducing Android 12.");
	}
	
}
