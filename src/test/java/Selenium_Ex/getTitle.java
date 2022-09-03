package Selenium_Ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTitle 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		Thread.sleep(10000);
		d.manage().window().minimize();
		Thread.sleep(10000);
		String Text_Title = d.getTitle();
		System.out.println(Text_Title);
		
		  if(Text_Title.equals("the automation zone: Mix of Basic WebElements"))
		  System.out.println("Title is Equal"); 
		  else
		  System.out.println("Title is not Equal");
		 
		Assert.assertEquals(Text_Title, "the automation zone: Mix of Basic WebElements" ,"Equal ....");
		
		
		
	}

}
