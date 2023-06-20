public class BankAccount {
    static String BankName;
    int AccountNumber;
    int balance;

    public static void setBankName(String bankName) {
        BankName = bankName;
    }

    public void deposit (Double amount){
        balance += amount;
    }

    public void withdraw (Double amount) {
        balance -= amount;
    }

}
