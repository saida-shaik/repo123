package projectlibrary;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baselibrary.BaseClass;

public class FilterActions extends BaseClass{
  @Test
  public void testfilters() {
	 driver.findElement(By.id("Categories")).click();
	//List <WebElement> alloptions = driver.findElements(By.xpath("(//label[@class='filter-label'])[1]"));
	
	//int option = alloptions.size();
	
	
  }
}
