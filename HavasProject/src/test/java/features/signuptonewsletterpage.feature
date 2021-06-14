Feature: Subscribe into News letter page

Scenario: Subscribe into News letter page
Given Initialize the browser with chrome 
And Navigate to "https://havaslynx.com/" site
When user click on elements Sign up to our newsletter
Then Elements page title should be Sign up to our newsletter - Havas Lynx Group
And user enter the email address "Selenium401@gmail.com"
And user enter the FirstName "Shiv" and LastName "Behal"
When user clicks on Subscribe button
And close browsers

