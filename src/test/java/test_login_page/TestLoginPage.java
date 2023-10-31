package test_login_page;

import base.BasePage;
import login_page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BasePage {
    @Test
    public void testLoginPage(){
        LoginPage loginPage=new LoginPage();
        String validEmail="sarafaty07@gmail.com";
        String validPassword="Fatma2023";
        loginPage.getLoginPage(validEmail,validPassword);
        Assert.assertTrue(isElementVisible(loginPage.resultLoginMessage));
    }
}
