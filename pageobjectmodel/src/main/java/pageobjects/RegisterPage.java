package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage
{
    WebDriver driver;
     @FindBy(id="gender-male")
     public WebElement maleradiobutton;

    @FindBy(id="gender-female")
    public WebElement femaleradiobutton;

    @FindBy(id="FirstName")
    public WebElement firstnametextbox;

    @FindBy(id="LastName")
    public WebElement lastnametextbox;

    @FindBy(name ="DateOfBirthDay")
    public WebElement daydropdown;

    @FindBy(name="DateOfBirthMonth")
    public WebElement monthdropdown;

    @FindBy(name = "DateOfBirthYear")
    public WebElement yeardropdown;

    @FindBy(id = "Email")
    public WebElement emailtextbox;

    @FindBy(id = "Password")
    public WebElement passwordtextbox;

    @FindBy(id="ConfirmPassword")
    public WebElement confirmtextbox;

    @FindBy(id="register-button")
    public WebElement registerButton;

    @FindBy(css = "div.result")
    public WebElement confText;


    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

// giving the actions for the webelements

     public void clickmaleradiobutton()
     {
         maleradiobutton.click();
     }

    public void clickfemaleradiobutton()
    {
        femaleradiobutton.click();
    }
    public void enterfirstnametextbox(String fn)
    {
        firstnametextbox.sendKeys(fn);
    }
    public void enterLastName(String ln)
    {
        lastnametextbox.sendKeys(ln);
    }

    public void enterEmail(String em)
    {
        emailtextbox.sendKeys(em);
    }
    public void enterPassword(String pw)
    {
        passwordtextbox.sendKeys(pw);
    }

    public void enterConfPassword(String cp)
    {
        confirmtextbox.sendKeys(cp);

    }
    public void clickRegisterButton()
    {
        registerButton.click();
    }

    public String verifyConfMessage()
    {
        return confText.getText();
    }

    public void selectDate(String date)
    {
        Select select = new Select(daydropdown);
        select.selectByVisibleText(date);
    }
    public void selectmonth(String month)
    {
        Select select =new Select(monthdropdown);
        select.selectByVisibleText(month);
    }
    public void selectyear(String year)
    {
        Select select=new Select(yeardropdown);
        select.selectByVisibleText(year);
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }
}





