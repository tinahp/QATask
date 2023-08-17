Feature: Age Details Features
  This features would describe a successful age component

Scenario: Successful Date of Birth Validation
  Given User launches the chrome Browser
  When  User is able to open URl "https://howoldru.m-messiah.cc/"
  Then  User should be able to input name in the name field "Ladipo Isreal"
  Then  User should be able to proceed to birthday field
  Then  User should click on the submit button
  Then  User gets a Success Message and title
  And   Browser should close
