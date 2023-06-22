package search_page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchBar extends BasePage {
    @FindBy(xpath = "//span[@class=\"base\"]")
    public WebElement textSearch;
    public SearchBar(){
        PageFactory.initElements(driver,this);
    }

    public WebElement getTextSearch() {
        return textSearch.findElement(By.xpath("//input[@id=\\\"search\\\"]"));
    }



}
