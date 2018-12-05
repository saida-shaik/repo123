package projectlibrary;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baselibrary.BaseClass;

public class Logocheck extends BaseClass{
  @Test
  public void testlogochk() {
	
	  boolean logostatus = driver.findElement(By.xpath("//a[@href='https://www.jabong.com/']")).isDisplayed();
		 System.out.println(logostatus);
  }
}
