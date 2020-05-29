Feature: Deal data creation 

@Afsan
Scenario: 
	Given User is already on Login Page 
	When Title of Login page is Free CRM 
	Then User clicks on login button 
	Then User enters username and password 
		|username|password|
		|afsan0403@gmail.com|Al112101|
	Then User clicks on submit button 
	Then user is on home page 
	Then user click on Deals link 
	Then user click on New Deals 
	Then user enter deal details 
		|title|amount|probability|commission|
		|test deal|1000|50| 10 |
		|test1 deal|2000|60| 20 |
		|test2 deal|3000|70| 30 |
		#Then User clicks on save button
	Then close the browser