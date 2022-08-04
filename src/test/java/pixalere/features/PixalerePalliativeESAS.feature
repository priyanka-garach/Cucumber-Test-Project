Feature: Pixalere Palliative ESAS

@test11
Scenario: Edmonton Symptom Assessment Scale (ESAS)
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin" User
When I set CIN for Existing User
And I search created patient
And I Navigate to "Palliative -> ESAS" LH panel option
Then "Edmonton Symptom Assessment Scale" page should open
##
When I select "Nurse" type for "Administered By:" field
When I select "1" radio value for "Pain" ESAS
And I select "2" radio value for "Tiredness" ESAS
And I select "3" radio value for "Nausea" ESAS
And I select "4" radio value for "Depression" ESAS
And I select "5" radio value for "Anxiety" ESAS
And I select "6" radio value for "Drowsiness" ESAS
And I select "7" radio value for "Lack of Appetite" ESAS
And I select "8" radio value for "Feeling of Well being" ESAS
And I select "9" radio value for "Shortness Breath" ESAS
And I select "10" radio value for "Other TEST" ESAS
And I add input as "TEST" in Other field
##
When I click on "Add My Electronic Signature and Save My Work" div Button
Then "Confirm" popup should open
When I click on "Confirm" Button
##
####### Viewer #######
And I Navigate to "Viewer -> ESAS Flowsheet" LH panel option
Then "ESAS Flowsheet" page should open
And I verify latest "ESAS Flowsheet" details on Viewer page