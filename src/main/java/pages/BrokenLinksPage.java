package pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLinksPage extends BasePage{
	
	public static void verifyBrokenLinks() throws IOException {
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		Iterator<WebElement> itr = tag.iterator();
		HttpURLConnection httpConn = null;
		while(itr.hasNext()) {
			String links = itr.next().getAttribute("href");
			try {
				URL url = new URL(links);
				httpConn = (HttpURLConnection)url.openConnection();
				httpConn.setConnectTimeout(5000);
				httpConn.connect();
					if(httpConn.getResponseCode()==200) {
						System.out.println(links+ "---> VALID LINKS ");
					}else
						System.out.println(links+ "---> BROKEN LINKS");
			}catch(MalformedURLException e) {
				e.printStackTrace();
			}
		}	
		httpConn.disconnect();
	}
	
	public static void verifyBrokenLink() throws IOException {
		HttpURLConnection httpConn = null;
		WebElement ele = driver.findElement(By.xpath("//p//a[@href='https://automatenow.iot/']"));
		String link = ele.getAttribute("href");
		URL url = new URL(link);
		try {
			httpConn = (HttpURLConnection) url.openConnection();
			httpConn.setConnectTimeout(5000);
			httpConn.connect();
			
			if(httpConn.getResponseCode()==200) {
				System.out.println(link+ "---> Valid Link");
			}
			if(httpConn.getResponseCode()>=400) {
				System.out.println(link+ " ---> BROKEN LINK");
			}
			
		} catch (UnknownHostException e) {
			System.out.println("INFO: " +link+ " is BROKEN");
		}
		
		finally {
			httpConn.disconnect();
		}
	}
}
