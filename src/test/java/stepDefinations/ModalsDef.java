package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ModalsPage;

public class ModalsDef {
	
	@When("User clicks on {string} button in Modals")
	public void user_clicks_on_button_in_modals(String string) throws InterruptedException {
		ModalsPage.clickOnModalButton(string);
		Thread.sleep(1000);
	}
	
	@Then("User verify the simple modal title and text")
	public void user_verify_the_simple_modal_title_and_text() throws InterruptedException {
		String simpleMsg = ModalsPage.getSimpleModalTitle();
		Assert.assertTrue(simpleMsg.equals("Hi, I’m a simple modal."));
	}
	
	@When("User enters {string} as {string} in contact info")
	public void user_enters_as_in_contact_info(String string, String string2) throws InterruptedException {
		ModalsPage.setNameAndEmail(string, string2);
		Thread.sleep(1000);
	}
	
	@When("User enters message as {string} in contact info")
	public void user_enters_message_as_in_contact_info(String string) throws InterruptedException {
		ModalsPage.setMessage(string);
	}
	
	@When("User clicks on submit button in modal form")
	public void user_clicks_on_submit_button_in_modal_form() throws InterruptedException {
		ModalsPage.clickOnSubmitButtonModalForm();
		Thread.sleep(2000);
	}
}
