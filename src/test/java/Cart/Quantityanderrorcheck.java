package Cart;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Quantityanderrorcheck {
	
	
	
	public static void clickaddcartonsonixperia() {
		
		BaseClass.OpenB.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")).click();
		
		
	}

	public static void changquantityandupdate() {
		
		
		
		
		WebDriverWait wait = new WebDriverWait(BaseClass.OpenB.driver,50);
		BaseClass.OpenB.driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")).sendKeys("1000");
		WebElement update = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span")));
		update.click();
	}
	
	
	
	public static void verifyerrormessage() {
		

		String actualmessage = BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='shopping-cart-table']/tbody/tr/td[2]/p")).getText();
		System.out.println("Actual Message displayed"+ actualmessage);
		String expectedmessage = "The requested quantity for Sony Xperia is not available";
		
		//Comparing two messages  ALWAYS FAIL THE STEPS 
		try {
		
		Assert.assertEquals(actualmessage,expectedmessage);}
		 
		catch(AssertionError e) {
			
			System.out.println("Quatity Message not matching");
		}
				
		
	
		
	}
	
	public static void emptycart() {
		
		BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='empty_cart_button']/span/span")).click();;
	}
	
	
	
	
	public  static void verifyemptycartmessage() {
		
		
		String actualmes = BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div/div[1]/h1")).getText();
		System.out.println("Actual Message displayed"+ actualmes);
		String expectedmes = "SHOPPING CART IS EMPTY";		
		
		
		//comparing result
		Assert.assertEquals("Shoppingcart empty message don't match",actualmes,expectedmes);
		
		
	}
	
	
	public static void closebrowser() {
		
		BaseClass.OpenB.Closechrome();
		
		
	}
	
}
