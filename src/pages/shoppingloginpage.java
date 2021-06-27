package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.baseclass;

public class shoppingloginpage {
	
	WebDriver driver;
	ExtentReports report;
    ExtentTest test;
    
   // =======================WebElements==============================
    @FindBy(id="user-name")
    WebElement username;
    
    @FindBy(id="password")
    WebElement Password;
    
    @FindBy(id="login-button")
    WebElement Login;
    
    public shoppingloginpage()
    {
    driver = baseclass.driver;
    report = baseclass.report;
    test = baseclass.test;
    PageFactory.initElements(driver, this);
    }
    
    public void  login(String uname, String pass)
    {
    	
    	username.sendKeys(uname);
    	Password.sendKeys(pass);
    	Login.click();
    }

}
