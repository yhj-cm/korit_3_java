package ch11_access_modifier;

class Bank {
    private int accountNum; //계좌번호
    private int pinNumber; //비번
    private int balance; //잔액
    private String accountHolder; //소유자명

    public Bank(String accountHolder, int accountNum) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, int balance, String accountHolder) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void showInfo() {

    }

}



public class BankaccessModifier2 {
    public static void main(String[] args) {

        Bank bankuser1 = new Bank(123456,10000,"홍길동");
        Bank bankuser2 = new Bank(987654, 100000, "신사임당");




    }
}
