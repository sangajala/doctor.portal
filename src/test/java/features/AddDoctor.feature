Feature: Add Doctor - Gopi

  In order to 'Add Doctor', I need to have Admin credentials.

  @gopi
  Scenario Outline: Add Doctor using valid details

    Given Admin is in login page
    When  Admin login with username and password as "admin@lgp.com" "Admin@123$"
    Then  Admin should be navigate to Home page with "LGP Appointment"
#    When Admin click on menu "Doctors"
    When Admin click on menu "Add Doctor"
    Then Admin should be see the page with title "Add Doctor"
    And provide details "<Name>","<email>","<password>","<gender>","<Appointments>","<status>"
    Then Doctor should be added
    And I logout as Admin
    Then Login with new Doctor credentials
    And Should be succesfully logged in with new Doctor credentials

    Examples:
      | Name         | email               | password  | gender | Appointments | status |
      | Gopi Krishna | gopi1179us@yahoo.com | Covid%201 | Male   | Consultation | Active |
