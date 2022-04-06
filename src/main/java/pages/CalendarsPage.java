package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;

public class CalendarsPage extends BasePage{
	public static final By bySelectOrEnterDate = findBy("g1065-selectorenteradate");
	public static final By byMessageSentEnteredDate = findBy("//div[@id='contact-form-1065']/blockquote/p");	
	
	public static void setSelectOrEnterDate(String data) throws InterruptedException, AWTException {
		setText(bySelectOrEnterDate, "EnterDate", data);
		Thread.sleep(1000);
		clickElement(bySelectOrEnterDate, "Enter Date");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	
	public static String getMessageSentEnteredDate() {
		return getText(byMessageSentEnteredDate, "Entered Date");	
	}
	
	public static void clickOnSelectOrEnterDate() {
		clickElement(bySelectOrEnterDate, "Select or enter date");
	}
	
	public static void selectDateInCalendar(String date) throws InterruptedException {
		By byDate = findBy("//*[@data-handler='selectDay']/a[@data-date='"+date+"']");
		clickElement(byDate, date);
		Thread.sleep(1000);
	}
	
	public static String getMessageSentSelectedDate() {
		return getText(byMessageSentEnteredDate, "Selected Date");
	}

}
