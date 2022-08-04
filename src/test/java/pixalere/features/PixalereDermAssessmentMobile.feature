Feature: Pixalere Derm Assessment Mobile

@test11
Scenario: Create Derm Assessment
Given I create a new derm assessment via API call

@test11
Scenario: Derm Assessment Mobile
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "dermatologist" User
Then I verify patient last name with API details
When I click on "Consult" Button of selected patient
##
Then "Patient Profile" page should open
When I select "Varicose Veins" option from "Co-morbidities" section
And I enter Text in "Past Medical History" textbox
And I enter Text in "Past Medical History Other" textbox
And I enter Text in "Allergies" textbox
And I enter Text in "Current Medications" textbox
And I select "Palliative" option from "Factors that Affect Wound Healing" section
And I click on "Next" div Button
##
Then "Assessment" page should open
When I enter Text in "Please indicate all parts of the body where the wound is present" textbox
And I select "Pigmentary Problem" radio button from "Problem Identified" section
And I select "3 - 12 months" radio button from "How long have you had this skin problem?" section
And I select "Always present" radio button from "Does your skin problem \"Come and go\" or \"Always present\"?" section
And I verify "Nurse's Diagnosis" value with API value
And I verify "What were the results of the Biopsy?" value with API value
And I verify "List any treatments tried and the response (if none, leave blank)" value with API value
And I enter Text in "Recommendations" textbox
And I enter Text in "Follow-Up" textbox
And I verify "Any questions that need urgently answered" value with API value
And I enter Text in "Response" textbox
##
And I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
##
Then "My Consults" page should open
And I verify Patient Name, Status as "Completed" and "Download PDF" button
And after click on "Download PDF" file should download in Local machine