Feature: Pixalere Advanced Lower Limb Assessment

@test11
Scenario: Pixalere Advanced Lower Limb Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Assessment -> Advanced Lower Limb Assessment" LH panel option
Then "Advanced Lower Limb Assessment" page will open
##
When I select "Triphasic" checkbox for Right Dorsalis Pedis field
And I select "Monophasic" checkbox for Right Dorsalis Pedis field
And I select "Diminished" checkbox for Right Dorsalis Pedis field
And I select "Biphasic" checkbox for Right Dorsalis Pedis field
And I select "Present" checkbox for Right Dorsalis Pedis field
And I select "Non-palpable" checkbox for Right Dorsalis Pedis field
#
And I select "Triphasic" checkbox for Left Dorsalis Pedis field
And I select "Monophasic" checkbox for Left Dorsalis Pedis field
And I select "Diminished" checkbox for Left Dorsalis Pedis field
And I select "Biphasic" checkbox for Left Dorsalis Pedis field
And I select "Present" checkbox for Left Dorsalis Pedis field
And I select "Non-palpable" checkbox for Left Dorsalis Pedis field
#
And I select "Triphasic " checkbox for Right Posterior Tibial field
And I select "Monophasic" checkbox for Right Posterior Tibial field
And I select "Diminished" checkbox for Right Posterior Tibial field
And I select "Biphasic" checkbox for Right Posterior Tibial field
And I select "Present" checkbox for Right Posterior Tibial field
And I select "Non-palpable" checkbox for Right Posterior Tibial field
#
And I select "Triphasic" checkbox for Left Posterior Tibialfield
And I select "Monophasic" checkbox for Left Posterior Tibialfield
And I select "Diminished" checkbox for Left Posterior Tibialfield
And I select "Biphasic" checkbox for Left Posterior Tibialfield
And I select "Present" checkbox for Left Posterior Tibialfield
And I select "Non-palpable" checkbox for Left Posterior Tibialfield
#
And I click "Done by WCC/designate" radio option for Ankle Brachial Index field
#
And I select "5" for day in Date_AB dropdown
And I select "Jun" for month in Date_AB dropdown
And I enter "Year Date ALLA" input field in script
#
And I click "Done by WCCdesignate" radio option for Ankle Brachial Index field
#
And I select "5" for day in Date dropdown
And I select "Jun" for month in Date dropdown
And I enter "Year Date TBI" input field in script
And I enter "Dorsalis Pedis mmHg Right" input field in script
And I enter "Dorsalis Pedis mmHg Left" input field in script
And I enter "Posterior Tibial mmHg Right" input field in script
And I enter "Posterior Tibial mmHg Left" input field in script
And I enter "Ankle Brachial Pressure mmHg Right" input field in script
And I enter "Ankle Brachial Pressure mmHg Left" input field in script
#
And I click "Yes" radio option for Referral For Vascular Assessment Initiated ABI Score field
#
And I click "Done by WCC/designate" radio option for Toe Brachial Index field
And I enter "Toe Pressure mmHg Right" input field in script
And I enter "Toe Pressure mmHg Left" input field in script
And I enter "Brachial Pressure mmHg Right" input field in script
And I enter "Brachial Pressure mmHg Left" input field in script
#
And I select "Lateral" checkbox for Right Monofilament Testing field ALB
And I select "3rd digit" checkbox for Right Monofilament Testing field ALB
And I select "1st MTH" checkbox for Right Monofilament Testing field ALB
And I select "5th MTH" checkbox for Right Monofilament Testing field ALB
And I select "Heel" checkbox for Right Monofilament Testing field ALB
And I select "1st digit" checkbox for Right Monofilament Testing field ALB
And I select "5th digit" checkbox for Right Monofilament Testing field ALB
And I select "3rd MTH" checkbox for Right Monofilament Testing field ALB
And I select "Medial" checkbox for Right Monofilament Testing field ALB
And I select "Dorsum" checkbox for Right Monofilament Testing field ALB
#
And I select "Lateral" checkbox for Left Monofilament Testing field ALB
And I select "3rd digit" checkbox for Left Monofilament Testing field ALB
And I select "1st MTH" checkbox for Left Monofilament Testing field ALB
And I select "5th MTH" checkbox for Left Monofilament Testing field ALB
And I select "Heel" checkbox for Left Monofilament Testing field ALB
And I select "1st digit" checkbox for Left Monofilament Testing field ALB
And I select "5th digit" checkbox for Left Monofilament Testing field ALB
And I select "3rd MTH" checkbox for Left Monofilament Testing field ALB
And I select "Medial" checkbox for Left Monofilament Testing field ALB
And I select "Dorsum" checkbox for Left Monofilament Testing field ALB
###
And I enter "Score Right" input field in script
And I enter "Score Left" input field in script
####

And I click "Yes" radio option for Right Stemmer's Sign field
And I click "Yes" radio option for Left Stemmer's Sign field
#
And I select "Champagne-bottle shaped" checkbox for Right Limb Shape field ALB
And I select "Wasted calf muscle" checkbox for Right Limb Shape field ALB
And I select "None of the above" checkbox for Right Limb Shape field ALB
And I select "Champagne-bottle shaped" checkbox for Left Limb Shape field ALB
And I select "Wasted calf muscle" checkbox for Left Limb Shape field ALB
And I select "None of the above" checkbox for Left Limb Shape field ALB
#
And I select "Bunion" checkbox for Right Concerns Foot field
And I select "Plantar wart" checkbox for Right Concerns Foot field
And I select "Hammertoe" checkbox for Right Concerns Foot field
And I select "Cracks between toes" checkbox for Right Concerns Foot field
And I select "Acute Charcot" checkbox for Right Concerns Foot field
And I select "Callus" checkbox for Right Concerns Foot field
And I select "Corn" checkbox for Right Concerns Foot field
And I select "Dropped MTH" checkbox for Right Concerns Foot field
And I select "Crossed toes" checkbox for Right Concerns Foot field
And I select "Chronic Charcot" checkbox for Right Concerns Foot field

And I select "Bunion" checkbox for Left Concerns Foot field
And I select "Plantar wart" checkbox for Left Concerns Foot field
And I select "Hammertoe" checkbox for Left Concerns Foot field
And I select "Cracks between toes" checkbox for Left Concerns Foot field
And I select "Acute Charcot" checkbox for Left Concerns Foot field
And I select "Callus" checkbox for Left Concerns Foot field
And I select "Corn" checkbox for Left Concerns Foot field
And I select "Dropped MTH" checkbox for Left Concerns Foot field
And I select "Crossed toes" checkbox for Left Concerns Foot field
And I select "Chronic Charcot" checkbox for Left Concerns Foot field

And I select "Incorrect length short" checkbox for Right Toe Nails field
And I select "Discoloured" checkbox for Right Toe Nails field
And I select "Fungal infection" checkbox for Right Toe Nails field
And I select "Ridged" checkbox for Right Toe Nails field
And I select "Incorrect length short" checkbox for Left Toe Nails field
And I select "Discoloured" checkbox for Left Toe Nails field
And I select "Fungal infection" checkbox for Left Toe Nails field
And I select "Ridged" checkbox for Left Toe Nails field
##
And I select "Dependent rubor" checkbox for Left Skin Appearance - Advanced field 
And I select "Stasis dermatitis" checkbox for Left Skin Appearance - Advanced field 
And I select "Varicosities" checkbox for Left Skin Appearance - Advanced field 
And I select "Dependent rubor" checkbox for Right Skin Appearance - Advanced field 
And I select "Stasis dermatitis" checkbox for Right Skin Appearance - Advanced field 
And I select "Varicosities" checkbox for Right Skin Appearance - Advanced field 
#
And I select "No pain" checkbox for Right Pain Assessment - Advanced field
And I select "Intermittent" checkbox for Right Pain Assessment - Advanced field
And I select "Pain at rest" checkbox for Right Pain Assessment - Advanced field
And I select "Increase with elevation" checkbox for Right Pain Assessment - Advanced field
And I select "Ache" checkbox for Right Pain Assessment - Advanced field
#
And I select "No pain" checkbox for Left Pain Assessment - Advanced field
And I select "Intermittent" checkbox for Left Pain Assessment - Advanced field
And I select "Pain at rest" checkbox for Left Pain Assessment - Advanced field
And I select "Increase with elevation" checkbox for Left Pain Assessment - Advanced field
And I select "Ache" checkbox for Left Pain Assessment - Advanced field
#
And I click on Save My Work Advanced Lower Limb Assessment Button
#Then Advanced Lower Limb Assessment details should get verified
And I Navigate to "Viewer -> Limb Flowchart" LH panel option
Then "Limb Flowchart" page will open
When I start verifying records in Advanced Lower Limb Assessment Page
Then I Logout from Pixalere
