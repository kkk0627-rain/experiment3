import java.util.Date;
public class Credit extends Payment {
    private String number;
    private String type;
    private Date expireDate;
    public Credit(double amount, String number, String type, Date expireDate) {
        super(amount); this.number = number; this.type = type; this.expireDate = expireDate;
    }
}