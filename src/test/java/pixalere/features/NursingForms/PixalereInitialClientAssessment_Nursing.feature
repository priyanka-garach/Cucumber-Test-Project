Feature: Pixalere Initial Client Assessment-Nursing

@test11
Scenario: Pixalere Initial Client Assessment-Nursing Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "TEST-Kirby , Jose" from Dashboard
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Patient Profile -> Initial Client Assessment" LH panel option
Then "Initial Client Assessment" page will open
##
When I select "2" from Primary Diagnosis dropdown OT 
And I enter "OtherICAone" input field OT
And I enter "OtherICA2" input field OT
And I select "3" from Co-morbidities dropdown OT
And I select "Yes" radio option for any chronic diseases OT
#change value here
And I select "Yes" radio option for home self-monitoring OT
And I select "3" from Home Self-Monitoring dropdown OT
And I enter "Symptom Management Initial Clilent" input field OT
And I enter "OtherICA3" input field OT
And I verified Cardiovascular History data
And I verified Respiratory History data
And I verified Respiratory Assessment data
And I enter "Cardiovascular History Comments" input field OT
And I enter "Respiratory History Comments" input field OT
And I enter "Respiratory Assessment Comments" input field OT
And I enter "Eyes Ears Nose Throat History Comments" input field OT
And I verified Eyes Ears Nose Throat History data
And I select "Yes" radio option for eyes ears nose Problem identified one OT
And I select "Yes" radio option for eyes ears nose Problem identified two OT
And I select "No" radio option for eyes ears nose Problem identified three OT
And I select "Yes" radio option for eyes ears nose Hearing Device OT
And I verified Neurological History 
And I verified Neurological Assessment
And I verified Endocrine Assessment 
And I verified Gastrointestinal History
And I verified Gastrointestinal Assessment
And I select "Yes" radio option for Gastrointestinal Assessment Not Assessed Bowel Movement Regular OT
And I select "No" radio option for Gastrointestinal Assessment Change in Bowel Pattern OT
And I verified Genitourinary History
And I verified Genitourinary Assessment
And I verified Depression Screening Tool
And I select "Yes" radio option for Depression Screening Tool one OT
And I select "No" radio option for Depression Screening Tool Two OT
And I select score "1" radio option for "Little interest or pleasure in doing things" OT 
And I select score "1" radio option for "Feeling down, depressed, or hopeless" OT 
And I select score "1" radio option for "Trouble falling asleep, or staying asleep, or sleeping too much" OT
And I select score "1" radio option for "Feeling tired or having little energy" OT
And I select score "1" radio option for "Poor appetite or overeating" OT
And I select score "1" radio option for "Feeling bad about yourself – or that you are a failure, or have let yourself or your family down" OT
And I select score "1" radio option for "Trouble concentrating on things, such as reading the newspaper or watching television" OT
And I select score "1" radio option for "Moving or speaking so slowly that other people could have noticed? Or the opposite – being so fidgety or restless that you have been moving around more than usual" OT
And I select score "1" radio option for "Thoughts that you would be better off dead or of hurting yourself in some way" OT
And I select "No" radio option for pain OT
#
And I verified Musculoskeletal Assessment
And I verified Pain
And I verified Cognition
And I verified nursing intervention
#And I verified Psychosocial Assessment
And I verified AlternativeComplimentary Therapies
And I enter "Client Perspective1" input field OT
And I enter "Client Perspective2" input field OT
And I enter "Client Perspective3" input field OT
And I enter "Client Perspective4" input field OT
And I enter "Client Perspective5" input field OT
#
And I click on Save My MAHC Fall Risk Assessment Button
#Then Initial Client Assessment details should get verified
And I Navigate to "Viewer -> ICAT Flowchart" LH panel option
Then "ICAT Flowsheet" page will open
When I start verifying records in ICAT Flowchart Page
Then I Logout from Pixalere