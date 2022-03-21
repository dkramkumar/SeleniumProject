package pages;

import java.security.SecureRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	
	public static void initialSetUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\WS Auto Testing\\SanboxProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void openUrl() throws InterruptedException {
		driver.get("https://automatenow.io/sandbox-automation-testing-practice-website/");
		Thread.sleep(2000);
		System.out.println("INFO: URL: " +driver.getCurrentUrl());
		System.out.println("INFO: Title: " +driver.getTitle());
	}
	
	public static By findBy(String sLocator) {

		By byElement = null;
		if(sLocator.contains("/")) {
			byElement = By.xpath(sLocator);
		}else {
			byElement = By.id(sLocator);
		}
		return byElement;
	}

	public static WebElement findObject(By ele, String selector) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement wEle =  wait.until(ExpectedConditions.presenceOfElementLocated(ele));
		return wEle;
	}

	public static void clickElement(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.click(wEle).build().perform();
			System.out.println("INFO: Element "+selector+ " is clicked");
		} catch (Exception e) {
			System.out.println("ERROR: Element is "+selector+" not clickable");
		}
	}

	public static void setText(By ele, String selector, String text) {
		WebElement wEle =  findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.sendKeys(wEle, text).build().perform();
			System.out.println("INFO: Entering text in "+selector+ " is :" +text);
		} catch (Exception e) {
			System.out.println("ERROR: Entering text in "+selector+ " is failed");
		}
	}

	public static String getText(By ele, String selector) {
		WebElement wEle =  findObject(ele, selector);
		String text = wEle.getText();
		System.out.println("INFO: Getting text from "+selector+ " is : " +text);
		return text;
	}
	
	public static String getAttribute(By ele, String selector) {
		WebElement wEle =  findObject(ele, selector);
		String text = wEle.getAttribute("value");
		System.out.println("INFO: Getting text from "+selector+ " is : " +text);
		return text;
	}

	public static boolean isElementPresent(By ele, String selector) {
		boolean status = false;
		try {
			WebElement wEle = findObject(ele, selector);
			status = wEle.isDisplayed();
			System.out.println("INFO: Element " + selector + " is present on screen ");
			return status;
		} catch (Exception e) {
			System.out.println("ERROR: Element " + selector + " is not present on screen ");
		}
		return status;
	}

	public static void scrollPage(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", wEle);
	}
	
	public static void selectFromDropDown(By ele, String selector, String text) {
		WebElement wEle = findObject(ele, selector);
		try {
			Select sel = new Select(wEle);
			sel.selectByVisibleText(text);
			System.out.println("INFO: Element from " +selector+ "selected is : "+text);
		} catch (Exception e) {
			System.out.println("ERROR: Element from " +selector+ "is not selected");
		}	
	}
	
	public static void doubleClick(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.doubleClick(wEle).build().perform();
			System.out.println("INFO: Element "+selector+ " is double clicked");
		} catch (Exception e) {
			System.out.println("ERROR: Element is not clickable");
		}
	}
	
	public static void dragAndDrop(By sourceEle, By targetEle,String sourceSelector, String targetSelector) {
		WebElement wEleSource = findObject(sourceEle, sourceSelector);
		WebElement wEleTarget = findObject(targetEle, targetSelector);
		try {
			Actions act = new Actions(driver);
			act.dragAndDrop(wEleSource, wEleTarget).build().perform();
			System.out.println("INFO: Element "+sourceSelector+ " is drag and droppped at " +targetSelector+ " element");
		} catch (Exception e) {
			System.out.println("ERROR: Element is not drag and dropped");
		}
	}
	
	public static void rightClick(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.contextClick(wEle).build().perform();
			System.out.println("INFO: Element "+selector+ " is right clicked");
		} catch (Exception e) {
			System.out.println("ERROR: Element is not clickable");
		}
	}
	
	public static void drag(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.dragAndDropBy(wEle, 200, 50).build().perform();
			System.out.println("INFO: Element "+selector+ " is dragged");
		} catch (Exception e) {
			System.out.println("ERROR: Element is not dragged");
		}
	}
	
	public static void curcurMovedToElement(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.moveToElement(wEle).build().perform();
			System.out.println("INFO: Cursur moved to " +selector);
		} catch (Exception e) {
			System.out.println("ERROR: Cursur not moved to " +selector);
		}
	}
	
	
	public static void resizable(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.dragAndDropBy(wEle, 250, 250).build().perform();
			System.out.println("INFO: Element "+selector+ " is resized");
		} catch (Exception e) {
			System.out.println("ERROR: Element is not resized");
		}
	}
	
	public static void newTab(By ele, String selector) {
		WebElement wEle = findObject(ele, selector);
		try {
			Actions act = new Actions(driver);
			act.keyDown(wEle, Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
			System.out.println("INFO: Moved to "+selector+ " window");
		} catch (Exception e) {
			System.out.println("ERROR: Not moved to new tab window");
		}
	}
	
	public static String getRandomString(int length) {
		String ab = "abcdefghijklmnopqrstuvwxyz";
		
		SecureRandom sr = new SecureRandom();
		StringBuffer sb = new StringBuffer(length);
		
		for(int i=0; i<length; i++) {
			sb.append(ab.charAt(sr.nextInt(ab.length())));
		}
		return sb.toString();
	}

}
