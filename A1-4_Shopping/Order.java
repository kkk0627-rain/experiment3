import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date createDate;
    private OrderStatus status;
    private List<OrderDetail> details = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();

    public Order() {
        this.createDate = new Date();
        this.status = OrderStatus.CREATE;
    }
    public void addDetail(OrderDetail d) { details.add(d); }
    public void addPayment(Payment p) { payments.add(p); }
    public double calculateTotal() {
        double sum = 0;
        for (OrderDetail d : details) sum += d.calculateSubTotal();
        return sum;
    }
    public void setStatus(OrderStatus status) { this.status = status; }
    public OrderStatus getStatus() { return status; }
    public List<OrderDetail> getDetails() { return details; }
    public List<Payment> getPayments() { return payments; }
}