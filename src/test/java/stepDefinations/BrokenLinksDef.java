package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Then;
import pages.BrokenLinksPage;

public class BrokenLinksDef {
	
	@Then("User verify the broken links")
	public void user_verify_the_broken_links() throws IOException {
		BrokenLinksPage.verifyBrokenLink();
	}
}
