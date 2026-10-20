public class WeixinPay extends Payment {
    private String number;
    public WeixinPay(double amount, String number) { super(amount); this.number = number; }
}