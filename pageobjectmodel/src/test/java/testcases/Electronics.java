package testcases;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Electronics extends BaseTest
{
    String homepageExpectedTitle =prop.getProperty("homepageExpectedTitle");
    String homepageActualTitle;

    String electronicspageExpectedTitle = prop.getProperty("electronicspageExpectedTitle");
    String electronicspageActualTitle;

    String cellphonepageExpectedtitle = prop.getProperty("cellphonepageExpectedtitle");
    String  cellphonepageAtualtitle;
    @Test
    public void cellphones()
    {

         homepageActualTitle = registerPage.getPageTitle();
         Assertions.assertEquals(homepageExpectedTitle,homepageActualTitle);

         homePage.clickingelectronics();

         electronicspageActualTitle = electronicsPage.getPageTitle();
          Assertions.assertEquals(electronicspageExpectedTitle,electronicspageActualTitle);

          electronicsPage.clickingcellphonelink();

    }

}

