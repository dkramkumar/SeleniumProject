package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.FormFieldsPage;
import org.junit.Assert; 

public class FormFieldsDef extends BasePage{
	
	@Given("User is on sandbox web site")
	public void user_is_on_sandbox_web_site() throws InterruptedException {
		initialSetUp();
		openUrl();
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) throws InterruptedException {
		FormFieldsPage.clickOnHomeSandboxButtons(string);
		Thread.sleep(2000);
	}

	@When("User enters {string} in input field")
	public void user_enters_in_input_field(String string) throws InterruptedException {
		FormFieldsPage.setInputField(string);
		Thread.sleep(1000);
	}

	@When("User clicks on {string} check box")
	public void user_clicks_on_check_box(String string) throws InterruptedException {
		FormFieldsPage.clickOnCheckBoxes(string);
		Thread.sleep(1000);
	}

	@When("User scroll down to dropdown menu")
	public void user_scroll_down_to_dropdown_menu() throws InterruptedException {
		FormFieldsPage.scrollDownToDropDownMenu();
		Thread.sleep(1000);
	}
	
	@When("User scroll down to submit button")
	public void user_scroll_down_to_submit_button() throws InterruptedException {
		FormFieldsPage.scrollDownToSubmitButton();
		Thread.sleep(1000);
	}
	
	@When("User scroll down to radio button")
	public void user_scroll_down_to_radio_button() throws InterruptedException {
		FormFieldsPage.scrollDownToRadioButton();
		Thread.sleep(1000);
	}
	
	@When("User enters {string} as email id")
	public void user_enters_as_email_id(String string) throws InterruptedException {
		FormFieldsPage.setEmail(string);
		Thread.sleep(1000);
	}

	@When("User selects the FirstBlue in radio button")
	public void user_selects_the_first_blue_in_radio_button() throws InterruptedException {
		FormFieldsPage.clickOnRadioButtonFirstBlue();
		Thread.sleep(1000);
	}

	@When("User selects the {string} from drop down menu")
	public void user_selects_the_from_drop_down_menu(String string) throws InterruptedException {
		FormFieldsPage.selectFromDropDownMenu(string);
		Thread.sleep(1000);
	}

	@When("User gets the list of items")
	public void user_gets_the_list_of_items() throws InterruptedException {
		FormFieldsPage.getListOfItems();
		Thread.sleep(1000);
	}

	@When("User enters the message {string} in input box")
	public void user_enters_the_message_in_input_box(String string) throws InterruptedException {
		FormFieldsPage.setInputBox(string);
		Thread.sleep(1000);
	}

	@When("User clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
		FormFieldsPage.clickOnSubmitButton();
		Thread.sleep(1000);
	}

	@Then("User verifies Contact Form Submission Message")
	public void user_verifies_contact_form_submission_message() {
		Assert.assertTrue(FormFieldsPage.isContactSubmissionMessagePresent());
	}

}
