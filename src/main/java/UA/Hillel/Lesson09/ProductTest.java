package UA.Hillel.Lesson09;

public class ProductTest {
  public void testProductCreation() {

    Product product1 = new Product();
    product1.name = "name 1";
    product1.description = "desc1";
    product1.category = "note";
    product1.price = 1299;
    product1.discount = 2.5;

    //product 1
    createProduct("name 1","desc1" , "note", 1299);

    //product2
    createProduct("name 2", "desc2", "lap", 150.33);

  }

  private void createProduct (String name, String description, String category, double price){
    ProductsDetailPage productsDetailPage = new ProductsDetailPage();
    productsDetailPage.setProductName(name);
    productsDetailPage.setDescription(description);
    productsDetailPage.setCategory(category);
    productsDetailPage.setPrice(price);
  }

  private void createProduct (Product product){
    ProductsDetailPage productsDetailPage= new ProductsDetailPage();
    productsDetailPage.setProductName(product.name);
    productsDetailPage.setDescription(product.description);
    productsDetailPage.setCategory(product.category);
    productsDetailPage.setPrice(product.price);

  }

  static class Product {
    String name;
    String description;
    String category;
    double price;
    double discount;

    public String getName(){
      return name;
    }
  }
}
