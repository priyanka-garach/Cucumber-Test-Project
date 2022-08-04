Feature: Pixalere LHIN Equipment Ordering Forms
@test11
Scenario: Pixalere LHIN Equipment Ordering Forms

Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I select "OT" from Service Referral
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "LHIN Forms -> Equipment and Supplies Order" LH panel option
Then "Equipment and Supplies Order" page will open
##
When I select "Infusion - Misc" from "Product Category" dropdown OT
#And I enter "FP1001" input field OT
And I enter "MP1549" input field OT
And I click on AddButton on all rows
And I select "Day" from Delivery Date dropdown OT
And I select "Month" from Delivery Date dropdown OT
And I enter "YearLHIN" input field OT
And I enter "Clinicians Contact Number" input field OT
And I click on Place Order Button LHIN
Then I Logout from Pixalere
