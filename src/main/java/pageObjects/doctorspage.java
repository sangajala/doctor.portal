package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

    public class doctorspage extends loginPage {
        @FindBy(xpath = "//div[@class='page-title']")
        public WebElement dashBoard;
        @FindBy(id = "appointment_note")
        public WebElement patientNotes;
        @FindBy(xpath = "(//span[@class='title'])[2]")
        //@FindBy(linkText="Appointment")
        public WebElement appointments;
        @FindBy(xpath = "(//span[@class='title'])[3]")
        public WebElement allAppointments;
        @FindBy(xpath = "(//span[@class='title'])[4]")
        public WebElement archive;
        @FindBy(xpath = "//div[@class='page-title']")
        public WebElement archivePage;
        @FindBy(xpath = "//a[@class='dropdown-toggle']/img")
        public WebElement hamBurgerIcon;
        @FindBy(linkText = "Log Out")
        public WebElement logOut;
        @FindBy(linkText = "Change Password")
        public WebElement changePasswordlink;
        @FindBy(id = "current-password")
        public WebElement currentPasswordTextBox;
        @FindBy(id = "password")
        public WebElement passwordTextBox;
        @FindBy(id = "password_confirmation")
        public WebElement reEnterPassword;
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement submitButton;
        @FindBy(xpath = "//input[@type='search']")
        public WebElement searchTextBox;
        @FindBy(xpath = "(//*[@type='submit'])[1]")
        public WebElement videoCallButton;
        @FindBy(xpath = "(//i[@class='fa fa-eye'])[1]")
        public WebElement viewIconButton;
        @FindBy(id = "dropdown1")
        public WebElement statusFilterDropDown;
        @FindBy(xpath = "//select[@name='example4_Appointment_length']")
        public WebElement entriesDropDown;
        @FindBy(xpath = "//button[@type='button']")
        public WebElement resetButtom;
        @FindBy(xpath = "//div[@class='page-title']")
        public WebElement getDashBoard;
        @FindBy(xpath = "//header[contains(text(),'Questionnare Details')]")
        public WebElement getQuestionnaire;
        @FindBy(xpath = "//button[@class='close']")
        // public WebElement reEnterPasswordRequired;
        public WebElement errorMessage;
        @FindBy(xpath = "//div[@class='container']/div/strong")
        public WebElement loginErrorMessage;

        public String getLoginErrorMessage() {
            return loginErrorMessage.getText();
        }

        public Boolean setErrorMessage(String text) {
            return errorMessage.isDisplayed();
        }


        public void setResetButtom() {
            resetButtom.click();
        }


        public void setAppointments() {
            appointments.click();
        }

        public void setAllAppointments() {
            allAppointments.click();
        }

        public void setArchive() {
            archive.click();
        }

        public void setArchivePage() {
            archivePage.getText();
        }

        public void setHamBurgerIcon() {
            hamBurgerIcon.click();
        }

        public void setLogOut() {
            logOut.click();
        }

        public void setChangePasswordlink() {
            changePasswordlink.click();
        }

        public void setCurrentPasswordTextBox(String password, String newpassword, String renterpassword) {

            currentPasswordTextBox.sendKeys(password);
            passwordTextBox.sendKeys(newpassword);
            reEnterPassword.sendKeys(renterpassword);

        }

        public void setSubmitButton() {
            submitButton.click();
        }

        public void setSearchTextBox(String patientName) {
            searchTextBox.sendKeys(patientName);
        }

        public void setVideoCallButton() {
            videoCallButton.click();
        }

        public void setViewIconButton() {
            viewIconButton.click();
        }

        public void setStatusFilterDropDown(String status) {
            Select drpStatus = new Select(statusFilterDropDown);
            drpStatus.selectByVisibleText(status);

        }

        public void setEntriesDropDown(String entries) {
            Select drpNumber = new Select(entriesDropDown);
            drpNumber.selectByVisibleText(entries);
        }

        public void setPatientNotes(String patientnotes) {
            patientNotes.sendKeys(patientnotes);

        }

        public boolean setGetQuestionnaire(String text) {

            utils.waitForElementVisibility(driver, getQuestionnaire);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            System.out.println(getQuestionnaire.isDisplayed());
            return getQuestionnaire.isDisplayed();

        }


    }



