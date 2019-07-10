package com.sele.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ScenarioPart2 {
	WebDriver driver;
	
  @Test
  public void f() {
	  driver = Drivers.getDriver("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  driver.findElement(By.name("userName")).sendKeys("NavyaReddy");
	  driver.findElement(By.name("firstName")).sendKeys("Navya");
	  driver.findElement(By.name("lastName")).sendKeys("Reddy");
	  driver.findElement(By.name("password")).sendKeys("Navya9246");
	  driver.findElement(By.name("confirmPassword")).sendKeys("Navya9246");
	  driver.findElement(By.xpath("//*[@id=\"demo\"]")).click();
	  driver.findElement(By.name("emailAddress")).sendKeys("navya.mamidi1@gmail.com");
	  driver.findElement(By.name("mobileNumber")).sendKeys("8886054641");
	  driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("07/07/1997");
	  driver.findElement(By.name("address")).sendKeys("flat-M201,surya splendor towers,habsiguda");
	  driver.findElement(By.name("securityQuestion")).sendKeys("What is your Birth Place?");
	  driver.findElement(By.name("answer")).sendKeys("Hyderabad");
	  driver.findElement(By.name("Submit")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
