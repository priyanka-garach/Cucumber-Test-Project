Feature: Pixalere Tracheostomy

@test11
Scenario: Pixalere Tracheostomy Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Pediatric Initial Client Assessment Tool (PICAT)" LH panel option
Then "Pediatric Initial Client Assessment Tool (PICAT)" page will open
##
When I enter "Source of Info" input field OT
And I enter "Custodial Arrangements" input field OT
And I enter "Important Past Medical Surgical History" input field OT
And I verify radio button record "Immunization up-to-date :"
And I enter "Daycare Childcare" input field OT
And I verify radio button record "Admission goals & discharge planning discussed with Family?"
And I enter "Siblings" input field OT
And I enter "Significant Other Relationships Pets" input field OT
And I enter "Respiratory History Comments PICAT" input field OT
And I verify checkbox options for "Respiratory Assessment"
And I enter "Respiratory Assessment Comments PICAT" input field OT
And I verify checkbox options for "Cardiovascular History"
And I select "No" radio option for "Pacemaker Present"
And I select "No Reported Concerns" checkbox for "Cardiovascular History"
And I enter "Cardiovascular History Comments PICAT" input field OT
And I enter "Cardiovascular Assessment Comments PICAT" input field OT
And I enter "Gastrointestinal Assessment Comments PICAT" input field OT
And I enter "Skin History Comments PICAT" input field OT
And I enter "Skin Assessment Comments PICAT" input field OT
And I enter "Genito Urinary Assessment Comments PICAT" input field OT
And I enter "Neurological Assessment Comments PICAT" input field OT
And I enter "Neuromuscular History Comments PICAT" input field OT
And I enter "Neuromuscular Assessment Comments PICAT" input field OT
And I enter "Behavioural & Safety Comments PICAT" input field OT
And I enter "Sleep Rest Comments PICAT" input field OT  
And I enter "School participation PICAT" input field OT 
And I enter "Social interactions PICAT" input field OT 
And I enter "Routine activities exercise PICAT" input field OT 
And I enter "Favourite toys security object hobbies PICAT" input field OT 
#
When I start verifying records in "" Page
Then I Logout from Pixalere