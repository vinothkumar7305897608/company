package org.baseclass.test;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class FaceBookFrame extends BaseClass {

@BeforeClass	
	public static void beforeclass() {
	chromelaunch();	
	}
@AfterClass	
	public static void afterclass() {
		driver.quit();
	}
@Before	
	public void before() {
	Date d=new Date();	
	System.out.println("Before "+d);
	}
@After	
	public void after() {
		Date d=new Date();
		System.out.println("After "+d);
	}
	
@Test	
	public void test1() throws InterruptedException {
	urlLaunch("https://www.facebook.com/");	
	impWait(10);
	LoginPage l=new LoginPage();
	sendKeys(l.getTxtusername(), "vinothkumar");
	sendKeys(l.getTxtpassword(), "8055");
	click(l.getLogbtn());
	Thread.sleep(5000);
	}
@Test	
	public void test2() {
	urlLaunch("https://www.facebook.com/");	
	impWait(10);
	CreatPage c=new CreatPage();
	click(c.getCreatnew());
	sendKeys(c.getFname(), "vinoth");
	sendKeys(c.getSname(), "kumar");
	sendKeys(c.getMoblienumber(), "7305897608");
	sendKeys(c.getNewpassword(), "8055");
	dropIntex(c.getDate(), 6);
	dropIntex(c.getMonth(), 9);
	dropText(c.getYear(), "1997");
	click(c.getGender());
	click(c.getSignup());
	}
	
	
	
	
	
}
