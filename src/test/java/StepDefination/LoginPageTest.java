package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass {
	

@Given("user is on login page")
public void user_is_on_login_page() {
 BaseClass.initialization();
}

@When("user enters loginID and Password clicks on Login button")
public void user_enters_login_id_and_password_clicks_on_login_button() {
	
	String username= prop.getProperty("USERNAME");
	String pass = prop.getProperty("PASSWORD");
  LoginPage loginpage= new LoginPage();
  loginpage.enterUserNamePassword(username, pass);
}

}
