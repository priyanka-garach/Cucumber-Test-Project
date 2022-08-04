Feature: Pixalere Medication Management eMar

@test11
Scenario: eMar - Add Medication Record
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> eMar" LH panel option
Then "eMar Flowchart" page should open
##
When I click on "Add Medication Record" Button
Then "Add Medication Record" section should display
When I edit "Medication Name" field
And I edit "Dosage" field as "Weekly"
And I select "Route" field as "SC"
And I select "Dose Frequency" field as "TID"
And I select "End Date" field as CurrentDate
And I select "Ambulatory Pump" checkbox
And I select "High Risk Medication" checkbox
And I select "Date Ordered" field as CurrentDate
And I edit "Special Instructions" field
And I click on "Save Medication" button for Save record
Then "Current Medications" section should display
And I verify Saved Record in "Current Medications" section

@test11
Scenario: eMar - Edit Existing Medication Record
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> eMar" LH panel option
Then "eMar Flowchart" page should open
##
When I click on "Edit" button of latest Medication Record
Then "Edit Medication Record" section should display
When I edit "Medication Name" field
And I edit "Dosage" field as "Monthly"
And I select "Route" field as "Each Eye"
And I select "End Date" field as CurrentDate
And I select "Date Ordered" field as CurrentDate
And I edit "Special Instructions" field
And I click on "Save Medication" button for Save record
Then "Current Medications" section should display
And I verify Saved Record in "Current Medications" section

@test11
Scenario: eMar - Medication Given
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> eMar" LH panel option
Then "eMar Flowchart" page should open
##
When I click on "Given" button of latest Medication Record
Then "Independant Double Check" popup should open
When I click on "Save" Button on popup
Then "Given" popup should open
When I click on "Given" Button on popup
Then End Date should saved for "Last Dose Given On" section
And I verify Medication Name with Date successfully message

@test11
Scenario: eMar - Medication Hold & Reactivate
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> eMar" LH panel option
Then "eMar Flowchart" page should open
##
When I click on "Hold" button of latest Medication Record
Then Current Medication Record set as Hold on Bottom
When I click on "Reactivate" button of Hold Medication Record
Then Current Medication Record activated and display on Top

@test11
Scenario: eMar - Medication Hold & Discontinue
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> eMar" LH panel option
Then "eMar Flowchart" page should open
##
When I click on "Hold" button of latest Medication Record
Then Current Medication Record set as Hold on Bottom
When I click on "Discontinue" button of Hold Medication Record
Then Current Medication Record deleted and it display in Delete History

@test11
Scenario: eMar - Add Medication Record & Discontinue
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> eMar" LH panel option
Then "eMar Flowchart" page should open
##
When I click on "Add Medication Record" Button
Then "Add Medication Record" section should display
When I edit "Medication Name" field
And I edit "Dosage" field as "Weekly"
And I select "Route" field as "SC"
And I select "Dose Frequency" field as "TID"
And I select "End Date" field as CurrentDate
And I select "Ambulatory Pump" checkbox
And I select "High Risk Medication" checkbox
And I select "Date Ordered" field as CurrentDate
And I edit "Special Instructions" field
And I click on "Save Medication" button for Save record
Then "Current Medications" section should display
And I verify Saved Record in "Current Medications" section
##
When I click on "Discontinue2" button of latest Medication Record
Then Current Medication Record deleted and it display in Delete History