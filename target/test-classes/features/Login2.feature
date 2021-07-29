
			Feature: Application Login
      
      Scenario Outline: Home Page Default Login
      Given User is on netbanking landing page
      When User login into Application with <username> and <password>
      Then Home page is populated
      And Cards are displayed
      
      Examples:
      |username   | password   |
      |username1  | password1  |
      |username2  | password2  |
      |username3  | password3  |
      |username4  | password4  |
      |username5  | password5  |
      
      
      