Feature: search

Scenario: verify search

Given launch "<url>" 
Then enter shirt on search field
Then click on search button 




Scenario: verify user can signin

Given launch "<url>"
Then click on sigin
Then enter email
Then enter password
Then click sigin button
 


Scenario: verify user can send message

Given launch "<url>"
Then click on contact us
Then click on subject
Then enter email
Then type hello on message filed 
Then click on send button 


@Signin
Scenario: verify user can create an account

Given launch "<url>"
Then click signin
Then type valid email
Then click create an account
Then select mrs 
Then type first name
Then type last name
Then type user email
Then type user password
Then select date of birth 
Then select month of birth
Then select year of birth
Then enter user first name
Then enter user last name
Then enter user address
Then enter user city
Then select user state
Then enter zipcode
Then enter mobile number
Then enter assign address  
#Then click register













 