import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String contact;
    private String deliveryAddress;
    private boolean active;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String contact, String deliveryAddress, boolean active) {
        this.name = name; this.contact = contact;
        this.deliveryAddress = deliveryAddress; this.active = active;
    }
    public Order placeOrder() {
        Order o = new Order();
        orders.add(o);
        return o;
    }
    public List<Order> getOrders() { return orders; }
}