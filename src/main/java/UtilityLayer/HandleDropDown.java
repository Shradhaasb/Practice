package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	
	
	
	public void selectByVisibleText(WebElement wb , String value) {
		
		Select sel= new Select(wb);
		sel.selectByValue(value);
	
	}
	
	public static void selectDropDown(List<WebElement> list, String Value) {
		for(WebElement  ls: list) {
			String expected= ls.getText();
			if(expected.equalsIgnoreCase(Value)) {
				ls.click();
				break;
			}
			
		}
	}

}
