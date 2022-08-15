Feature: Pixalere Fall Risk Assessment

@test11
Scenario: Pixalere Fall Risk Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Acosta , Sandra" from Dashboard
And I select "OT" from Service Referral 
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate-NAMD to "Non-Authorizer Mobility Device Recommendation" LH panel option Non-Authorizer Mobility Device Recommendation
Then "Non-Authorizer Mobility Device Recommendation" page will open
##
When I click on "Analysis: Device Recommended" checkbox Button SM 
And I verify radio button for "Assistive Devices"
And I verify radio button for "Assessment results shared with client"
And I verify radio button for "Mobility device goal"
And I verify radio button for "Student participation in service."
And I save my work for above SM
And I click on "ADP Eligibility Screened" checkbox Button SM
And I verify radio button for "Assistive Devices"
And I verify radio button for "Screen for ADP"
And I click on radio button for "Client appears to meet ADP eligibility"
And I click checkbox for "Device(s) needed for ongoing"
And I click checkbox for "Client unable to access the front door without the recommended device."
And I click checkbox for "The recommended device is the most basic device to meet the"
And I click checkbox for "Client has a valid Ontario Health Card."
And I click checkbox for "Client is a permanent resident of Ontario."
And I click checkbox for "Client is expected to use the recommended device for 6 months or greater."
And I save my work for above SM
And I click on "Previous Funding by ADP Confirmed" checkbox Button SM
And I verify radio button for "Confirmed the status of any prior funding access to ADP"
And I save my work for above SM
And I click on "Mobility Device Specifications Recommended" checkbox Button SM
And I click checkbox for "situation requires device to be put in place by non-authorizer prior to"
And I save my work for above SM
And I click on "Equipment Trial Arranged" checkbox Button SM
And I verify radio button for "Vendor list provided, options discussed and client/SDM freely selected their preferred vendor."
And I verify radio button for "Role/activities for vendor in relation to OT services"
And I save my work for above SM
And I click on "Authorizer Involved in Service" checkbox Button SM
And I enter "Name of authorizer" input field in script
And I saveAsDraft for Authorizer Involved in Service
And I click on "Authorizer Services Concluded" checkbox Button SM
And I click checkbox for "Assessment results/application status reviewed and considered in"
#Then Fall Risk Assessment details should get verified
And I Navigate to "Viewer -> Non-Authorizer Mobility Device Recommendation" LH panel option
Then "Non-Authorizer Mobility Device Recommendation" page will open
When I start verifying records in Non-Authorizer Mobility Device Recommendation Page
Then I Logout from Pixalere