package com.test.PageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.PageLocator.Locator;
import com.test.util.testbase;

public class Action extends testbase {
	
	Locator loc=new Locator();
	
	public void search() {
		loc.searchfield.sendKeys("shirt");
		}
	public void clicksearch() {
		loc.clicksearchbutton.click();
	}
	
	////SCENARIO:SIGIN
	
	public void sigin() {
		loc.clicksigin.click();
	}
	
	public void enteremail() {
		loc.enteremail.sendKeys("sazibk36@gmail.com");
	}
	
	public void enterpassword() {
		loc.enterpassword.sendKeys("sazibkhan");
	}
	
	public void siginbutton() {
		loc.clicksiginbutton.click();
	}
	
	/////////// CUSTOMER SERVICE
	
	public void contactus() {
		loc.clickcontactus.click();
	}
	
	public void subject() {
	loc.subject.click();
	Select sl=new Select(driver.findElement(By.id("id_contact")));
	sl.selectByVisibleText("Customer service");
	}
	
	public void customeremail() {
		loc.customeremail.sendKeys("sazibk36@gmail.com");
	}
	
	public void messagefield() {
		loc.customermessagefiled.sendKeys("hello");
	}
	
	public void sendbutton() {
		loc.clicksendbutton.click();
	}
	
	
	////CREATE ACCOUNT
	
	public void clicksignin() {
		loc.clicksigin.click();
	}
	
	public void validemail() {
		loc.validemail.sendKeys("sazibk37@gmail.com");
	}
	
	public void clickcreateanaccount() {
		loc.createanaccount.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
	}
	
	public void selectmrs() throws Exception {
		//Thread.sleep(7000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		loc.selectmrs.click();
	//	WebDriverWait wait = new WebDriverWait(driver,30);
	}
	
	public void typefirstname() throws Exception {
		//Thread.sleep(7000);
		loc.firstname.clear();
		loc.firstname.sendKeys("Riya");
		WebDriverWait wait = new WebDriverWait(driver,30);
	}
	
	public void typelastname() throws Exception {
		Thread.sleep(7000);
		loc.lastname.sendKeys("Khan");
	}
	
	public void typeuseremail() throws Exception {
		Thread.sleep(7000);
		loc.useremail.clear();
		loc.useremail.sendKeys("sazibk37@gmail.com");
	}
	
	public void typeuserpassword() throws Exception {
		Thread.sleep(7000);
		loc.userpassword.sendKeys("riyakhan");
	}
	
	public void selectdateofbirth () throws Exception {
		Thread.sleep(7000);
		loc.dateofbirth.click();
		Select sl=new Select(driver.findElement(By.id("days")));
		sl.selectByValue("1");
	}
	
	public void selectmonthofbirth() throws Exception {
		Thread.sleep(7000);
		loc.monthofbirth.click();
		Select sl=new Select(driver.findElement(By.id("months")));
		sl.selectByValue("1");
	}
	
	public void selectyearofbirth() throws Exception {
		Thread.sleep(7000);
		loc.yearofbirth.click();
		Select sl=new Select(driver.findElement(By.id("years")));
		sl.selectByValue("1999");
	}
	
	public void enteruserfirstname() {
		loc.userfirstname.clear();
		loc.userfirstname.sendKeys("riya");
	}
	
	public void enteruserlastname() throws Exception {
		Thread.sleep(7000);
		loc.userlastname.clear();
		loc.userlastname.sendKeys("khan");
	}
	
	public void useraddress() throws Exception {
		Thread.sleep(7000);
		loc.useraddress.sendKeys("1335 meadow creek dr.");
	}
	
	public void usercity() throws Exception {
		Thread.sleep(7000);
		loc.usercity.sendKeys("irving");
	}
	
	public void userstate() throws Exception {
		Thread.sleep(7000);
		loc.userstate.click();
		Select sl=new Select(driver.findElement(By.id("id_state")));
		sl.selectByValue("43");
	}
	
	public void zipcode() {
		loc.zipcode.sendKeys("75038");
	}
	
	public void mobilenumber() {
		loc.mobilenumber.sendKeys("9296027015");
	}
	
	public void assignaddress() {
		loc.assignadress.sendKeys("1335 meadow creek dr.");
	}
	
	//public void clickregister() {
		//loc.cliclregister.click();
	//}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
