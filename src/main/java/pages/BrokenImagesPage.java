package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenImagesPage extends BasePage{
	
	public static void verifyBrokenImages() {
			
			List<WebElement> images = driver.findElements(By.tagName("img"));
			for(WebElement img : images) {
				if(img. getAttribute("naturalWidth").equals("0")) {
					System.out.println(img.getAttribute("outerHTML")+"BROKEN IMAGE");
				}else {
					System.out.println(img.getAttribute("outerHTML")+"VALID IMAGE");
				}
			}
			
			
	}
}
