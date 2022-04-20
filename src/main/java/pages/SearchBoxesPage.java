package pages;

import org.openqa.selenium.By;

public class SearchBoxesPage extends BasePage{
	
	public static final By bySearchBox = findBy("//input[@id='wp-block-search__input-1']");
	public static final By bySearchButton = findBy("//button[contains(text(), 'Search')]");
	public static final By byEntryHeader = findBy("//h1[contains(text(), 'Search Results for: Selenium')]");
	
	
	
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
	
	public static String getHeaderText(String data) {
		By byHeaderText = findBy("//h1[contains(text(), '"+data+"')]");
		return getText(byHeaderText, "Header Text");
	}
}
