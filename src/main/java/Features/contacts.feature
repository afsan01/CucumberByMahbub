Feature: Free CRM Create Contacts

@Test
Scenario Outline: Free CRM Create a new contact Scenario

Given User is already on Login Page
When Title of Login page is Free CRM
Then User clicks on login button
Then User enters "<username>" and "<password>"
Then User clicks on submit button
Then user is on home page
Then user click on contact link
Then user click on New link
Then user enter contact details "<firstname>" and "<lastname>" and "<company>"
Then user clicks on save button
Then close the browser

Examples:
|username| password| firstname |lastname | company|
|afsan0403@gmail.com| Al112101 |Ahfaz   |Ibtisam  | Verizon| 
|afsan0403@gmail.com| Al112101 |Afsan   |Ibtisam  | AA line|
|afsan0403@gmail.com| Al112101 |Rabeya   |Rahman | Verizon|
|afsan0403@gmail.com| Al112101 |Mahbubur   |Rahman  | MasterCard|
|afsan0403@gmail.com| Al112101 |Taheem   |Islam  | Verizon|