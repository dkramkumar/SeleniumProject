package stepDefinations;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WindowsOperationPage;

public class WindowsOperationDef {
	
	@When("User clicks on {string} in window operations")
	public void user_clicks_on_in_window_operations(String string) throws InterruptedException {
		WindowsOperationPage.clickOnWindows(string);
		Thread.sleep(1000);
	}
	
	@Then("Verify the new tab is opened")
	public void verify_the_new_tab_is_opened() {
		String title = WindowsOperationPage.verifyNewTabOpened();
		Assert.assertTrue(title.equals("Google"));
	}
	
	@Then("Verify that the window is replaced")
	public void verify_that_the_window_is_replaced() throws InterruptedException {
		String url = WindowsOperationPage.verifyWidowIsReplaced();
		Assert.assertTrue(url.equals("https://www.google.com/"));
	}
	
	@When("User scroll to New Window")
	public void user_scroll_to_new_window() throws InterruptedException {
		WindowsOperationPage.scrollToNewWindow();
		Thread.sleep(1000);
	}
	
	@Then("Verify that the New Window is opened")
	public void verify_that_the_new_window_is_opened() throws InterruptedException {
		String newWindow = WindowsOperationPage.verifyNewWindowOpened();
		System.out.println("INFO: Title is : " +newWindow);
		Assert.assertTrue(newWindow.equals("Google"));
	}
}
