package Auto_Suggestive_Dropdown;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC_Autosuggest_Drop_down {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
//From 		
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Hyd");
		Thread.sleep(1000);
		List<WebElement> options =driver.findElements(By.xpath("//span[@class='ng-star-inserted']"));
		//System.out.println("Suggestion count is "+options.size());

		for(WebElement option:options) 
		{
			//System.out.println(option.getText());
			if(option.getText().contains("HYDERABAD DECAN")) 
			{ 
				//System.out.println("Selected City  "+option.getText());
				option.click(); 
				break; 
			} 
		}	
	
//To.. 		
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Pune");
		Thread.sleep(1000);
		List<WebElement> options_to =driver.findElements(By.xpath("//span[@class='ng-tns-c57-9 ng-star-inserted']"));
		//System.out.println("Suggestion count is "+options_to.size());

		for(WebElement op_tion:options_to) 
		{
			//System.out.println(op_tion.getText());
			if(op_tion.getText().contains("PUNE JN - PUNE")) 
			{ 
				//System.out.println("Selected City "+op_tion.getText());
				op_tion.click(); 
				break; 
			} 
		}	
		
//Date :---
		String expectedMonth="August";
		String expectedDay="16";
		String expectedyear="2022";

		WebElement datepickr=driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
		datepickr.click(); 
		//span[@class='ui-datepicker-month'] for month  and //span[@class='ui-datepicker-year']  for year 

		//*[@id="ui-datepicker-div"]/table/tbody  all the day select 
		while(true) 
		{
			String  calendermonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
			String  calenderyer =driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
			if(calendermonth.equals(expectedMonth) && calenderyer.equals(calenderyer))
			{
				//System.out.println("Month and year are equals");
				//tbody[@class='ng-tns-c58-10']
				//a[text()='18']
				//td[text()='"+expectedDay+"']
				List<WebElement> dayList=driver.findElements(By.xpath("//a[text()='"+expectedDay+"']"));
				System.out.println("Month and year are equals "+dayList.size());
				for(WebElement e:dayList) 
				{ 
					String calender_Day=e.getText();
					System.out.println(calender_Day);
					if(calender_Day.equals(expectedDay))
					{
						System.out.println("selected day is "+calender_Day);
						e.click();
						break;
					}
				} 
				break;	 
			}
			else
			{	
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			}
		}	
			
//ALL Classes 
	System.out.println("For Select Class COde ......");
	driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-11']")).click();
	Thread.sleep(1000);		
	List<WebElement> options_classes =driver.findElements(By.xpath("//p-dropdownitem[@class='ng-tns-c65-11 ng-star-inserted']"));
	System.out.println("Suggestion count is "+options_classes.size());

		for(WebElement option_class:options_classes) 
		{
			System.out.println(option_class.getText());
			if(option_class.getText().contains("AC First Class (1A)")) 
			{ 
				//System.out.println("Selected Class  "+option_class.getText());
				option_class.click(); 
				break; 
			} 
		}		
		System.out.println("Execute last part Concession ");
		driver.findElement(By.xpath("//*[@class='css-label_c t_c' and text()='Person With Disability Concession']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Click on search button ");
		Thread.sleep(1000);
		List<WebElement> numer_of_train=driver.findElements(By.xpath("//div[@class='form-group no-pad col-xs-12 bull-back border-all']"));
		System.out.println("Number of Train Available "+numer_of_train.size());
		for(WebElement t_name:numer_of_train)
		{
			String train_Name=t_name.getText();
			System.out.println(train_Name);
		}		
		
		LocalDateTime myDateObj = LocalDateTime.now();
		String name=myDateObj.toString();
		System.out.println(name);
		String name2=myDateObj.toString().replace(":", "").replace(" ", "").replace(".", "");
		System.out.println(name2);
		
		
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des =new File("C:\\Users\\ghanshyam.p\\Desktop\\screenshot\\"+name2+".png");
		FileUtils.copyFile(src,des);
		
		Thread.sleep(3000);
		
		
	//driver.close();
	 }

  }



