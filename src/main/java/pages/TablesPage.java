package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TablesPage extends BasePage{
	
	public static final By byItem = findBy("//*[@id='post-1076']/div/figure/table/tbody/tr[1]/td[1]");
	public static final By byPrice = findBy("//*[@id='post-1076']/div/figure/table/tbody/tr[1]/td[2]");
	
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
		int rows = driver.findElements(By.xpath("//*[@id='tablepress-1']/tbody/tr")).size();
		
	}
}
