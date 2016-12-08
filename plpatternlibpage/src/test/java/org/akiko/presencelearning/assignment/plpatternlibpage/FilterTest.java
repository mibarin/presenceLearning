package org.akiko.presencelearning.assignment.plpatternlibpage;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;



public class FilterTest {
	
	WebDriver driver;
	WebDriverWait wait;	
	PLPatternLibraryPageUtil pageUtil;
	
    @DataProvider(name = "categories")
	public String [][] createData(){
    	return new String [][]{
    	    new String [] {"First Name"}, 
		    new String [] {"Last Name"}, 
		    new String [] {"Birthdate"}, 
		    new String [] {"Status"},
		};
	} 
	

	@BeforeClass
    public void setUp()
    {
		driver = new FirefoxDriver();
        driver.get("https://patterns.presencelearning.com/table");
        driver.manage().deleteAllCookies();
        wait = new WebDriverWait(driver, 10);    
        pageUtil = PageFactory.initElements(driver, PLPatternLibraryPageUtil.class);
        pageUtil.setWait(wait);
    }
	
	@Test(priority=1)
	public void toggleFilterTest(){
		Assert.assertTrue(pageUtil.showFirstFilterRow());		
	}
	
	@Test(priority=2, dataProvider="categories")
	public void checkAllCategoryListed(String category){
		Assert.assertTrue(pageUtil.checkCategories(category));
	}
	
	/*
	 * @Test(priority=3, dataProvider="initialTexts")
	 * public void checkAllinitialTextsInField(text){
	 *     here, I intended to check the default text which appears in the text field 
	 *     upon selecting the new search category, such as "Enter First Name".
	 */
	
	@AfterClass
    public void tearDown(){
	   driver.quit();
   }
}