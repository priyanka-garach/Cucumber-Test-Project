Feature: Pixalere Create New Patient Account

@test11
Scenario: Create New Patient Account Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I Navigate to "Administration -> Patient Accounts" LH panel option
Then It should be shown "Search" screen
When I click on Search Button
Then It should be shown "Create" screen
When I enter "Last Name" input field
And I enter "First Name" input field
And I enter "Middle Name" input field
And I select "Male" from "Gender" dropdown
And I select current date with "1990" year in "Date of Birth" dropdown
And I enter "CIN #" input field
And I enter "Allergies" input field
And I enter "Home Address" input field
And I enter "City" input field
And I enter "State/Province" input field
And I enter "Zip Code/Postal Code" input field
And I select "PUG" from "Treatment Area" dropdown
And I select "Pixalere User Group" from "Treatment Location" dropdown
And I enter "Primary Insurance Carrier" input field
And I enter "Primary Insurance Policy Holder Name" input field
And I enter "Primary Insurance Policy #" input field
And I enter "Primary Insurance Group #" input field
And I click on CreatePatientAccount Button
Then Patient should get create with displaying "Name, Date of Birth, Allergies, Treatment Location, Status, CIN #" details
And I Logout from Pixalere


@test11
Scenario: Patient Consent
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
Then I verify "Warning: This patient has not signed/accepted a Patient Consent. To proceed" message should display
When I click on "click here" hyper link
Then Another window should open for consent
When I Select "No" and click on "Save" Button
Then Consent window should close And the consent text should "remain visible"
When I click on "click here" hyper link
Then Another window should open for consent
When I Select "Yes" and click on "Save" Button
Then Consent window should close And the consent text should "disappear"
And I Logout from Pixalere


@test11
Scenario: Patient Profile
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
When I Navigate to "Patient Profile -> Patient Profile" LH panel option
Then "Patient Profile" page should open
When I enter "Past Medical History" in Patient Profile input field
And I enter "Past Medical History Other" in Patient Profile input field
And I verify "Allergies" input field with Patient Account
And I enter "Current Medications" in Patient Profile input field
And I select "Alcohol, Poor Diet, Smoking, Palliative, Incontinence: Fecal, Incontinence: Urinary" in Factors that Affect Wound Healing section
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Back" Button
Then "Confirm" popup should close
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from popup
When I click on "Confirm" Button
Then Data should saved And "Your work has been saved successfully" message should display
And I verify "Last Updated" Date
And I Logout from Pixalere


@test11
Scenario: Patient Braden
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
When I Navigate to "Patient Profile -> Braden" LH panel option
Then "Braden Pressure Injury Risk Assessment" page should open
When I select "4. No Impairment" radio Button in "Sensory/Perception" section
And I select "2. Moist" radio Button in "Moisture" section
And I select "4. Walks Frequently" radio Button in "Activity" section
And I select "4. No Limitations" radio Button in "Mobility" section
And I select "4. Excellent" radio Button in "Nutrition" section
And I select "2. Potential Problem" radio Button in "Friction" section
Then It should show "20" braden score in "Little to No Risk Score" textarea
When I enter "Additional Comments" textarea field
And I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Back" Button
Then "Confirm" popup should close
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from popup
When I click on "Confirm" Button
#Then Data should saved And "Your work has been saved successfully" message should display
Then I verify "Last Updated" Date
And I Logout from Pixalere


@test11
Scenario: Patient Investigations
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
When I Navigate to "Patient Profile -> Investigations" LH panel option
Then "Investigations" page should open
When I click on "Diagnostic Tests" Button from Diagnostic Tests field
Then "Diagnostic Tests" popup should open
When I select "WBC Scan" radio option from "Diagnostic Tests" popup
And I click on "Next" input value Button on popup
And I select current date from calendar
And I click on "Done" input value Button on popup
Then Selected value should be added in "Diagnostic Tests" section
##
When I click on "Albumin g/L" Button from "Albumin & Prealbumin Tests" field
Then "Albumin g/L" modal popup should open
When I enter Numeric value in "Albumin g/L" popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Albumin g/L"
When I Select Current Date in "Albumin g/L" Date section field
Then Selected Date should be shown for "Albumin g/L"
##
When I click on "Prealbumin mg/L" Button from "Albumin & Prealbumin Tests" field
Then "Prealbumin mg/L" modal popup should open
When I enter Numeric value in "Prealbumin mg/L" popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Prealbumin mg/L"
When I Select Current Date in "Prealbumin mg/L" Date section field
Then Selected Date should be shown for "Prealbumin mg/L"
##
When I click on "Blood Glucose mmol/L" Button from "Albumin & Prealbumin Tests" field
Then "Blood Glucose mmol/L" modal popup should open
When I enter Numeric value in "Blood Glucose mmol/L" popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Blood Glucose mmol/L"
When I Select Current Date in "Blood Glucose mmol/L" Date section field
Then Selected Date should be shown for "Blood Glucose mmol/L"
##
When I click on "Blood Glucose Time" Button from "Albumin & Prealbumin Tests" field
Then "Blood Glucose Time" modal popup should open
When I enter Numeric value in "Blood Glucose Time" popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Blood Glucose Time"
When I click on "PURS Score" Button from "Albumin & Prealbumin Tests" field
##
Then "PURS Score" modal popup should open
When I enter Numeric value in "PURS Score" popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "PURS Score"
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from popup
When I click on "Confirm" Button
Then "Your work has been saved successfully" popup should open
When I click on "Stay On" Button
Then "Your work has been saved successfully" popup should close
