package Itsutra.Maven_Project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class LearnGoals {
 WebDriver driver;
	
	@Test
  public void f(){
  
  }
  @BeforeTest
  public void beforeTest() {
  driver = new FirefoxDriver();
  driver.get("http://eaapp.somee.com/Account/Login");
  driver.manage().window().maximize();
  
  
  }

  @AfterTest
  public void afterTest() {
 
  }

}
