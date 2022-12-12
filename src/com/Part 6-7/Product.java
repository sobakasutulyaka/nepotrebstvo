package lesson6;

public class Product {

  String nameProduct;
  double cost;
  int count;

  Product(String nameProduct, double cost) {
    this.nameProduct = nameProduct;
    this.cost = cost;
  }

  @Override
  public String toString() {
    String result = nameProduct + " in an amount " + count + ". Cost "  + cost*count + " ₽.";
    return (result);
  }
}
