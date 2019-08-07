Feature: Recepie Registration 

Scenario: Title Matching 
	Given User is on 'Recepie Reg' Page 
	Then Check the page title 
	
Scenario: 'Online Cooking School Verification' text test 
	Given User is on 'Recepie Reg' Page 
	Then check for the text' 
	
Scenario: 'Download our Recipe class Brochure' link verification 
	Given User is on 'Recepie Reg' Page 
	When user clicks on hyperlink 
	Then display msg page 
Scenario: 'Recipe class Brochure is sent to your registered mail id' text verification 
	Given User is on 'Msg' Page 
	Then check for text 
Scenario: navigating back to recepie reg 
	Given User is on 'Msg' Page 
	When user clicks on back button 
	Then display 'recepie reg' page 
	
Scenario: Invalid first name 
	Given user is on 'Recepie reg' page 
	When user enters invalid first name 
	Then displays 'First Name must be filled out' 
	
	
Scenario: Invalid last name 
	Given user is on 'Recepie reg' page 
	When user enters invalid last name 
	Then displays 'Last Name must be filled out' 
	
Scenario: Invalid Email 
	Given user is on 'Recepie Reg' page 
	When user enters invalid email 
	Then display 'Email must be filled out' 
	
	
Scenario: Invalid Mobile Number 
	Given user is on 'Recepie Reg' page 
	When user enters invalid mobile number 
	Then display 'Mobile must be filled out.' 
	
Scenario: Wrong Mobile Number digits 
	Given user is on 'Recepie Reg' page 
	When user enters wrong mobile number 
	Then display 'Enter 10 digit Mobile number' 
	
	
Scenario: Wrong Mobile Number 
	Given user is on 'Recepie Reg' page 
	When user enters wrong mobile number 
	Then display 'it should start with 9 ' 
	
Scenario: Select the  Category of recipes interested from dropdown as “Non-Veg” 

	Given user is on 'Recepie Reg' page 
	Then select Non-veg 
	
Scenario: Select the city preference as “Mumbai” 
	Given user is on 'Recepie Reg' page 
	
	Then select 'Mumbai' 
	
Scenario: Select Mode of the learning as “In house training” 

	Given user is on 'Recepie reg' page 
	Then select “In house training” 
	
Scenario: Select interested course duration as “6 months” 

	Given user is on 'Recepie reg' page 
	Then select '6 months' 
	
Scenario: Click on Enquire Now!!! button 

	Given user is on 'Recepie reg' page 
	When user clicks enquir enow 
	Then displays 'Enquiry details must be filled out' 
	
	
Scenario: Enter enquire details 

	Given user is on 'Recepie reg' page 
	Then Enter enquire details 
	
	
Scenario: Click on Enquire Now!!! button 
	Given user is on 'Recepie reg' page 
	When user clicks enquir enow 
	Then displays 'Thank you for submitting the online recipe class Enquiryt' 
	
	
	
	
	
	
	
	
	
	
