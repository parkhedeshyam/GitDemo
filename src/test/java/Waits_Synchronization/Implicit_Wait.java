package Waits_Synchronization;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //for selenium 4

				String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

				driver.get("https://rahulshettyacademy.com/seleniumPractise");
				
				Thread.sleep(3000);

				addItems(driver,itemsNeeded);
				
				driver.findElement(By.xpath("//img[@alt='Cart']")).click();
				driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
				  //rahulshettyacademy
				
				driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
				  
				driver.findElement(By.cssSelector("button.promoBtn")).click();
				  
				  
				  
				  System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).
				  getText());
				  
				  driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).
				  click(); //div[@class='wrapperTwo']//div//select
				  
				  WebElement
				  sel_ele=driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select"
				  )); sel_ele.click(); Select sel =new Select(sel_ele);
				  sel.selectByVisibleText("India"); sel_ele.click();
				  
				  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				  driver.findElement(By.xpath("//button[text()='Proceed']")).click();		
	}
	
	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{

	int j=0;

	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0;i<products.size();i++)

	{

	//Brocolli - 1 Kg   //Brocolli,    1 kg

	String[] name=products.get(i).getText().split("-");

	String formattedName=name[0].trim();

	//format it to get actual vegetable name

	//convert array into array list for easy search

	//  check whether name you extracted is present in arrayList or not-

	List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(formattedName))

	{

		j++;

		//click on Add to cart

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			if(j==itemsNeeded.length)

			{
				
				break;
				
			}

		}

	}
	}
}
				
	

				
				
	


	
