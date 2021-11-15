package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	
	@FindBy(xpath="//div[@class='Dropdown-placeholder'][text()='Select']")
	private WebElement profileFor;
	
	@FindBy(xpath="//div[text()='Self']")
	private WebElement profileForOpt;
	
	public SecondPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createProfile() {
		profileFor.click();
		profileForOpt.click();
		
	}

}
