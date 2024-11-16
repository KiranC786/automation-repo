package launchthebrowser;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com");

	URL mainUrl=new URL("https://www.myntra.com"); 
	
	URL menUrl =new URL(mainUrl, "men");
	 URL womenUrl= new URL(mainUrl, "women");
	 URL kids =new URL(mainUrl,"/shop/kids");
	 URL homeliveUrl= new URL(mainUrl, "home-living");
	 URL beautyurl =new URL(mainUrl ,"/personal-care"); 
	 URL studioUrl= new URL(mainUrl ,"/studio/home");
	
	 driver.navigate().to(mainUrl);
	 Thread.sleep(2000);
	 driver.navigate().to(womenUrl);
	 Thread.sleep(2000);
	 driver.navigate().to(menUrl);
	 Thread.sleep(2000);
	 driver.navigate().to(kids);
	 Thread.sleep(2000);
	 driver.navigate().to(homeliveUrl);
	 Thread.sleep(2000);
	 driver.navigate().to(beautyurl);
	 Thread.sleep(2000);
	 driver.navigate().to(studioUrl);
	 Thread.sleep(2000);
}
}
