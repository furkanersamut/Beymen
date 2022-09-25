package locators;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {

    private WebDriver driver;
    private WebDriverWait wait;

    public Locator(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickById(String id)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.id(id)).click();
    }

    public void ClickByXpath(String xpath)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath(xpath)).click();
    }
    public void Clear(String xpath)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath(xpath)).clear();
    }

    public void ClickByName(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.name(name)).click();
    }

    public void ClickByClassName(String className)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.className(className)).click();
    }

    public void ClickByCssSelector(String cssSelector)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.cssSelector(cssSelector)).click();
    }
    //------------------------------------------------------------------
    public void SendById(String id,String text)
    {

        driver.findElement(By.id(id)).clear();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.id(id)).sendKeys(text);
    }

    public void SendByXpath(String xpath,String text)
    {
        driver.findElement(By.xpath(xpath)).clear();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public void SendByName(String name,String text)
    {
        driver.findElement(By.name(name)).clear();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.name(name)).sendKeys(text);
    }

    public void SendByClassName(String className,String text)
    {
        driver.findElement(By.className(className)).clear();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.className(className)).sendKeys(text);
    }

    public void SendByCssSelector(String cssSelector,String text)
    {
        driver.findElement(By.cssSelector(cssSelector)).clear();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.cssSelector(cssSelector)).sendKeys(text);
    }

    //---------------------------------------------------------------------
    public String GetTextById(String id)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return driver.findElement(By.id(id)).getText();
    }
    public String Clean(String id)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return driver.findElement(By.id(id)).getText();
    }

    public String GetTextByXpath(String xpath)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public String GetTextByName(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return driver.findElement(By.name(name)).getText();
    }

    public String GetTextByClassName(String className)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return driver.findElement(By.className(className)).getText();
    }

    public String GetTextByCssSelector(String cssSelector)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return driver.findElement(By.cssSelector(cssSelector)).getText();
    }

    public void sleep(int second) {
        try {
            Thread.sleep(second);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


    public Boolean IsDisplayed(String xpath)
    {
        WebDriverWait wait = new WebDriverWait(driver, 20);

        return driver.findElement(By.xpath(xpath)).isDisplayed();

    }
    public void KeysENTER(String xpath){
        driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);


    }


}
