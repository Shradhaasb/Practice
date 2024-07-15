package StepDefination;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Then;

public class HomePageTest extends BaseClass {
	
	

@Then("user enters homePage")
public void user_enters_home_page() {
	HomePage homepage= new HomePage();
	
	homepage.isLogoDisplayed();
	String title = homepage.validateTitle();
	boolean url= homepage.validateUrl().contains("ui.cogmento");
	Assert.assertEquals(title, "Cogmento CRM");
	
	Assert.assertEquals(url,true);
}

}
