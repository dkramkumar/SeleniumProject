package pages;

import org.openqa.selenium.By;

public class HoverPage extends BasePage{
	
	public static final By byMouseOverMebutton = findBy("//h3[@id='mouse_over']");
	
	public static void moveToMouseOverMeButton() throws InterruptedException {
		curcurMovedToElement(byMouseOverMebutton, "Mouse Over Me button");
		Thread.sleep(1000);
		
		getText(byMouseOverMebutton, "Mouse Over message");
	}
	
	

}
