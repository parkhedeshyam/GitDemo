package Properties_FileDemo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		ReadConfigFile ConfigFile =new ReadConfigFile();

		// driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get(ConfigFile.getURL());

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

		driver.findElement(By.name("username")).sendKeys(ConfigFile.getUserName());
		// driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");


		driver.findElement(By.name("password")).sendKeys(ConfigFile.getPassword());
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");


		 driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
