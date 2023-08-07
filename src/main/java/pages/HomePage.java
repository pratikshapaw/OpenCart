package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@class='nav-item']//*[text()='Tablets']")WebElement tablets;
	@FindBy(xpath="(//*[@type='submit'])[1]")WebElement addtocart;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	public void validateTablets()
	{
		tablets.click();
	}
	public void addToCart() throws InterruptedException
	{
//		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(addtocart));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",addtocart);
	}

}
