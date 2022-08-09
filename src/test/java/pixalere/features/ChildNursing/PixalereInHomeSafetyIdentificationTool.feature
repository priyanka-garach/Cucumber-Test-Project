Feature: Pixalere In-Home Safety Identification Tool

  @test11
  Scenario: Pixalere In-Home Safety Identification Tool Script
    Given I setup in Browser
    Given I am enter Pixalere Url
    And I login with "admin-P" User-p
    When I globally select "Pix ID" from Search Category dropdown
    And I search created patient with PIXID
    And I click "General Visit" radio option for "Service Referral and Type" field
    And I Navigate to "Patient Profile -> In-Home Safety Identification Tool (Visiting & Shift)" LH panel option
    Then "In-Home Safety Identification Tool (Visiting & Shift)" page will open
    ##
    When I select "Client did not consent to home safety assessment" checkbox for HSA Not Compelted field HSI
    When I select "School Client" checkbox for HSA Not Compelted field HSI
    
    And I select "Clutter" checkbox for TrippingFalling field HSI
    And I select "Bathroom" checkbox for rooms for hazard
    And I click on Save for rooms for hazard
    And I select "Cords" checkbox for TrippingFalling field HSI
    And I select "Kitchen" checkbox for rooms for hazard
    And I click on Save for rooms for hazard
    
    And I select "Unsafe disposal of sharps" checkbox for Medication
    And I select "Improper storage of meds" checkbox for Medication
    
    And I select "Absence of food in home" checkbox for Other
    And I select "Issue with medical equipment" checkbox for Other
    And I select "No phone" checkbox for Other
    
    And I select "Frayed cords" checkbox for Fire
    And I select "Hallway" checkbox for rooms for hazard
    And I click on Save for rooms for hazard
    And I select "Oxygen present" checkbox for Fire
    And I select "Stairs" checkbox for rooms for hazard
    And I click on Save for rooms for hazard
    And I select "Lack of smoke detector" checkbox for Fire
    And I select "Outdoors" checkbox for rooms for hazard
    And I click on Save for rooms for hazard
    
    And I select "No safety issues identified - no action required" checkbox for FollowupPlan
    And I select "Client chooses to live at risk" checkbox for FollowupPlan
    And I select " Safety issues addressed - no further action required" checkbox for FollowupPlan
    
    And I select "Non-adherence to RNAO Safe Sleep BPG" checkbox for SafeSleep
    And I select "Bunk beds in children < 5 years" checkbox for SafeSleep
    
    And I select "Lack of safety belts on equipment" checkbox for FallsPrevention
    And I select "Risk for falls from windows" checkbox for FallsPrevention
    And I select "Lack of mechanical aids if weight > 35lb" checkbox for FallsPrevention
    
    And I select "Developmentally unsafe food" checkbox for PoisonChoking
    And I select "Unsafe storage of hazardous material" checkbox for PoisonChoking
    
    And I enter "Comments HSI" input field
    And I click on Save My Work In-Home Safety Identification Tool Button HSI
    ##
    And I Navigate to "Viewer -> In-Home Safety Identification Tool Flowchart" LH panel option
    Then "In-Home Safety Identification Tool Flowchart" page will open
    When I start verifying records in In-Home Safety Identification Tool Flowchart Record Page
    Then I Logout from Pixalere
