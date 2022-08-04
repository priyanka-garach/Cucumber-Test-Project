Feature: Pixalere Medication Management BPMH

@test11
Scenario: Best Possible Medication History
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Medication Management -> BPMH" LH panel option
Then "Best Possible Medication History" page should open
##
When I select "Admission" radio option from BPMH
And I click on "Add Medication" Button
Then "Add Medication Record" popup should open
##
When I edit "Medication Name" field for BPMH
And I edit "Dose" field as "Weekly" for BPMH
And I select "Route" field as "SC" for BPMH
And I select "Frequency" field as "TID" for BPMH
##
When I select "Source" as "Referral, Medication Calendar, Prescription Label, Pharmacy Label, Client Self-Report" checkboxes
When I select "Discrepancy" as "Client no longer taking medication, OTC not taken as prescribed, Allergy to prescribe medication, Duplication of medications, Drug Interaction" checkboxes
And I select "OTC Meds" radio option from "Medication Type" field for BPMH
And I check "Medication Discontinued" for BPMH
And I check "New Order(s) since Admission" for BPMH
And I click on "Save Medication" Button on popup
Then Data should saved and display in Medication History Table
##
When I click on "Edit" for update Record
Then "Edit Medication Record" popup should open
##
When I edit "Medication Name" field for BPMH
And I edit "Dose" field as "Monthly" for BPMH
And I select "Route" field as "Each Eye" for BPMH
And I click on "Save Medication" Button on popup
Then Data should saved and display in Medication History Table
##
When I check "Copy Faxed to Physician/Nurse Practitioner/Pharmacy" Actions checkbox And select CurrentDate
And I select "Yes" radio option for "Does this Client have at least one discrepancy that requires clarification?:" value
And I click on "Add My Electronic Signature and Save My Work" input value Button
Then I verify "Last Updated" Date on BPMH page
