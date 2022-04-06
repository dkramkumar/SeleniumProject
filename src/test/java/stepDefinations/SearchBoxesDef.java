package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchBoxesPage;

public class SearchBoxesDef {
	
	@When("user enters {string} in search box")
	public void user_enters_in_search_box(String string) throws InterruptedException {
		SearchBoxesPage.setSearchBox(string);
		Thread.sleep(1000);
	}
	
	@When("User scroll to search boxes button")
	public void user_scroll_to_search_boxes_button() throws InterruptedException {
		SearchBoxesPage.scrollToSearchBoxes();
		Thread.sleep(1000);
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		SearchBoxesPage.clickOnSearchButton();
		Thread.sleep(2000);
	}
	
	@Then("User verify entry header")
	public void user_verify_entry_header() {
		String header = SearchBoxesPage.getEntryHeader();
		Assert.assertTrue(header.equals("Search Results for: Selenium"));
	}
}
