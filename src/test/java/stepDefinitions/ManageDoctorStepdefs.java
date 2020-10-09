package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ManageDoctorStepdefs extends baseStepDefs {

    @When("^Admin click on menu \"([^\"]*)\"$")
    public void adminClickOnMenu(String menu) throws Throwable {

        //A
//        homepage.clickOnDoctorLink();
//        homepage.clickOnAllDoctorLink();

        //B
        homepage.clickOnMenu(menu);
//        homepage.clickOnMenu("All Doctor");
    }

    @Then("^Admin should be see the page with title \"([^\"]*)\"$")
    public void adminShouldBeGivenOptionToAddDoctor(String header) {

        Assert.assertEquals(addDoctorPage.getPageHeader(),header);

    }

    @When("^Admin click on 'Add Doctor'$")
    public void adminClickOnAddDoctor() {

    }

    @And("^provide details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void provideDetails(String name, String email, String password, String gender, String appointment, String status) throws Throwable {
        addDoctorPage.addDoctorWithDetails(name,email,password,gender,appointment,status);
    }


    @Then("^Doctor should be added$")
    public void doctor_should_be_added() throws Throwable {

        Assert.assertEquals(addDoctorPage.getMessage(),"Doctor created successfully.");

    }

    @Then("^I logout as Admin$")
    public void i_logout_as_Admin() throws Throwable {

    }

    @Then("^Login with new Doctor credentials$")
    public void login_with_new_Doctor_credentials() throws Throwable {

    }

    @Then("^Should be succesfully logged in with new Doctor credentials$")
    public void should_be_succesfully_logged_in_with_new_Doctor_credentials() throws Throwable {

    }



}
