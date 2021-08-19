package com.Mahmuda.Uuuil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase_MD {

		public static Properties prop;
		public static WebDriver driver;

			public TestBase_MD() {
			try {
				FileInputStream	fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\Mahmuda\\config\\ConfigMD.properties");
					
				 prop = new Properties();
				 prop.load(fls);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
				
			}
			public void intialize() {
				String Browsername = prop.getProperty("browser1");
				if (Browsername.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driverrr\\chromedriver_win32\\chromedriver.exe");
				
					 driver = new ChromeDriver();
					 driver.manage().timeouts().implicitlyWait(UUutil.implicitlyWait_wait,TimeUnit.SECONDS);
					 driver.manage().timeouts().pageLoadTimeout(UUutil.pageLoadTimeout_wait,TimeUnit.SECONDS);
					 driver.manage().window().maximize();
					 driver.manage().deleteAllCookies();
						
				}
				
				else 
					System.out.println("Browser not found");
					
			}
			public static void launchApplication(String URL) {
				
					 driver.get(prop.getProperty("url_QA"));
				
			}
			
		}


