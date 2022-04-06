package pages;

import org.openqa.selenium.By;

public class AdsPage extends BasePage{
	
	public static final By byAdsText = findBy("(//div[@class='pum-content popmake-content'])[2]");
	
	public static void verifyAdPresentonScreen() throws InterruptedException {
		Thread.sleep(8000);
		getText(byAdsText, "Ads");
	}
}
