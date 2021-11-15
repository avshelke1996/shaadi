package TestClasses;

import org.testng.annotations.Test;

import pageClasses.MainPage;
import pageClasses.SecondPage;

public class MainTest extends BaseTest {
	
  @Test(priority=1)
  public void letsBegainButton() {
	  MainPage mp = new MainPage(driver);
	  mp.letsSeeButtonPress();
  }
  
  @Test(priority=2)
  public void profileForCreateOpt() {
	 SecondPage sp = new SecondPage(driver);
	 sp.createProfile();
	 }
  
  
}
