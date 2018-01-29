$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search",
  "description": "",
  "id": "search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Search with valid data",
  "description": "",
  "id": "search;search-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "i am in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "i enter valid product details",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "i select search button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "i should see search results page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDef.i_am_in_home_page()"
});
formatter.result({
  "duration": 22721501911,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_enter_valid_product_details()"
});
formatter.result({
  "duration": 176966917,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDef.i_select_search_button()"
});
formatter.result({
  "duration": 5319400440,
  "status": "passed"
});
formatter.match({
  "location": "SearchResultsPageStepDef.i_should_see_search_results_page()"
});
formatter.result({
  "duration": 1700289,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login With Valid Data",
  "description": "",
  "id": "login;login-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am in Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Select on Login Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see the login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I enter the valid email address and valid password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "i should see the welcome page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStepDef.i_am_in_home_page()"
});
formatter.result({
  "duration": 18716615432,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.i_Select_on_login_link()"
});
formatter.result({
  "duration": 3232933153,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.i_should_see_the_login_page()"
});
formatter.result({
  "duration": 69332873,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.i_enter_the_valid_email_address_and_valid_password()"
});
formatter.result({
  "duration": 217074811,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.i_click_login_button()"
});
formatter.result({
  "duration": 2291012111,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.i_should_see_the_welcome_page()"
});
formatter.result({
  "duration": 44475,
  "status": "passed"
});
});