Feature: Pixalere Intake/Output

@test11
Scenario: Pixalere Intake/Output Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Flow Sheets -> Intake/Output" LH panel option
Then "Intake/Output" page will open
##
When I select "Fluid" checkbox IntakeOutput
And I enter "Fluid" input field IO
And I select "Solid" checkbox IntakeOutput
And I enter "Solid" input field IO
And I select "H2O" checkbox IntakeOutput
And I enter "H2O" input field IO
And I select "Other" checkbox IntakeOutput
And I enter "Other" input field IO
And I select "Water" checkbox IntakeOutput
And I enter "Water" input field IO
And I click "Yes" radio option for Emesis field
And I enter "Emesis" input field IO
And I click "Yes" radio option for Enteral field
And I click "N/G Tube" radio option for Tube Type field
And I click "Yes" radio option for Safety Check field
And I click "Yes" radio option for Tube placement verified field
And I enter "IOFormula" input field IO
And I enter "Water Bolus" input field IO
And I enter "Volume to be Delivered" input field IO
And I enter "Volume Infused" input field IO
And I enter "Flush Volume" input field IO
#And I enter "Total Volume" input field IO
And I enter "Rate" input field IO
And I enter "Formula Name" input field IO
And I click "Yes" radio option for Void field
And I enter "Void Volume" input field IO
And I enter "Number of wet diapers" input field IO
And I click "Yes" radio option for Ostomy field
And I enter "Ostomy" input field IO
And I click "Yes" radio option for Drain field
And I enter "Drain 1" input field IO
And I click "Mitrofanoff" radio option for Drain Type1 field
And I enter "Drain Location1" input field IO
And I enter "Drain 2" input field IO
And I click "Hemovac" radio option for Drain Type2 field
And I enter "Drain Location2" input field IO
And I enter "Drain 3" input field IO
And I click "Paracentesis" radio option for Drain Type3 field
And I enter "Drain Location3" input field IO
And I click "Yes" radio option for Stool field
And I click "Formed" radio option for Stool Consistency field
And I enter "Number of Stools in the Past 24 Hours" input field IO
And I click on Save My Work IntakeOutput Button
#Then Intake/Output details should get verified
And I Navigate to "Viewer -> Intake/Output Flowchart" LH panel option
Then "Intake/Output Flowchart" page will open
When I start verifying records in Intake/Output
Then I Logout from Pixalere
