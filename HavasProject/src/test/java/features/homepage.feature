Feature: Login into Application and validating the title

--@SmokeTest
Scenario: Positive test validating Title of Home Page
Given Initialize the browser with chrome 
And Navigate to "https://havaslynx.com/" site
When user gets the title of the Home page
Then Home Page title should be "Havas Lynx Group - A leading global healthcare communications agency"
And close browsers

Scenario Outline: Validate Elements on Home page
Given Initialize the browser with chrome
And Navigate to "https://havaslynx.com/" site
When user click on elements <Elements>
Then Elements page title should be <Title>
And close browsers

Examples:
| Elements 				           |  Title                                              | 
| Contact			               |  Get in touch - Havas Lynx Group                    |  
| Our Work 			             |  Our Work - Havas Lynx Group                        |    
| Thought Leadership         |  Thought Leadership - Havas Lynx Group              |  
| News & Blog   	           |  News & Blog - Havas Lynx Group                     |
| #LYNXLife            	     |  #LYNXLife - Havas Lynx Group                       |
| Sign up to our newsletter  |  Sign up to our newsletter - Havas Lynx Group       |
| Cookie Policy              |  Cookie Policy - Havas Lynx Group                   |
| Privacy Policy             |  Privacy Policy - Havas Lynx Group                  |
