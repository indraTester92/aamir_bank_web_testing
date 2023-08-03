package Bank_Web_Testing.bankPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.devtools.v109.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class BankRegistration_Page {
    WebDriver driver;

    public BankRegistration_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Register")
    WebElement register;

    @FindBy(id = "customer.firstName")
    WebElement fName;

    @FindBy(id = "customer.lastName")
    WebElement lName;

    @FindBy(id = "customer.address.street")
    WebElement address;

    @FindBy(id = "customer.address.city")
    WebElement city;

    @FindBy(id = "customer.address.state") 
    WebElement state;

    @FindBy(id = "customer.address.zipCode")
    WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    WebElement phone;

    @FindBy(id = "customer.ssn")
    WebElement ssn;

    @FindBy(id = "customer.username")
    WebElement userName;

    @FindBy(id = "customer.password")
    WebElement password;

    @FindBy(id = "repeatedPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//tr//td//input[@class='button']")
    WebElement registerSubmit;

    @FindBy(xpath = "//div[@id='bodyPanel']//div[@id='rightPanel']//h1")
    WebElement welcomeText;

    String UserName = "aamir_001";

    public void registerProfile()
    {
        register.click();

        fName.sendKeys("Aamir");
        lName.sendKeys("Alam");
        address.sendKeys("Neamatpur");
        city.sendKeys("Asansol");
        state.sendKeys("West Bengal");
        zipCode.sendKeys("713359");
        phone.sendKeys("9876543210");
        ssn.sendKeys("123");
        userName.sendKeys(UserName);
        password.sendKeys("aamir786");
        confirmPassword.sendKeys("aamir786");

        registerSubmit.click();
    }

    public void registerationCheck()
    {
        if(welcomeText.getText()==UserName)
        {
            System.out.println("Registration is successful!!!");
        }
        else
        {
            System.out.println("Registration is not successful!!!");
        }
    }
}
