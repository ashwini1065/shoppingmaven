package test;

import pages.shoppingloginpage;

import org.testng.annotations.Test;

import pages.Cartpage;
import pages.shoppingcartpage;

public class shoppingpage  extends baseclass
{
	
	@Test
	public void testcase1()
	{
		shoppingloginpage Loginobj = new shoppingloginpage();
		

		String uname =sheet.getRow(1).getCell(0).getStringCellValue();
		String pass =sheet.getRow(1).getCell(1).getStringCellValue();
		String product =sheet.getRow(1).getCell(2).getStringCellValue();

		Loginobj.login(uname,pass);
		
		shoppingcartpage cartobj = new shoppingcartpage();
	    cartobj.selectproduct(product);
	    cartobj.gotocart();
		Cartpage verifyobj = new Cartpage();		
		verifyobj.verifyproduct(product);
	}

}
