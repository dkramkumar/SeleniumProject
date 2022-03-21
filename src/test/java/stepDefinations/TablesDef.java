package stepDefinations;

import io.cucumber.java.en.When;
import pages.TablesPage;

public class TablesDef {
	
	@When("User get the item details and price from simple table")
	public void user_get_the_item_details_and_price_from_simple_table() {
		TablesPage.getSimpleTableItems();
	}
}
