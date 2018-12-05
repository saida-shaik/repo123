package projectlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baselibrary.BaseClass;

public class SearchTask extends BaseClass{
  @Test
  public void testsearch() throws InterruptedException {
	  driver.findElement(By.id("search")).click();
	  Thread.sleep(3000);
	  String type = xlib.getexceldata("Search",1,0);
	  driver.findElement(By.id("search")).sendKeys(type);
	  Thread.sleep(3000);
	  driver.findElement(By.id("ul-pdp-search-res"));
	  Thread.sleep(3000);
	  WebElement Hw = driver.findElement(By.xpath("//span[text()='Handbags women']"));
	  Thread.sleep(3000);
	  Actions act=new Actions(driver);
	  act.moveToElement(Hw).click().perform();
	  Thread.sleep(3000);
	  WebElement sel = driver.findElement(By.xpath("(//select[@name='sort'])[2]"));
	  Thread.sleep(3000);
	  Select dd=new Select(sel);
	 dd.selectByVisibleText("Popularity");
	 Thread.sleep(3000);
  }
}
