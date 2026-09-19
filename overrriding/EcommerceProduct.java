class EcommerceProductBase {
    public void showProduct() {
        System.out.println("Product information");
    }
}

public class EcommerceProduct extends EcommerceProductBase {
    @Override
    public void showProduct() {
        System.out.println("Showing product name, price, and stock status");
    }

    public static void main(String[] args) {
        EcommerceProductBase product = new EcommerceProduct();
        product.showProduct();
    }
}