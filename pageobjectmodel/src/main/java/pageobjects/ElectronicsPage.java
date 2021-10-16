package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage
{
    WebDriver driver;

    @FindBy(xpath = "//a[@href='/cell-phones'][1]")
    public WebElement cellphonelink;

    @FindBy(xpath ="//a[text()='HTC One Mini Blue']")
    public WebElement htcmobilelink;


//constructor
    public ElectronicsPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //actions
    public void clickingcellphonelink()
    {
        cellphonelink.click();
    }
    public void clickingmobile()
    {
        htcmobilelink.click();
    }
    public String getPageTitle()
    {
        return driver.getTitle();
    }


}
