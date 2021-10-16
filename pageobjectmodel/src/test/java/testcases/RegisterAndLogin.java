package testcases;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterAndLogin extends BaseTest
{

        String homePageExpectedTitle = prop.getProperty("homePageExpectedTitle");
        String homePageActualTitle;

        String loginPageExpectedTitle = prop.getProperty("loginPageExpectedTitle");
        String loginPageActualTitle;

        @Test
        public void registerUser()
        {

            homePageActualTitle = registerPage.getPageTitle();
            Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle); // assert equals

            homePage.clickRegisterlink();

            homePage.pageRefresh();

            registerPage.clickfemaleradiobutton();

            registerPage.enterfirstnametextbox(prop.getProperty("firstname"));
            registerPage.enterLastName(prop.getProperty("lastname"));
            registerPage.enterEmail(prop.getProperty("email"));
            registerPage.enterPassword(prop.getProperty("password"));
            registerPage.enterConfPassword(prop.getProperty("password"));
            registerPage.selectDate(prop.getProperty("date"));
            registerPage.selectmonth(prop.getProperty("month"));
            registerPage.selectyear(prop.getProperty("year"));

            registerPage.clickRegisterButton();

            System.out.println(registerPage.verifyConfMessage());

            homePage.waitForLogoutClickable();

            homePage.clickLogoutLink();

        }
        @Test
        public void login()
        {
            homePageActualTitle = registerPage.getPageTitle();
            Assertions.assertEquals(homePageExpectedTitle,homePageActualTitle);
            homePage.waitForLoginClickable();
            homePage.clickloginlink();
            loginPageActualTitle = registerPage.getPageTitle();
            Assertions.assertEquals(loginPageExpectedTitle,loginPageActualTitle);
            homePage.pageRefresh();
            loginPage.loginToNop(prop.getProperty("email"),prop.getProperty("password"));
        }
}
