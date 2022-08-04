Feature: Pixalere In-Home Safety Identification Tool

@test11
Scenario: Pixalere In-Home Safety Identification Tool Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> In-Home Safety Identification Tool (Visiting & Shift)" LH panel option
Then "In-Home Safety Identification Tool (Visiting & Shift)" page will open
##
When I select "School Client" checkbox for HSA Not Compelted field HSI
And I select "Clutter" checkbox for TrippingFalling field HSI
And I select "Cords" checkbox for TrippingFalling field HSI
And I select "Unsafe disposal of sharps" checkbox for HSA Not Compelted field HSI
And I select "Absence of food in home" checkbox for HSA Not Compelted field HSI
And I select "Oxygen present" checkbox for TrippingFalling field HSI
And I select "Frayed cords" checkbox for TrippingFalling field HSI
And I select "Client chooses to live at risk" checkbox for HSA Not Compelted field HSI
And I select "Non-adherence to RNAO Safe Sleep BPG" checkbox for HSA Not Compelted field HSI
And I select "Risk for falls from windows" checkbox for HSA Not Compelted field HSI
And I select "Developmentally unsafe food" checkbox for HSA Not Compelted field HSI
And I enter "Comments HSI" input field
And I click on Save My Work In-Home Safety Identification Tool Button HSI
Then I Logout from Pixalere
