package Selenium_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//Name  : Ghanshyam 
public class ApplicationFrom_Example {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/Students/Form");
		driver.findElement(By.id("firstname")).sendKeys("Rajesh");
		driver.findElement(By.id("lastname")).sendKeys("Patil");
		driver.findElement(By.name("optradio")).click();  
		driver.findElement(By.xpath("//input[@value='dance']")).click();

		WebElement element=driver.findElement(By.id("sel1"));
		Select select=new Select(element);
		select.selectByVisibleText("Egypt");

		/*
		 * driver.findElement(By.id("datepicker")).click(); WebElement
		 * Month=driver.findElement(By.className("ui-datepicker-month")); Select
		 * select_M=new Select(Month); select_M.selectByVisibleText("Mar");
		 * 
		 * WebElement yrs=driver.findElement(By.className("ui-datepicker-year")); Select
		 * select_yrs=new Select(yrs); select_yrs.selectByVisibleText("2021");
		 * 
		 * driver.findElement(By.xpath("//a[text()='1']")).click();
		 */
		
		driver.findElement(By.id("datepicker")).sendKeys("021/2/2021");
		

		driver.findElement(By.id("phonenumber")).sendKeys("8952147836");
		driver.findElement(By.id("username")).sendKeys("patilRajesh");

		driver.findElement(By.id("email")).sendKeys("Rajesh@gmail.com");
		driver.findElement(By.id("comment")).sendKeys("I am Rajesh from Channai");

		driver.findElement(By.id("pwd")).sendKeys("Rajesh@768"); Thread.sleep(1000);
		driver.findElement(By.className("btn btn-default")).click();


		System.out.println("successfully Completed");

		driver.close();

	}

}
