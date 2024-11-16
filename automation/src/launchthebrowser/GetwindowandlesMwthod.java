package launchthebrowser;

import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowandlesMwthod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.shoppersstack.com/sub-category/women-sweater");
		Set<String> allwid=driver.getWindowHandles();
		 System.out.println(allwid.size());
		 for(String wid : allwid) {
			 String widTitle = driver.switchTo().window(wid).getTitle();
			 System.out.println("widTitle =   "+widTitle);
			 
			 
		 }

}
}
