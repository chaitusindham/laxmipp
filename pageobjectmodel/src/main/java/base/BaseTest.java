package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.*;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseTest
{
    public static WebDriver driver;
    public static Properties prop;
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static LoginPage loginPage;
    public static ElectronicsPage electronicsPage;
    public static CellphonesPage cellphonesPage;
    public static Buildcomputerpage buildcomputerpage;


    @BeforeAll
    public static void setup()
        {
            prop = new Properties();
            try
            {
                FileInputStream fs = new FileInputStream("src/main/java/configaration/data.properties");
                prop.load(fs);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to(prop.getProperty("url"));
            homePage =new HomePage(driver);
            registerPage = new RegisterPage(driver);
            loginPage = new LoginPage(driver);
            electronicsPage =new ElectronicsPage(driver);
            cellphonesPage=new CellphonesPage(driver);
            buildcomputerpage =new Buildcomputerpage(driver);

        }

      @AfterAll
      public static void teardown()
      {
        driver.quit();
      }


}
