Feature: Use ChatGPT to dynamically find the XPaths of WebElements required to Login

  @ChatGPTAPIDynamicLoginTest
  Scenario Outline: Test ChatGPT API and print results
    Given User opens the browser and goes to the required "<URL>" for "<TestCase>"
    Then User is able to connect to ChatGPT API and gets the required xpaths for login for "<TestCase>"
    Then User enters the "<UserName>" and "<Password>" for "<TestCase>"
    Then User clicks on the login button for "<TestCase>"

    Examples:
    | TestCase                 |  URL                                                | UserName | Password |
    | DynamicLogin_TC01        |  https://parabank.parasoft.com/parabank/index.htm   | UserName | Password |
