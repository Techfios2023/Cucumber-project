 @DBLoginFeature @Smoke
Feature: Techfios Other billing login page functionality validation by extracting data from september2022 Database

 @DBScenerio1
Scenario Outline: User should be able to login with valid credentials from DB	
 Given User is on the techfios login page
	When User enters the "username" from DB
	When User enters the "password" from DB
	And User clicks on "login"
	Then User should land on Dashboard page 