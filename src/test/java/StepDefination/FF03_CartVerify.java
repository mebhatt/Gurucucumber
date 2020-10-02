package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FF03_CartVerify {
	
	
	@Given("^User is on demogur and click mobile button$")
	public void user_is_on_demogur_and_click_mobile_button()  {
		
		
		BaseClass.OpenB.browser();
		BaseClass.OpenB.navweb("http://live.demoguru99.com/index.php/");
		BaseClass.OpenB.clickonmobile();
	   
	   
	}

	@Given("^User Click on Add Cart button of Soni Xperia mobile$")
	public void user_Click_on_Add_Cart_button_of_Soni_Xperia_mobile()  {
		
		
		Cart.Quantityanderrorcheck.clickaddcartonsonixperia();
	   
	   
	}

	@Given("^User change the quantity to (\\d+) and click Update button$")
	public void user_change_the_quantity_to_and_click_Update_button(int arg1)  {
	   
	   Cart.Quantityanderrorcheck.changquantityandupdate();
	}

	@Then("^User get Error message the requsted quantity for sony xperia is not available$")
	public void user_get_Error_message_the_requsted_quantity_for_sony_xperia_is_not_available()  {
	   
	   Cart.Quantityanderrorcheck.verifyerrormessage();
	}

	@Then("^User click Empty cart button$")
	public void user_click_Empty_cart_button()  {
	   
		Cart.Quantityanderrorcheck.emptycart();
	   
	}

	@Then("^Messae comes shopping cart is empty$")
	public void messae_comes_shopping_cart_is_empty()  {
	   
		Cart.Quantityanderrorcheck.verifyemptycartmessage();
	   
	}

	@Then("^Uer close the borwser$")
	public void uer_close_the_borwser()  {
	   
		Cart.Quantityanderrorcheck.closebrowser();
	   
	}



}
