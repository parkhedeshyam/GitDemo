package Properties_FileDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile
{
	Properties properties ;
	String path="C:\\Users\\ghanshyam.p\\eclipse-workspace\\Selenium_EX\\src\\test\\java\\Properties_FileDemo\\Config.properties";
	
	public ReadConfigFile() throws IOException 
	{
		properties =new Properties();
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			properties.load(fis);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public String getURL() 
	{
		String url=properties.getProperty("url");
		if(url!=null)
		 return url;
		else
			throw new RuntimeException("url is not configure in config file");
	}
	
	public String getUserName() 
	{
		String username=properties.getProperty("username");
		if(username!=null)
		 return username;
		else
			throw new RuntimeException("username is not configure in config file");
	}
	
	public String getPassword() 
	{
		String password=properties.getProperty("password");
		if(password!=null)
		 return password;
		else
			throw new RuntimeException("password is not configure in config file");
	}
}
