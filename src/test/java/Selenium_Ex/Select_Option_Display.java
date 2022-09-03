package Selenium_Ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Option_Display {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//"http://www.uitestpractice.com/students/switchto" 
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
			System.out.println("size of broweser is "+driver.manage().window().getSize());
				WebElement ele =driver.findElement(By.id("mySelect"));
				Select sel=new Select(ele);
				List<WebElement> ListOption = sel.getOptions();
				/*
				 * for(int i =0;i<ListOption.size();i++)
				 * 
				 * { String option= ListOption.get(i).getText(); System.out.println(option); }
				 */
				
				for (WebElement option: ListOption) {
		            sel.selectByValue(option.getAttribute("value"));
		            System.out.println("Selected option's text: " + sel.getFirstSelectedOption().getText());
		        }
				
				

	}

}

