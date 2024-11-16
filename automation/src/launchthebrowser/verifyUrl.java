package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyUrl {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.in/";
		System.out.println("actualUrl = " + actualUrl);
		if (actualUrl.equals(expectedUrl)) {
			System.out.println("Url is verifide and correct");

		} else {
			System.out.println("URL is verifide and incorrect");
		}
	}

}
