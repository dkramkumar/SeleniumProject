package pages;

import org.openqa.selenium.By;

public class SearchBoxesPage extends BasePage{
	
	public static final By bySearchBox = findBy("//input[@id='wp-block-search__input-1']");
	public static final By bySearchButton = findBy("//button[contains(text(), 'Search')]");
	public static final By byEntryHeader = findBy("//section[@id='title']/div/h1");
	
	
	
	public static void setSearchBox(String text) {
		setText(bySearchBox, "Search Box", text);
	}
	
	public static void scrollToSearchBoxes() {
		By bySearchBoxes = findBy("//a[contains(text(), 'Search Boxes')]");
		scrollPage(bySearchBoxes, "Search Boxes");
	}
	
	public static void clickOnSearchButton() {
		clickElement(bySearchButton, "Search Button");
	}
	
	public static String getEntryHeader() {
		return getText(byEntryHeader, "Entry Header");
	}

}
