package pages;

import org.openqa.selenium.By;

public class AccordionsPage extends BasePage{

	public static final By byClickToSeeMore = findBy("//summary[@class='wp-block-coblocks-accordion-item__title']");
	public static final By byAccordionMessage = findBy("//div[@class='wp-block-coblocks-accordion-item__content']/p");
	
	public static void clickToSeeMore() {
		clickElement(byClickToSeeMore, "Click To See More");
	}
	
	public static String getAccordionMessage() {
		return getText(byAccordionMessage, "Accordion Message");
	}
}
