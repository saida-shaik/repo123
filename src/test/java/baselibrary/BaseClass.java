package baselibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public	WebDriver driver;
	public	ExcelLibrary xlib;
  @BeforeMethod
  public void openbrowser() {
	  xlib=new ExcelLibrary();
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.jabong.com/");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
String	expectedtitle="Online Shopping Site: Buy Women, Men, Kids Fashion & Lifestyle in India - Jabong";
String actualtitle = driver.getTitle();

if(actualtitle.equals(expectedtitle)){
	System.out.println("pass");
}
  }
  @AfterMethod
  public void closebrowser() {
	  driver.quit();
  }
 
}
