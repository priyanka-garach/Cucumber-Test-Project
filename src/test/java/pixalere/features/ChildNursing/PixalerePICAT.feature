Feature: Pixalere PICAT

@test11
Scenario: Pixalere PICAT Script
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
And I enter "Primary Diagnosis" input field in script
And I enter "Important Past Medical Surgical History" input field in script
And I select "No" radio option for Immunization up-to-date field
And I enter "Allergies and Reactions" input field in script

And I enter "nursing service" input field in script
And I enter "most important" input field in script
And I enter "health teaching" input field in script
And I enter "values and beliefs" input field in script
And I enter "concerns or issues" input field in script
And I enter "Daycare Childcare" input field in script
And I select "Yes" radio option for Admission goals & discharge planning discussed with Family? field

And I enter "Siblings" input field in script
And I enter "Significant Other Relationships Pets" input field in script
And I select "Cough" checkbox for Respiratory History field
And I select "Snoring" checkbox for Respiratory History field
And I select "Smoking" checkbox for Respiratory History field
And I select "Ventillation" checkbox for Respiratory History field
And I select "Ventilator" checkbox for Respiratory History field
And I select "Suctioning" checkbox for Respiratory History field
And I select "Oral Frequency & other details" checkbox for Respiratory History field
And I select "Nasopharyngeal Frequency & other details" checkbox for Respiratory History field
And I select "Inspection" checkbox for Respiratory Assessment field
And I select "Grunting" checkbox for Respiratory Assessment field
And I select "Cyanosis" checkbox for Respiratory Assessment field
And I select "Strider" checkbox for Respiratory Assessment field
And I enter "Respiratory Assessment Comments PICAT" input field in script
And I select "Yes" radio option for Pacemaker Present field
And I select "Fixed" radio option for Type field
And I select "Fatigue" checkbox for Cardiovascular History field
And I select "Murmurs" checkbox for Cardiovascular History field
And I select "Arrhythmias" checkbox for Cardiovascular History field
And I select "Thrombus" checkbox for Cardiovascular History field
And I select "Yes" radio option for Extremities warm to touch? field
And I select "Greater than 2 seconds" radio option for Cap refill field
And I select "No" radio option for Cyanosis Present? field
And I select "No" radio option for Edema noted field
And I select "No" radio option for Presence of Central Intravenous Line? field
And I select "Yes" radio option for Murmurs field
And I enter "Cardiovascular History Comments PICAT" input field in script
And I enter "Cardiovascular Assessment Comments PICAT" input field in script
And I select "Pain Management" checkbox option for Gastrointestinal History field
And I select "Nutrition and Patient Education" checkbox option for Gastrointestinal History field
And I select "Nausea" checkbox option for Gastrointestinal History field
And I select "Vomiting" checkbox option for Gastrointestinal History field
And I select "Yes" radio option for Recent weight changes field
And I enter "Weight_10" input field in script
And I select "Flat" radio option for Inspection field
And I select "Firm" radio option for Palpation field
And I select "Bowel sounds present" radio option for Auscultation field
And I enter "Gastrointestinal Assessment Comments PICAT" input field in script
And I select "Toilet trained" checkbox for Bowel Habits field
And I select "Constipation" checkbox for Bowel Habits field
And I select "Diarrhea" checkbox for Bowel Habits field
And I select "No" radio option for Enteral Tubes Present field
And I select "No" radio option for Stoma Present field
And I select "Dry" checkbox for Skin conditions field
And I select "Cool" checkbox for Skin conditions field
And I select "Pale" checkbox for Skin conditions field
And I select "Flushed" checkbox for Skin conditions field
And I select "Turgor Brisk" checkbox for Skin conditions field
And I select "Jaundice" radio option for Skin color field
And I select "Cool" radio option for Skin temperature field
And I select "Dry" radio option for Skin moisture field
And I select "Brisk,<3 seconds" radio option for Skin turgor field
And I select "Pink" checkbox for Oral muscous membranes field
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

And I select "Yes" radio option for Voiding without difficulty field
And I select "Yes" checkbox for Toilet trained field  
And I select "No" radio option for Genital urinary malformations field
And I select "No" radio option for Neurogenic Bladder field
And I select "No" radio option for Stoma present field

And I select "Yes" radio option for Catherization required field

And I select "Clean Intermittent Catheterization" checkbox for Catherization Type field
And I select "Indwelling" checkbox for Catherization Type field
And I enter "Catheter Size" input field in script
And I enter "Care Instructions" input field in script

#And I select "Yes" radio option for Discharge present field

And I select "No" radio option for Foul odor in urine present field
And I select "Intact" radio option for Skin integrity of perineal area field
And I select "No" radio option for Sexual Development Reported Concerns field
And I enter "Genito Urinary Assessment Comments PICAT" input field in script

And I select "Fine Motor Deficit" checkbox for Neurological History field
And I select "Dizziness" checkbox for Neurological History field
And I select "Headache" checkbox for Neurological History field
And I select "Head Injury" checkbox for Neurological History field
And I select "VP Shunt" checkbox for Neurological History field
And I select "No" radio option for Seizures field
And I select "Yes" radio option for PupilsEqualRoundReactive to Light Accomodation field
And I select "Typical" radio option for Gait field
And I select "Yes" radio option for Oriented field
And I select "Typical" radio option for Response to painful stimuli field
And I select "Yes" radio option for Cooperativefriendly field
And I select "No" radio option for Crying field
And I enter "Mental Health Concerns" input field in script
And I enter "Neurological Assessment Comments PICAT" input field in script

And I select "Partial ROM" checkbox for Neuromuscular History field
And I select "Hypotonia present" checkbox for Neuromuscular History field
And I select "Wheelchair" checkbox for Neuromuscular History field
And I select "Walker" checkbox for Neuromuscular History field
And I select "Crutches" checkbox for Neuromuscular History field
And I select "Splints/Braces" checkbox for Neuromuscular History field
And I select "Passive ROM observed" checkbox for Neuromuscular Assessment field
And I select "Contractures present" checkbox for Neuromuscular Assessment field
And I select "Weakness present" checkbox for Neuromuscular Assessment field
And I select "Muscle wasting" checkbox for Neuromuscular Assessment field
And I select "Typical" radio option for Muscle tone field
And I select "Typical" radio option for Muscle strength field
And I enter "Neuromuscular History Comments PICAT" input field in script
And I enter "Neuromuscular Assessment Comments PICAT" input field in script

And I select "Changes in vision/limitations in vision" checkbox for face field
And I select "Use of visual aids and devices" checkbox for face field
And I select "Glasses" checkbox for face field
And I select "Contact lenses" checkbox for face field
And I select "History of earaches" checkbox for face field
And I select "Tinnitus" checkbox for face field
And I select "Myringotomy tubes" checkbox for face field
And I select "Sinus pain" checkbox for face field
And I select "History of epitaxis" checkbox for face field
And I select "Excessive drooling" checkbox for face field
And I select "Oral aversion" checkbox for face field
And I select "No" radio option for Cranial_facial malformations field
And I select "Yes" radio option for Fontanelle Palpable field
And I select "Bulging" radio option for indicate field
And I enter "165" in Head Circumference feild
And I select "No" radio option for Lumps andor swelling noted to head field
And I select "Redness,swelling noted to eyes" checkbox for Eyes field
And I select "Left" checkbox for Redness swelling noted to eyes field
And I select "Watery eyes" checkbox for Eyes field
And I select "Left Watery eyes" checkbox for Eyes field
And I select "Discharge" checkbox for Nose field
And I select "Right" checkbox for Nose field
And I select "Gum hypertrophy" checkbox for Mouth & Throat field
And I select "Atypical dentition" checkbox for Mouth & Throat field
And I enter "Last dental appointment" input field in script
And I enter "Oral hygiene practices" input field in script
And I enter "Head Eyes Ears Nose Mouth & Throat history" input field in script

And I enter "Child Behaviour" input field in script
And I enter "Distractibility Attention span" input field in script
And I select "Yes" radio option for Is the child agitated andor aggressive field
And I select "No" radio option for Does the child wander field
And I select "No" radio option for Are restraints used & required field
And I enter "Behavioural & Safety Comments PICAT" input field in script

And I select "No" radio option for Does the client have pain field

And I select "Yes" radio option for Oral intake field
And I select "Pureed" checkbox for Diet field
And I select "Finger Food" checkbox for Diet field
And I select "Breast milk" checkbox for Diet field
And I select "Formula" checkbox for Diet field
And I enter "Nutrition Likes" input field in script
And I enter "Nutrition Dislikes" input field in script
And I enter "Nutrition Sensitivies" input field in script
And I enter "Client Care Summary" input field in script
And I select "Assist" checkbox for Feeding field
And I select "Table" checkbox for Feeding field
And I select "Bottle" checkbox for Feeding field
And I select "Uses finger" checkbox for Feeding field
And I enter "Eating habits" input field in script
And I select "Difficulty chewing" checkbox for Eating habits field
And I select "Requires cueing" checkbox for Eating habits field

And I select "No" radio option for Does the client take naps field
And I enter "Bedtime routine" input field in script
And I select "Yes" radio option for Does the child sleep alone field
And I enter "medical devices" input field in script
And I enter "Sleep Rest Comments PICAT" input field in script  

And I enter "School participation PICAT" input field in script 
And I enter "Social interactions PICAT" input field in script 
And I enter "Routine activities exercise PICAT" input field in script 
And I enter "Favourite toys security object hobbies PICAT" input field in script 
#And I click on "Add My Electronic Signature and Save My Work" Button
#And I click on "Confirm" Button
#
And I Navigate to "Viewer -> ICAT Pediatric Flowchart" LH panel option
Then "ICAT Pediatric Flowchart" page will open

Then I start verifying records in PICAT Pediatric Flowchart Page

Then I Logout from Pixalere