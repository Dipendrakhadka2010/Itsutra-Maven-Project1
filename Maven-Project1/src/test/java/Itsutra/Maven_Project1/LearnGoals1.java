package Itsutra.Maven_Project1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class LearnGoals1 {
	WebDriver driver;
  
	@Test
  public void LoginTest() {
	driver.findElement(By.id("UserName")).sendKeys("admin");
	driver.findElement(By.id("Password")).sendKeys("password");
	
	Actions actions = new Actions(driver);
	actions.click(driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[4]/div/input"))).build().perform();
  
	List<WebElement> ifLogIn = driver.findElements(By.xpath("//*[@id=\"logoutForm\"]/ul/li[2]/a"));
	
	assertNotNull(ifLogIn);
	assertNotEquals(0, ifLogIn.size());
	
	}
	
	@Test
	public void RegisterTest() {
	driver.findElement(By.id("UserName")).sendKeys("ABCdeZ");
	driver.findElement(By.id("Password")).sendKeys("XYZa123@");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("XYZa123@");
	driver.findElement(By.id("Email")).sendKeys("ABCdef123@gmail.com");
	
	Actions actions = new Actions(driver);
	actions.click(driver.findElement(By.xpath("/html/body/div[2]/form/div[6]/div/input"))).build().perform();
	
	List<WebElement> ifRegister = driver.findElements(By.xpath("//*[@id=\"logoutForm\"]/ul/li[2]/a"));
	
	assertNotNull(ifRegister);
	assertNotEquals(0, ifRegister.size());
	
	}
  @BeforeTest
  public void beforeTest() {
	driver = new FirefoxDriver();
	driver.get("http://eaapp.somee.com/Account/Login");
	driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	 driver.quit(); 
 
  }

}
