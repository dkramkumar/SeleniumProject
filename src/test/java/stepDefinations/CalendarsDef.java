package stepDefinations;

import java.awt.AWTException;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CalendarsPage;

public class CalendarsDef {

	String selectedDate;

	@When("User enters the date {string} in text field")
	public void user_enterss_the_date_in_text_field(String string) throws InterruptedException, AWTException {
		CalendarsPage.setSelectOrEnterDate(string);
		Thread.sleep(1000);
	}

	@When("User selects the date {string} in calendar")
	public void user_selects_the_date_in_calendar(String string) throws InterruptedException {
		CalendarsPage.clickOnSelectOrEnterDate();
		Thread.sleep(1000);
		CalendarsPage.selectDateInCalendar(string);
		Thread.sleep(1000);
	}
	
	@Then("User verify the entered date")
	public void user_verify_the_entered_date() {
		String date = CalendarsPage.getMessageSentEnteredDate();
		Assert.assertTrue(date.equals("Select or enter a date: March 24, 2022"));
	}

	@Then("User verify the selected date")
	public void user_verify_the_selected_date() {
		String date = CalendarsPage.getMessageSentSelectedDate();
		Assert.assertTrue(date.equals("Select or enter a date: April 10, 2022"));
	}
}
