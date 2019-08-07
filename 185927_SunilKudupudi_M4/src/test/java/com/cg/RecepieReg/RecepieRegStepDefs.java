package com.cg.RecepieReg;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.bean.RecepieRegPageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RecepieRegStepDefs {
	
	
	private WebDriver driver;
	private RecepieRegPageFactory rrpf;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\skudupud\\Downloads\\chromedriver.exe" );
		
		driver= new ChromeDriver();
	}


@Given("^User is on 'Recepie Reg' Page$")
public void user_is_on_Recepie_Reg_Page() {
	driver.get("D:\\Users\\skudupud\\Desktop\\sunil\\185927_SunilKudupudi_M4\\Recipe_class_registration.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

@Then("^Check the page title$")
public void check_the_page_title() {
	String actual=driver.getTitle();
	String expected="Online Cooking Class Enquiry Form";
	Assert.assertEquals(expected,actual);
	driver.close();
	
}

@Then("^check for the text'$")
public void check_for_the_text() {
	
	String bodyText = driver.findElement(By.tagName("body")).getText();
	Assert.assertTrue("Online Cooking School", bodyText.contains("Online Cooking School"));
	driver.close();
}

@When("^user clicks on hyperlink$")
public void user_clicks_on_hyperlink() {
	driver.findElement(By.linkText("Download our Recipe class Brochure")).click();
	
}

@Then("^display msg page$")
public void display_msg_page() {
	driver.get("D:\\Users\\skudupud\\Desktop\\sunil\\185927_SunilKudupudi_M4\\msg.html");
	driver.close();
	
}
@Given("^User is on 'Msg' Page$")
public void user_is_on_Msg_Page() {
	driver.get("D:\\Users\\skudupud\\Desktop\\sunil\\185927_SunilKudupudi_M4\\msg.html");
	
}

@Then("^check for text$")
public void check_for_text() {
	String bodyText = driver.findElement(By.tagName("body")).getText();
	Assert.assertTrue("Recipe class Brochure is sent to your registered mail id", bodyText.contains("Recipe class Brochure is sent to your registered mail id"));
	
}

@When("^user clicks on back button$")
public void user_clicks_on_back_button() {
	
	driver.findElement(By.linkText("Go Back to Registration")).click();
	
	
}

@Then("^display 'recepie reg' page$")
public void display_recepie_reg_page(){
	
	driver.get("D:\\Users\\skudupud\\Desktop\\sunil\\185927_SunilKudupudi_M4\\Recipe_class_registration.html");
	
	
	
}

@Given("^user is on 'Recepie reg' page$")
public void user_is_on_Recepie_reg_page() {
	
	driver.get("D:\\Users\\skudupud\\Desktop\\sunil\\185927_SunilKudupudi_M4\\Recipe_class_registration.html");
	
}

@When("^user enters invalid first name$")
public void user_enters_invalid_first_name() {
	rrpf.setFirstName("");
	rrpf.setConfirmButton();
}

@Then("^displays 'First Name must be filled out'$")
public void displays_First_Name_must_be_filled_out(){
	
	
	String expectedMessage="First Name must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
	
}

@When("^user enters invalid last name$")
public void user_enters_invalid_last_name(){
	
	rrpf.setFirstName("Sunil");
	rrpf.setLastName("");
	rrpf.setConfirmButton();
	
}

@Then("^displays 'Last Name must be filled out'$")
public void displays_Last_Name_must_be_filled_out(){
	
	String expectedMessage="Last Name must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
	
	
}

@Given("^user is on 'Recepie Reg' page$")
public void user_is_on_Recepie_Reg_page() {
	driver.get("D:\\Users\\skudupud\\Desktop\\sunil\\185927_SunilKudupudi_M4\\Recipe_class_registration.html");
}

@When("^user enters invalid email$")
public void user_enters_invalid_email() {
	
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("");
	rrpf.setConfirmButton();
	
}

@Then("^display 'Email must be filled out'$")
public void display_Email_must_be_filled_out(){
	
	String expectedMessage="Email must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
	
}

@When("^user enters invalid mobile number$")
public void user_enters_invalid_mobile_number(){
	
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("");
	rrpf.setConfirmButton();
	
}

@Then("^display 'Mobile must be filled out\\.'$")
public void display_Mobile_must_be_filled_out() {
	
	
	String expectedMessage="Mobile must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();

	
}

@When("^user enters wrong mobile number$")
public void user_enters_wrong_mobile_number() {
	
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("3454");
	rrpf.setConfirmButton();
	
	
}

@Then("^display 'Enter 10 digit Mobile number'$")
public void display_Enter_digit_Mobile_number(int arg1){
	
	String expectedMessage="Enter 10 digit Mobile number";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
	
}

@Then("^display 'it should start with 9 '$")
public void display_it_should_start_with(int arg1) {
	
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("8099298883");
	rrpf.setConfirmButton();
	
}

@Then("^select Non-veg$")
public void select_Non_veg() {
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("9099298883");
	rrpf.setCategory("Non-Veg");
	rrpf.setConfirmButton();
	
	
	
}

@Then("^select 'Mumbai'$")
public void select_Mumbai(){
	
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("9099298883");
	rrpf.setCategory("Non-Veg");
	rrpf.setCity("Mumbai");
	rrpf.setConfirmButton();
	
}
@Then("^select “In house training”$")
public void select_In_house_training() {
	
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("9099298883");
	rrpf.setCategory("Non-Veg");
	rrpf.setCity("Mumbai");
	rrpf.setMol("In house training");
	rrpf.setConfirmButton();
	
	
}
@Then("^select 6 months'$")
public void select_months(int arg1){
	

	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("9099298883");
	rrpf.setCategory("Non-Veg");
	rrpf.setCity("Mumbai");
	rrpf.setMol("In house training");
	rrpf.setICD("6 months");
	rrpf.setConfirmButton();
	
}

@When("^user clicks enquir enow$")
public void user_clicks_enquir_enow() {
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("9099298883");
	rrpf.setCategory("Non-Veg");
	rrpf.setCity("Mumbai");
	rrpf.setMol("In house training");
	rrpf.setICD("6 months");
	rrpf.setConfirmButton();
	
	
}

@Then("^displays 'Enquiry details must be filled out'$")
public void displays_Enquiry_details_must_be_filled_out(){
	
	String expectedMessage="Enquiry details must be filled out";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
	
	
}

@Then("^Enter enquire details$")
public void enter_enquire_details() {
	
	rrpf.setFirstName("Yogini");
	rrpf.setLastName("Naik");
	rrpf.setEmail("yogini@gmail.com");
	rrpf.setMobileNo("9099298883");
	rrpf.setCategory("Non-Veg");
	rrpf.setCity("Mumbai");
	rrpf.setMol("In house training");
	rrpf.setICD("6 months");
	rrpf.setYourEnquiry("hello");
	rrpf.setConfirmButton();
	
}

@Then("^displays 'Thank you for submitting the online recipe class Enquiry'$")
public void displays_Thank_you_for_submitting_the_online_recipe_class_Enquiryt(){
	
	String expectedMessage="Thank you for submitting the online recipe class Enquiry";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.switchTo().alert().accept();
	driver.close();
	
}


}
