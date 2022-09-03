package Wait_Example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/ncr");
		driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
		
		// Initialize and wait till element(link) became clickable - timeout in 10 seconds
	WebElement firstResult = 
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
		// Print the first result
	System.out.println(firstResult.getText());
	
	 //div[@id='sec-if-cpt-message']//span[@class='message-text']
	
	WebElement msg=driver.findElement(By.xpath("//div[@id='sec-if-cpt-message']//span[@class='message-text']"));
	  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(90000));
      wait.until(ExpectedConditions.visibilityOf(msg));
	}

}
