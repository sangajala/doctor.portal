package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.io.IOException;

import cucumber.api.PendingException;

import java.io.IOException;
import java.util.List;

    public class doctorsPortal extends baseStepDefs {
        @Given("^doctor has launched url$")
        public void doctorHasLaunchedUrl() throws IOException {
            loginpage.NavigateToUrl();
        }
        @When("^doctor enters \"([^\"]*)\" and \"([^\"]*)\"$")
        public void doctorEnters(String username, String password) throws Throwable {
            //System.out.println("before login :" + driver.getTitle());
            loginpage.loginToDoctorPortal(username, password);
        }
        @Then("^doctor is directed to \"([^\"]*)\"$")
        public void doctorIsDirectedTo(String Dashboard) throws Throwable {
            Assert.assertTrue(Dashboard.equals(doctorsPage.getDashBoard.getText()));
        }
        @Given("^doctor has logged in$")
        public void doctorHasLoggedIn() {
            Assert.assertTrue(homepage.isUserCanSeeDashBoard());
        }


        @When("^doctor selects archive from appointments$")
        public void doctorSelectsArchiveFromAppointments() {
            doctorsPage.setAppointments();

        }
        @Then("^doctor can view all completed and cancelled appointments here$")
        public void doctorCanViewAllCompletedAndCancelledAppointmentsHere() {
            doctorsPage.setArchive();
            doctorsPage.setArchivePage();

        }
        @Given("^Doctor has logged into dashboard$")
        public void doctorHasLoggedIntoDashboard() {
            doctorsPage.setAppointments();
            doctorsPage.setAllAppointments();
        }

        @When("^Doctor selects \"([^\"]*)\"$")
        public void doctorSelects(String patientname) throws Throwable {
            doctorsPage.setSearchTextBox(patientname);
            doctorsPage.setViewIconButton();

        }

        @Then("^Doctor writes \"([^\"]*)\"$")
        public void doctorWrites(String patientnotes) throws Throwable {
            doctorsPage.setPatientNotes(patientnotes);

        }

        @And("^Doctor can see entered notes for particular patient in details$")
        public void doctorCanSeeEnteredNotesForParticularPatientInDetails() {
        }

        @Given("^Doctor has log in and is in dashboard$")
        public void doctorHasLogInAndIsInDashboard() {
            doctorsPage.setAppointments();
        }

        @When("^Doctor selects All Appointments from Appointment dropdown$")
        public void doctorSelectsAllAppointmentsFromAppointmentDropdown() {
            doctorsPage.setAllAppointments();

        }

        @Then("^Doctor can view the list of appointments here$")
        public void doctorCanViewTheListOfAppointmentsHere() {
        }

        @And("^Doctors selects particular \"([^\"]*)\" details to view$")
        public void doctorsSelectsParticularDetailsToView(String patientName) throws Throwable {
            doctorsPage.setSearchTextBox(patientName);
            doctorsPage.setViewIconButton();

        }


        @And("^Doctor can view all the details of patients with \"([^\"]*)\"$")
        public void doctorCanViewAllTheDetailsOfPatientsWith(String questionnaire) throws Throwable {
            //doctorsPage.setGetQuestionnaire(questionnaire);
            Assert.assertTrue(doctorsPage.setGetQuestionnaire(questionnaire));

            // Assert.assertFalse(doctorsPage.setGetQuestionnaire(questionnaire));
        }
        @Given("^doctor has logged into his account$")
        public void doctorHasLoggedIntoHisAccount() {
            doctorsPage.setAppointments();
            doctorsPage.setAllAppointments();
        }

        @When("^doctor searches for particular \"([^\"]*)\"$")
        public void doctorSearchesForParticular(String patientname) throws Throwable {
            doctorsPage.setSearchTextBox(patientname);

        }

        @Then("^doctor can select view icon from for that patient$")
        public void doctorCanSelectViewIconFromForThatPatient() {
            doctorsPage.setViewIconButton();
        }

        @And("^doctor selects reset to that patient$")
        public void doctorSelectsResetToThatPatient() {
            doctorsPage.setResetButtom();
        }

        @And("^data from patient notes will be cleared$")
        public void dataFromPatientNotesWillBeCleared() {
        }

        @Given("^doctor has logged in and is in dashboard$")
        public void doctorHasLoggedInAndIsInDashboard() {
        }
        @When("^Doctor selects log out from hamburger icon$")
        public void doctorSelectsLogOutFromHamburgerIcon() {
            doctorsPage.setHamBurgerIcon();
        }
        @Given("^Doctor has already logged in and is in dashboard$")
        public void doctorHasAlreadyLoggedInAndIsInDashboard() {

        }

        @When("^Doctor selects hamburger icon and selects change password$")
        public void doctorSelectsHamburgerIconAndSelectsChangePassword() {
            doctorsPage.setHamBurgerIcon();
            doctorsPage.setChangePasswordlink();

        }

        @Then("^Doctor enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
        public void doctorEntersAndAnd(String password,String newpassword,String renterpassword) throws Throwable {
            doctorsPage.setCurrentPasswordTextBox(password,newpassword,renterpassword);
        }

        @And("^Doctor submit$")
        public void doctorSubmit() {
            doctorsPage.setSubmitButton();
        }


        @Then("^Doctor successfully logs out of application$")
        public void doctorSuccessfullyLogsOutOfApplication() {
            doctorsPage.setLogOut();
        }
        @Given("^doctor has logged in and is in dashboard to make video consultation$")
        public void doctorHasLoggedInAndIsInDashboardToMakeVideoConsultation() {
            //Assert.assertTrue(homepage.isUserCanSeeDashBoard());

        }

        @When("^doctor selects All Appointments from Appointments dropdown$")
        public void doctorSelectsAllAppointmentsFromAppointmentsDropdown() {
            doctorsPage.setAppointments();
            doctorsPage.setAllAppointments();
        }

        @Then("^doctor can see appointments list$")
        public void doctorCanSeeAppointmentsList() {

        }

        @And("^doctor selects \"([^\"]*)\" by seeing the video icon$")
        public void doctorSelectsBySeeingTheVideoIcon(String patientName) throws Throwable {
            doctorsPage.setSearchTextBox(patientName);
        }

        @And("^doctor places call to patient at the time of appointment$")
        public void doctorPlacesCallToPatientAtTheTimeOfAppointment() throws Throwable {
            Thread.sleep(3000);
            doctorsPage.setVideoCallButton();
            Thread.sleep(5000);

            driver.navigate().to("https://thedoctorsportal.com/Dashboard");
            homepage.isUserCanSeeDashBoard();

        }


        @Given("^Doctor is in dashboard after loggin$")
        public void doctorIsInDashboardAfterLoggin() {
            // Assert.assertTrue(homepage.isUserCanSeeDashBoard());
        }

        @When("^Doctor selects change password from hamburger icon$")
        public void doctorSelectsChangePasswordFromHamburgerIcon() {
            doctorsPage.setHamBurgerIcon();
            doctorsPage.setChangePasswordlink();
        }

        @Then("^Doctor enters invalid data  \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
        public void doctorEntersInvalidDataAndAnd(String password,String newPassword,String confirmPassword) throws Throwable {
            doctorsPage.setCurrentPasswordTextBox(password,newPassword,confirmPassword);
            doctorsPage.setSubmitButton();

        }

        @And("^Doctor submits gets \"([^\"]*)\"$")
        public void doctorSubmitsGets(String errorMessage) throws Throwable {
            doctorsPage.setErrorMessage(errorMessage);
            Assert.assertTrue(doctorsPage.setErrorMessage(errorMessage));

        }
        @Given("^doctor has logged in after launching url$")
        public void doctorHasLoggedInAfterLaunchingUrl() {
            //Assert.assertTrue(homepage.isUserCanSeeDashBoard());
        }
        @When("^doctor selects all appointments from appointments$")
        public void doctorSelectsAllAppointmentsFromAppointments() {
            doctorsPage.setAppointments();
            doctorsPage.setAllAppointments();
        }

        @Then("^doctor selects number of \"([^\"]*)\" to view in a page from drop down$")
        public void doctorSelectsNumberOfToViewInAPageFromDropDown(String entries) throws Throwable {
            doctorsPage.setEntriesDropDown(entries);
        }

        @And("^view the selected number of appointments from$")
        public void viewTheSelectedNumberOfAppointmentsFrom() {
        }
        @Given("^doctor is in dashboard$")
        public void doctorIsInDashboard() {

            doctorsPage.setAppointments();
        }

        @When("^doctor selects All Appointments from Appointments menu$")
        public void doctorSelectsAllAppointmentsFromAppointmentsMenu() {
            doctorsPage.setAllAppointments();
        }

        @Then("^doctor can see the filter by status dropdown$")
        public void doctorCanSeeTheFilterByStatusDropdown() {
            //doctorsPage.setStatusFilterDropDown();
        }

        @And("^doctor selects the option from \"([^\"]*)\"$")
        public void doctorSelectsTheOptionFrom(String status) throws Throwable {
            doctorsPage.setStatusFilterDropDown(status);
        }

        @And("^doctor can view appointments with only the selected status$")
        public void doctorCanViewAppointmentsWithOnlyTheSelectedStatus() {
        }


        @Given("^Doctor in dashboard$")
        public void doctorInDashboard() throws Throwable {
            loginpage.NavigateToUrl();
        }

        @When("^Doctor selects all appointments from appointments drop down$")
        public void doctorSelectsAllAppointmentsFromAppointmentsDropDown() {
            doctorsPage.setAppointments();
            doctorsPage.setAllAppointments();

        }

        @Then("^Doctor enters \"([^\"]*)\" in search text box for \"([^\"]*)\" which he is looking for$")
        public void doctorEntersInSearchTextBoxForWhichHeIsLookingFor(String credentials, String data ) throws Throwable {
            doctorsPage.setSearchTextBox(credentials);
        }

        @And("^Doctor can view all the entries with a given data$")
        public void doctorCanViewAllTheEntriesWithAGivenData() {
        }
        @Given("^doctor has launched doctorsportal url$")
        public void doctorHasLaunchedDoctorsportalUrl() throws Throwable{
            loginpage.NavigateToUrl();
        }

        @When("^doctor tries to login with invalid \"([^\"]*)\" and \"([^\"]*)\"$")
        public void doctorTriesToLoginWithInvalidAnd(String username, String password) throws Throwable {
            loginpage.loginToDoctorPortal(username,password);
        }
        @Then("^verify \"([^\"]*)\"$")
        public void verify(String errorMessage) throws Throwable {
            String errMsg= doctorsPage.getLoginErrorMessage();
            //Assert.assertEquals(errorMessage,loginpage.passwordError.getText());
            System.out.println( "LoginError" +errMsg);
            Assert.assertTrue(errorMessage.equals(errMsg));

        }





    }
