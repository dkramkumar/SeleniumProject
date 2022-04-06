package pages;

import org.openqa.selenium.By;

public class GesturesPage extends BasePage{

	public static final By byCanvas = findBy("//canvas[@class='mapboxgl-canvas']");
	public static final By byFullScreenButton = findBy("//button[@class='mapboxgl-ctrl-fullscreen']");
	public static final By byZoomInButton = findBy("//button[@class='mapboxgl-ctrl-zoom-in']");
	public static final By byZoomOutButton = findBy("//button[@class='mapboxgl-ctrl-zoom-out']");
	public static String beforeZoomIn;
	public static String afterZoomIn;
	public static String beforeZoomOut;
	public static String afterZoomOut;

	public static void clickOnFullScreenButton() throws InterruptedException {
		String x = driver.findElement(By.xpath("//canvas[@class='mapboxgl-canvas']")).getAttribute("style");
		System.out.println("Before full screen : " +x);
		clickElement(byFullScreenButton, "Full Screen Button");
		Thread.sleep(2000);
		String x1 = driver.findElement(By.xpath("//canvas[@class='mapboxgl-canvas']")).getAttribute("style");
		System.out.println("Full Screen : " +x1);
	}
	public static void dragOnCanvas() throws InterruptedException {
		String x = driver.findElement(By.xpath("//div[@class='wp-block-jetpack-map-marker mapboxgl-marker mapboxgl-marker-anchor-center']")).getAttribute("style");
		System.out.println("Before drag : "+x.substring(33, 56));
		drag1(byCanvas, "Drag on Canvas");
		Thread.sleep(1000);
		String x1 = driver.findElement(By.xpath("//div[@class='wp-block-jetpack-map-marker mapboxgl-marker mapboxgl-marker-anchor-center']")).getAttribute("style");
		System.out.println("After drag : "+x1.substring(33, 56));
	}

	public static void clickOnZoomInButton() throws InterruptedException {
		beforeZoomIn = driver.findElement(By.xpath("//div[@class='wp-block-jetpack-map-marker mapboxgl-marker mapboxgl-marker-anchor-center']")).getAttribute("style");
		System.out.println("INFO: Before Zoom In : "+beforeZoomIn.substring(33, 56));
		drag1(byCanvas, "Drag on Canvas");
		clickElement(byZoomInButton, "Zoom In Button");
		Thread.sleep(1000);
		afterZoomIn = driver.findElement(By.xpath("//div[@class='wp-block-jetpack-map-marker mapboxgl-marker mapboxgl-marker-anchor-center']")).getAttribute("style");
		System.out.println("INFO: After Zoom In : "+afterZoomIn.substring(33, 56));
	}
	
	public static void clickOnZoomOutButton() throws InterruptedException {
		beforeZoomOut = driver.findElement(By.xpath("//div[@class='wp-block-jetpack-map-marker mapboxgl-marker mapboxgl-marker-anchor-center']")).getAttribute("style");
		System.out.println("INFO: Before Zoom Out : "+beforeZoomOut.substring(33, 56));
		drag1(byCanvas, "Drag on Canvas");
		clickElement(byZoomOutButton, "Zoom Out Button");
		Thread.sleep(1000);
		afterZoomOut = driver.findElement(By.xpath("//div[@class='wp-block-jetpack-map-marker mapboxgl-marker mapboxgl-marker-anchor-center']")).getAttribute("style");
		System.out.println("INFO: After Zoom Out : "+afterZoomOut.substring(33, 56));
	}
}
