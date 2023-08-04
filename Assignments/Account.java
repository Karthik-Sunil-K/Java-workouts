package Assignments;

public class Account {
    int accountNo;
    String accountHolderName;
    int balanceAmount;
    int secretKey;

    public Account(int accountNo, String accountHolderName, int balanceAmount, int secretKey) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balanceAmount = balanceAmount;
        this.secretKey = secretKey;
    }
}
