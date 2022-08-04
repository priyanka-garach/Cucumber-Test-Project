Feature: Pixalere Derm Assessment

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
And I click on "Derm" hyper link
And I click on the Abdomen image
#Then it should put Alpha Character in the image
Then it should put Numeric Character in the image
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
When I select latest Numeric Character from Assessment
Then "Assessment" page should open
##
When I enter text in "Please indicate all parts of the body where the wound is present" text box
When I select "Pigmentary Problem" in "Problem Identified" section
And I select "3 - 12 months" in "How long have you had this skin problem?" section
And I select "Comes and goes" in "Does your skin problem \"Come and go\" or \"Always present\"?" section
And I select "Painful" value from "Do you currently have any of the following symptoms?" section
And I fill "Other Symptoms" textarea
And I fill "Nurse's Diagnosis" textarea
And I select "C" from Diagnosis section with select "Callus,Condyloma acuminata,Cyanosis,Chalazion" options
And I select "Yes" from "Problem Biopsied Before?" section
And I fill "What were the results of the Biopsy?" textarea
And I fill "List any treatments tried and the response (if none, leave blank)" textarea
And I select "Joint Pain" value from "Review of Systems" section
And I fill "Recommendations" textarea
And I fill "Follow-Up" textarea
And I fill "Any questions that need urgently answered" textarea
And I fill "Response" textarea
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
#And I select "Autolytic" in "Debridement - Wound A" section
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
And I click on "Derm" hyper link
And I click on the Abdomen image
#Then it should put Alpha Character in the image
Then it should put Numeric Character in the image
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
When I select latest Numeric Character from Assessment
Then "Assessment" page should open
##
When I enter text in "Please indicate all parts of the body where the wound is present" text box
When I select "Pigmentary Problem" in "Problem Identified" section
And I select "3 - 12 months" in "How long have you had this skin problem?" section
And I select "Comes and goes" in "Does your skin problem \"Come and go\" or \"Always present\"?" section
And I select "Painful" value from "Do you currently have any of the following symptoms?" section
And I fill "Other Symptoms" textarea
And I fill "Nurse's Diagnosis" textarea
And I select "C" from Diagnosis section with select "Callus,Condyloma acuminata,Cyanosis,Chalazion" options
And I select "Yes" from "Problem Biopsied Before?" section
And I fill "What were the results of the Biopsy?" textarea
And I fill "List any treatments tried and the response (if none, leave blank)" textarea
And I select "Joint Pain" value from "Review of Systems" section
And I fill "Recommendations" textarea
And I fill "Follow-Up" textarea
And I fill "Any questions that need urgently answered" textarea
And I fill "Response" textarea
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
#And I select "Autolytic" in "Debridement - Wound A" section
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