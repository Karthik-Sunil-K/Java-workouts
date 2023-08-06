package Assignments;

import java.util.List;

public class Account {
    int accountNo;
    String type;
    int balanceAmount;
    int secretKey;

    public Account(int accountNo, String type, int balanceAmount, int secretKey) {
        this.accountNo = accountNo;
        this.type = type;
        this.balanceAmount = balanceAmount;
        this.secretKey = secretKey;
    }

    public void setCredit(int creditAmount){
        this.balanceAmount+=creditAmount;
    }

    public void setDebit(int debitAmount){
        this.balanceAmount-=debitAmount;
    }


    @Override
    public String toString() {
        if (includeSectetKey()) {
            return "Account{" +
                    "accountNo=" + accountNo +
                    ", type='" + type + '\'' +
                    ", balanceAmount=" + balanceAmount +
                    '}';
        } else {
            return "Account{" +
                    "accountNo=" + accountNo +
                    ", type='" + type + '\'' +
                    ", balanceAmount=" + balanceAmount +
                    ", secretKey=" + secretKey +
                    '}';
        }
    }
    public  boolean includeSectetKey(){
        return balanceAmount > 1500;
    }

}
