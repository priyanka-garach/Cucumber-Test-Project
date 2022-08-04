Feature: Pixalere Basic Lower Limb Assessment

@test11
Scenario: Pixalere Basic Lower Limb Assessment Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I globally select "Pix ID" from Search Category dropdown
And I search created patient with PIXID
And I click "General Visit" radio option for "Service Referral and Type" field
And I Navigate to "Assessment -> Basic Lower Limb Assessment" LH panel option
Then "Basic Lower Limb Assessment" page will open
##
When I select "No amputations" checkbox for Right Missing Limbs or Toes field
And I select "Leg b/k" checkbox for Right Missing Limbs or Toes field
And I select "Foot all" checkbox for Right Missing Limbs or Toes field
And I select "Second toe" checkbox for Right Missing Limbs or Toes field
And I select "Fourth toe" checkbox for Right Missing Limbs or Toes field
And I select "Leg a/k" checkbox for Right Missing Limbs or Toes field
And I select "Foot partial" checkbox for Right Missing Limbs or Toes field
And I select "Great toe" checkbox for Right Missing Limbs or Toes field
And I select "Third toe" checkbox for Right Missing Limbs or Toes field
And I select "Fifth toe" checkbox for Right Missing Limbs or Toes field
#
And I select "No amputations" checkbox for Left Missing Limbs or Toes field
And I select "Leg b/k" checkbox for Left Missing Limbs or Toes field
And I select "Foot all" checkbox for Left Missing Limbs or Toes field
And I select "Second toe" checkbox for Left Missing Limbs or Toes field
And I select "Fourth toe" checkbox for Left Missing Limbs or Toes field
And I select "Leg a/k" checkbox for Left Missing Limbs or Toes field
And I select "Foot partial" checkbox for Left Missing Limbs or Toes field
And I select "Great toe" checkbox for Left Missing Limbs or Toes field
And I select "Third toe" checkbox for Left Missing Limbs or Toes field
And I select "Fifth toe" checkbox for Left Missing Limbs or Toes field
#
And I click "Black" radio option for "Right" Lower Leg Skin Colour field
And I click "Black" radio option for "Left" Lower Leg Skin Colour field
And I click "Black" radio option for "Right" Foot Skin Colour field
And I click "Pale" radio option for "Left" Foot Skin Colour field
And I click "Red" radio option for "Right" Toes Skin Colour field
And I click "Black" radio option for "Left" Toes Skin Colour field
And I click "Cool" radio option for "Right" Lower Leg Skin Warmth field
And I click "Cool" radio option for "Left" Lower Leg Skin Warmth field
And I click "Cool" radio option for "Right" Foot Skin Warmth field
And I click "Cool" radio option for "Left" Foot Skin Warmth field
And I click "Cool" radio option for "Right" Toes Skin Warmth field
And I click "Cool" radio option for "Left" Toes Skin Warmth field
#
And I click "Present" radio option for "Right" Dorsalis Pedis Pulses by Palpation field
And I click "Present" radio option for "Left" Dorsalis Pedis Pulses by Palpation field
And I click "Present" radio option for "Right" Posterior Tibial Pulses by Palpation field
And I click "Present" radio option for "Left" Posterior Tibial Pulses by Palpation field
And I click "Right" radio option for Less than equal to three secs Capillary Refill field
And I click "Left" radio option for Greater than three secs Capillary Refill field
And I click "Normal" radio option for "Right" Knee Range of Motion field
And I click "Normal" radio option for "Left" Knee Range of Motion field
And I click "Normal" radio option for "Right" Ankle Range of Motion field
And I click "Normal" radio option for "Left" Ankle Range of Motion field
#
And I click "Up to ankle" radio option for "Right" Edema Location field
And I click "Up to ankle" radio option for "Left" Edema Location field
And I click "None noted" radio option for "Right" Edema Severity field
And I click "None noted" radio option for "Left" Edema Severity field
And I enter "Sleep Position" input field
And I enter "Ankle Measurement cm Right" input field
And I enter "Ankle Measurement mm Right" input field
And I enter "Mid-Calf Measurement cm Right" input field
And I enter "Mid-Calf Measurement mm Right" input field
#
And I select "Dryflaky" checkbox for Right Derm Assessment field
And I select "Rash present" checkbox for Right Derm Assessment field
And I select "Weepy" checkbox for Right Derm Assessment field
#
And I select "Dryflaky" checkbox for Left Derm Assessment field
And I select "Rash present" checkbox for Left Derm Assessment field
And I select "Weepy" checkbox for Left Derm Assessment field

And I select "Burning" checkbox for Right Monofilament Testing field
And I select "Crawling" checkbox for Right Monofilament Testing field
#
And I select "No pain" checkbox for "Right" Pain Assessment field
And I select "No pain" checkbox for "Left" Pain Assessment field
And I enter "Basic LL Comments" input field
And I click on Save My Work Basic Lower Limb Assessment Button
#Then Basic Lower Limb Assessment details should get verified
And I Navigate to "Viewer -> Limb Flowchart" LH panel option
Then "Limb Flowchart" page will open
When I start verifying records in Basic Lower Limb Assessment Page
Then I Logout from Pixalere
