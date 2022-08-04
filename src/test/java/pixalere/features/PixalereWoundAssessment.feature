Feature: Pixalere Wound Assessment

@test11
Scenario: Create New Patient - "New User"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
And I create New Patient
And I accept Patient Consent
And I Logout from Pixalere

@test11
Scenario: Wound Profile - "New User"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I click on abdomen in the given canvas
And I click on Abdomen from the given images
And I click on the Abdomen image
Then it should put Alpha Character in the image
When I enter text in "Cause/History" section
And I enter text in "Surgical Procedure" section
And I enter text in "Surgeon" section
#When I Select Current Date in "Date of Surgery" Date section field
#Then Selected Date should be shown for "Date of Surgery"
When I select "Date of Surgery" field as Current Date
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from Wound Profile popup
And I click on "Confirm" Button
Then I verify "Last Updated" Date on Wound Profile page

@test11
Scenario: Wound Assessment and Treatment - "New User"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I select latest Alpha Character from Assessment
Then "Assessment" page should open
##
When I select "Venous Ulcer" in "Etiology" section
And I select "Heal wound" in "Goal of Care" section
##
And I click on "Add Pain Scale" Button from "Pain" section
Then "Pain-Scale" modal popup should open
When I select value from "Pain-Scale" popup
Then Selected value should be set for "Pain-Scale"
When I enter text in "Pain Comments" text box
##
And I click on "Length" Button from "Dimensions" section
Then "Length" modal popup should open
When I enter Numeric value in "Length" Assessment popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Length" Assessment
##
When I click on "Width" Button from "Dimensions" section
Then "Width" modal popup should open
When I enter Numeric value in "Width" Assessment popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Width" Assessment
##
When I click on "Depth" Button from "Dimensions" section
Then "Depth" modal popup should open
When I enter Numeric value in "Depth" Assessment popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Depth" Assessment
##
When I click on "Undermining Area" Button from "Undermining Depth" section
Then "Undermining Depth" modal popup should open
When I enter Numeric value "1" in "Undermining Area" popup
And I click on Next Button from "Undermining Area" popup
Then "Undermining Area # 1" block should displayed
When I select radio option from "Location Start, Location End" section for "Undermining Location"
And I click on "Submit" Button on popup
Then The selected "Undermining Depth" section values should display
##
When I click on "Sinus Tracts Area" Button from "Sinus Tracts" section
Then "Sinus Tracts" modal popup should open
When I enter Numeric value "1" in "Sinus Tracts" popup
And I click on Next Button from "Sinus Tracts" popup
Then "Sinus Tracts Area # 1" block should displayed
When I select radio option from "Location Start" section for "Sinus Tracts Location"
And I click on "Submit" Button on popup
Then The selected "Sinus Tracts" section values should display
##
When I click on "Number of Fistulas" Button from "Fistula" section
Then "Number of fistulas" modal popup should open
When I select value from "Number of Fistulas" popup
Then Selected value should be set for "Number of Fistulas"
And "Fistula # 1" textarea should display And I enter text in textarea
##
When I click on "Cavity, Slough, Tendon" from "Wound Bed" section AND with respect select "30, 30, 40" values from "Wound Bed Percent" block
##
When I select "Nil" value from "Exudate Characteristics" section
Then Remaining values like "Serous, Haemoserous, Sanguineous, Purulent" should "disabled"
When I select "Nil" value from "Exudate Characteristics" section
Then Remaining values like "Serous, Haemoserous, Sanguineous, Purulent" should "enabled"
##
When I select "Serous" value from "Exudate Characteristics" section
And I select "Dry" in "Exudate Amount" section
And I select "Yes" value from "Odour" section
And I select "Discolour" value from "Wound Edge" section
And I select "Callused" value from "Peri-Wound Skin" section
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
Then "Successfully Saved" popup should open
When I click on "Go to Treatment" Button
Then "Treatment" page should open
####### Treatment #######
When I select "All Products A-Z" from Product Category section
And I select "ABSORB DURAFIBER 10X10CM" value from "Select a Product(s)" section
And I select "ABSORB DURAFIBER 2X45CM" value from "Select a Product(s)" section
And I enter "2" value "Choose a Quantity" text box
And I click on Each hyperlink from "Add Products to Alphas" section
Then "ABSORB DURAFIBER 10X10CM" and "ABSORB DURAFIBER 2X45CM" should display with "2" Quantity in "Treatment Elements By Alpha - Wound A - Assessment" section
##
When I select "Tomorrow" in "Dressing Change Frequency - Wound A" section
And I select "M-W-F" in "Visit Frequency - Wound A" section
And I select "Autolytic" in "Debridement - Wound A" section
And I enter Text in "Progress Note" text Area
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from Wound Profile popup
When I click on "Confirm" Button
Then Data should saved And "Your work has been saved successfully" message should display
And "Wound Profile" page should open
And I verify "Last Updated" Date on Wound Profile page
####### Viewer #######
And I Navigate to "Viewer -> Assessment & Treatment Flowchart" LH panel option
Then "Assessment Flowchart" page should open
And I verify "Wound Assessment" details on Viewer page


####### Existing User #######

@test11
Scenario: Wound Profile - "Existing User"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-Existing" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I click on abdomen in the given canvas
And I click on Abdomen from the given images
And I click on the Abdomen image
Then it should put Alpha Character in the image
When I enter text in "Cause/History" section
And I enter text in "Surgical Procedure" section
And I enter text in "Surgeon" section
#When I Select Current Date in "Date of Surgery" Date section field
#Then Selected Date should be shown for "Date of Surgery"
When I select "Date of Surgery" field as Current Date
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from Wound Profile popup
And I click on "Confirm" Button
Then I verify "Last Updated" Date on Wound Profile page

@test11
Scenario: Wound Assessment and Treatment - "Existing User"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-Existing" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I select latest Alpha Character from Assessment
Then "Assessment" page should open
##
When I select "Venous Ulcer" in "Etiology" section
And I select "Heal wound" in "Goal of Care" section
##
And I click on "Add Pain Scale" Button from "Pain" section
Then "Pain-Scale" modal popup should open
When I select value from "Pain-Scale" popup
Then Selected value should be set for "Pain-Scale"
When I enter text in "Pain Comments" text box
##
And I click on "Length" Button from "Dimensions" section
Then "Length" modal popup should open
When I enter Numeric value in "Length" Assessment popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Length" Assessment
##
When I click on "Width" Button from "Dimensions" section
Then "Width" modal popup should open
When I enter Numeric value in "Width" Assessment popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Width" Assessment
##
When I click on "Depth" Button from "Dimensions" section
Then "Depth" modal popup should open
When I enter Numeric value in "Depth" Assessment popup
And I click on "DONE" input value Button on popup
Then Selected Numeric value should be shown for "Depth" Assessment
##
When I click on "Undermining Area" Button from "Undermining Depth" section
Then "Undermining Depth" modal popup should open
When I enter Numeric value "1" in "Undermining Area" popup
And I click on Next Button from "Undermining Area" popup
Then "Undermining Area # 1" block should displayed
When I select radio option from "Location Start, Location End" section for "Undermining Location"
And I click on "Submit" Button on popup
Then The selected "Undermining Depth" section values should display
##
When I click on "Sinus Tracts Area" Button from "Sinus Tracts" section
Then "Sinus Tracts" modal popup should open
When I enter Numeric value "1" in "Sinus Tracts" popup
And I click on Next Button from "Sinus Tracts" popup
Then "Sinus Tracts Area # 1" block should displayed
When I select radio option from "Location Start" section for "Sinus Tracts Location"
And I click on "Submit" Button on popup
Then The selected "Sinus Tracts" section values should display
##
When I click on "Number of Fistulas" Button from "Fistula" section
Then "Number of fistulas" modal popup should open
When I select value from "Number of Fistulas" popup
Then Selected value should be set for "Number of Fistulas"
And "Fistula # 1" textarea should display And I enter text in textarea
##
When I click on "Cavity, Slough, Tendon" from "Wound Bed" section AND with respect select "30, 30, 40" values from "Wound Bed Percent" block
##
When I select "Nil" value from "Exudate Characteristics" section
Then Remaining values like "Serous, Haemoserous, Sanguineous, Purulent" should "disabled"
When I select "Nil" value from "Exudate Characteristics" section
Then Remaining values like "Serous, Haemoserous, Sanguineous, Purulent" should "enabled"
##
When I select "Serous" value from "Exudate Characteristics" section
And I select "Dry" in "Exudate Amount" section
And I select "Yes" value from "Odour" section
And I select "Discolour" value from "Wound Edge" section
And I select "Callused" value from "Peri-Wound Skin" section
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
Then "Successfully Saved" popup should open
When I click on "Go to Treatment" Button
Then "Treatment" page should open
####### Treatment #######
When I select "All Products A-Z" from Product Category section
And I select "ABSORB DURAFIBER 10X10CM" value from "Select a Product(s)" section
And I select "ABSORB DURAFIBER 2X45CM" value from "Select a Product(s)" section
And I enter "2" value "Choose a Quantity" text box
And I click on Each hyperlink from "Add Products to Alphas" section
Then "ABSORB DURAFIBER 10X10CM" and "ABSORB DURAFIBER 2X45CM" should display with "2" Quantity in "Treatment Elements By Alpha - Wound A - Assessment" section
##
When I select "Tomorrow" in "Dressing Change Frequency - Wound A" section
And I select "M-W-F" in "Visit Frequency - Wound A" section
And I select "Autolytic" in "Debridement - Wound A" section
And I enter Text in "Progress Note" text Area
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from Wound Profile popup
When I click on "Confirm" Button
Then Data should saved And "Your work has been saved successfully" message should display
And "Wound Profile" page should open
And I verify "Last Updated" Date on Wound Profile page
####### Viewer #######
And I Navigate to "Viewer -> Assessment & Treatment Flowchart" LH panel option
Then "Assessment Flowchart" page should open
And I verify "Wound Assessment" details on Viewer page


@exclude
Scenario: Negative Pressure Wound Therapy (NPWT)
####### Negative Pressure Wound Therapy (NPWT) #######
When I Navigate to "Assessment -> Negative Pressure Wound Therapy (NPWT)" LH panel option
Then "Negative Pressure Wound Therapy (NPWT)" page should open
When I select Caretype option
And I select "NPWT Type -> Open Wound" option
And I select "NPWT Initiated By -> Community" option
And I select "NPWT Vendor -> S&N" option
And I select "NPWT Type of Device -> Reusable" option
And I select "NPWT Machine Acquirement -> Owned" option
And I select "NPWT Machine Acquirement -> Owned" option
And I edit "NPWT Machine Serial #" input field
And I edit "NPWT Vendor Confirmation #" input field
When I select current Date in "NPWT Start Date" Date section field
Then Selected Date should be shown for "NPWT Start Date" field
When I select "NPWT Goal of Therapy -> Fistula Closure" option
And I select "Pressure Reading -> 75 mm/hg" option
And I select "Therapy Setting -> Constant" option
And I select "Connector Device -> Bridge" option
And I select "NPWT Reason for Discontinuation -> Wound deterioration" option
When I select current Date in "NPWT End Date" Date section field
Then Selected Date should be shown for "NPWT End Date" field
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
Then "Negative Pressure Wound Therapy (NPWT)" page data should saved