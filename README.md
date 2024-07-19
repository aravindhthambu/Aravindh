**Overview**
This repository contains Basic cookie Selenium automation scripts for testing the **EdControls application**. 
The tests are implemented using Java and the Page Object Model (POM) framework to ensure comprehensive coverage and maintainability.

**Project Structure**
src/test/java/pageObjects: Page Object Model classes for different pages of the application.
src/test/java/testBase: contains the Basepage class.
src/test/java/testCases: Test classes for various test scenarios.

**Features**
Page Object Model (POM): Organizes code for maintainability and scalability.
TestNG: Used for test management and execution.

Getting Started
**Prerequisites**
Java Development Kit (JDK): JDK 8 or above.
Maven: For managing dependencies and build automation.
Browser Driver: Ensure you have the appropriate driver (e.g., chromedriver) for your browser.

**Test Cases**
**Test Case 1: Accept Cookies**
Description: Ensures that cookies are accepted on the home page.

Steps:
Navigate to the home page.
Accept cookies by interacting with the cookie consent banner.
Verify that the acceptance action is completed successfully.

**Test Case 2: Verify Cookie Size**
Description: Verifies the size of the cookie.

Steps:
Navigate to the home page.
Accept cookies.
Retrieve the cookie with the name "CookieConsent".
Check the size of the cookie value.
Assert that the cookie size meets the expected criteria.

**Test Case 3: Validate Page Title**
Description: Validates that the page title is as expected after accepting cookies.

Steps:
Navigate to the home page.
Accept cookies.
Retrieve the page title.
Assert that the page title matches the expected value.

Installation
Clone the Repository:
git clone https://github.com/aravindhthambu/Aravindh

Navigate to the Project Directory:
cd Aravindh

Install Dependencies:
mvn install

Running Tests
Execute the tests using Maven:
mvn test
