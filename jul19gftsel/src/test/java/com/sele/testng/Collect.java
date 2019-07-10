package com.sele.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Collect {
	WebDriver driver;
  @Test
  public void testColl() {
	  
	  driver=Drivers.getDriver("chrome");
	  
	  driver.get("http://newtours.demoaut.com/mercurycruise.php");
	  List<WebElement> coll=driver.findElements(By .tagName("th"));
	    System.out.println(coll.size());
	    for(int i=0;i<=coll.size()-1;i++){
	    	String lnk_name=coll.get(i).getText();
	    
	    	System.out.println(lnk_name);
	    	if(lnk_name.equals("Cruise Itinerary")) {
	    		coll.get(i).click();
	    		break;
	    	}
	    }
  

	    
	    
	  
  }
}
