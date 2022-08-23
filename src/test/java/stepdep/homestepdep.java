package stepdep;

import com.test.PageAction.Action;
import com.test.util.testbase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homestepdep extends testbase{
	Action ac=new  Action();
	
	@Given("^launch \"([^\"]*)\"$")
	public void launch(String url) throws Throwable {
	   getUrl(url);
	}
	
	@Then("^enter shirt on search field$")
	public void enter_shirt_on_search_field() throws Throwable {
	   ac.search();
	}
	
	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
	  ac.clicksearch();
	}

	////Signin
	
	
	
	
	@Then("^click on sigin$")
	public void click_on_sigin() throws Throwable {
       ac.sigin();

	}

	@Then("^enter email$")
	public void enter_email() throws Throwable {
       ac.enteremail();

	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
     ac.enterpassword();

	}

	@Then("^click sigin button$")
	public void click_sigin_button() throws Throwable {
       ac.siginbutton();
     
	}
	
	////////////CUSTOMER SERVICE
	
	
	
	@Then("^click on contact us$")
	public void click_on_contact_us() throws Throwable {
	   ac.contactus();
	}

	@Then("^click on subject$")
	public void click_on_subject() throws Throwable {
	 ac.subject();
	}

	@Then("^type hello on message filed$")
	public void type_hello_on_search_filed() throws Throwable {
	  ac.messagefield();
	}

	@Then("^click on send button$")
	public void click_on_send_button() throws Throwable {
	 ac.sendbutton();
	}
	
	
	//////////// ACCOUNT CREATE
	
	
	
	@Then("^click signin$")
	public void click_signin() throws Throwable {
	   ac.clicksignin();
	}

	@Then("^type valid email$")
	public void type_valid_email() throws Throwable {
	  ac.validemail();
	}

	@Then("^click create an account$")
	public void click_create_an_account() throws Throwable {
	 ac.clickcreateanaccount();
	}
	
	@Then("^select mrs$")
	public void select_mrs() throws Throwable {
	ac.selectmrs();
	}

	@Then("^type first name$")
	public void type_first_name() throws Throwable {
	ac.typefirstname();
	}

	@Then("^type last name$")
	public void type_last_name() throws Throwable {
	   ac.typelastname();
	}

	@Then("^type user email$")
	public void type_user_email() throws Throwable {
	 ac.typeuseremail();
	}

	@Then("^type user password$")
	public void type_user_password() throws Throwable {
	  ac.typeuserpassword();
	}

	@Then("^select date of birth$")
	public void select_date_of_birth() throws Throwable {
	  ac.selectdateofbirth();
	}

	@Then("^select month of birth$")
	public void select_month_of_birth() throws Throwable {
	  ac.selectmonthofbirth();
	}

	@Then("^select year of birth$")
	public void select_year_of_birth() throws Throwable {
	 ac.selectyearofbirth();
	}

	@Then("^enter user first name$")
	public void enter_user_first_name() throws Throwable {
	  ac.enteruserfirstname();
	}

	@Then("^enter user last name$")
	public void enter_user_last_name() throws Throwable {
	  ac.enteruserlastname();
	}

	@Then("^enter user address$")
	public void enter_user_address() throws Throwable {
	  ac.useraddress();
	}

	@Then("^enter user city$")
	public void enter_user_city() throws Throwable {
	  ac.usercity();
	}

	@Then("^select user state$")
	public void select_user_state() throws Throwable {
	  ac.userstate();
	}

	@Then("^enter zipcode$")
	public void enter_zipcode() throws Throwable {
	   ac.zipcode();
	}

	@Then("^enter mobile number$")
	public void enter_mobile_number() throws Throwable {
	  ac.mobilenumber();
	}
	
	@Then("^enter assign address$")
	public void enter_assign_address() throws Throwable {
	   ac.assignaddress();
	}

	//@Then("^click register$")
	//public void click_register() throws Throwable {
	 // ac.clickregister();
	//}


	
	
}

