 package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.shoppersstack.com/men");
		Thread.sleep(2000);
		driver.navigate().to("https://www.shoppersstack.com/women");
		Thread.sleep(2000);
		driver.navigate().to("https://www.shoppersstack.com/electronics");
		Thread.sleep(2000);
		driver.navigate().to("https://www.shoppersstack.com/beauty_products");
		Thread.sleep(2000);
		driver.navigate().to("https://www.shoppersstack.com/sub-category/lip-liner");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.shoppersstack.com/sub-category/men-tshirt");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		
		
	}

}
