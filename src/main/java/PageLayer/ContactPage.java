package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class ContactPage extends BaseClass {

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactPageLink;

	@FindBy(xpath = "//a[@href=\"/contacts/new\"]")
	private WebElement createButton;


	@FindBy(name = "first_name")
	private WebElement firstName;
	
	@FindBy(name = "last_name")
	private WebElement lastName;
	
	
	@FindBy(name = "middle_name")
	private WebElement middleName;
	
	
	@FindBy(name = "company")
	private WebElement company;
	
	@FindBy(name = "value")
	private WebElement email;
	
	@FindBy(name = "//button[text()='Save']")
	private WebElement save;
	

	@FindBy(xpath = "//label[text()='Status']/following-sibling::div")
	private WebElement statusDropDown;
	
	
	@FindBys(@FindBy(xpath = "//div[@name='status']/following-sibling::div"))
	private List<WebElement >status;
	
	public ContactPage() {

		PageFactory.initElements(driver, this);
	}

	public void clickOnContactPage() {

		Wait.click(contactPageLink);

	}

	public void clickOnCreateButton() {
		Wait.click(createButton);
	}

	public void createUser(String Fname, String Lname , String Mname, String Email, String comapny, String Status) {
		
		Wait.sendKeys(firstName, Fname);
		Wait.sendKeys(lastName, Lname);
		Wait.sendKeys(middleName, Mname);
		Wait.sendKeys(email, Email);
		Wait.sendKeys(company, comapny);
		Wait.click(statusDropDown);
	HandleDropDown.selectDropDown(status, Status);
		
	}
	
	public void clickOnSaveButton() {
		Wait.click(save);
	}
}
