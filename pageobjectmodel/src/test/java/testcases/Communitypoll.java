package testcases;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Communitypoll extends BaseTest
{
    String homePageExpectedTitle = prop.getProperty("homePageExpectedTitle");
    String homePageActualTitle;

    @Test
    public void communitypoll()
    {
        homePageActualTitle = registerPage.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);

        homePage.clickexcellentbutton();
        homePage.waitforvote();
        homePage.clickvotebutton();
        //homePage.pageRefresh();

       homePage.waitfortext();
        homePage.verifyingtext();
        System.out.println(homePage.verifyingtext());

    }
}
