Feature: Pixalere Acute Respiratory Illness

@test11
Scenario: Acute Respiratory Illness Tool
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Acute Respiratory Illness Tool" LH panel option
Then "Acute Respiratory Illness" page should open
##
When I checked "No symptoms noted" checkbox
Then All fields of "Acute Respiratory Illness" page should "disabled"
When I unchecked "No symptoms noted" checkbox
Then All fields of "Acute Respiratory Illness" page should "enabled"
##
When I select "Yes" radio option for "Do you have a new/worse cough or shortness of breath?:" field
And I select "Yes" radio option for "Are you feeling feverish (greater than 38 degrees Celsius), or have you had shakes or chills in the last 24 hours?:" field
And I set "27" degree celsius as Temperature
And I click on "Add My Electronic Signature and Save My Work" Button
##
Then I verify "Date" value as "Achal Shah"
Then I verify "Do you have a new/worse cough or shortness of breath?" value as "Yes"
And I verify "Are you feeling feverish (greater than 38 degrees Celsius), or have you had shakes or chills in the last 24 hours?" value as "Yes"
And I verify "Temperature" value as "27.0"
##
When I delete saved record
Then "Delete Assessment" popup should open
When I edit reason in "Reason for Marked in Error" text field
And I click on "Delete this charting" Button on popup
##
Then I verify "Do you have a new/worse cough or shortness of breath?" value as "Yes" deleted
And I verify "Are you feeling feverish (greater than 38 degrees Celsius), or have you had shakes or chills in the last 24 hours?" value as "Yes" deleted
And I verify "Temperature" value as "27.0" deleted