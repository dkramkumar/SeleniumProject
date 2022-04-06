package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HoverPage;

public class HoverDef {
	
	@When("User move to mouse over me button")
	public void user_move_to_mouse_over_me_button() throws InterruptedException {
		HoverPage.moveToMouseOverMeButton();
	}
	
	@Then("User get the mouse over out put message")
	public void user_get_the_mouse_over_out_put_message() {

	}
}
