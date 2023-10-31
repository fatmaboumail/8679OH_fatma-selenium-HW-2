package login_page;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    public WebElement loginLink;
    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@name=\"login[password]\"]")
    public WebElement inputPassword;
    @FindBy(xpath = "//button[@class=\"action login primary\"]")
    public WebElement loginButton;
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
    public WebElement resultLoginMessage;
    public void clickLoginLink(){safeClickOnElement(loginLink);}
    public void setInputEmail(String validEmail){sendKeysToElement(inputEmail,validEmail);}
    public void setInputPassword(String validPassword){sendKeysToElement(inputPassword, validPassword);}
    public void clickLoginButton(){safeClickOnElement(loginButton);}

    public HomePage getLoginPage(String validEmail,String validPassword){
        clickLoginLink();
        setInputEmail(validEmail);
        setInputPassword(validPassword);
        clickLoginButton();
        return new HomePage();
    }
}
