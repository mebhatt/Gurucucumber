package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Readproperty.ReadPropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.EOFException;
import java.io.IOException;

import org.apache.velocity.tools.generic.ComparisonDateTool.Comparison;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

public class homepagetitle {
	//Global Variable
	
	
	@Test// try this 
	
	//PUT THE junit priorityorder to execute in sequences.
	public  static void navwebsite() {
		
		
		//Opening the browser 
	//	Base.OpenB.browser("https://www.google.com/");
		BaseClass.OpenB.browser();
		
		//Navigate to the guru website.
	//	Base.OpenB.navweb("https://www.google.com/");
		BaseClass.OpenB.navweb(ReadPropertiesFile.PropFile("guru"));
		
		
	}
	
	
	
	
	@Test
	public static  void asserthomepage() throws InterruptedException{
		
		
		String Actualtitle = BaseClass.OpenB.driver.getTitle();
		System.out.println(Actualtitle);
		String Expectedtitle = "Home page";
		
		
		//It will catch the comparisonfailure exception and throw the message without termiantion progarame.
		
		try {
		Assert.assertEquals("Title is wrong",Expectedtitle, Actualtitle);
		}
		catch(ComparisonFailure e) {
			System.out.println("Message: "+ e);
		}
		
		
	    BaseClass.OpenB.Closechrome();
	    

		
	}

}
