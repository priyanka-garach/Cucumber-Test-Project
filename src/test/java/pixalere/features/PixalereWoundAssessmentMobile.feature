Feature: Pixalere Wound Assessment Mobile

@test11
Scenario: Create Wound Assessment
Given I create a new wound assessment via API call

@test11
Scenario: Wound Assessment Mobile
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "physician" User
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
Then "Wound Images And Description" page should open
When I verify "Pain" value with API value
And I verify "Measurements" value with API value
And I verify "Undermining Depth(cm)" value with API value
And I verify "Sinus Tracts" value with API value
##
And I select value for "Number of Fistulas" section
And I click on "Cavity, Slough, Tendon" with respect to select "30, 30, 40" values from "Wound Bed Percent" block
And I select "Discolour" option from "Wound Edge" section
And I select "Callused" option from "Peri-Wound Skin" section
And I click on "Next" div Button
##
Then "Assessment" page should open
#
When I select "Cellulitis" option from "Primary Diagnosis" section
And I select "Finger" radio button from "Cellulitis" section
And I select "Unspecified" radio button from "Finger" section
And I click on "Save" input value Button
#And I accept Alert popup
Then "Cellulitis, Finger, Unspecified" value should selected for "Primary Diagnosis" section
#
When I select "Lymphedema" option from "Co-morbidities" section
#And I accept Alert popup
Then "Lymphedema" value should selected for "Co-morbidities" section
#
When I select "Heal wound" radio button from "Goal of Care" section
And I click on "Next" div Button
##
Then "Treatment And Plan" page should open
When I enter Text in "Overview" textbox
And I select "Active Healing Support / Low Exudate" radio button from "Care Plan" section
Then it should add 2 orders in "Wound Care Treatment Orders" section
When I click on "Next" div Button
##
Then "SuperBill" page should open
When I select "Live Video" radio button from "SuperBill" section
And I enter "1" in  "How much time did you spend with the patient?" field
And I select "Lymphedema - I89.0, Cellulitis  Finger  Unspecified - L03.019" option from "ICD10/CPT Codes" section
##
And I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
##
Then "My Consults" page should open
And I verify Patient Name, Status as "Completed" and "Download PDF" button
And after click on "Download PDF" file should download in Local machine