import java.math.BigDecimal;

public class Account{
    enum AccountType {
        CURRENT,
        SAVINGS,
        CREDIT
    }

    private String name;
    private BigDecimal balance;
}