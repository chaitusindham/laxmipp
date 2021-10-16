package testcases;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Addtocart extends BaseTest
{
    String homePageExpectedTitle = prop.getProperty("homePageExpectedTitle");
    String homePageActualTitle;

    @Test
    public void addtocart()
    {
        homePageActualTitle = registerPage.getPageTitle();
        Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);

        homePage.clickbuildcomputer();
        buildcomputerpage.clickingaddtocart();
        buildcomputerpage.selectingram(prop.getProperty("ram"));
        buildcomputerpage.clickradiobutton();
        buildcomputerpage.clickingaddtocart();

        System.out.println(buildcomputerpage.grabtext());



    }




}
