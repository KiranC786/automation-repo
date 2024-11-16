package launchthebrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		Set<String> allwid=driver.getWindowHandles();
		 System.out.println(allwid.size());
		 System.out.println(driver.manage().window().getSize().getHeight());
		 //for each loop  ctrl+shift+i
		 for(String wid : allwid) {
			 String widTitle = driver.switchTo().window(wid).getTitle();
			 Thread.sleep(2000);
			 System.out.println("widTitle =   "+widTitle);
			 if (widTitle.equals("Facebook - log in or sign up")) {
				 Thread.sleep(2000);
				 System.out.println("prent window");
			}
			 else if (widTitle.equals("Log in to Facebook")) {
				 System.out.println("chiled window");
				 
				 int childWindowHeight =driver.manage().window().getSize().getHeight();
				 Thread.sleep(2000);
				 System.out.println("childwindow hieght    " +childWindowHeight);
				 int childWindowWidth = driver.manage().window().getSize().getWidth();
				 Thread.sleep(2000);
				 System.out.println("childWindowWidth   "+childWindowWidth);
				 int childWindowXAxis=driver.manage().window().getPosition().getX();
				 Thread.sleep(2000);
				 System.out.println("childWindowXAxis   "+childWindowXAxis);
				 int childWindowYAxis=driver.manage().window().getPosition().getY();
				 Thread.sleep(2000);
				 System.out.println("childWindowYAxis   "+childWindowYAxis);
				 //SET the size of child window
				 Dimension definedSize =new Dimension(800,500);
				 Thread.sleep(2000);
				 driver.manage().window().setSize(definedSize);
				 Thread.sleep(2000);
				 Point definedpoint =new Point(180,170);
				 Thread.sleep(2000);
				 driver.manage().window().setPosition(definedpoint);
			 }
				
			}
				
		
	}
}
