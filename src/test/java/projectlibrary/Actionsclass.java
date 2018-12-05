package projectlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baselibrary.BaseClass;

public class Actionsclass extends BaseClass{
	@Test
	public void testwomentab() throws InterruptedException {
		WebElement women = driver.findElement(By.xpath("//a[@href='/women']"));
		WebElement ethnic = driver.findElement(By.xpath("//a[text()='ETHNIC WEAR']"));
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		Thread.sleep(3000);
		act.moveToElement(ethnic).click().perform();
		Thread.sleep(3000);
		
		WebElement filter = driver.findElement(By.xpath("//div[@id='allFilterPopupTop']"));
		act.moveToElement(filter).click().perform();
		Thread.sleep(3000);
		WebElement catgory = driver.findElement(By.id("Categories"));
		act.moveToElement(catgory).click().perform();
		Thread.sleep(3000);
		WebElement p1 = driver.findElement(By.xpath("(//div[@id='Baby_Dolls'])[1]"));
		Thread.sleep(3000);
		act.moveToElement(p1).click().perform();
		Thread.sleep(3000);
		WebElement p2 = driver.findElement(By.xpath("(//div[@id='Bodysuit'])[1]"));
		Thread.sleep(3000);
		
		act.moveToElement(p2).click().perform();
		Thread.sleep(3000);

	}
}
