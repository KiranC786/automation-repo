package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//identify the email .... enter the email
	 WebElement emailTextfield =driver .findElement(By.id("email" ));
	 emailTextfield.sendKeys("kirankiranc715@gmail.com");
	System.out.println(emailTextfield);
}
}
