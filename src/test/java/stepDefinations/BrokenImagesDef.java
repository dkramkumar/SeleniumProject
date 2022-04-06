package stepDefinations;

import io.cucumber.java.en.Then;
import pages.BrokenImagesPage;

public class BrokenImagesDef {
	
	@Then("User verify the broken images")
	public void user_verify_the_broken_images() {
		BrokenImagesPage.verifyBrokenImages();
	}
}
