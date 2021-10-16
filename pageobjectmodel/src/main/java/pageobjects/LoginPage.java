package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;



    @FindBy(id="gender-male")
    public WebElement maleRadioButton;


    @FindBy(id="gender-female")
    public WebElement femaleRadioButton;


    @FindBy(id="FirstName")
    public WebElement firstNameTextBox;


    @FindBy(id="Email")
    public WebElement emailTextBox;

    @FindBy(id="Password")
    public WebElement passwordTextBox;


    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement loginButton;


    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void loginToNop(String em,String pw)
    {
        emailTextBox.sendKeys(em);
        passwordTextBox.sendKeys(pw);
        loginButton.click();
    }






}
