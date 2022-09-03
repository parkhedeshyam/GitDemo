package Selenium_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		//"http://www.uitestpractice.com/students/switchto" 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/students/switchto" );
		driver.findElement(By.id("alert")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.close();
			

	}

}
