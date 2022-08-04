Feature: Pixalere Tinetti

@test11
Scenario: Pixalere Tinetti Script
Given I setup in Browser
Given I am enter Pixalere Url
And I login with "admin-P" User-p
When I select client name "Data_PT" from Dashboard
And I select "PT" from Service Referral PT
And I click "Access Chart" radio option for "Service Referral and Type" field
And I Navigate to "Outcome Measures -> Tinetti" LH panel option
Then "Tinetti Assessment Tool" page will open
##
When I click "Leans or slides in chair" radio option for "Sitting Balance" field PT
And I click "Unable without help" radio option for "Rises from chair" field PT 
And I click "Unable without help" radio option for "Attempts to rise" field PT   
And I click "Steady but uses walker or other support" radio option for "Immediate standing" field PT  
And I click "Unsteady" radio option for "Standing balance" field PT   
And I click "Begins to fall" radio option for "Nudged" field PT  
And I click "Unsteady" radio option for "Eyes closed" field PT  
And I click "Discontinuous steps" radio option for "Turning 360 degrees" field PT 
And I click "Uses arms or not a smooth motion" radio option for "Sitting down" field PT 
#
And I click "Right foot passes left stance foot" radio option for "Step length (right)" field PT 
And I click "Right foot completely clears floor" radio option for "Step height (right)" field PT 
And I click "Left foot passes right stance foot" radio option for "Step length (left)" field PT 
And I click "Left foot completely clears floor" radio option for "Step height (left)" field PT
And I click "Right and left step appear equal" radio option for "Step symmetry" field PT
And I click "Steps appear continuous" radio option for "Step continuity" field PT
And I click "Marked deviation" radio option for "Path" field PT
And I click "Marked sway or uses walking aid" radio option for "Trunk" field PT
And I click "Heels apart" radio option for "Walking Stance" field PT
#
And I click on Save My Work Tinetti Button
#Then Tinetti should get verified
And I Navigate to "Viewer -> Tinetti Assessment Tool" LH panel option
Then "Tinetti Assessment Tool" page will open
When I start verifying records in Tinetti Page
Then I Logout from Pixalere