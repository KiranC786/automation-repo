package com.qsp.assigment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWindow {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		String[]urls = {"https://www.myntra.com/login?referer=https://www.myntra.com/shop/men","https://www.myntra.com/shop/men","https://www.myntra.com/shop/kids","https://www.myntra.com/shop/home-living","https://www.myntra.com/personal-care"};
		for(String url:urls) {
			WebDriver newDriver =driver.switchTo().newWindow(WindowType.WINDOW);
			newDriver.get(url);
		}
		java.util.Set<String>allwid=driver.getWindowHandles();
		System.out.println(allwid.size());
		for(String wid : allwid) {
			 String widTitle =driver.switchTo().window(wid).getTitle();
			 System.out.println("widTitle   "+widTitle);
			 if(widTitle.equals( "Online Shopping foer Women, Men, Kids Fasgion & lifestyle - Myntra   "      ))
			 {
				 String parentWindowUrl= driver.getCurrentUrl();
				 System.out.println("parentWindowUrl   "+parentWindowUrl);
			 }
			 else if (widTitle.equals("Myntra")) {
				 int childWindowXAxis=driver.manage().window().getPosition().getX();
					
				 System.out.println("childWindowXAxis   "+childWindowXAxis);
				 int childWindowYAxis=driver.manage().window().getPosition().getY();
				
				 System.out.println("childWindowYAxis   "+childWindowYAxis);
				
			 }
			 
			 else if (widTitle.equals("Men shopping Online - shope for Mens Clothing & Accessories in India | Myntra "   )) {
                 int childWindowHeight =driver.manage().window().getSize().getHeight();
				 
				 System.out.println("childwindow hieght    " +childWindowHeight);
				 int childWindowWidth = driver.manage().window().getSize().getWidth();
				 
				 System.out.println("childWindowWidth   "+childWindowWidth);
				
			}
			 else {
				 Dimension definedSize =new Dimension(800,500);
					
				 driver.manage().window().setSize(definedSize);
				
				 Point definedpoint =new Point(180,170);
				
				 driver.manage().window().setPosition(definedpoint);
			}
			 
		}
		driver.manage().window().minimize();
		driver.quit();
}
}
