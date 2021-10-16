package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
    WebDriver driver;
    //Webelements
    @FindBy(linkText ="Register")
    public WebElement registerlink;

    @FindBy(linkText = "Log in")
    public WebElement loginlink;

    @FindBy(css = "span.wishlist-label")
     public   WebElement wishlistlink;

    @FindBy(className = "cart-label")
    public WebElement shoppingcartlink;


    @FindBy(id = "small-searchterms")
    public WebElement searchTextBox;

    @FindBy(className = "button-1 search-box-button")
    public WebElement searchbutton;

    @FindBy(linkText = "Log out")
    public WebElement logoutLink;

    @FindBy(id="pollanswers-1")
    public WebElement excellentbutton;

    @FindBy(id="vote-poll-1")
    public WebElement votebutton;

    @FindBy(xpath="//div[contains(text(),'Only registered users')]")
    public WebElement grabingtext;

     @FindBy(linkText = "Electronics ")
     public WebElement electronicslink;

     @FindBy(linkText = "Build your own computer")
      public WebElement buildcomputerlink;


   //using constructor
    public HomePage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);//initialiing pagefactory
    }

    //actions
    public void clickRegisterlink()
    {
        registerlink.click();
    }

    public void clickloginlink()
    {
        loginlink.click();
    }

    public void clickwishlistlink()
    {
        wishlistlink.click();
    }
    public void clickShoppingCartLink()
    {
        shoppingcartlink.click();
    }

    public void enterSearchText(String searchText)
    {
        searchTextBox.sendKeys(searchText);
    }

    public void clicksearchbutton()
    {
        searchbutton.click();
    }
    public void pageRefresh()
    {
        driver.navigate().refresh();
    }

    public void clickLogoutLink()
    {
        logoutLink.click();
    }

    public void clickexcellentbutton()
    {
        Actions actions =new Actions(driver);
        actions.moveToElement(excellentbutton).perform();
        excellentbutton.click();
    }
    public void waitforvote()
    {
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(votebutton));
    }
    public void clickvotebutton()
    {
        votebutton.click();
    }
    public void clickbuildcomputer()
    {
        buildcomputerlink.click();
    }
    public void waitfortext()
    {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Only registered users ')])")));
    }
    public String verifyingtext()
    {
         return grabingtext.getText();
    }

    public void clickingelectronics()
    {
        electronicslink.click();
    }

    public void waitForLoginClickable()
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(loginlink));
    }

    public void waitForLogoutClickable()
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
    }


}
