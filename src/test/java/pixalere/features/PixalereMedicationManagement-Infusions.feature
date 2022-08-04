Feature: Pixalere Medication Management Infusions

@test11
Scenario: Infusions
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> Infusions" LH panel option
Then "Infusions" page should open
##
When I click on "Add Solution" Button
Then "Add Solution" popup should open
##
When I edit "Solution Name" input text
And I select "Medication" radio button in "Solution Type"
And I select "Gravity" radio button in "Method"
And I select "Central Line – Tunneled" radio text button in "Catheter Type"
And I click on "Save Solution" Button
Then "Solution Name, Solution Type, Catheter Type" dropdown set for "Solution Name" field in Daily Entry
##
When I edit "Site Location" input text in Daily Entry
And I select "Redness at insertion site" checkbox from "Which of the following signs of infection does your client have?" section in Daily Entry
Then "There is a high likelihood of an infection at the insertion site. Monitor closely and use your judgment to determine whether actions to remove and/or replace the line are required." "Redness alert" message should display
##
When I select "Yes" radio button in "Location Change"
And I edit "Peripheral Cannula Size (gauge)" input text as "1"
And I edit "Central Line: External Length(cm)" input text as "2"
And I edit "PICC: Circumference (cm)" input text as "3"
##
And I select "Yes" radio button in "Occlusion Assessed"
And I select "Yes" radio button in "Occlusion Detected"
Then "Occlusion Quality" and "Occlusion Source" dropdown should visible
When I select "Partial" value from "Occlusion Quality" dropdown
And I select "Thrombotic" value from "Occlusion Source" dropdown
##
And I edit "Normal Saline Flush (mL)" input text as "1"
And I edit "Volume to be infused (mL)" input text as "2"
And I edit "Volume Infused (mL)" input text as "3"
And I edit "Res Volume" input text as "4"
And I select "1" value from "Doses Given" dropdown
##
And I select "Yes" radio button in "Battery Checked"
And I select "Yes" radio button in "Battery Changed"
And I select "Yes" radio button in "Tubing Change"
And I select "Yes" radio button in "Dressing Change"
And I select "Yes" radio button in "Bag Change"
And I select "Yes" radio button in "Cap Change"
And I select "Yes" radio button in "Port-A-Cath Changed"
Then "Port-A-Cath Gauge" field should visible
When I edit "Port-A-Cath Gauge" input text as "4"
And I select "Yes" radio button in "Heparin Lock"
Then "The client requires a heparin lock. Please proceed to eMAR to Administer Heparin" "Heparin Lock alert" message should display
##
When I click on "Given" input value Button
Then Data should Saved in Table and verify it "Yes"
##
When I click on "Delete" button to delete record
Then "Delete Assessment" popup should open
When I edit reason in "Reason for Marked in Error" text field
And I click on "Delete this charting" Button on popup
Then Saved record should deleted in Table and verify it "No"