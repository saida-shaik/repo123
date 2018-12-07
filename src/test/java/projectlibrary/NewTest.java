package projectlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baselibrary.BaseClass;

public class NewTest extends BaseClass {
  @Test
  public void testsignin() throws InterruptedException {
	  WebElement Emailid = driver.findElement(By.id("login-email"));
	  	if(Emailid!=null) {
		System.out.println(Emailid);
		String mail=xlib.getexceldata("SingIn",1,0);
		String pwd = xlib.getexceldata("SingIn",1,1);
		Thread.sleep(2000);
		Emailid.sendKeys(mail);
		Thread.sleep(2000);
		driver.findElement(By.id("login-pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("btn-login")).submit();
	}
	else {
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
	}

  }
  
}
