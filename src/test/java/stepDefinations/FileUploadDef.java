package stepDefinations;

import io.cucumber.java.en.When;
import pages.FileUploadPage;

public class FileUploadDef {
	
	@When("User clicks on Choose file button")
	public void user_clicks_on_choose_file_button() throws InterruptedException {
		FileUploadPage.clickOnChooseFile();
		Thread.sleep(1000);
	}
	
	@When("User selects the file to upload")
	public void user_selects_the_file_to_upload() {
		FileUploadPage.fileUpload();
	}
	
	@When("User clicks on Upload button")
	public void user_clicks_on_upload_button() {

	}
}
