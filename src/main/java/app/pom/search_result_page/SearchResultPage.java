package app.pom.search_result_page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage {
    public SearchResultPage(){
        PageFactory.initElements(driver,this);
    }
    public List<WebElement>getSearchResults(){
        return driver.findElements(By.xpath("//div[@class=\"product-item-info\"]//span[@class=\"product-image-container\"]"));
    }
}
