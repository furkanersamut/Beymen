package pages;


import locators.Locator;
import xpaths.ProductConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ProductPage extends Locator implements ProductConstants {

    private WebDriverWait wait;
    private WebDriver driver;


    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }

    public void SaveProductInfoInTxt() throws IOException {
        sleep(1000);
        String str = GetTextByXpath(productInformation);
        File file = new File("dosya.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.write(str);
        bWriter.close();

   }

    public void ChooseSize(){
        sleep(1000);
        ClickByXpath(productSize);

    }
    public void ClickAddBasketButton(){
        sleep(1000);
        ClickById(addBasket);

    }
    public BasketPage basketPage() {
        sleep(3000);
        return new BasketPage(driver);
    }

   public String GetProductPrice(){
       sleep(1000);
        return GetTextById(productPrice);
   }
   public void GoToBasket(){
       sleep(1000);
        ClickByXpath(basket);

   }


}