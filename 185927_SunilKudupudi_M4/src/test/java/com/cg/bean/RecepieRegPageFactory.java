package com.cg.bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RecepieRegPageFactory {
	
	
	
	WebDriver driver;
	@FindBy(how=How.TAG_NAME,using="title")
	WebElement title;
	
	@FindBy(how=How.NAME, using="fname")
	@CacheLookup
	WebElement firstName;

	//using how class
	@FindBy(how=How.ID, using="Submit1")
	@CacheLookup
	WebElement confirmButton;

	@FindBy(how=How.NAME,using="lname")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(how=How.NAME, using="email")
	@CacheLookup
	WebElement email;

	@FindBy(how=How.NAME, using="mobile")
	@CacheLookup
	WebElement mobileNo;
	
	@FindBy(how=How.NAME, using="D5")
	@CacheLookup
	WebElement city;
	
	@FindBy(how=How.NAME, using="D6")
	@CacheLookup
	WebElement category;

	@FindBy(xpath="/html/body/form/table/tbody/tr[8]/td[2]")
	@CacheLookup
	WebElement mol;

	@FindBy(xpath="/html/body/form/table/tbody/tr[9]/td[2]")
	@CacheLookup
	WebElement iCD;
	
	@FindBy(how=How.NAME, using="enqdetails")
	@CacheLookup
	WebElement yourEnquiry;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title.sendKeys(title);;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public void setConfirmButton() {
		this.confirmButton.click();
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo.sendKeys(mobileNo);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public WebElement getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category.sendKeys(category);
	}

	public WebElement getMol() {
		return mol;
	}

	public void setMol(String mol) {
		this.mol.sendKeys(mol);
	}

	public WebElement getICD() {
		return iCD;
	}

	public void setICD(String iCD) {
		this.iCD.sendKeys(iCD);
	}

	public WebElement getYourEnquiry() {
		return yourEnquiry;
	}

	public void setYourEnquiry(String yourEnquiry) {
		this.yourEnquiry.sendKeys(yourEnquiry);
	}
	
	
	//initiating Elements
	public RecepieRegPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
}
