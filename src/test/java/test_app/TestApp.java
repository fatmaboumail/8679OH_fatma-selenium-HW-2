package test_app;

import app.pom.addItem.AddItemToCart;
import app.pom.contact_page.ContactPage;
import app.pom.modify_cart_page.ModifyCartPage;
import app.pom.register.RegisterPage;
import app.pom.home_page.Homepage;
import app.pom.search_result_page.SearchResultPage;
import base.BasePage;
import app.pom.deleteItem.DeleteItemFromShoppingCart;
import app.pom.login_page.LoginPage;
import app.pom.login_page.LoginPageWIthInvalidCredentials;
import app.pom.login_page.WelcomeLoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import app.pom.search_page.SearchBar;

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
        Homepage login =new Homepage();
        LoginPage loginPage=new LoginPage();
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
    @Test(priority = 8,groups = {"BAT"})
    public void SearchResultPage(){
        SearchResultPage searchResultPage =new SearchResultPage();
        Assert.assertTrue(isElementVisible(getVisibleElement(By.xpath("//div[@class=\"product-item-info\"]//span[@class=\"product-image-container\"]"))));
    }
    @Test(priority = 9,groups = {"BAT"})
    public void ModifyCartPage(){

        ModifyCartPage add=new ModifyCartPage();
        Assert.assertTrue(isElementVisible(ModifyCartPage.driver.findElement(By.xpath("//a[@class=\"action order\"]"))));
    }
    @Test(priority = 10,groups = {"BAT"})
    public void ContactPage(){
        ContactPage page=new ContactPage();
        String name="fatma";
        String email="sarafaty07@gmail.com";
        String phoneNumber="1234567889";
        String commit= "Thank you";
        page.doContactUs(name,email,phoneNumber,commit);
        Assert.assertTrue(isElementVisible(page.Message));
    }

    }







