package app.pom.register;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {


    @FindBy(id = "//input[@id=\"firstname\"]")
    public WebElement first_nameInputField;
    @FindBy(id = "//input[@id=\"lastname\"]")
    public WebElement last_nameInputField;
    @FindBy(id = "//input[@id=\"email_address\"]")
    public WebElement emailAddressInputField;
    @FindBy(id = "//input[@id=\"password\"]")
    public WebElement passwordInputField;
    @FindBy(name = "//input[@name=\"password_confirmation\"]")
    public WebElement confirm_passwordInputField;
    @FindBy(className = "//button[@class=\"action submit primary\"]")
    public WebElement accountButton;
    @FindBy(className = "//div[@class=\"panel header\"]//span[@class=\"logged-in\"]")
    public WebElement registerPageCreated;

    public RegisterPage(){
        PageFactory.initElements(driver, this);
    }
    public void setFirst_name(String firstName){first_nameInputField.sendKeys(firstName);
    }

    public void setLast_name(String lastName) {
        last_nameInputField.sendKeys(lastName);
    }
    public void typeEmailAddress(String email){emailAddressInputField.sendKeys(email);
    }
    public void typePassword(String password){
        passwordInputField.sendKeys(password);
    }
    public void typeConfirmPassword(String confirmPassword){
      confirm_passwordInputField.sendKeys(confirmPassword);
    }
    public void clickAccountButton(){accountButton.click();}

    RegisterPage Register= new RegisterPage();
    String First_name="Fatma";
    String Last_name="Boumail";
    String email="sarafaty07@gmail.com";
    String password="Fatma2023";
    String confirmaPassword="Fatma2023";


}



















