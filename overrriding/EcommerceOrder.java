class EcommerceOrderBase {
    public void processOrder() {
        System.out.println("Processing a general order");
    }
}

public class EcommerceOrder extends EcommerceOrderBase {
    @Override
    public void processOrder() {
        System.out.println("Processing an ecommerce order and preparing shipment");
    }

    public static void main(String[] args) {
        EcommerceOrderBase order = new EcommerceOrder();
        order.processOrder();
    }
}