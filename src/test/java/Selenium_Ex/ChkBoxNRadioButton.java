package Selenium_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChkBoxNRadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		driver.findElement(By.id("red")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("blue")).click();
		Thread.sleep(1000);
		WebElement chk_Cricket=driver.findElement(By.id("cricket"));
		chk_Cricket.click();
		Thread.sleep(1000);
		driver.findElement(By.id("badminton")).click();
		Thread.sleep(1000);
		chk_Cricket.click();
		Thread.sleep(1000);
		driver.findElement(By.id("pink")).click();
		driver.close();
		

	}

}
