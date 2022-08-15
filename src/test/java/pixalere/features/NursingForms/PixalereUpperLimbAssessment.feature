Feature: Pixalere Upper Limb Assessment

@test11
Scenario: Pixalere Upper Limb Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID Nursing
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Assessment -> Upper Limb Assessment" LH panel option
Then "Upper Limb Assessment" page will open
##
When I select "Thumb" checkbox for Right Missing Limbs or Fingers field
And I select "No amputations" checkbox for Right Missing Limbs or Fingers field
And I select "Arm below elbow" checkbox for Right Missing Limbs or Fingers field
And I select "Hand all" checkbox for Right Missing Limbs or Fingers field
And I select "Second finger" checkbox for Right Missing Limbs or Fingers field
And I select "Fourth finger" checkbox for Right Missing Limbs or Fingers field
#
And I select "Thumb" checkbox for Left Missing Limbs or Fingers field
And I select "No amputations" checkbox for Left Missing Limbs or Fingers field
And I select "Arm below elbow" checkbox for Left Missing Limbs or Fingers field
And I select "Hand all" checkbox for Left Missing Limbs or Fingers field
And I select "Second finger" checkbox for Left Missing Limbs or Fingers field
And I select "Fourth finger" checkbox for Left Missing Limbs or Fingers field
#
And I click "Black" radio option for "Right" Arm Skin Colour field
And I click "Black" radio option for "Left" Arm Skin Colour field
And I click "Black" radio option for "Right" Hand Skin Colour field
And I click "Black" radio option for "Left" Hand Skin Colour field
And I click "Black" radio option for "Right" Fingers Skin Colour field
And I click "Black" radio option for "Left" Fingers Skin Colour field

And I click "Cool" radio option for "Right" Arm Skin Warmth field
And I click "Cool" radio option for "Left" Arm Skin Warmth field
And I click "Cool" radio option for "Right" Hand Skin Warmth field
And I click "Cool" radio option for "Left" Hand Skin Warmth field
And I click "Cool" radio option for "Right" Fingers Skin Warmth field
And I click "Cool" radio option for "Left" Fingers Skin Warmth field
#
And I click "Present" radio option for "Right" Dorsalis Pedis Pulses by Palpation field
And I click "Present" radio option for "Left" Dorsalis Pedis Pulses by Palpation field
And I click "Present" radio option for "Right" Posterior Tibial Pulses by Palpation field
And I click "Present" radio option for "Left" Posterior Tibial Pulses by Palpation field
And I click "Right" radio option for Less than equal to three secs Capillary Refill field
And I click "Left" radio option for Greater than three secs Capillary Refill field
And I click "Hand" radio option for "Right" Edema Location field
And I click "Hand" radio option for "Left" Edema Location field
And I click "None noted" radio option for "Right" Edema Severity field
And I click "None noted" radio option for "Left" Edema Severity field
#
And I enter "Wrist Measurement cm Right" input field
And I enter "Forearm Measurement cm Right" input field
And I enter "Wrist Measurement cm Left" input field
And I enter "Forearm Measurement cm Left" input field
#
And I select "Dryflaky" checkbox for Right Derm Assessment field
And I select "Rash present" checkbox for Right Derm Assessment field
And I select "Weepy" checkbox for Right Derm Assessment field
#
And I select "Dryflaky" checkbox for Left Derm Assessment field
And I select "Rash present" checkbox for Left Derm Assessment field
And I select "Weepy" checkbox for Left Derm Assessment field
#
And I select "Burning" checkbox for Right Monofilament Testing field
And I select "Crawling" checkbox for Right Monofilament Testing field
And I select "Burning" checkbox for Left Sensation Assessment field
And I select "Crawling" checkbox for Left Sensation Assessment field
#
And I select "No pain" checkbox for "Left" Pain Assessment field
And I select "No pain" checkbox for "Right" Pain Assessment field
#
And I click "Normal" radio option for "Right" Elbow Range of Motion field
And I click "Normal" radio option for "Left" Elbow Range of Motion field
And I click "Normal" radio option for "Right" Wrist Range of Motion field
And I click "Normal" radio option for "Left" Wrist Range of Motion field
And I click "Normal" radio option for "Right" Thumb Range of Motion field
And I click "Normal" radio option for "Left" Thumb Range of Motion field
And I enter "Comments Upper Limb" input field
And I click on Save My Work Basic Lower Limb Assessment Button
#Then Upper Limb Assessment details should get verified
And I Navigate to "Viewer -> Limb Flowchart" LH panel option
Then "Limb Flowchart" page will open
When I start verifying records in Upper Limb Assessment Page
Then I Logout from Pixalere