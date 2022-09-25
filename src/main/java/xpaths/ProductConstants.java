package xpaths;

public interface ProductConstants {
    public String productInformation="//*[text()='Ürün Özellikleri']/following-sibling::div[@class='m-productDescription__infoDesc']";
    public String productSize="(//div[@class='m-variation']//span[not(@class='m-variation__item -disabled')])[1]";
    public String addBasket="addBasket";
    public String productPrice="priceNew";
    public String basket="//*[@class='icon icon-cart icon-cart-active']";
}
