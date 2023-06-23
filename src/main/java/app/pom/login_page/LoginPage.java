package app.pom.login_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"panel header\"]//a[contains( . ,\"Sign In\")]")
     public WebElement loginLink;
    @FindBy(id = "//input[@id=\"email\"]")
    public WebElement inputEmail;
    @FindBy(id = "//input[@id=\"pass\"]")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[@class=\"action login primary\"]")
    public WebElement loginButton;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    public void ClickLoginLink(){

        safeClickOnElement(loginLink);
    }
    public void setInputEmail(String validEmail){
        sendKeysToElement(inputEmail, validEmail);

    }
    public void setInputPassword(String validPassword){
        sendKeysToElement(inputPassword, validPassword);

    }
    public void ClickSignInButton(){
        safeClickOnElement(loginButton);
    }



    public WelcomeLoginPage getLogin(String validEmail, String validPassword){
        ClickLoginLink();
        setInputEmail(validEmail);
        setInputPassword(validPassword);
        ClickSignInButton();
        return new WelcomeLoginPage();
    }


}
