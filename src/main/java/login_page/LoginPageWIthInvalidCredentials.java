package login_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWIthInvalidCredentials extends BasePage {

    @FindBy(xpath = "//div[@class=\"panel header\"]//a[contains( . ,\"Sign In\")]")
    public WebElement loginLink;
    @FindBy(id = "//input[@id=\"email\"]")
    public WebElement inputEmail;
    @FindBy(id = "//input[@id=\"pass\"]")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[@class=\"action login primary\"]")
    public WebElement loginButton;


    public LoginPageWIthInvalidCredentials(){
        PageFactory.initElements(driver,this);
    }
    public void ClickLoginLink(){

        safeClickOnElement(loginLink);
    }
    public void setInputEmail(String invalidEmail){
        sendKeysToElement(inputEmail, invalidEmail);

    }
    public void setInputPassword(String invalidPassword){
        sendKeysToElement(inputPassword, invalidPassword);

    }
    public void ClickSignInButton(){
        safeClickOnElement(loginButton);
    }



    public LoginPageWIthInvalidCredentials(String invalidEmail, String invalidPassword) {
        ClickLoginLink();
        setInputEmail(invalidEmail);
        setInputPassword(invalidPassword);
        ClickSignInButton();




    }






}
