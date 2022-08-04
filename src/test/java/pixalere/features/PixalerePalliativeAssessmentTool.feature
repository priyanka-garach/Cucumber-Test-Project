Feature: Pixalere Palliative Assessment Tool

@test11
Scenario: Palliative Assessment Tool
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Palliative -> Palliative Assessment Tool" LH panel option
Then "Palliative Assessment Tool" page should open
##
When I edit numeric number in "PPS Stage" input field
When I select "Primary Diagnosis,Secondary Diagnosis" options from "Disease Management" Palliative section
And I edit comment for "Disease Management Comments" section
And I select "Cognition,Fluids" options from "Physical" Palliative section
And I edit comment for "Physical Comments" section
And I select "Dignity,Anxiety" options from "Psychological" Palliative section
And I edit comment for "Psychological Comments" section
And I select "Financial,Abandonment" options from "Social" Palliative section
And I edit comment for "Social Comments" section
And I select "Symbols,Transcendental" options from "Spiritual" Palliative section
And I edit comment for "Spiritual Comments" section
And I select "Pets,Activities of daily living" options from "Practical" Palliative section
And I edit comment for "Practical Comments" section
And I select "Gift giving,Legacy creation" options from "End of Life Care / Death Management" Palliative section
And I edit comment for "End of Life Comments" section
And I select "Chronic,Anticipatory" options from "Loss and Grief" Palliative section
And I edit comment for "Loss and Grief Comments" section
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
##
####### Viewer #######
And I Navigate to "Viewer -> Palliative Assessment Flowchart" LH panel option
Then "Palliative Assessment Flowchart" page should open
And I verify latest "Palliative Assessment" details on Viewer page