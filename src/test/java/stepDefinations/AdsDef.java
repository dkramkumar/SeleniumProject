package stepDefinations;

import io.cucumber.java.en.Then;
import pages.AdsPage;

public class AdsDef {

	@Then("Verify Ads open after five seconds")
	public void verify_ads_open_after_five_seconds() throws InterruptedException {
		AdsPage.verifyAdPresentonScreen();
	}
}
