package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	
public static WebDriver driver;
	
	public static Properties pro;
	
	//// constructor
	public testbase() {
		try {
			FileInputStream fls=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\test\\config\\config.properties");
			
			pro =new Properties();
			pro.load(fls);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	/////// code for open browser
	public void init() {
		
		String browsername= pro.getProperty("Browser");
		
		if(browsername.equalsIgnoreCase("Chrome")) {                                    //// location of chrome driver
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		   	driver = new ChromeDriver();  
			driver.manage().window().maximize();
		}
		
		else
			System.out.println("browser not found");{
				
			}
			}
	
	public static void getUrl(String URL) {
		driver.get(pro.getProperty("url"));

	}

}
