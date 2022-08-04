Feature: Pixalere Ostomy Assessment

@test11
Scenario: Create New Patient
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
And I create New Patient
And I accept Patient Consent
And I Logout from Pixalere

@test11
Scenario: Wound Profile for "Urostomy"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I click on abdomen in the given canvas
And I click on Abdomen from the given images
And I click on "Ostomy" tab from Wound Profile page
And I click on the Abdomen image
Then it should put RoundImage Character in the image
When I enter text in "Cause/History" section
And I enter text in "Surgical Procedure" section
And I enter text in "Surgeon" section
#When I Select Current Date in "Date of Surgery" Date section field
#Then Selected Date should be shown for "Date of Surgery"
When I select "Date of Surgery" field as Current Date
##
When I click on "Cecostomy" div Button from "Type Of Ostomy" section
And I click on "Yes" div Button from "Ostomy Marking Prior To Surgery" section
And I click on "Patient independent with ostomy care" div Button from "Ostomy Teaching Goals" section
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from Wound Profile popup
And I click on "Confirm" Button
Then I verify "Last Updated" Date on Wound Profile page

@test11
Scenario: Wound Assessment and Treatment for "Urostomy"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-New" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I select latest RoundImage Character from Assessment
Then "Assessment" page should open
##
When I select "Perforation" in "Etiology" section
And I select "Temporary ostomy" in "Goal of Care" section
And I select "Unmatured" in "Construction" section
And I select "Irregular" in "Stoma Shape" section
And I select "N/A" value for "mm X" from "Dimensions" section
And I select "Os off-centre" value from "Profile" section
And I select "Cancerous lesion(s)" value from "Appearance" section
And I select "Catheter" in "Devices" section
And I select "Flabby" value from "Abdominal Contour" section
And I select "Os tilted" value from "Concerns for Pouching" section
And I select "Fistula" value from "Mucocutaneous Margin" section
And I select "Denuded" value from "Peri-Ostomy Skin" section
And I select "Clear" value from "Fistula Drainage" section
And I select "Erythemic" value from "Peri-Fistula Skin" section
And I select "Large" in "Urine Quantity" section
And I select "Red" value from "Urine Colour" section
And I select "Cloudy" value from "Urine Type" section
And I select "Clear fluids" in "Nutritional Status" section
And I select "Changed - test/procedure" in "Flange Pouch" section
And I select "UOA visitor" value from "Self Care Progress" section
And I fill "Self Care Progress Comments" textarea
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
When I select "Tomorrow" in "Dressing Change Frequency - Wound A" section
And I select "M-W-F" in "Visit Frequency - Wound A" section
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

@test11
Scenario: Wound Profile for "Fecal Stoma"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-Existing" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I click on "Ostomy" tab from Wound Profile page
And I click on the Abdomen image
Then it should put RoundImage Character in the image
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I get "VisitTime/Date" from Wound Profile popup
And I click on "Confirm" Button
Then I verify "Last Updated" Date on Wound Profile page

@test11
Scenario: Wound Assessment and Treatment for "Fecal Stoma"
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-Existing" User
When I search created patient
And I Navigate to "Assessment -> Wound Profile" LH panel option
Then "Wound Profile" page should open
When I select latest RoundImage Character from Assessment
Then "Assessment" page should open
##
When I select "Perforation" in "Etiology" section
And I select "Temporary ostomy" in "Goal of Care" section
And I select "Unmatured" in "Construction" section
And I select "Irregular" in "Stoma Shape" section
And I select "N/A" value for "mm X" from "Dimensions" section
And I select "Os off-centre" value from "Profile" section
And I select "Cancerous lesion(s)" value from "Appearance" section
And I select "Catheter" in "Devices" section
And I select "Flabby" value from "Abdominal Contour" section
And I select "Os tilted" value from "Concerns for Pouching" section
And I select "Fistula" value from "Mucocutaneous Margin" section
And I select "Denuded" value from "Peri-Ostomy Skin" section
And I select "Clear" value from "Fistula Drainage" section
And I select "Erythemic" value from "Peri-Fistula Skin" section
And I select "Large" in "Stool Quantity" section
And I select "Bloody" value from "Stool Colour" section
And I select "Soft/formed" value from "Stool Consistancy" section
And I select "Clear fluids" in "Nutritional Status" section
And I select "Changed - test/procedure" in "Flange Pouch" section
And I select "UOA visitor" value from "Self Care Progress" section
And I fill "Self Care Progress Comments" textarea
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
And I click on Each hyperlink from "Add Products to Alphas : Fecal Stoma" section
Then "ABSORB DURAFIBER 10X10CM" and "ABSORB DURAFIBER 2X45CM" should display with "2" Quantity in "Treatment Elements By Alpha - Wound A - Assessment" section
When I select "Tomorrow" in "Dressing Change Frequency - Wound A" section
And I select "M-W-F" in "Visit Frequency - Wound A" section
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