package Calender_Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Redbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expectedMonthyear="Aug 2022";
		String expectedDay="30";
		//String expectedyear="2022";

//Date pass parameter to xpath 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement datepickr=driver.findElement(By.id("onward_cal"));
		datepickr.click(); 
		while(true) 
		{
			String  calendermonth_Year =driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(calendermonth_Year);
			if(calendermonth_Year.equals(expectedMonthyear))
			{
				//td[text()='30']
				driver.findElement(By.xpath("//td[text()='"+expectedDay+"']")).click();
				break;	 
			}
			else
			{	
				driver.findElement(By.xpath("//td[@class='next']")).click();
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			//Thread.sleep(1000);

		}
		
	}	

}


