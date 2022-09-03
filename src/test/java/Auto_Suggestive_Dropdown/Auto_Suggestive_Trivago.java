package Auto_Suggestive_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggestive_Trivago {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.trivago.in/");
		  Thread.sleep(1000);
		 // driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		driver.findElement(By.xpath("//input[@id='input-auto-complete']")).click();
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='input-auto-complete']")).sendKeys("Lo");
		Thread.sleep(1000);

		  //List<WebElement> options =driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
		List<WebElement> options =driver.findElements(By.xpath("//div[@id='react-autowhatever-1']//ul//li"));
		  System.out.println("Suggestion count is "+options.size());
		  
		  for(WebElement option:options) 
			{
			  System.out.println(option.getText());
			  if(option.getText().contains("London")) 
				 { 
				   System.out.println("pune is selected "+option.getText());
					option.click(); 
					break; 
				  	} 
			}		
		//driver.close();		-
			}


	}




