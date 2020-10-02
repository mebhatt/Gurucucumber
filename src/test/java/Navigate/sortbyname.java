package Navigate;

import static org.junit.Assert.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Readproperty.ReadPropertiesFile;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;

public class sortbyname {
	
	//Global Variable 
	 
	
	   
		public static  void clickonmobile() {
		
		BaseClass.OpenB.browser();
		BaseClass.OpenB.navweb(ReadPropertiesFile.PropFile("guru"));
		//Clicking on the Mobile button
		 BaseClass.OpenB.driver.findElement(By.xpath("//a[@href='http://live.demoguru99.com/index.php/mobile.html']")).click();
		
		
		
		}
		
	

	   
		public static void verifymobilepage(){
		
			 WebDriverWait wait = new WebDriverWait(BaseClass.OpenB.driver,50);
				//wait to see 100% on progress bar
				WebElement ProgressBar =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[2]")));
				String txt=ProgressBar.getText();
				System.out.println(txt);
				
				
				
				assertTrue(txt.contains("This is root of mobile"));
		
				
		
		}
		
		
		public static void sortbyname() {
			
			//Selecting Mobile shorting by Name
			
			
			Select Mname = new Select (BaseClass.OpenB.driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/select[1]")));
		    
			
			Mname.selectByVisibleText("Name");
			
			
			
			}
		
		
		
		public static void productverify(String ScreenShotName){
			

			//Capture screen shot of the page to confirm shorting of product by name.
			//String ScreenShotName = "MobilePagesort";
			try {
	            File screenshot=((TakesScreenshot)BaseClass.OpenB.driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(screenshot,new File(ReadPropertiesFile.PropFile("screenshots")+ScreenShotName+".jpg"));
			} catch (Exception e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		   
		}
		
	
	
	
}

