Feature: Pixalere In-Home Safety Identification Tool Nursing
  @test11
  Scenario: Pixalere In-Home Safety Identification Tool Script Nursing
    Given I setup in Browser
    Given I am enter Pixalere Url
    And I login with "admin-P" User-p
   	When I globally select "Pix ID" from Search Category dropdown
		And I search created patient with PIXID Nursing
		And I click "General Visit" radio option for "Service Referral and Type" field
    And I Navigate to "Patient Profile -> In Home Safety Checklist" LH panel option
    Then "In Home Safety Checklist" page will open
    ##
    When I select "Client did not consent to home safety assessment" checkbox for HSA Not Compelted field HSI
    
    And I select "Clutter" checkbox for TrippingFalling field HSI
    And I select "Bathroom" checkbox for rooms for hazard
    And I click on Save for rooms for Home Safety
    And I select "Cords" checkbox for TrippingFalling field HSI
    And I select "Kitchen" checkbox for rooms for hazard
    And I click on Save for rooms for Home Safety
    
    And I select "Unsafe disposal of sharps" checkbox for Medication
    And I select "Improper storage of meds" checkbox for Medication
    
    And I select "Absence of food in home" checkbox for Other
    And I select "Issue with medical equipment" checkbox for Other
    And I select "No phone" checkbox for Other
    
    And I select "Frayed cords" checkbox for Fire
    And I select "Hallway" checkbox for rooms for hazard
    And I click on Save for rooms for Home Safety
    And I select "Oxygen present" checkbox for Fire
    And I select "Stairs" checkbox for rooms for hazard
    And I click on Save for rooms for Home Safety
    And I select "Lack of smoke detector" checkbox for Fire
    And I select "Outdoors" checkbox for rooms for hazard
    And I click on Save for rooms for Home Safety
    
    And I select "No safety issues identified - no action required" checkbox for FollowupPlan
    And I select "Client chooses to live at risk" checkbox for FollowupPlan
    And I select "Safety issues addressed - no further action required" checkbox for FollowupPlan
    
    And I enter "Comments HSI Nursing" input field in script
    
    And I click on Save My Work In-Home Safety Identification Tool Button HSI
    ##
    And I Navigate to "Viewer -> In-Home Safety Identification Tool Flowchart" LH panel option
    Then "In-Home Safety Identification Tool Flowchart" page will open
    When I start verifying records in In-Home Safety Identification Tool Flowchart Record Page Nursing
    Then I Logout from Pixalere
