package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.baseclass;

public class Cartpage {
	
	WebDriver driver;
	ExtentReports report;
    ExtentTest test;
	
	@FindBy(id="item_1_title_link")
	WebElement productname;
	
	 public Cartpage ()
	    
	    {
		    driver = baseclass.driver;
		    report = baseclass.report;
		    test = baseclass.test;
		    PageFactory.initElements(driver, this);
	    }
	
public void verifyproduct(String product) {
	
	String ActMsg = productname.getText();
    String ExpMsg = product;
            
    Assert.assertTrue(productname.isDisplayed());
    System.out.println(productname.getText());
    System.out.println(product);
}

}
