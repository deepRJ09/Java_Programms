public class EcommerceOrder {
    static void placeOrder(String product) {
        System.out.println("Order placed for " + product);
    }

    static void placeOrder(String product, int quantity) {
        System.out.println("Order placed for " + quantity + " " + product);
    }

    static void placeOrder(String product, int quantity, String address) {
        System.out.println("Order placed for " + quantity + " " + product
                + " to " + address);
    }

    public static void main(String[] args) {
        placeOrder("Book");
        placeOrder("Mouse", 2);
        placeOrder("Keyboard", 1, "Delhi");
    }
}
