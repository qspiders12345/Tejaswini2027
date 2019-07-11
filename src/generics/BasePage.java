package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage 
{
	public void visibleText(WebElement ele, String text)
	{
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void value(WebElement ele, String value)
	{
		Select sel=new Select(ele);
		sel.selectByValue(value);
	}
	
	public void index(WebElement ele, int index)
	{
		Select sel=new Select(ele);
		sel.selectByIndex(index);
	}
	
	public void click(WebElement ele, WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.click(ele).perform();
	}
}