package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.baseclass;

public class shoppingcartpage {
	
	
		WebDriver driver;
		ExtentReports report;
	    ExtentTest test;
	    
	   // =======================WebElements==============================
	    @FindBy(id="add-to-cart-sauce-labs-backpack")
	    WebElement addcart;
	    
	    @FindBy(id="shopping_cart_container")
	    WebElement cartbutton;
	    
	   
	    public shoppingcartpage()
	    {
	    driver = baseclass.driver;
	    report = baseclass.report;
	    test = baseclass.test;
	    PageFactory.initElements(driver, this);
	    }
	    
	    public void selectproduct(String product)
	    {
	    	
	    	WebElement btnproductselect = driver.findElement(By.xpath("//*[text()='"+ product +"']//following::button[1]"));
	    	btnproductselect.click();
	    	
	    }
 
	    public void gotocart() 
	    {
		
		cartbutton.click();
	    }
	

}
