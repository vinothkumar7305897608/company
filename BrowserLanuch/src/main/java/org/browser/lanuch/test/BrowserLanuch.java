package org.browser.lanuch.test;

import java.io.IOException;
import java.time.Duration;

import org.baseclass.test.BaseClass;
import org.baseclass.test.CreatPage;
import org.baseclass.test.LoginPage;
import org.baseclass.test.LoginPage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanuch extends BaseClass  {

	public static void main(String[] args) {
		chromelaunch();

		urlLaunch(" https://www.facebook.com/ ");
		impWait(10);
		
		LoginPage2 li=new LoginPage2();
		
		sendKeys(li.getTxtuser(), "vinothkumar");
		sendKeys(li.getTxtpassword(), "8055");
		click(li.getCreatnewpage());
		sendKeys(li.getFname(), "vinoth");
		sendKeys(li.getSname(), "kumar");
		sendKeys(li.getMobilenum(), "7305897608");
		sendKeys(li.getNewpass(), "805544");
		dropIntex(li.getDate(), 6);
		dropIntex(li.getMonth(), 9);
		dropText(li.getYear(), "1997");
		click(li.getGender());
		click(li.getSingup());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//LoginPage l = new LoginPage();

	//sendKeys(l.getTxtusername(), "vinothkumar");
		//sendKeys(l.getTxtpassword(), "8055");

		//CreatPage c=new CreatPage();
//	click(c.getCreatnew());
//	sendKeys(c.getFname(), "vinoth");	
//	sendKeys(c.getSname(), "kumar");	
//	sendKeys(c.getMoblienumber(), "7305897608");	
//	sendKeys(c.getNewpassword(), "8055");	
//	dropIntex(c.getDate(), 6);
//	dropIntex(c.getMonth(), 9);	
//	dropValue(c.getYear(), "1997");	
//	click(c.getGender());	
//	click(c.getSignup());	
//		
		
		
		
		
		
	}

}
