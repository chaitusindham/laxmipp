package testcases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class Searchproduct  extends BaseTest
{
    @Test
    public void searchproducts()
    {
       homePage.enterSearchText(prop.getProperty("item1"));
       homePage.clicksearchbutton();

       homePage.enterSearchText(prop.getProperty("item2"));
       homePage.clicksearchbutton();
    }
}
