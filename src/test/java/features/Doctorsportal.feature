Feature:End to end verification of doctors portal - Rumana

  Scenario Outline:Verify doctor can login with valid credentials
    Given doctor has launched url
    When  doctor enters "<email>" and "<password>"
    Then doctor is directed to "<dashboard>"
    Examples:
      |email        |password  |dashboard |
      |lgp@test.com |Qwe@12345 |Dashboard |


  Scenario:Verify doctor can view Archive
    Given doctor has logged in
    When  doctor selects archive from appointments
    Then  doctor can view all completed and cancelled appointments here


  Scenario Outline: Doctor can add patient notes to particular patient
    Given Doctor has logged into dashboard
    When Doctor selects "<patient>"
    Then Doctor writes "<patient notes>"
    And Doctor can see entered notes for particular patient in details
    Examples:
      |patient|patient notes  |
      |Nany   |patient is fine|


  Scenario Outline:Doctor can view particular patient details
    Given Doctor has log in and is in dashboard
    When  Doctor selects All Appointments from Appointment dropdown
    Then  Doctor can view the list of appointments here
    And   Doctors selects particular "<patient>" details to view
    And   Doctor can view all the details of patients with "<questionnaire>"
    Examples:
      |patient      |questionnaire                           |
      |Nany         |Questionnaire available for this patient|


  Scenario Outline:Doctor can reset patient notes
    Given doctor has logged into his account
    When doctor searches for particular "<patient>"
    Then doctor can select view icon from for that patient
    And doctor selects reset to that patient
    And data from patient notes will be cleared
    Examples:
      |patient|
      |Nany   |



  Scenario Outline: Doctor can select the entries to view per page
    Given doctor has logged in after launching url
    When doctor selects all appointments from appointments
    Then doctor selects number of "<entries>" to view in a page from drop down
    And view the selected number of appointments from
    Examples:
      |entries|
      |10     |
      |25     |

  Scenario Outline: Doctor can filter appointments based on status
  confirmed,cancelled and completed
    Given doctor is in dashboard
    When doctor selects All Appointments from Appointments menu
    Then  doctor can see the filter by status dropdown
    And  doctor selects the option from "<dropdown>"
    And doctor can view appointments with only the selected status
    Examples:
      |dropdown  |
      |Confirmed |
      |Cancelled |
      |Completed |
      |All       |

  Scenario Outline:Verify doctor can find details of patient with one data
    Given Doctor in dashboard
    When Doctor selects all appointments from appointments drop down
    Then Doctor enters "<credentials>" in search text box for "<type of data>" which he is looking for
    And  Doctor can view all the entries with a given data
    Examples:
      | type of data | credentials   |
      | Patient name | Nany          |
      | Date         | 06-08-2020    |
      | Time         | 08:00         |
      | Mobile       | +447341177570 |
      | Type         | video         |
      | Status       | confirmed     |

  Scenario Outline:verify doctor can place a call for video consultation
    Given doctor has logged in and is in dashboard to make video consultation
    When  doctor selects All Appointments from Appointments dropdown
    Then doctor can see appointments list
    And   doctor selects "<video consultation>" by seeing the video icon
    And doctor places call to patient at the time of appointment
    Examples:
      |video consultation|
      |Ana               |

  Scenario Outline: Verify that doctor can't change password with invalid credentials
    Given  Doctor is in dashboard after loggin
    When   Doctor selects change password from hamburger icon
    Then    Doctor enters invalid data  "<current password>" and "<new password>" and "<re enter new password>"
    And    Doctor submits gets "<validation message>"
    Examples:
      |current password |new password |re enter new password|validation message                       |
      |Qwe@123          |Qwe@1234     |                     |The password confirmation does not match.|

  Scenario Outline: Verify that doctor can change password
    Given  Doctor has already logged in and is in dashboard
    When   Doctor selects hamburger icon and selects change password
    Then    Doctor enters "<current password>" and "<new password>" and "<re enter new password>"
    And    Doctor submit
    Examples:
      |current password |new password |re enter new password|
      |Qwe@12345        |Qwe@1234     |Qwe@1234             |




  Scenario Outline: Verify user cannot login to doctors portal with invalid credentials
    Given doctor has launched doctorsportal url
    When  doctor tries to login with invalid "<email>" and "<password>"
    Then  verify "<error message>"
    Examples:
      |email        |password  |error message                             |
      |lg@test.com  |qwe@12    |Oops! You have entered invalid credentials|
      |lg@test.com  |Qwe@12345 |Oops! You have entered invalid credentials|
      |lgp@test.com |qwe@1     |Oops! You have entered invalid credentials|
















