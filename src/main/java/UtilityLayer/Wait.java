package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {

	public static WebElement visibilityOfElement(WebElement wb) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement wb1 = wait.until(ExpectedConditions.visibilityOf(wb));
		return wb1;

	}

	public static void sendKeys(WebElement wb, String Value) {

		Wait.visibilityOfElement(wb).sendKeys(Value);
	}

	public static void click(WebElement wb) {

		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb)).click();;
	}
	
	public static boolean isDisplayed(WebElement wb) {
		
		return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).isDisplayed();
	}
}
