package pages;

import org.openqa.selenium.By;

public class ClickEventsPage extends BasePage{
	
	public static final By bySoundText = findBy("//p[@id='demo']");
	
	public static void clickOnButtonSounds(String data) {
		By bySound = findBy("//button[@onclick='"+data+"Sound()']");
		clickElement(bySound, data + "sound");
	}
	
	public static String getSoundText(String data) {
		return getText(bySoundText, data);
	}

}
