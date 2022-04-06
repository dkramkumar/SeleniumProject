package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TablesPage extends BasePage{
	
	public static final By byItem = findBy("//*[@id='post-1076']/div/figure/table/tbody/tr[1]/td[1]");
	public static final By byPrice = findBy("//*[@id='post-1076']/div/figure/table/tbody/tr[1]/td[2]");
	public static final By byEntriesSelectBox = findBy("//*[@id='tablepress-1_length']/label/select");
	public static final By byEmailOrPhone = findBy("//input[@id='identifierId']");
	
	public static void getSimpleTableItems() {
		
		int rows = driver.findElements(By.xpath("//*[@id='post-1076']/div/figure/table/tbody/tr")).size();
		for(int i= 2; i<=rows+1; i++) {
			List<WebElement> items = driver.findElements(By.xpath("//*[@id='post-1076']/div/figure/table/tbody/tr["+i+"]"));
			Iterator<WebElement> itr = items.iterator();
			while(itr.hasNext()) {
				String text = itr.next().getText();
				System.out.println("Items in a table are : " +text);
			}
		}
	}
	
	public static void getDataFromSortableTable() {
		List<WebElement> li = driver.findElements(By.xpath("//*[@id='tablepress-1']/tbody/tr"));
		for(WebElement wle : li){
			System.out.println(wle.getText());
		}
	}
	
	public static void getEntriesinSortableTable(String data) {
		//clickElement(byEntriesSelectBox, "Entries Select Box");
		selectFromDropDown(byEntriesSelectBox, "Entries", data);
	}
	
	public static int getNumOfRowsAfterEntriesSelected() {
		int rows = driver.findElements(By.xpath("//*[@id='tablepress-1']/tbody/tr")).size();
		if(rows==25) {
			System.out.println("Number of rows displayed : " +rows);
		}
		return rows;
	}
}
