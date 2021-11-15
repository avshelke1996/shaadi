package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(xpath="//button[@data-testid='lets_begin']")
	private WebElement letsBegain;

	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void letsSeeButtonPress() {
		letsBegain.click();
		
	}
}
