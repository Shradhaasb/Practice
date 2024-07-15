package StepDefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import UtilityLayer.ExcelReader;
import io.cucumber.java.en.Then;

public class ContactPageTest extends BaseClass{
	public  ContactPage contactPage;
	public String ExcelSheetPath= System.getProperty("user.dir")+"\\src\\main\\java\\TestData\\TestData.xlsx";


	@Then("user click on ContactPage")
	public void user_click_on_contact_page() {
		contactPage= new ContactPage();
		contactPage.clickOnContactPage();
		
	}
	@Then("user click on new Contact")
	public void user_click_on_new_contact(){
	   contactPage = new ContactPage();
	contactPage.clickOnCreateButton();  
	System.out.println(ExcelSheetPath);
	  
	 
	}
	
//	@Then("user fills the data from {string} and  {int}")
//	public void user_fills_the_data_from_and(String SheetName, int rowNumber) {
//		
//		ExcelReader reader= new ExcelReader();
//		List<Map<String, String>> data= reader.getAllSheetDAta(ExcelSheetPath , SheetName);
//	
//		String Fname = data.get(rowNumber).get("fistname");
//		String Lname = data.get(rowNumber).get("lastname");
//		String Mname = data.get(rowNumber).get("middlename");
//		String email  = data.get(rowNumber).get("email");
//		String company = data.get(rowNumber).get("company");
//		String status = data.get(rowNumber).get("status");
//		
//		contactPage.createUser(Fname, Lname, Mname, email, company, status);
//		
//	}
	
	

	@Then("user fills the data from {string} and {int}")
	public void user_fills_the_data_from_and(String SheetName, Integer rowNumber) throws IOException {
		ExcelReader reader= new ExcelReader();
		List<Map<String, String>> data= reader.getAllSheetDAta(ExcelSheetPath , SheetName);
	
		String Fname = data.get(rowNumber).get("fistname");
		String Lname = data.get(rowNumber).get("lastname");
		String Mname = data.get(rowNumber).get("middlename");
		String email  = data.get(rowNumber).get("email");
		String company = data.get(rowNumber).get("company");
		String status = data.get(rowNumber).get("status");
		
		contactPage.createUser(Fname, Lname, Mname, email, company, status);
	}



	@Then("Click On Save button")
	public void click_on_save_button() {
		contactPage.clickOnSaveButton();
	   
	}






}
