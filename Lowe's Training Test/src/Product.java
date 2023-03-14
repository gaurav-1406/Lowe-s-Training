public class Product {
  private int id;
  private String name;
  private int quantity;
  private double unitPrice;
  private int stock;
  
  public Product(int id, String name, int quantity, double unitPrice, int stock) {
    this.id = id;
    this.name = name;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.stock = stock;
  }
  
  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public double getUnitPrice() {
    return unitPrice;
  }
  
  public int getStock() {
    return stock;
  }
  
  public double calculateTotalCost() {
    return quantity * unitPrice;
  }
  
  public int calculateRemainingStock() {
    return stock - quantity;
  }
  
  public static void main(String[] args) {
    Product product = new Product(1, "Product 1", 5, 10.0, 20);
    System.out.println("Product ID: " + product.getId());
    System.out.println("Product Name: " + product.getName());
    System.out.println("Quantity: " + product.getQuantity());
    System.out.println("Unit Price: " + product.getUnitPrice());
    System.out.println("Stock: " + product.getStock());
    System.out.println("Total Cost: " + product.calculateTotalCost());
    System.out.println("Remaining Stock: " + product.calculateRemainingStock());
  }
}
