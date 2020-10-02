

package Mobile;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jsoup.Connection.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class Compareprodcutinpopup {
	
	
	
     public static void user_click_compare_for_Soney_xperia_and_iphone()  {
		
		//Clicking compare on soney xperia
		BaseClass.OpenB.driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > ul > li:nth-child(2) > a")).click();
		
		//Clicking compare on iphone
		BaseClass.OpenB.driver.findElement(By.cssSelector("body > div > div > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(2) > div > div.actions > ul > li:nth-child(2) > a")).click();;
	  
	    
	}


	public static  void user_click_on_COMPARE_button()  {
		
		//Click compare button
	  
	    BaseClass.OpenB.driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button")).click();
		
		
	}

	
	public static void pop_up_windows_comes_up_and_verify_the_prodcut_inside()  {
		
	
		
		//Getting Text of the two phone Sonia and iphone from mobile page in order to compare (assert) it 
		//with pop up compare list text.
		 WebElement Mstext = BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a"));
		 WebElement Mitext = BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a"));
		 
		 String Comparetext1= (Mstext.getText() + Mitext.getText());
				 
	//	 System.out.println(Comparetext1);
		
		
		
		
		
		//Creating string instance to handle window so can switch to it later stage.
		
		String Mainwindow = BaseClass.OpenB.driver.getWindowHandle();
		
		//Handle the pop up windwos
		
		Set<String> popup = BaseClass.OpenB.driver.getWindowHandles();
		Iterator<String> P1= popup.iterator();
		
		//While loop to access popup windwos get the element compare it and close popup
		
		while (P1.hasNext())
		{
			String popupwindwos = P1.next();
			if (!Mainwindow.equalsIgnoreCase(popupwindwos)) {
				
				//Switching to popupwindows and verifing comparing element existence.
				BaseClass.OpenB.driver.switchTo().window(popupwindwos);
				WebDriverWait wait = new WebDriverWait(BaseClass.OpenB.driver,50);
				
				WebElement popsxtext= BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='product_comparison']/tbody[1]/tr[1]/td[1]/h2/a"));
				WebElement popiptext= BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='product_comparison']/tbody[1]/tr[1]/td[2]/h2/a"));
				String Comparetext = (popsxtext.getText() + popiptext.getText());
			//	System.out.println(Comparetext);
				
				
				//Compareint two text mobile page and popup for varification
				
				Assert.assertEquals("Mobilepage and Popup result not maching",Comparetext1, Comparetext);
				
				
				
				
				
//			//	Approach with getting text from the popuptable coloum. not using because popup contains compare
//			//	table whose first row two coloums are sony xperia, 1 review(s),$100.00 and same for iphone so can't
//			//	compare with the mobile page text 
//				WebElement htmltable=BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='product_comparison']/tbody[1]"));
//	
//				List<WebElement> row=htmltable.findElements(By.xpath("//*[@id='product_comparison']/tbody[1]/tr[1]"));
//				List<WebElement> colo=htmltable.findElements(By.xpath("//*[@id='product_comparison']/tbody[1]/tr[1]/td"));
//				
//				
//				for(int rnum=0;rnum<colo.size();rnum++)
//				{
//				
//			//	System.out.println("Compare list 1:"+colo.get(rnum).getText()+"\n");
//				String colotext = colo.get(rnum).getText()+ "\n";
//				String comparetext = colotext;
//				System.out.println(comparetext);
//				
//				} 
				
				
				
				
				
				
			}
		}
		//close the popup windwos
				
		BaseClass.OpenB.driver.findElement(By.xpath("//*[@id='top']/body/div/div[2]/button")).click();
		
	  //Switch to the Mainwindows 
		BaseClass.OpenB.driver.switchTo().window(Mainwindow);
	    
	}

	
	

}
