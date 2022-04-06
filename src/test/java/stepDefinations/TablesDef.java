package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TablesPage;

public class TablesDef {
	
	@When("User get the item details and price from simple table")
	public void user_get_the_item_details_and_price_from_simple_table() {
		TablesPage.getSimpleTableItems();
	}
	
	@When("User get the countries by population in sorted table")
	public void user_get_the_countries_by_population_in_sorted_table() throws InterruptedException {
		TablesPage.getDataFromSortableTable();
		Thread.sleep(1000);
	}
	
	@When("User selects {string} as entries in sortable table")
	public void user_selects_as_entries_in_sortable_table(String string) throws InterruptedException {
		TablesPage.getEntriesinSortableTable(string);
		Thread.sleep(1000);
	}
	
	@Then("User verify number of rows displayed")
	public void user_verify_number_of_rows_displayed() {
		int rows = TablesPage.getNumOfRowsAfterEntriesSelected();
		Assert.assertEquals(rows, 25);
	}
}
