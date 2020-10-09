package pageObjects.old;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage;

public class AddDoctorPage extends basePage{

    private @FindBy(className = "page-title")
    WebElement notificationTitle;

    private @FindBy(name = "name")
    WebElement nameTextField;

    private @FindBy(name = "EmailAddress")
    WebElement emailTextField;

    private @FindBy(name = "password")
    WebElement passwordTextField;

    private @FindBy(name = "gender")
    WebElement genderDropDown;

    private @FindBy(name = "status")
    WebElement statusDropDown;

    private @FindBy(xpath = "//button[text()='Submit']")
    WebElement submitButton;

    private @FindBy(css = "div.alert.alert-dismissable.alert-success.col.-md-6 strong")
    WebElement messageHeader;

    private @FindBy(id = "vehicle1")
    WebElement consultation;

    public String getPageHeader() {
        return notificationTitle.getText() ;
    }

    public void addDoctorWithDetails(String name, String email, String password, String gender, String appointment, String status) throws InterruptedException {
        nameTextField.sendKeys(name);
        emailTextField.sendKeys(email);
        passwordTextField.sendKeys(password);
        utils.SelectUsingVisibleText(genderDropDown,gender);
        consultation.click();
//        utils.SelectUsingVisibleText(statusDropDown,status);
        submitButton.click();
        utils.waitToLoad();
    }

    public String getMessage(){
        return messageHeader.getText();
    }
}
