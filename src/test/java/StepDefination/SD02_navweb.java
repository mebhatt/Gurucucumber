package StepDefination;

import cucumber.api.java.en.Given;

public class SD02_navweb {
	

	@Given("^user is on demoguru website$")
	public void user_is_on_demoguru_website()  {
		
		
		Navigate.homepagetitle.navwebsite();
	    
	    
	}

	@Given("^User click on mobile button$")
	public void user_click_on_mobile_button()  {
	    
	    Navigate.sortbyname.clickonmobile();
	}

	@Given("^User verify the title of the page which should be$")
	public void user_verify_the_title_of_the_page_which_should_be()  {
	    Navigate.sortbyname.verifymobilepage();
	    
	}

	@Given("^User click on sort by to sort it by name\\.$")
	public void user_click_on_sort_by_to_sort_it_by_name()  {
	    
		Navigate.sortbyname.sortbyname();
	    
	}

	@Given("^Verify all the three prodcut are sort by name$")
	public void verify_all_the_three_prodcut_are_sort_by_name()  {
	    
		Navigate.sortbyname.productverify("Mobilesortpage");
	    
	}

	@Given("^User close the browser$")
	public void user_close_the_browser()  {
	    
		BaseClass.OpenB.Closechrome();
	    
	}


	
	

}
