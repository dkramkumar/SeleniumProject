package stepDefinations;

import java.awt.AWTException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FileDownloadPage;

public class FileDownloadDef {
	
	@When("User clicks on download button in normal download")
	public void user_clicks_on_download_button_in_normal_download() throws InterruptedException {
		FileDownloadPage.clickOnNormalDownloadButton();
		Thread.sleep(2000);
	}
	
	@When("User enters the path to download in window based popup")
	public void user_enters_the_path_to_download_in_window_based_popup() throws InterruptedException, AWTException {
		FileDownloadPage.setPathToSaveFile();
		Thread.sleep(3000);
	}
	
	@When("User clicks on download button in Password Protected Download")
	public void user_clicks_on_download_button_in_password_protected_download() throws InterruptedException {
		FileDownloadPage.clickOnPasswordDownloadButton();
		Thread.sleep(5000);
	}
	
	@When("User enters {string} password")
	public void user_enters_password(String string) throws InterruptedException {
		FileDownloadPage.setDownloadPassword(string);
		Thread.sleep(2000);
	}
	
	@Then("User verify the file is downloaded")
	public void user_verify_the_file_is_downloaded() {

	}



}
