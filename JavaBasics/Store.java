public class Store {
    String productType; 
    int inventoryCount;
    double inventoryPrice;

    //Constructor
    public Store(String product, int count, double price){

        System.out.println("I am inside the constructor method.");
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public static void main(String[] args)
    { 
         System.out.println("Start of the main method."); 

         Store cookieShop = new Store("cookies",12,3.75);
         System.out.println(cookieShop.inventoryCount);
    } 
}
