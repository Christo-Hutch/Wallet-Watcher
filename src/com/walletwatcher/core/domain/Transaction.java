import java.math.BigDecimal;

public class Transaction {
    enum TransactionType {
        EXPENSE,
        INCOME,
        TRANSFER
    }
    
    private String desc;
    private BigDecimal amount;
}