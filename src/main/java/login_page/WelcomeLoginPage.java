package login_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeLoginPage extends BasePage {

    @FindBy(xpath = "//div[@class=\"panel header\"]//span[@class=\"logged-in\"]")
    WebElement welcome,Name;
    public WelcomeLoginPage(){ PageFactory.initElements(driver,this);





    }

}
