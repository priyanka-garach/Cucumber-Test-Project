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
When I enter "Source of Info" input field in script
And I enter "Custodial Arrangements" input field in script
And I enter "Important Past Medical Surgical History" input field in script
And I select "No" radio option for Immunization up-to-date field
And I enter "Allergies and Reactions" input field in script
And I enter "Daycare Childcare" input field in script
And I select "No" radio option for Admission goals & discharge planning discussed with Family? field
And I enter "Siblings" input field in script
And I enter "Significant Other Relationships Pets" input field in script
And I select "Cough" checkbox for Respiratory History field
And I select "Inspection" checkbox for Respiratory Assessment field
And I select "Strider" checkbox for Respiratory Assessment field
And I enter "Respiratory Assessment Comments PICAT" input field in script
And I select "Yes" radio option for Pacemaker Present field
And I select "Fixed" radio option for Type field
And I select "Fatigue" checkbox for Cardiovascular History field
And I select "Yes" radio option for Extremities warm to touch? field
And I select "Greater than 2 seconds" radio option for Cap refill field
And I select "No" radio option for Cyanosis Present? field
And I select "No" radio option for Edema noted field
And I select "No" radio option for Presence of Central Intravenous Line? field
And I select "Yes" radio option for Murmurs field
And I enter "Cardiovascular History Comments PICAT" input field in script
And I enter "Cardiovascular Assessment Comments PICAT" input field in script
And I select "Nutrition and Patient Education" checkbox option for Gastrointestinal History field
And I select "yes" radio option for Recent weight changes field
And I enter "10lbs" in Weight gain feild
And I select "Flat" radio option for Inspection field
And I select "Firm" radio option for Palpation field
And I select "Bowel sounds present" radio option for Auscultation field
And I enter "Gastrointestinal Assessment Comments PICAT" input field in script
And I select "Toilet trained" checkbox for Bowel Habits field
And I select "No" radio option for Enteral Tubes Present? field
And I select "No" radio option for Stoma Present? field
And I select "Dry" checkbox for Skin conditions field
And I select "Jaundice" radio option for Skin color field
And I select "Cool" radio option for Skin temperature field
And I select "Dry" radio option for Skin moisture field
And I select "Dry" checkbox for Oral muscous membranes field
And I select "No" radio option for Diaper dermatitis field
And I select "No" radio option for Erythema field
And I select "No" radio option for Lesions field
And I select "No" radio option for Bruises field
And I select "No" radio option for Lacerations field
And I select "No" radio option for Petechiae field
And I select "No" radio option for Scars field
And I select "No" radio option for Burns field
And I select "No" radio option for Pressure injuries field
And I enter "Skin History Comments PICAT" input field in script
And I enter "Skin Assessment Comments PICAT" input field in script
And I select "No" radio option for Genital urinary malformations field
And I select "No" radio option for Discharge present field
And I select "No" radio option for Foul odor in urine present field
And I select "Intact" radio option for Skin integrity of perineal area field
And I select "No" radio option for Sexual Development Reported Concerns field
And I enter "Genito Urinary Assessment Comments PICAT" input field in script
And I select "Fine Motor Deficit" checkbox for Neurological History field
And I select "No" radio option for Pupils, Equal, Round, & Reactive to Light & Accomodation (PERRLA) field
And I select "Typical" radio option for Gait field
And I select "Yes" radio option for Oriented field
And I select "Typical" radio option for Response to painful stimuli field
And I select "Yes" radio option for Cooperative/friendly field
And I select "Yes" radio option for Crying field
And I enter "Neurological Assessment Comments PICAT" input field in script
And I select "Partial ROM" checkbox for Neuromuscular History field
And I select "Contractures present" checkbox for Neuromuscular Assessment field
And I select "Typical" radio option for Muscle tone field
And I select "Typical" radio option for Muscle strength field
And I enter "Neuromuscular History Comments PICAT" input field in script
And I enter "Neuromuscular Assessment Comments PICAT" input field in script
And I select "No" radio option for Cranial/facial malformations field
And I select "No" radio option for Fontanelle - Palpable field
And I enter "165" in Head Circumference feild
And I select "No" radio option for Lumps and/or swelling noted to head field
And I select "Watery eyes" checkbox for Eyes field
And I select "Discharge" checkbox for Nose field
And I select "Gum hypertrophy" checkbox for Mouth & Throat field
And I select "Yes" radio option for Is the child agitated and/or aggressive field
And I select "No" radio option for Does the child wander field
And I select "No" radio option for Are restraints used & required field
And I enter "Behavioural & Safety Comments PICAT" input field in script
And I select "No" radio option for Does the client have pain field
And I select "Yes" radio option for Oral intake field
And I select "Breast milk" checkbox for Diet field
And I select "Bottle" checkbox for Feeding field
And I select "Requires cueing" checkbox for Eating habits field
And I select "No" radio option for Does the client take naps field
And I select "Yes" radio option for Does the child sleep alone field
And I enter "Sleep Rest Comments PICAT" input field in script  
And I enter "School participation PICAT" input field in script 
And I enter "Social interactions PICAT" input field in script 
And I enter "Routine activities exercise PICAT" input field in script 
And I enter "Favourite toys security object hobbies PICAT" input field in script 
And I click on "Add My Electronic Signature and Save My Work" Button
And I click on "Confirm" Button
#
And I Navigate to "Viewer -> ICAT Pediatric Flowchart" LH panel option
Then "ICAT Pediatric Flowchart" page will open
Then I start verifying records Home Peritoneal Flowchart
#When I start verifying records in "" Page
Then I Logout from Pixalere