public class EcommerceProduct {
    static void addProduct(String name) {
        System.out.println(name + " added to cart");
    }

    static void addProduct(String name, int quantity) {
        System.out.println(quantity + " " + name + " added to cart");
    }

    static void addProduct(String name, int quantity, String color) {
        System.out.println(quantity + " " + color + " " + name + " added to cart");
    }

    public static void main(String[] args) {
        addProduct("Laptop");
        addProduct("Headphones", 2);
        addProduct("T-shirt", 3, "blue");
    }
}
