package app.pom.modify_cart_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyCartPage  extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    public WebElement addToCartButton;
    @FindBy(xpath = "//button[@id=\"product-addtocart-button\"]")
    public WebElement cartButton;
    @FindBy(xpath = "//a[@class=\"action delete\"]")
    public WebElement deleteButton;
    @FindBy(xpath = "//input[@type=\"number\"]")
    public WebElement quantityButton;
    @FindBy(xpath = "//a[@class=\"product-item-link\"]")
    public WebElement item;
    @FindBy(xpath = "//button[@title=\"Update\"]")
    public WebElement updateButton;

    public ModifyCartPage(){
        PageFactory.initElements(driver,this);
    }
    public void ClickOnElement(){safeClickOnElement(addToCartButton);}
    public void clickOnElement(){safeClickOnElement(cartButton);}
    public void ClickonElement(){safeClickOnElement(deleteButton);}
    public void clickElement(){safeClickOnElement(quantityButton);}
    public void ClickElement(){safeClickOnElement(item);}
    public void clickOnelement(){safeClickOnElement(updateButton);}

}


