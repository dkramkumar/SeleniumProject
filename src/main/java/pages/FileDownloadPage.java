package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileDownloadPage extends BasePage{
	
	public static final By byNormalDownloadButton = findBy("//a[@class='wpdm-download-link download-on-click btn btn-primary ']");
	public static final By byPasswordDownloadButton = findBy("//a[@class='wpdm-download-link wpdm-download-locked btn btn-primary ']");
	public static final By byDownloadPassword = findBy("//div[@class='modal-content']/div[3]/div/div[2]/form/div/input");
	public static final By bySubmit = findBy("//div[@class='modal-content']/div[3]/div/div[2]/form/div/span/input");
	
	public static void clickOnNormalDownloadButton() throws InterruptedException {
		clickElement(byNormalDownloadButton, "Normal Download Button");
	}
	
	public static void clickOnPasswordDownloadButton() throws InterruptedException {
		clickElement(byPasswordDownloadButton, "Password Download Button");
	}
	
	public static void setDownloadPassword(String data) throws InterruptedException {
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='wpdm-lock-frame']"));
		driver.switchTo().frame(frame1);
		setText(byDownloadPassword, "Password", data);
		Thread.sleep(1000);
		clickElement(bySubmit, "submit");
		Thread.sleep(2000);
	}
	public static void setPathToSaveFile() throws AWTException {
	
		Robot robot = new Robot();
		StringSelection stringSelection = new StringSelection("D:\\WS Auto Testing\\SanboxProject\\Download");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		System.out.println("File Uploaded sucessfully");
	}
	
	public static void verifyFileDownloadedOrNot() {
		File file = null;
		try {
			file = new File(fileDownloadPath);
			String filePath = file.getAbsolutePath();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		file.exists();
		String fileName = file.getName();
		System.out.println(" file path :" +file.getAbsolutePath());
		System.out.println("File name :" +fileName);
	}
}
