package pages;

import locators.Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import xpaths.BasketConstants;


public class BasketPage extends Locator implements BasketConstants {

    private WebDriverWait wait;
    private WebDriver driver;
    private ProductPage productPage;

    public BasketPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }

    public void ComparePrice(String firstPrice) {
        sleep(1000);
        Assert.assertEquals(firstPrice, GetTextByXpath(basketPrice));

    }

    public void ClickUnitSelectBox() {
        sleep(1000);
        ClickByXpath(unit);

    }

    public void SelectBoxUnit() {
        sleep(1000);
        Select selectUnit = new Select(driver.findElement(By.xpath(unit)));
        selectUnit.selectByValue("2");

    }

    public void IncreaseUnitCompare(String firstPrice) {
        sleep(1000);
        String str = firstPrice;
        str = str.replaceAll("\\D+", "");
        int firstSituation = Integer.valueOf(str);
        System.out.println(firstSituation);

        String str2 = GetTextByXpath(basketPrice);
        str2 = str2.replaceAll("\\D+", "");
        int lastSituation = Integer.valueOf(str2);
        System.out.println(lastSituation);

        Assert.assertEquals(firstSituation * 2, lastSituation);
    }

    public void ClickDeleteButton() {
        sleep(1000);
        ClickById(deleteButton);
    }

    public void EmptyBasketText() {
        sleep(1000);
        Assert.assertEquals("SEPETINIZDE ÜRÜN BULUNMAMAKTADIR", GetTextByXpath(emptyBasket));
    }

}