package pages;


import locators.Locator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import xpaths.HomeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

import java.io.File;

import jxl.read.biff.BiffException;

import java.io.IOException;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


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
        sleep(1000);
        ClickByXpath(searchBox);
    }

    public void whatUWannaSearch(String search) {
        sleep(1000);
        SendByXpath(searchBox, search);
    }

    public void ClearSearchBox() {
        sleep(1000);
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

//        public void ReadExcell () throws IOException{
//
//            String excelFilePath = "C:\\Users\\furkan.ersamut\\MyWorks\\Beymen\\beymen.xlsx";
//            FileInputStream inputstream = new FileInputStream(excelFilePath);
//            XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
//            XSSFSheet sheet = workbook.getSheetAt(0);
//            System.out.println(sheet);
//
//            String a="A";
//            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
//            {
//                CellReference cellReference = new CellReference(a+i);
//                Row row = xssfSheet.getRow(cellReference.getRow());
//
//                //your Logic
//            }
//        }

    public String setExcelDostaYolu() {
        String excelFilePath = "C:\\Users\\furkan.ersamut\\MyWorks\\Beymen\\beymen.xls";
        return excelFilePath;
    }

    //Excelden okuma işlemi yapacak olan metod.
    public String ExceldenOku(String cell) throws IOException, BiffException {
//Verilen dosya yoluna göre bir dosya oluşturuyor.
        File DosyaExcel = new File(setExcelDostaYolu());
//Excel ‘den calisma kitabını alıyoruz.
        Workbook CalismaKitabi = Workbook.getWorkbook(DosyaExcel);
//Aldığımız çalışma kitabı yani çalışma alanından ilk excel sayfasını alıyoruz.
        Sheet ExcelSayfasi = CalismaKitabi.getSheet(0);
//Aldığımız sayfadaki excel hücrelerini for döngüsü içinde okuyacağız.
        Cell Hucre2 = ExcelSayfasi.getCell(0, 0);
        String d = Hucre2.getContents();
        System.out.println(d);
        Cell Hucre3 = ExcelSayfasi.getCell(1, 0);
        String c = Hucre3.getContents();
        System.out.println(c);
        if (cell.equalsIgnoreCase("1")){
            Cell Hucre = ExcelSayfasi.getCell(0, 0);
            String a = Hucre.getContents();
            System.out.println(a);
            return a;
        }else if(cell.equalsIgnoreCase("2")) {
            Cell Hucre1 = ExcelSayfasi.getCell(1, 0);
            String b = Hucre1.getContents();
            System.out.println(b);
            return b;
        }else return "excel seçeneği bulunamadı";


//        for (int j = 0; j < ExcelSayfasi.getColumns(); j++) {//excel sayfasının sütunlarının sayısına kadar
//
//            for (int i = 0; i < ExcelSayfasi.getRows(); i++) {//excel sayfasının satırlarının sayısına kadar.
//
//                Cell Hucre = ExcelSayfasi.getCell(j, i);//Bir hücre oluştur.Bu hücreyi excel sayfasından al.
//
//                System.out.println(i + ".satir degeri: " + Hucre.getContents());//Aldığın hücrenin içeriğini yazdır.
//
//
//            }
//
//            System.out.println();
//
//        }

//okuma işlemi bitti diye ekrana mesaj ver.



    }

}