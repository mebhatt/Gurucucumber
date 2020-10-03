package BaseClass;
import java.time.Clock;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import Readproperty.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;




public class OpenB {
	
	
	
	public static WebDriver driver;
	
	

	//new line fortest
	
	
	public static void browser() {
	
		/**
		System.setProperty("webdriver.chrome.driver", ReadPropertiesFile.PropFile("chromeLoc"));
		WebDriver driver = new ChromeDriver();
		driver.get(ReadPropertiesFile.PropFile("guru"));
		**/
		
		//Webdriver incase property file won't work
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	//	driver.get(websitename);
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	

	public static void navweb(String websitename) {
		
		
		driver.get(websitename);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
				
	}
	
	
	public static void clickonmobile() {
		
		driver.findElement(By.xpath("//a[@href='http://live.demoguru99.com/index.php/mobile.html']")).click();
	}
	
	
		public static void Closechrome() {
			
			
			driver.close();
			driver.quit();
			
			
		}
		
		
}	
			
			
		
		
		
		
	
	


