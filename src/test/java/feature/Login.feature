Feature: Application Login

Scenario Outline: Home page default login
Given user is on internet landing page
When user login into application with <username> and <password>
Then home page is populated
And cards are displayed


Examples:
|username	|password	|
|usrname1	|pswd1	|
|usrname2	|pswd2	|
|usrname3	|pswd3	|
			

	