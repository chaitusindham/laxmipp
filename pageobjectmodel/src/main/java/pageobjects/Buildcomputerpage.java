package pageobjects;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Buildcomputerpage extends BaseTest
{
    WebDriver driver;

    //Webelements

    @FindBy(id = "product_attribute_2")
    public WebElement selectingram;
    @FindBy(id = "product_attribute_3_6")
    public WebElement radiobuttongb;

    @FindBy(id = "add-to-cart-button-1")
    public WebElement addtocart;
    @FindBy(xpath = "//p[text()=\"The product has been added to your \"]")
    public WebElement shoppingcarttext;




    //constructor
    public Buildcomputerpage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);//initialiing pagefactory

    }

    //actions

    public void selectingram(String ram)
    {
        Select select = new Select(selectingram);
        select.selectByVisibleText(ram);
    }
    public void clickradiobutton()    {        radiobuttongb.click();    }
    public void clickingaddtocart()
    {
        addtocart.click();
    }
    public String grabtext()
    {
        return shoppingcarttext.getText();
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }
}
