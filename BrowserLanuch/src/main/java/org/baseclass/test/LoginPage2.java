package org.baseclass.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 extends BaseClass {
public  LoginPage2() {
PageFactory.initElements(driver, this);	
}
	
@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@id='email']")})	
private WebElement txtuser;	
	
@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@id='pass']")})	
private WebElement txtpassword;	

@FindBys({@FindBy(xpath="//a[text()='Create New Account']"),@FindBy(xpath="//a[contains(@class,'_42ft _4jy0 _6lti')]")})	
private WebElement creatnewpage;

@FindAll({@FindBy(name="firstname"),@FindBy(xpath="(//input[@type='text'])[2]")})	
private WebElement fname;	

@FindBys({@FindBy(name="lastname"),@FindBy(xpath="(//input[@type='text'])[3]")})	
private WebElement sname;

@FindAll({@FindBy(xpath="(//input[@type='text'])[4]"),@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")})	
private WebElement mobilenum;

@FindBys({@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[5]"),@FindBy(xpath="(//input[@type='password'])[2]")})	
private WebElement newpass;	

@FindAll({@FindBy(name="birthday_day"),@FindBy(id="day")})	
private WebElement date;	
	
@FindAll({@FindBy(xpath="//select[@id='month']"),@FindBy(id="month")})	
private WebElement month;

@FindBy(id="year")
private WebElement year;

@FindBy(name="sex")
private WebElement Gender;

@FindBy(name="websubmit")
private WebElement singup;

public WebElement getTxtuser() {
	return txtuser;
}

public WebElement getTxtpassword() {
	return txtpassword;
}

public WebElement getCreatnewpage() {
	return creatnewpage;
}

public WebElement getFname() {
	return fname;
}

public WebElement getSname() {
	return sname;
}

public WebElement getMobilenum() {
	return mobilenum;
}

public WebElement getNewpass() {
	return newpass;
}

public WebElement getDate() {
	return date;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getGender() {
	return Gender;
}

public WebElement getSingup() {
	return singup;
}


	
}
