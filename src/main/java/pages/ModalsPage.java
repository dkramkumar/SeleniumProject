package pages;

import org.openqa.selenium.By;

public class ModalsPage extends BasePage{
	
	public static final By bySimpleModalTitle = findBy("//div[@id='pum_popup_title_1318']");
	public static final By bySimpleModalMsg = findBy("//div[@id='pum_popup_title_1318']/following::div[1]");
	public static final By byMessage = findBy("//textarea[@name='g1051-message']");
	public static final By bySubmitButtonModalForm = findBy("//p[@class='contact-submit']/button");
	
	public static void clickOnModalButton(String data) {
		By byModelButton = findBy("//button[@id='"+data+"']");
		clickElement(byModelButton, data);
	}
	
	public static String getSimpleModalTitle() throws InterruptedException {
		getText(bySimpleModalTitle, "Simple Modal Title");
		Thread.sleep(1000);
		return getText(bySimpleModalMsg, "Simple Modal Message");
	}
	
	public static void setNameAndEmail(String data, String text) throws InterruptedException {
		By byName = findBy("//input[@id='g1051-"+data+"']");
		setText(byName, "Name", text);
	}	
	
	public static void setMessage(String text) throws InterruptedException {
		By byMessage = findBy("//textarea[@name='g1051-message']");
		setText(byMessage, "Name", text);
	}	
	
	public static void clickOnSubmitButtonModalForm() {
		clickElement(bySubmitButtonModalForm, "Submit");
	}
}
