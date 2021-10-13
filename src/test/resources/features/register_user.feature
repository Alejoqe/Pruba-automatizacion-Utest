
Feature: register a log an account in the webpage Utest


  @Registeruser
  Scenario Outline: User  creates an account
    Given the user is on Homepage
    When the user clicks on become a utester
    And user fills all the forms
      | firstName | lastName | email | day   | month  | year    |languages| city | postalcode | country | computer | version | language| mobile| model |system |password | confirmpassword |agreement1 | agreement2 |agreement3 |
      | <firstName> | <lastName> | <email> | <day> | <month> |<year> |<languages> | <city> | <postalcode> | <country> |<computer> | <version> | <language>  |<mobile> | <model> | <system> | <password> | <confirmpassword> | <agreement1> | <agreement2> |<agreement3> |
    Then the user successfully  creatted  the account
    Examples:
      | firstName | lastName | email | day   | month  | year    |languages| city | postalcode | country | computer | version | language| mobile| model |system |password | confirmpassword |agreement1 | agreement2 |agreement3 |
      | Alex | Estarada  | fercho_q@hotmail.com | 28 | October | 1985  |English | Envigado | 055422| Colombia |   macOS  | Mojave 10.14 |  Spanish  |Samsung |J7|Android 8.1|Wsxaq123., | Wsxaq123., | hola123 | hola123  | hola123  |


  @LogInAccount
  Scenario Outline: user can log in account
    Given the user has a valid account
    When the user clicks on Log in
    And enters email
    | <Mail> |
    And User puts password
    | <Psw> |
    And clicks sign in
    Then the user is successfully logged in
    Examples:
      | Mail                   | Psw       |
      | fercho_q@hotmail.com   | Wsxaq123., |


  @RegisterAccountWithEmailUsed
  Scenario Outline: the user cannot create an account with email already registered
    Given The user is on Homepage
    When the user clicks on Log in
    And user enters email
      | <Mail> |
    And User Clicks create an account
    Then validate message account in use
    Examples:
      | Mail|
      | fercho_q@hotmail.com  |