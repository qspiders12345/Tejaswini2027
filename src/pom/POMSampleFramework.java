package pom;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class POMSampleFramework extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstNameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastNameTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement userNameTextfield;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailIDTextfield;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement maleRadioButton;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement femaleRadioButton;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement rememberMeCheckbox;
	
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement countryCodeDropDownList;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobileNoTextfield;
	
	@FindBy(xpath="//textarea")
	private WebElement addressTextarea;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	
	public POMSampleFramework(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void submit() throws IOException
	{
		firstNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 0));
		lastNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1",1, 1));
		userNameTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1",1, 2));
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 3));
		emailIDTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 4));
		maleRadioButton.click();
		rememberMeCheckbox.click();
		visibleText(countryCodeDropDownList, "+852");
		mobileNoTextfield.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1", 1, 5));
		addressTextarea.sendKeys(ExcelLibrary.getCellValue(excel_path, "Sheet1",1, 6));
		saveButton.click();
	}
}