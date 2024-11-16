package launchthebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class VerifyUrlG {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		String expectedUrl="https://www.shoppersstack.com/";
		String expectedtitle  ="ShoppersStack";
		System.out.println("ural and title  is ");
		if(driver.getCurrentUrl().equals(expectedUrl)&&(driver.getTitle().equals(expectedtitle)))
		{
			System.out.println("same as give ");
		}
		else {
			System.out.println("not same as give ");
		}
		}
	
			

}
