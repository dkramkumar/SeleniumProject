package pages;

import org.openqa.selenium.By;

public class FileUploadPage extends BasePage{
	
	public static final By byChooseFile = findBy("//input[@id='file_upload']");
	
	public static void clickOnChooseFile() {
		clickElement(byChooseFile, "Choose File");
	}
	
	public static void fileUpload() {
		fileUpload(byChooseFile, "Choose File", "D:\\Files\\inter.txt");
	}
}
