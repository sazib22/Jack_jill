package com.test.PageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.util.testbase;

public class Locator extends testbase {
	
	public Locator () {
		
		PageFactory.initElements(driver, this);
}

	@FindBy(how=How.ID, using="search_query_top")
	public WebElement searchfield;

	@FindBy(how=How.NAME, using="submit_search")
	public WebElement clicksearchbutton;

	//scenarion:sigin
	
	@FindBy(how=How.XPATH, using="//a[@title='Log in to your customer account']")
	public WebElement clicksigin;
	
	@FindBy(how=How.ID, using="email")
	public WebElement enteremail;
	
	@FindBy(how=How.ID, using="passwd")
	public WebElement enterpassword;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public WebElement clicksiginbutton;
	
	
	/////////CUSTOMER SERVICE
	
	@FindBy(how=How.ID, using="contact-link")
	public WebElement clickcontactus;
       
	
	@FindBy(how=How.ID, using="id_contact")
	public WebElement subject;
	
	@FindBy(how=How.ID, using="email")
	public WebElement customeremail;
	
	@FindBy(how=How.ID, using="message")
	public WebElement customermessagefiled;
	
	@FindBy(how=How.ID, using="submitMessage")
	public WebElement clicksendbutton; 
	
	/////// CREATE ACCOUNT
	
	@FindBy(how=How.ID, using="//a[@title='Log in to your customer account']")
	public WebElement clicksignin; 
	
	@FindBy(how=How.ID, using="email_create")
	public WebElement validemail; 
	
	@FindBy(how=How.ID, using="SubmitCreate")
	public WebElement createanaccount; 
	
	@FindBy(how=How.ID, using="id_gender2")
	public WebElement selectmrs; 
	
	
	@FindBy(how=How.ID, using="customer_firstname")
	public WebElement firstname; 
	
	@FindBy(how=How.ID, using="customer_lastname")
	public WebElement lastname; 
	
	@FindBy(how=How.ID, using="email")
	public WebElement useremail; 
	
	@FindBy(how=How.ID, using="passwd")
	public WebElement userpassword; 
	
	@FindBy(how=How.ID, using="days")
	public WebElement dateofbirth; 
	
	@FindBy(how=How.ID, using="months")
	public WebElement monthofbirth; 
	
	@FindBy(how=How.ID, using="years")
	public WebElement yearofbirth; 
	
	@FindBy(how=How.ID, using="firstname")
	public WebElement userfirstname; 
	
	@FindBy(how=How.ID, using="lastname")
	public WebElement userlastname; 
	
	@FindBy(how=How.ID, using="address1")
	public WebElement useraddress; 
	
	@FindBy(how=How.ID, using="city")
	public WebElement usercity; 
	
	@FindBy(how=How.ID, using="id_state")
	public WebElement userstate; 
	
	@FindBy(how=How.ID, using="postcode")
	public WebElement zipcode; 
	
	@FindBy(how=How.ID, using="phone_mobile")
	public WebElement mobilenumber;
	
	@FindBy(how=How.ID, using="alias")
	public WebElement assignadress; 
	
	@FindBy(how=How.ID, using="submitAccount")
	public WebElement cliclregister; 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
