package org.akiko.presencelearning.assignment.plpatternlibpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class PLPatternLibraryPageUtil
{
	private WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css = ".blue")
	private WebElement toggleFilterBtn;
	
	@FindBy(css = ".pl-table-filter-row")
	private WebElement firstFilterRow;
	
	@FindBy(xpath = "html/body/main/div/div/section/div/div[2]/div/pl-table/div/div[1]/div[2]/div/div[1]/div/span[1]/div/div/div[1]/span")
	private WebElement categoryDropDown;
	
	@FindBy(xpath = "html/body/main/div/div/section/div/div[2]/div/pl-table/div/div[1]/div[2]/div/div[1]/div/span[1]/div/select")
	private WebElement categoryDropDownList;
	
	@FindBy(xpath = "html/body/main/div/div/section/div/div[2]/div/pl-table/div/div[1]/div[2]/div/div[1]/div/span[2]/span[1]/div/div/div[1]/span")
	private WebElement conditionDropDown;	
	
	@FindBy(xpath = "html/body/main/div/div/section/div/div[2]/div/pl-table/div/div[1]/div[2]/div/div[1]/div/span[2]/span[2]/pl-input-text/div/div/input")
	private WebElement textField;
	
	public void setWait(WebDriverWait w){
		wait = w;
	}
	
	public boolean showFirstFilterRow(){
		wait.until(ExpectedConditions.visibilityOf(toggleFilterBtn));
		toggleFilterBtn.click();		
		wait.until(ExpectedConditions.visibilityOf(firstFilterRow));
		return 	(categoryDropDown.isDisplayed() && conditionDropDown.isDisplayed() && textField.isDisplayed());
	}
	
	
	public boolean checkCategories(String category){
	    Select categories = new Select(categoryDropDownList);
	    List<WebElement> options = categories.getOptions();
	    for (WebElement option : options) {	    	
		   if (option.getAttribute("innerHTML").equals(category)){
			   return true;
		   }
	   }
	   return false;		
	}
	/*  For Test(Priority=3)
	public boolean checkCategoriesText(String category, String text){
		Select select = new Select(categoryDropDown);
		select.selectByVisibleText(category);
		return textField.getText() == text;
	}
	*/
	
	
}
