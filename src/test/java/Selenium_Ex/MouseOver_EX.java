package Selenium_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

class Mouse
{
	WebDriver driver;
	public void mouse_Over() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://deltadentalma.com/");
		//WebElement ele=driver.findElement(By.xpath("//a[text()='Employers']"));
		
		WebElement ele=driver.findElement(By.linkText("Employers"));
		
		Actions action=new Actions(driver);
		
		Thread.sleep(1000);
		action.moveToElement(ele).build().perform();
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(1000);
		driver.close();
		
	}
	
	public void dragDrop() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.uitestpractice.com/Students/Actions");
		
		WebElement source= driver.findElement(By.id("draggable"));   //div[@id='draggable']
		
		  //WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement Destination =driver.findElement(By.id("droppable"));
		
		  //WebElement Destination =driver.findElement(By.xpath("//div[@id='droppable']"));
		
		 Actions action_drag_drop=new Actions(driver) ;
		 Thread.sleep(1000);
		 action_drag_drop.dragAndDrop(source, Destination).build().perform();
		 Thread.sleep(1000);
		 driver.close();
		
	}
	
	public void dobule_Clik() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.uitestpractice.com/Students/Actions");
		//dblClick
		WebElement source= driver.findElement(By.name("dblClick"));  
		 Actions action_double_click=new Actions(driver) ;
		// Thread.sleep(1000);
		 action_double_click.doubleClick(source).build().perform();
		// action_double_click.moveToElement(source).doubleClick().build().perform();
		 Thread.sleep(1000);
		 driver.close();
		
	}
	
	
	
}

public class MouseOver_EX {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		Mouse x =new Mouse();
	    //    x.mouse_Over();
		System.out.println("Go to Drag and Drop Functinality ");
		//Thread.sleep(1000);
	      // x.dragDrop();
		System.out.println("Double click  Functinality ");
		x.dobule_Clik();
	}

}
