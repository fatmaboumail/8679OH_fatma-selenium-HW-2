package deleteItem;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteItemFromShoppingCart extends BasePage {


    @FindBy(xpath = "//div[@class=\"minicart-wrapper\"]")
    public WebElement ButtonShoppingCart;
    @FindBy(xpath = "//span[@class=\"product-image-wrapper\"]")
    public WebElement ClickOnItemWanted;
    @FindBy(xpath = "//a[@class=\"action delete\"]")
    public WebElement ClickOnDeleteButton;
    @FindBy(xpath = "//button[@class=\"action-primary action-accept\"]")
    public WebElement ClickOnOkButton;
    @FindBy(xpath = "//strong[@class=\"subtitle empty\"]")
    public WebElement deletedItemResultText;

    public DeleteItemFromShoppingCart() {
        PageFactory.initElements(driver,this);
    }

    public  void ClickShoppingCart(){
        safeClickOnElement(ButtonShoppingCart);
    }
    public void ClickOnItem(){
        safeClickOnElement(ClickOnItemWanted);
    }
    public void ClickOnDeleteButton(){
        safeClickOnElement(ClickOnDeleteButton);
    }
    public void ClickOnOkButton(){
        safeClickOnElement(ClickOnOkButton);
    }
    public void DeleteItemFromShoppingCart(){
        ClickShoppingCart();
        ClickOnItem();
        ClickOnDeleteButton();
        ClickOnOkButton();

    }
}
