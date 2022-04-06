package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PopUpsPage;

public class PopupsDef {
	
	@When("User clicks on {string} popup")
	public void user_clicks_on_popup(String string) throws InterruptedException {
		PopUpsPage.clickOnAlertConfirmPromptPopups(string);
		Thread.sleep(1000);
	}
	
	@When("User enters {string} in prompt popup  text field")
	public void user_enters_in_prompt_popup_text_field(String string) throws InterruptedException {
		PopUpsPage.setNameInPromtTextField(string);
		Thread.sleep(1000);
	}

	@When("User gets the text from the alert popup")
	public void user_gets_the_text_from_the_alert_popup() throws InterruptedException {
		PopUpsPage.getAlertPopupText();
		Thread.sleep(1000);
	}
	
	@When("User verify the text on the alert popup")
	public void user_verify_the_text_on_the_alert_popup() {
		System.out.println("INFO: " +PopUpsPage.getAlertPopupText());
		Assert.assertEquals(PopUpsPage.getAlertPopupText(), "Hi there pal!");
	}
	
	@When("User clicks on OK button")
	public void user_clicks_on_ok_button() {
		PopUpsPage.clickOnOKButton();
	}
	
	@Then("User verify the text after clicking OK button")
	public void user_verify_the_text_after_clicking_ok_button() throws InterruptedException {
		String okMsg = PopUpsPage.getConfirmMsgAfterClickingOkButton();
		Assert.assertTrue(okMsg.equals("OK it is!"));
		Thread.sleep(1000);
	}
	
	@Then("User clicks on Cancel button")
	public void user_clicks_on_cancel_button() throws InterruptedException {
		PopUpsPage.clickOnCancelButton();
		Thread.sleep(1000);
	}
	
	@Then("User verify the text after clicking Cancel button")
	public void user_verify_the_text_after_clicking_cancel_button() throws InterruptedException {
		String cancelMsg = PopUpsPage.getConfirmMsgAfterClickingCancelButton();
		Assert.assertTrue(cancelMsg.equals("Cancel it is!"));
		Thread.sleep(1000);
	}
	
	@When("User get the text from text box")
	public void user_get_the_text_from_text_box() throws InterruptedException {
		PopUpsPage.getTextFromPromtAlert();
		Thread.sleep(1000);
	}

	@Then("User get the prompt result after clicking OK button")
	public void user_get_the_prompt_result_after_clicking_ok_button() throws InterruptedException {
		String promtResult = PopUpsPage.getPromtMsgAfterClickingOkButton();
		Assert.assertTrue(promtResult.equals("Nice to meet you Super Automator!"));
		Thread.sleep(1000);
	}
	
	@Then("User get the prompt result after clicking Cancel button")
	public void user_get_the_prompt_result_after_clicking_cancel_button() {
		String promtResult = PopUpsPage.getPromtMsgAfterClickingCancelButton();
		Assert.assertTrue(promtResult.equals("Fine, don't tell me then :("));
	}
}
