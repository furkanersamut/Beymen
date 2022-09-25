package tests;

import jxl.read.biff.BiffException;
import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import users.SearchInformation;
import users.SearchingPool;

import java.io.IOException;

public class AddBasketCaseTest extends InitialTest {

    WebDriverWait wait;
    WebDriver driver;

    @Test
    public void add_basket_item_and_clean() throws IOException, BiffException {

        logger.info("Case 1 : When add item to basket and delete item");
        homePage.UrlControl();
        homePage.ClickSearchBox();
//        SearchInformation searchInformation = SearchingPool.getSearchFirst();
        homePage.whatUWannaSearch(homePage.ExceldenOku("1"));
        homePage.ClickEmptyPlace();
        homePage.ClearSearchBox();
        homePage.ClickSearchBox();
//        searchInformation = SearchingPool.getSearchSecond();
        homePage.whatUWannaSearch(homePage.ExceldenOku("2"));
        homePage.KeyEnter();
        homePage.ChooseProduct();
        ProductPage productPage = homePage.productPage();
        productPage.SaveProductInfoInTxt();
        String firstPrice = productPage.GetProductPrice();
        productPage.ChooseSize();
        productPage.ClickAddBasketButton();
        productPage.GoToBasket();
        BasketPage basketPage = productPage.basketPage();
        basketPage.ComparePrice(firstPrice);
//        basketPage.ClickUnitSelectBox();
        basketPage.SelectBoxUnit();
        basketPage.IncreaseUnitCompare(firstPrice);
        basketPage.ClickDeleteButton();
        basketPage.EmptyBasketText();
    }

}