package pages;

import org.openqa.selenium.By;

public class SliderPage extends BasePage{
	
	public static final By bySliderBar = findBy("//input[@id='slideMe']");
	public static final By bySliderValue = findBy("//p//span[@id='value']");
	
	public static void dragAndDropSliderBar() {
		drag(bySliderBar, "Slider Bar");
	}
	
	public static void getSliderValue() {
		getText(bySliderValue, "Slider Value");
	}

}
