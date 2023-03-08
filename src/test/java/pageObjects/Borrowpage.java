package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Borrowpage {
    public WebDriver driver;

    public Borrowpage(WebDriver driver)
    {
        this.driver = driver;

    }
    By single = By.cssSelector("label[for='application_type_single']");
    By zerodepen = By.cssSelector("select[title='Number of dependants']");

    By annualincome = By.cssSelector("select[title='Number of dependants']");
    By otherincome = By.cssSelector("input[value='0'][type='text'][aria-labelledby='q2q2']");

    By livingexpense = By.cssSelector("#expenses");
    By homeloanrepayment = By.cssSelector("#homeloans");
    By othercommit = By.cssSelector("input[value='0'][type='text'][aria-labelledby='q3q4']");
    By creditcardlimit = By.cssSelector("#credit");
    By borrowestima = By.cssSelector("#btnBorrowCalculater");
    By startover=By.cssSelector("button[fdprocessedid='rnomi']");

    By finalestimatedborrow=By.cssSelector(" #borrowResultTextAmount");

    public void selectSingleType()
    {
        driver.findElement(single).click();
    }
    public void selectzerodepen()
    {
        driver.findElement(zerodepen).getText();
    }

    public void getannualincome(String valannualincome)
    {
        driver.findElement(annualincome).sendkeys(valannualincome);

    }
    public void getotherincome(String valotherincome)
    {
        driver.findElement(otherincome).sendkeys(valotherincome);

    }
    public void getlivingexpense(String vallivingexpense)
    {
        driver.findElement(livingexpense).sendkeys(vallivingexpense);

    }
    public void gethomeloanrepayment(String valhomeloanrepayment)
    {
        driver.findElement(homeloanrepayment).sendkeys(valhomeloanrepayment);

    }
    public void getothercommit(String valothercommit)
    {
        driver.findElement(othercommit).sendkeys(valothercommit);

    }
    public void getcreditcardlimit(String 10000)
    {
        driver.findElement(creditcardlimit).sendkeys(10000);

    }
    public String getuserborrowestimate()
    {
        driver.findElement(borrowestima).click();
        String valfinalestimatedborrow=driver.findElement(finalestimatedborrow).getText();
        return valfinalestimatedborrow

    }
    public String clickstartover()
    {
        driver.findElement(startover).click();
        String startoverestimatedborrow=driver.findElement(finalestimatedborrow).getText();
        return startoverestimatedborrowl;
    }






}
