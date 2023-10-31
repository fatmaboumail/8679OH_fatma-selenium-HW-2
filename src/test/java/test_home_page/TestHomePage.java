package test_home_page;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BasePage {
  @Test
    public void testNavigationToApplication(){
      HomePage homePage=new HomePage();
      Assert.assertTrue(isElementVisible(homePage.logo));
  }

}
