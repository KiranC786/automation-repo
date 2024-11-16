package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		String actualUrl = driver.getCurrentUrl();
		String expectedtile   = "ShoppersStack";
		System.out.println("actualUrl = " + actualUrl);
		if (driver.getTitle().equals(expectedtile))
		{
			System.out.println("the title is ");
		}
		else {
			System.out.println("not same");
		}
	}

}
