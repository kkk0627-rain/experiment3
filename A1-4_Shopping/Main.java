public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("张三", "13800000000", "北京市", true);
        Order o = c.placeOrder();
        Product p = new Product("Java书", 0.8, "教材", 59.9);
        o.addDetail(new OrderDetail(p, 2));
        o.addPayment(new AliPay(o.calculateTotal(), "zhangsan@ali"));
        o.setStatus(OrderStatus.PAID);
        System.out.println("Total: " + o.calculateTotal());
        System.out.println("Status: " + o.getStatus());
    }
}