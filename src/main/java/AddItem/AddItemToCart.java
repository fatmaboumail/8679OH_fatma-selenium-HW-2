package AddItem;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItemToCart extends BasePage {



    @FindBy(xpath = "//input[@id=\"search\"]")
    public WebElement inputSearchBar;
    @FindBy(xpath = "//button[@class=\"action search\"]")
    public WebElement ButtonActionSearch;
    @FindBy(xpath = "//span[@class=\"base\"]")
    public WebElement wantedItem;
    @FindBy(id = "//div[@id=\"option-label-size-143-item-168\"]")
    public WebElement sizeBox;
    @FindBy(id = "//div[@id=\"option-label-color-93-item-57\"]")
    public WebElement colorBox;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement addToCartButton;
    public AddItemToCart(){
        PageFactory.initElements(driver,this);
    }

    public void setInputSearchTerm(String searchTerm) {
        clearSendKeysToElement(inputSearchBar,searchTerm);

    }
    public void ClickActionSearchButton(){
        safeClickOnElement(ButtonActionSearch);

    }
    public void ClickOnItem(){
        safeClickOnElement(wantedItem);
    }
    public void SelectSize(){
        safeClickOnElement(sizeBox);
    }
    public void selectColor(){
        safeClickOnElement(colorBox);
    }
    public void ClickOnAddCartButton(){
        safeClickOnElement(addToCartButton);
    }
    public void addItemToCart(String SearchTerm){
        setInputSearchTerm(SearchTerm);
        ClickActionSearchButton();
        ClickOnItem();
        SelectSize();
        selectColor();
        ClickOnAddCartButton();


    }



}
