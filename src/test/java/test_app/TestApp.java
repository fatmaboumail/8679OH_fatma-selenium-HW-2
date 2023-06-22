package test_app;

import AddItem.AddItemToCart;
import Register.RegisterPage;
import app.pom.homepage.Homepage;
import base.BasePage;
import deleteItem.DeleteItemFromShoppingCart;
import login_page.LoginPage;
import login_page.LoginPageWIthInvalidCredentials;
import login_page.WelcomeLoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.log.model.ViolationSetting;
import org.testng.Assert;
import org.testng.annotations.Test;
import search_page.SearchBar;

import java.util.Optional;

public class TestApp extends BasePage {

    @Test(priority = 0, groups = {"BAT"})
    public void testNavigationToApplication() {
        Homepage homepage = new Homepage();

        Assert.assertTrue(isElementVisible(homepage.logo));


    }
    @Test(priority = 1, groups ={"BAT"})
    public void RegisterPageInApplication(){
        RegisterPage registerPage=new RegisterPage();
        Assert.assertTrue(isElementVisible(registerPage.registerPageCreated));

    }

    @Test(priority = 2,groups = {"BAT"})
    public void LoginPageWithValidCredentials() {
        LoginPage loginPage = new LoginPage();
        String validEmail = "sarafaty07@gmail.com";
        String validPassword = "Fatma2023";
        Assert.assertTrue(isElementVisible(loginPage.loginLink));

    }
    @Test(priority = 3,groups = {"BAT"})
    public void LoginPageWithInvalidCredentials(){
        LoginPageWIthInvalidCredentials loginPageWIthInvalidCredentials=new LoginPageWIthInvalidCredentials();
        String invalidEmail="nor@gmail.com";
        String invalidPassword="Abc123";
        Assert.assertTrue(isElementVisible(loginPageWIthInvalidCredentials.loginLink));

    }

    @Test(priority = 4,groups = {"BAT"})

    public void SearcgBar(){
        SearchBar searchBar = new SearchBar();
        Assert.assertTrue(isElementVisible(searchBar.driver.findElement
                (By.xpath("//input[@id=\"search\"]"))));
    }
    @Test(priority = 5,groups = {"BAT"})
    public void addItemToCart(){
       AddItemToCart addItemToCart=new AddItemToCart();
        addItemToCart.addItemToCart("Jackets");
        Assert.assertTrue(isElementVisible(AddItemToCart.driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img"))));

    }
    @Test(priority = 6,groups = {"BAT"})
    public void DeleteItemFromShoppingCart() {
        Homepage homepage = new Homepage();

        DeleteItemFromShoppingCart deleteItemFromShoppingCart = new DeleteItemFromShoppingCart();
        Assert.assertTrue(isElementVisible(deleteItemFromShoppingCart.deletedItemResultText));


    }
    @Test(priority = 7,groups = {"BAT"})
    public void WelcomeLoginPage(){
        WelcomeLoginPage welcomeLoginPage=new WelcomeLoginPage();
        Assert.assertTrue(isElementVisible(welcomeLoginPage.getVisibleElement(By.xpath("//div[@class=\"panel header\"]//span[@class=\"logged-in\"]"))));

    }

    }







