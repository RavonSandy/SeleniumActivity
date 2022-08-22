
Feature: Orange Hrm Login

  Scenario Outline: Login the orange Hrm Application
    Given Launch the brower
    When Enter the <username>
    And Enter the <Password>
    Then Click Login button
   Examples: 
      | UserName | Password |
      | Admin | admin123 |
    
    
Feature: Orange HRM Admin

  Scenario: Add User in Admin Tab
    Given Click add user
    When Enter the Select the userrole and status
    And Enter the Employee Name
    And Enter the UserName and Password
    Then Click Save button
    
    
Feature: Orange HRM Search User

  Scenario: Search User in Admin Tab
    Given Navigate to the admin page
    When Enter  the userrole and status
    And Enter the Employee Names
    And Select the status
    Then Click Search button

Feature: Orange HRM PIM Tab Add Employee

  Scenario Outline: Add Employee in PIM  
    Given Navigate to the PIM tab
    When Click on the Add button
    Then Enter the <FirstName> and <LastName>
    Then Click Saves button
    Examples: 
      | FirstName | LastName |
      | Santhosh | G |
    
    
Feature: Orange HRM Directory Tab

  Scenario: Logging out the application
    Given Navigate to the Home page tab
    When Click on username
    Then Logging out the application

   
