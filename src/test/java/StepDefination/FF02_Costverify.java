package StepDefination;

import cucumber.api.java.en.Given;

public class FF02_Costverify {
	
	
	@Given("^User is on demoguru website and click moible$")
	public void user_is_on_demoguru_website_and_click_moible(){
		BaseClass.OpenB.browser();
		BaseClass.OpenB.navweb("http://live.demoguru99.com/index.php/");
		BaseClass.OpenB.clickonmobile();
	}
	
	
	
	
	@Given("^User verify the price of soni xperia on list page$")
	public void user_verify_the_price_of_soni_xperia_on_list_page()  {
	    
		Navigate.Productcostverify.priceonlistpage();
	    
	}

	@Given("^User click sonia xperia$")
	public void user_click_sonia_xperia()  {
	   
		Navigate.Productcostverify.clickonproduct();
	    
	}

	@Given("^User verify the price of soni xperia on detail page$")
	public void user_verify_the_price_of_soni_xperia_on_detail_page()  {
	    
	    Navigate.Productcostverify.priceondetailpage();
	}

	@Given("^User compare prices and both should be same$")
	public void user_compare_prices_and_both_should_be_same()  {
	    
		Navigate.Productcostverify.compareprices();
	    
	}

	@Given("^User close the borwser$")
	public void user_close_the_borwser()  {
		
		BaseClass.OpenB.Closechrome();
	    
	    
	}	
	
	

}
