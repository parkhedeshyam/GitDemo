package Calender_Date;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_goibibo_two_calender {
	//https://www.goibibo.com/
	public static void main(String[] args) throws InterruptedException {
		
	String expectedMonthyear="August 2022";
	String expectedDay="20";
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.goibibo.com/");
				
    WebElement datepickr=driver.findElement(By.xpath("//span[@class='sc-kfPuZi dprjVP fswDownArrow']"));
	datepickr.click(); 
	//*[@id="root"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]
	
	while(true) 
	{
	// String  calendermonth_year =driver.findElement(By.xpath("//div[contains(text(),'August 2022')]")).getText();
	 //String  calendermonth_year =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
	String  calendermonth_year =driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div[1]")).getText();
				
	 System.out.println("Calender Month_year is "+calendermonth_year);
	 if(calendermonth_year.equals(expectedMonthyear))
	  {
		System.out.println("Month and Year are equals"+calendermonth_year);
		List<WebElement> dayList=driver.findElements(By.xpath("//p[@class='fsw__date']"));
		 
		 for(WebElement e:dayList) 
			 { 
				String calender_Day=e.getText();
				if(calender_Day.equals(expectedDay))
				{
				   e.click();
				   driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
				   break;
				}  
			} 
		 break;	 
	  }
	else
	{	
	     driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	}
	
	}
  }
}


