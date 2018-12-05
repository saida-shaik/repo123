package projectlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import baselibrary.BaseClass;

public class Productcheckout extends BaseClass{
	@Test
	public void testproduct() throws InterruptedException {
		WebElement kids = driver.findElement(By.xpath("//a[@href='/kids']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(kids).click().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/2-12ykids']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='view all filters']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@id='Gender']/../..//div[@id='boys'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Categories")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@id='Categories']/../..//label//div[@id='Clothing_Set'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("applyFIlters")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/gini-and-jony-navy-blue-t-shirt-5407708.htm?pos=2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("guidechartlink")).click();
		// WebElement size=driver.findElement(By.id("size-drop-down"));
		//size.click();
		//Select dd=new Select(size);
		//dd.selectByVisibleText("5-6Y");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='selectSizeVariation'])[5]")).click();
		Thread.sleep(2000);
		WebElement DIVelement = driver.findElement(By.xpath("//div[@id='tab1C']/../..//button[@id='addToCart']"));
		Thread.sleep(2000);
		act1.moveToElement(DIVelement).click().perform();
		Thread.sleep(3000);
		WebElement minicart = driver.findElement(By.xpath("(//a[@href='https://www.jabong.com/cart/'])[1]"));
		Thread.sleep(2000);
		act1.moveToElement(minicart).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/cart/']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://www.jabong.com/checkout/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.jabong.com/customer/account/create/']")).click();
		Thread.sleep(2000);
		String fnm = xlib.getexceldata("Signup",1,0);
		String lnm = xlib.getexceldata("Signup",1,1);
		String email =xlib.getexceldata("Signup",1,2);
		String pwd = xlib.getexceldata("Signup",1,3);
		String mob = xlib.getexceldata("Signup",1,4);
		Thread.sleep(3000);
		driver.findElement(By.id("firstname")).sendKeys(fnm);
		driver.findElement(By.id("lastname")).sendKeys(lnm);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("accessKey")).sendKeys(pwd);
		driver.findElement(By.id("mobile")).sendKeys(mob);
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("btn-signup")).click();
		Thread.sleep(3000);
		String pincode = xlib.getexceldata("address",1,0);
		String fstnm = xlib.getexceldata("address",1,1);
		String add1 = xlib.getexceldata("address",1,2);
		String phone = xlib.getexceldata("address",1,3);
		
		driver.findElement(By.id("postcode")).sendKeys(pincode);
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).sendKeys(fstnm);
		Thread.sleep(2000);
		driver.findElement(By.id("address1")).sendKeys(add1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys(phone);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='deliver to this address']")).click();
		Thread.sleep(3000);

	}
}
