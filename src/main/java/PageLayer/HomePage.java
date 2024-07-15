package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logo;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public void isLogoDisplayed() {

		Wait.isDisplayed(logo);
	}

	public String validateTitle() {

		String title = driver.getTitle();
		return title;
	}

	public String validateUrl() {

		String url = driver.getCurrentUrl();
		return url;
	}

}
