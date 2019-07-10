package com.sele.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Scenario1part1 {
 WebDriver driver;
	@Test
  public void s1login(){
		driver = Drivers.getDriver("chrome");
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    driver.findElement(By.name("userName")).click();
	    driver.findElement(By.name("userName")).sendKeys("lalitha");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("password123");
	    driver.findElement(By.name("Login")).click();
   
	}
}
