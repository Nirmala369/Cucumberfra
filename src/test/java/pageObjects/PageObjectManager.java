package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public Borrowpage borrowpage;

	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	
	public Borrowpage getBorrowpage()
	{

		borrowpage= new Borrowpage(driver);
	 return borrowpage;
	}

}
