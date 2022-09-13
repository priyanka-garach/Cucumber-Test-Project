Feature: Pixalere PT Seating Mobility

@test11
Scenario: Pixalere PT Seating Mobility Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID special for PTConsent Form
And I select PT from Service Referral PT for read from excel
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Comprehensive Mobility Device Assessment" LH panel option
Then "Comprehensive Mobility Device Assessment" page will open
##
When I tick checkbox for Assessment Initiated
And I verify all records under Assessment Initiated
And I tick checkbox for Stated Mobility Concerns Discussed
And I enter "Stated Mobility Concerns Discussed" input field in script
And I tick checkbox for Assessment Data Obtained
And I select radio "House" for Home Access
And I enter "Home Access Environment comment" input field in script
And I select radio "Basic and essential use of home is functional" for Home Access radio
And I select "Ramp" for Equipment in place
And I enter "Equipment in place comments" input field in script
And I enter "Physical Health Components Diagnons comment" input field in script
And I select radio "sufficient for function" for Physical Health Components
And I enter "Physical Health Component additional comment" input field in script
And I select radio "Difficulties/risks identified" for Physical Cognition
And I select "Known diagnosis of dementia/mild cognitive impairment" checkbox for Cognition 
And I select "Perception" checkbox for Cognition 
And I enter "Cognition comment" input field in script
And I select radio "Difficulties/risks identified" for Mental Behavioural Health
And I select "Potential driving safety risk" checkbox for Cognition 
And I select "Impulsive or potentially unsafe behaviours regarding mobility" checkbox for Cognition 
And I enter "Mental Behavioural Health comment" input field in script
And I select "Accessible transit/vehicle used" checkbox for Community Transportation
And I enter "Community Transportation comment" input field in script
And I select "ODSP/OW" checkbox for Supplementary Funding Availability
And I select "VAC" checkbox for Supplementary Funding Availability
And I select "Insurance" checkbox for Supplementary Funding Availability
And I select "WSIB" checkbox for Supplementary Funding Availability
And I enter "ODSP/OW Number" input field in script
And I enter "VAC Number" input field in script
And I enter "WSIB Number" input field in script
And I enter "Supplementary Funding Availability comment" input field in script
And I select radio "No" for any falls in the past three months
And I select radio "No" Activities avoided for fear of falling
And I enter "Falls comment" input field in script
And I select radio "WFL - functional ambulation without aid" for Ambulation
And I enter "Limitations of current mobility devices" input field in script
And I select checkbox "Declined/unable to demonstrate" for During assessment, observed client
And I enter "Declined/unable to demonstrate comment" input field in script
And I enter "Ambulation comment PT" input field in script
#
And I tick checkbox for Analysis and Recommendation Provided
And I select checkbox "Power scooter" Analysis and Recommendation Provided
And I select checkbox "Client is not able to propel manual" Analysis and Recommendation Provided
And I select checkbox "Client has adequate cognitive, self-regulatory, visual" Analysis and Recommendation Provided
And I select radio "Yes" for Model type sizing and specifications are expected to maximize
And I enter "Analysis and Recommendation Provided comment" input field in script
And I select radio "3 wheel" for Power Scooter Recommendation
And I enter "Trial model recommended comment" input field in script
And I select radio "Yes" for Assessment results shared with client/SDM.
And I select radio "Yes" Mobility device goal/care plan established in collaboration with client/SDM
And I select radio "Yes" Any difficulties/issues identified in assessment are addressed
#
And I tick checkbox for Informed Consent for Mobility Service Obtained
And I verify data for Proposed Health Services Discussed
And I enter "Proposed Health Services Discussed comment" input field in script
And I verify data for Consent obtained from 
#
And I tick checkbox for ADP Eligibility Screened Obtained
And I verify data for ADP Eligibility Screened
And I select radio "Client appears to meet ADP eligibility"
And I verify data for Client appears to meet ADP eligibility
And I enter "ADP Eligibility Screened comment" input field in script
#
And I tick checkbox for Previous Funding by ADP Confirmed
And I select radio "Yes" for Confirmed the status of any prior funding access to ADP
And I select radio "None" under Confirmed the status
And I select checkbox "Client circumstances supports reapplication or replacement" for Previous Funding by ADP Confirmed
And I select "Change of status" for rationale
And I select "Change of size" for rationale
And I select "Equipment worn beyond repair" for rationale
And I select "Special circumstances" for rationale
And I enter "Previous Funding Comments PT" input field in script
#
And I tick checkbox for Client Portion Discussed
And I select radio "Yes" for Client their representative is aware of the client portion to be paid
And I select checkbox "ODSP" for Funding for client portion
And I select checkbox "ACSD" for Funding for client portion
And I enter "Client Portion Discussed comment" input field in script
And I click on Save As Draft
#
And I tick checkbox for Equipment Trial Arranged
And I verify radio options discussed and clientSDM and Role activities for vendor in relation
And I enter "Reason for client vendor selection comment" input field in script
And I enter "Vendor comment" input field in script
And I enter "Representative name comment" input field in script
And I enter "Phone number comment" input field in script
And I enter "Equipment Trial Arranged comment" input field in script
And I click on Save As Draft
#
And I tick checkbox for Client Assessed with Mobility Device
And I select radio "Client to trial as delivered until further assessment" for Assessed client with use of mobility device
And I verify data for Mobility device inspected and appears to be in working order and Delivered as per specs ordered
And I enter "Delivered equipment specifications comment" input field in script
And I click on Save As Draft
#
And I tick checkbox for Education and Training on Device Use Provided
And I enter "Education and Training on Device Use Provided comment one" input field in script
And I enter "Education and Training on Device Use Provided comment two" input field in script
And I click on Save As Draft
#
And I tick checkbox for ADP Application for Funding Completed
And I verify data for ADP Application for Funding Completed
And I click on Save As Draft
#
And I tick checkbox for ADP Application Submitted
And I select checkbox "ADP" for ADP application submitted to
And I select radio "Courier" for ADP application delivered via
And I select radio for "Yes shared, keep client on my roster" ADP authorizer assessmentApplication results shared 
And I select radio for "Yes" Goal of comprehensive mobility assessment met
And I enter "ADP Application Submitted comment" input field in script
#
#And I click on Save My Work Functional Independence Measure Button
#Then Functional Independence Measure should get verified
#
Then I Logout from Pixalere