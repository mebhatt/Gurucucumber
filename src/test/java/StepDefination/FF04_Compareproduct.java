package StepDefination;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FF04_Compareproduct {
	
	
	@Given("^User is on demoguru website and click mobile$")
	public void user_is_on_demoguru_website_and_click_mobile()  {
		BaseClass.OpenB.browser();
		BaseClass.OpenB.navweb("http://live.demoguru99.com/index.php/");
		BaseClass.OpenB.clickonmobile();
	  
	    
	}

	@Given("^User click compare for Soney xperia and iphone$")
	public void user_click_compare_for_Soney_xperia_and_iphone()  {
	  
	    Mobile.Compareprodcutinpopup.user_click_compare_for_Soney_xperia_and_iphone();
	}

	@Given("^User click on COMPARE button$")
	public void user_click_on_COMPARE_button()  {
	  
	    Mobile.Compareprodcutinpopup.user_click_on_COMPARE_button();
	}

	@Then("^Pop up windows comes up and verify the prodcut inside\\.$")
	public void pop_up_windows_comes_up_and_verify_the_prodcut_inside()  {
	  
	    Mobile.Compareprodcutinpopup.pop_up_windows_comes_up_and_verify_the_prodcut_inside();
	}

	@After
	public void user_close_the_browser()  {
	  BaseClass.OpenB.Closechrome();
	    
	}



}
