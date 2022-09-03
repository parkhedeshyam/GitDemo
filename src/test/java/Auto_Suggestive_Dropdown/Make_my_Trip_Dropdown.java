package Auto_Suggestive_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Make_my_Trip_Dropdown {

	public static void main(String[] args) throws InterruptedException {
	
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.makemytrip.com/");
  Thread.sleep(1000);
 // driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
driver.findElement(By.xpath("//input[@id='fromCity']")).click();
Thread.sleep(1000);

//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune");
driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("LHR");
Thread.sleep(1000);

  //List<WebElement> options =driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
List<WebElement> options =driver.findElements(By.xpath("//p[contains(@class,'font14 appendBottom5 blackText')]"));
  System.out.println(options.size());
  
  for(WebElement option:options) 
	{
	  //System.out.println(option.getText());
	  if(option.getText().contains("London - Heathrow Apt, United Kingdom")) 
		 { 
		   //System.out.println("pune is selected "+option.getText());
			option.click(); 
			break; 
		  	} 
	}		
//driver.close();		
	}


}
