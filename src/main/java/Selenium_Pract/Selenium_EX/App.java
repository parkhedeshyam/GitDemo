package Selenium_Pract.Selenium_EX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App {
  public static void main(String[] args) 
  {
    System.out.println("Hello World!");
    WebDriverManager.chromedriver().setup();
    WebDriver d= new ChromeDriver();
    d.manage().window().maximize();
    d.get("https://mvnrepository.com/");
  }
}
