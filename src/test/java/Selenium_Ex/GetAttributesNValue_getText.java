package Selenium_Ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributesNValue_getText {
	//Name : Ghanshyam 
	/*
	Launch the edgebrowser.
	 luanch the webpage.
	 get the print of the "This is an example of paragraphs with a span inside" on console.
	 Enter usename : JAVA
	 enter paswrod:  SELENIUM
	 get the print of both the value.
	 clear the un and pswd
	 enter un: selenium
	enter pswd: java
	 print both the value
*/
	public static void main(String[] args) 
	{
//		http://www.uitestpractice.com/students/switchto
		// TODO Auto-generated method stub
		 System.out.println("Hello World!");
		    WebDriverManager.edgedriver().setup();
		    WebDriver d= new EdgeDriver();
		    d.manage().window().maximize();
		    d.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		    String text=d.findElement(By.id("p3")).getText();
		    System.out.println(text);
		    WebElement usn=d.findElement(By.id("input1"));
		    WebElement pwd=d.findElement(By.id("input2"));
		    usn.sendKeys("JAVA");
		    pwd.sendKeys("SELENIUM");
		    String name =usn.getAttribute("value");
		    System.out.println(name);
		    
		    String pwdprint =pwd.getAttribute("value");
		    System.out.println(pwdprint);
		    usn.clear();
		    pwd.clear();
		    System.out.println("bothe text boxes are clear");
		    usn.sendKeys("java");
		    pwd.sendKeys("selenium");
		    
		    String name1 =usn.getAttribute("value");
		    System.out.println(name1);
		    
		    String pwdprint1 =pwd.getAttribute("value");
		    System.out.println(pwdprint1);
		    
		    d.quit();
		    

	}

}

