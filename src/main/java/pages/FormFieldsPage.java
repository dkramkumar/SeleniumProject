package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FormFieldsPage extends BasePage{
	
	public static final By byInputField = findBy("//input[@id='g1103-inputfield']");
	public static final By byRadioButtonFirstBlue = findBy("(//input[@name='g1103-radiobuttons'])[1]");
	public static final By byRadioButtonSecondBlue = findBy("(//input[@name='g1103-radiobuttons'])[3]");
	public static final By byRadioButtonWhite = findBy("//input[@value='White']");
	public static final By byDropDownMenu = findBy("//select[@name='g1103-dropdownmenu']");
	public static final By byEmail = findBy(" //input[@id='email']");
	public static final By byInputBox = findBy("//textarea[@id='contact-form-comment-message']");
	public static final By bySubmit = findBy("(//button[@type='submit'])[1]");
	public static final By byContactSubmissionMessage = findBy("//div[@id='contact-form-1103']//blockquote//p[1]");
	
	
	public static void clickOnHomeSandboxButtons(String data) {
		By byFormFieldsButton = findBy("//a[contains(text(), '"+data+"')]");
		clickElement(byFormFieldsButton, data);
	}

	public static void setInputField(String text) {
		setText(byInputField, "Input Field", text);
	}

	public static void clickOnCheckBoxes(String data) {
		By byCheckBox = findBy("//input[@value='"+data+"']");
		clickElement(byCheckBox, data);
	}
	
	public static void scrollDownToDropDownMenu() {
		scrollPage(byDropDownMenu, "Dropdown menu");
	}
	
	public static void scrollDownToSubmitButton() {
		scrollPage(bySubmit, "Submit Button");
	}
	
	public static void scrollDownToRadioButton() {
		scrollPage(byRadioButtonFirstBlue, "Radio Button");
	}
	
	public static void clickOnRadioButtonFirstBlue() {
		clickElement(byRadioButtonFirstBlue, "Radio Button First Blue");
	}

	public static void selectFromDropDownMenu(String data) throws InterruptedException {
		clickElement(byDropDownMenu, "Drop down menu");
		Thread.sleep(1000);
		selectFromDropDown(byDropDownMenu, "Drop down menu", data);
	}

	public static void getListOfItems() {
		List<WebElement> listItems = driver.findElements(By.xpath("//div//ul//li[contains(text(), 'Item')]"));
		Iterator<WebElement> itr = listItems.iterator();
		while(itr.hasNext()) {
			String items = itr.next().getText();
			System.out.println("INFO: List of items are : " +items);
		}
	}

	public static void setEmail(String data) {
		setText(byEmail, "Email", data);
	}
	
	public static void setInputBox(String data) {
		setText(byInputBox, "Input Box", data);
	}
	
	public static void clickOnSubmitButton() {
		clickElement(bySubmit, "Submit");
	}
	
	public static boolean isContactSubmissionMessagePresent() {
		getText(byContactSubmissionMessage, "Submission Message");
		return isElementPresent(byContactSubmissionMessage, "Submission Message");
	}
}
