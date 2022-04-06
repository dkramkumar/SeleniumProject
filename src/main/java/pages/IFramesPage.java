package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFramesPage extends BasePage{
	
	public static final By byIFrame = findBy("//h1[@class='central-textlogo-wrapper']/span");
	public static final By byIFrame2 = findBy("//h1[@class='is-2 is-2--scale']");
	
	public static void getIFrame() {
		WebElement frame1 = driver.findElement(By.xpath("//*[@id='frame1']"));
		driver.switchTo().frame(frame1);
		getText(byIFrame, "Header");
	}
	
	public static String getSecondIFrame() {
		WebElement frame1 = driver.findElement(By.xpath("//*[@id='frame2']"));
		driver.switchTo().frame(frame1);
		return getText(byIFrame2, "Header");
	}
	
	public static void scrollDownToSecondFrame() {
		By byFrame2 = findBy("//*[@id='frame2']");
		scrollPage(byFrame2, "Second Frame");
	}

}
