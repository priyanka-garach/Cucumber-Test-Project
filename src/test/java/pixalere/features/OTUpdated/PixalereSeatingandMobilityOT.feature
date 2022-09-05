Feature: Pixalere Seating and MobilityOT

@test11
Scenario: Pixalere Seating and MobilityOT Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID OT
And I select "OT" from Service Referral 
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate-NAMD to "Non-Authorizer Mobility Device Recommendation" LH panel option Non-Authorizer Mobility Device Recommendation
Then "Non-Authorizer Mobility Device Recommendation" page will open

##
When I click on "Analysis: Device Recommended" checkbox Button SM 
And I click checkbox for "Walker"
And I click checkbox for "Manual wheelchair"
And I click checkbox for "Seating only"
And I click checkbox for "Power scooter"
And I click checkbox for "Client is not able to propel manual wheelchair a functional distance."
And I click checkbox for "Client has adequate cognitive, self-regulatory, visual and perceptual skills to recommend power mobility."
And I click on "Assessment results shared with client" Radio Button
And I click on "Mobility device goal" Radio Button
And I click on "Student participation in service" Radio Button
And I enter "Analysis Comments" input field in script
And I save my work for above Analysis Device Recommended
And I click on "ADP Eligibility Screened" checkbox Button SM
And I click on "Assistive Devices Program" Radio Button
And I click on "Screen for ADP" Radio Button
And I click on "Client appears to meet ADP eligibility" Radio Button
And I click checkbox for "Device(s) needed for ongoing"
And I click checkbox for "Client unable to access the front door without the recommended device."
And I click checkbox for "The recommended device is the most basic device to meet the"
And I click checkbox for "Client has a valid Ontario Health Card."
And I click checkbox for "Client is a permanent resident of Ontario."
And I click checkbox for "Client is expected to use the recommended device for 6 months or greater."
And I save my work for above ADP Eligibility Screened
And I click on "Previous Funding by ADP Confirmed" checkbox Button SM
And I click on "Confirmed the status" Radio Button
And I click on "None" Radio Button
And I click checkbox for "Client circumstances supports"
And I click checkbox for "Change of status"
And I click checkbox for "Change of size"
And I click checkbox for "Equipment worn beyond repair"
And I click checkbox for "Special circumstances"
And I enter "Previous Funding Comments" input field in script
And I save my work for above Previous Funding by ADP Confirmed
And I click on "Mobility Device Specifications Recommended" checkbox Button SM
And I click checkbox for "situation requires device to be put in place by non-authorizer prior to"
And I click on "Skin Integrity" Radio Button
And I click checkbox for "Pressure surface"
And I click checkbox for "Kyphosis"
And I click checkbox for "Scoliosis"
And I click checkbox for "Lordosis"
And I click checkbox for "Rotation" at "1"
And I click checkbox for "Rotation" at "2"
And I click checkbox for "Anterior tilt"
And I click checkbox for "Posterior tilt"
And I click checkbox for "Obliquity"
And I click checkbox for "Abduction"
And I click checkbox for "Adduction"
And I click checkbox for "External rotation"
And I click checkbox for "Internal rotation"
And I click checkbox for "Contractures"
And I click checkbox for "↑ Tone"
And I click checkbox for "↓ Tone"
And I click checkbox for "Windswept knees"
And I enter "client Weight" input field in script
And I click checkbox for "Stable"
And I enter "Hip width" input field in script
And I enter "Popliteal fossa-heal" input field in script
And I enter "Buttocks-popliteal fossa" input field in script
And I enter "Other" input field in script
And I enter "Any additional comments" input field in script
And I click on "Walker type" Radio Button
And I enter "Rationale" input field in script
And I enter "Handle height" input field in script
And I click checkbox for "4 point"
And I click checkbox for "Bariatric"
And I click checkbox for "Forearm support(s)"
And I click checkbox for "Left"
And I click checkbox for "Right"
And I save my work for above Mobility Device Specifications Recommended
And I click on "Equipment Trial Arranged" checkbox Button SM
And I click on "Vendor list provided, options discussed and client/SDM freely selected their preferred vendor" Radio Button
And I click on "Role/activities for vendor in relation to OT services" Radio Button
And I save my work for above Equipment Trial Arranged
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