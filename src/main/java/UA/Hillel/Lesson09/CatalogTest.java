package UA.Hillel.Lesson09;

public class CatalogTest {
  public static void main(String[] args) {
    CatalogPage catalogPage = new CatalogPage();
    CatalogPage.ProductTable productTable = catalogPage.new ProductTable();

    productTable.getProductName();

    catalogPage.filterByName("product1");
    catalogPage.filterByStatus(AppValues.ProductStatuses.NEW);

    productTable = catalogPage.new ProductTable();
    productTable.getProductName();
  }
}
