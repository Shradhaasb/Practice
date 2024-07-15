Feature: Validate Cogmento login

  Scenario: validate login feature
    Given user is on login page
    When user enters loginID and Password clicks on Login button
    Then user enters homePage
    Then user click on ContactPage

  Scenario Outline: Validate contact page functionality
    And user click on new Contact
    Then user fills the data from "<SheetName>" and <RowNumber>
    And Click On Save button

    Examples: 
      | SheetName | RowNumber |
      | Contact   |         0 |
      | Contact   |         1 |
