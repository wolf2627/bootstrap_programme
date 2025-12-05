enum OrderStatus {
    NEW("Order created"),
    PROCESSING("Order under process"),
    SHIPPED("Order on the way"),
    DELIVERED("Order delivered");

    private String description;

    // Constructor
    OrderStatus(String description) {
        this.description = description;
    }

    // Getter
    public String getDescription() {
        return description;
    }
}

public class OrderExample {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;

        System.out.println(status);  
        System.out.println(status.getDescription());
    }
}
