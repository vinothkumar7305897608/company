package org.baseclass.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver chromelaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);

	}

	public static void impWait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		driver.manage().window().maximize();
	}

	public static void sendKeys(WebElement a, String name) {
		a.sendKeys(name);

	}

	public static void click(WebElement b) {
		b.click();
	}

	public static String getText(WebElement a) {
		String ts = a.getText();
		return ts;

	}

	public static String getAttribute(WebElement b) {
		String att = b.getAttribute("value");
		return att;

	}

	public static void mouseover(WebElement move) {
		Actions a = new Actions(driver);
		a.moveToElement(move).perform();

	}

	public static void dragAndDrop(WebElement from, WebElement to) {
		Actions a = new Actions(driver);
		a.dragAndDrop(from, to).perform();

	}

	public static void conTextClick(WebElement con) {
		Actions a = new Actions(driver);
		a.contextClick(con).perform();

	}
	public static void doubleClick(WebElement dou ) {
		Actions a = new Actions(driver);
		a.doubleClick(dou).perform();
		
	}
	
	public static void scrollUP(WebElement scr) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", scr);
		
	}
	
	public static void scrollDown(WebElement scr1) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scr1);
	}	
	
	public static void screenShot(String name) throws IOException {
	TakesScreenshot	ts=(TakesScreenshot)driver;
	File from = ts.getScreenshotAs(OutputType.FILE);		
	File to=new File("C:\\Users\\vinot\\eclipse-workspace\\BrowserLanuch\\Screenshot\\"+name+".png");		
	FileUtils.copyFile(from, to);
	
	}
	
	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void confirmationAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		
	}
	
	public static void promptAlert(String s) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(s);
		a.accept();
	}
	
	public static  void dropIntex(WebElement e, int a) {
	Select s=new Select(e);
	s.selectByIndex(a);
	
	
	}
	
	public static void dropValue(WebElement e,String b) {
		Select s=new Select(e);
		s.selectByValue(b);
			
	}
	
	public static void dropText(WebElement e,String b) {
		Select s=new Select(e);
		s.selectByVisibleText(b);
	}
	
	
	public static void window(String b) {
	String id = driver.getWindowHandle();	
	System.out.println(b);
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	


