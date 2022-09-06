package org.baseclass.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatPage extends BaseClass {

public  CreatPage() {
	PageFactory.initElements(driver, this);
}	
@FindBy(xpath="//a[text()='Create New Account']")	
private WebElement Creatnew;	
	
@FindBy	(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")
private WebElement Fname;	
	
	
@FindBy	(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")
private WebElement Sname ;	
	
@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
private WebElement moblienumber;	
	
@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")
private WebElement newpassword;	
	
@FindBy	(id="day")
private WebElement date;	
	
@FindBy	(id="month")
private WebElement month;	
	
@FindBy	(id="year")
private WebElement year;

@FindBy(name="sex")
private WebElement Gender;

@FindBy(name="websubmit")
private WebElement signup;

public WebElement getCreatnew() {
	return Creatnew;
}

public WebElement getFname() {
	return Fname;
}

public WebElement getSname() {
	return Sname;
}

public WebElement getMoblienumber() {
	return moblienumber;
}

public WebElement getNewpassword() {
	return newpassword;
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

public WebElement getSignup() {
	return signup;
}


	
}
