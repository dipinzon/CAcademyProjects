public class Store2 {
    // instance fields
    String productType;
    double price;
    
    // constructor method
    public Store2(String product, double initialPrice) {
      productType = product;
      price = initialPrice;
    }
    
    // increase price method
    public void increasePrice(double priceToAdd){
      double newPrice = price + priceToAdd;
      price = newPrice; 
    }

    public double getPriceWithTax()
    {
      double totalPrice = price + (price*0.08);
      return totalPrice;   
    }
    
    // main method
    public static void main(String[] args) {
      double lemonadePrice;
        
      Store2 lemonadeStand = new Store2("Lemonade", 3.75);
      lemonadeStand.increasePrice(1.5);

      lemonadePrice =lemonadeStand.getPriceWithTax();

      System.out.println(lemonadePrice);
  }
}
