package Calender_Date;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Picker_jqueryui {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String expectedMonth="August";
		String expectedDay="15";
		String expectedyear="2022";


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);

		//driver.findElement(By.id("datepicker")).click();
		//input[@id='datepicker']

		WebElement datepickr=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepickr.click(); 
		//span[@class='ui-datepicker-month'] for month  and //span[@class='ui-datepicker-year']  for year 

		//*[@id="ui-datepicker-div"]/table/tbody  all the day select 
		while(true) 
		{
			String  calendermonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String  calenderyer =driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(calendermonth.equals(expectedMonth) && calenderyer.equals(calenderyer))
			{
				System.out.println("Month and year are equals");
				  List<WebElement> dayList=driver.findElements(By.xpath("//table/tbody/tr/td"));
				  System.out.println("Month and year are equals"+dayList.size());
				  for(WebElement e:dayList) 
				  { 
				   String calender_Day=e.getText();
				  // System.out.println(calender_Day);
				   if(calender_Day.equals(expectedDay))
				    	{
					        e.click();
					        break;
				    	}
				  } 
				  break;	 
			}
			else
			{	
			  driver.findElement(By.xpath("//span[text()='Next']")).click();
		     //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}
	}

}
