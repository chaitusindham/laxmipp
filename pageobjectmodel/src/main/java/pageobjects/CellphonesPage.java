package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellphonesPage
{
    WebDriver driver;

    @FindBy(xpath = "//a[contains(@href,'/nokia-lumia-1020')][2]")
    public WebElement nokiaphonelink;


    public CellphonesPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

   public void clicknokialink()
   {
       nokiaphonelink.click();
   }


}
