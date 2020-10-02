package Navigate;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.junit.Assert;

public class Productcostverify {
	
	
	
	
	public static String detailpage= "$100.00";
	public static String Listpage= "$100.00";

	
	public static void priceondetailpage() {
			
		//Storing detailproduct price and comparing
	
		WebElement priceofxp = BaseClass.OpenB.driver.findElement(By.xpath("//*[@id=\"product-price-1\"]//span[@class='price']"));
		String priceofxp11 = priceofxp.getText();
		System.out.println("Price of Xperia on detailpage"+ priceofxp11);
		
		//Asserting with global variable 
		Assert.assertEquals("Deatail Price does't Match", priceofxp11, detailpage);
		
	
			}
	
	

	public static void clickonproduct() {
		
		//Clicking on Xperial mobile 
		
		
		BaseClass.OpenB.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/a")).click();
		
		
	}
	
	
	public static void priceonlistpage() {
		
	

		//storing listpage price and comparing
		
			
		 WebElement listpagepro = BaseClass.OpenB.driver.findElement(By.xpath("//span[@id='product-price-1']//span[@class='price']"));
		 String listpagepro1 = listpagepro.getText();
		 System.out.println("Price of Listpage Xperia"+ listpagepro1);
		 
		 //Asserting with the global variable 
				
		Assert.assertEquals("List page price not match",listpagepro1,Listpage);

		
		
	}

	public static void compareprices() {
 		
		//Comparing two global variable
		
		Assert.assertEquals(detailpage, detailpage);
		
	}
}
