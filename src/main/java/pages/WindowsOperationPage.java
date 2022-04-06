package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;

public class WindowsOperationPage extends BasePage{
	
	public static void clickOnWindows(String data) {
		By byNewTab = findBy("//p//button[contains(text(), '"+data+"')]");
		clickElement(byNewTab, data);
	}
	
	public static String verifyNewTabOpened() {
		Set<String> handles = driver.getWindowHandles();
		List<String> li = new ArrayList<>(handles);
		String c = li.get(1);
		driver.switchTo().window(c);
		return driver.getTitle();
	}
	
	public static String verifyWidowIsReplaced() throws InterruptedException {
		String afterReplace = driver.getCurrentUrl();
		System.out.println("INFO: After clicking Replace window the url is : " +afterReplace);
		return afterReplace;
	}
	
	public static String verifyNewWindowOpened() throws InterruptedException {
		Set<String> handles = driver.getWindowHandles();
		List<String> li = new ArrayList<>(handles);
		String c = li.get(1);
		driver.switchTo().window(c);
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(1000);
		return driver.getTitle();
	}
	
	public static void scrollToNewWindow() {
		By byNewWindow = findBy("//p//button[contains(text(), 'New Window')]");
		scrollPage(byNewWindow, "New Window");
	}
}
