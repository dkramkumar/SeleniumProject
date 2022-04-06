package pages;

import org.openqa.selenium.By;

public class PopUpsPage extends BasePage{
	
	public static final By byConfirmResult = findBy("//p[@id='confirmResult']");
	public static final By byPromptResult = findBy("//p[@id='promptResult']");
	public static final By byPromtEnteringText = findBy("");
	
	public static void clickOnAlertConfirmPromptPopups(String pop) {
		By byPopups = findBy("//button[@id='"+pop+"']");
		clickElement(byPopups, pop+" Popup");
	}
	
	public static String getAlertPopupText() {
		String alertText = driver.switchTo().alert().getText();
		return alertText;
	}
	
	public static void clickOnOKButton() {
		driver.switchTo().alert().accept();
		System.out.println("INFO: User clicks on OK button");
	}
	
	public static void clickOnCancelButton() {
		driver.switchTo().alert().dismiss();
		System.out.println("INFO: User clicks on Cancel button");
	}
	
	public static String getConfirmMsgAfterClickingOkButton() {
		return getText(byConfirmResult, "After Clicking Ok Button");
	}
	
	public static String getConfirmMsgAfterClickingCancelButton() {
		return getText(byConfirmResult, "After Clicking Cancel Button");
	}
	
	public static String getPromtMsgAfterClickingOkButton() {
		return getText(byPromptResult, "After Clicking Ok Button");
	}
	
	public static String getPromtMsgAfterClickingCancelButton() {
		return getText(byPromptResult, "After Clicking Cancel Button");
	}
	
	public static String getPromtMsgAfterEnteringName() {
		return getText(byPromptResult, "After Clicking Cancel Button");
	}
	
	public static void getTextFromPromtAlert() {
		String text = driver.switchTo().alert().getText();
		System.out.println("INFO: " +text);
	}
	
	public static void setNameInPromtTextField(String data) throws InterruptedException {
	    driver.switchTo().alert().sendKeys(data);
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    String text = driver.findElement(By.id("promptResult")).getText();
	    System.out.println("INFO: " +text);
	}
}
