package xpaths;

public interface BasketConstants {
    public String basketPrice="//li[@class='m-orderSummary__item -grandTotal']//span[@class='m-orderSummary__value']";
    public String unit="//*[@id='quantitySelect0-key-0']";
    public String deleteButton="removeCartItemBtn0-key-0";
    public String emptyBasket="(//*[@class='m-empty__messageTitle'])[1]";
}
