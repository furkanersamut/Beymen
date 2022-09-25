package pages;


import locators.Locator;
import xpaths.HomeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.IOException;
import java.io.File;
import jxl.read.biff.BiffException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;


public class HomePage extends Locator implements HomeConstants {

    private WebDriverWait wait;
    private WebDriver driver;


    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);

    }

    public void UrlControl() {

        sleep(1000);
        Assert.assertEquals("https://www.beymen.com/", driver.getCurrentUrl());

    }

    public void ClickSearchBox() {
        sleep(6000);
        ClickByXpath(searchBox);
    }

    public void whatUWannaSearch(String search) {
        sleep(1000);
        SendByXpath(searchBox, search);
    }

    public void ClearSearchBox() {
        sleep(2000);
        Clear(searchBox);

    }

    public void KeyEnter() {
        sleep(1000);
        KeysENTER(searchBox);

    }

    public void ChooseProduct() {
        sleep(1000);
        ClickByXpath(choiceShirt);

    }

    public void ClickEmptyPlace() {
        sleep(1000);
        ClickByXpath(emptyPlace);
    }

    public ProductPage productPage() {

        sleep(1000);

        return new ProductPage(driver);


    }


    public String setExcelFileLocation() {
        String excelFilePath = "C:\\Users\\furkan.ersamut\\MyWorks\\Beymen\\beymen.xls";
        return excelFilePath;
    }


    public String ReadFromExcel(String cell) throws IOException, BiffException {
        File FileExcel = new File(setExcelFileLocation());
        Workbook workbook = Workbook.getWorkbook(FileExcel);
        Sheet ExcelPage = workbook.getSheet(0);


        if (cell.equalsIgnoreCase("1")){
            Cell excelCell = ExcelPage.getCell(0, 0);
            String firstProductToSearch = excelCell.getContents();
            System.out.println(firstProductToSearch);
            return firstProductToSearch;
        }else if(cell.equalsIgnoreCase("2")) {
            sleep(1000);
            Cell excelCell1 = ExcelPage.getCell(1, 0);
            String lastProductToSearch = excelCell1.getContents();
            System.out.println(lastProductToSearch);
            return lastProductToSearch;
        }else return "excel seçeneği bulunamadı";


    }

}