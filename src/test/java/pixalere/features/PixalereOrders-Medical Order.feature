Feature: Pixalere Orders - Medical Order

@test11
Scenario: Orders - Medical Order
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Orders -> Medical Order" LH panel option
Then "Physicians Orders" page should open
##
When I edit "Physician's / Nurse Practitioner's Name" field for Orders
And I edit "Telephone" field as "9999999999" for Orders
And I edit "Fax" field as "7777777777" for Orders
And I select "Order Date" field as CurrentDate for Orders
And I edit "Orders" field for Orders
##
And I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
Then "Orders - Medical Order" field Data should saved and verify in History record
##
When I edit "Reason for Marked in Error" field for Orders
And I click on "Delete Order" input value Button for Orders
Then "Orders - Medical Order" field Data should deleted and verify in History record