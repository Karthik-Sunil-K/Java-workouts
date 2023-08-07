package Assignments;

import java.util.List;
import java.util.stream.Collectors;

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

    public int setDebit(int debitAmount,int keySecret){
        if (secretKey == keySecret){
            this.balanceAmount-=debitAmount;
            return 200;
        }else {
            return 404;
        }

    }


    public int getBalanceAmount() {
        return balanceAmount;
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
