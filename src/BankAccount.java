public class BankAccount {
    static String BankName;
    int AccountNumber;
    int balance;

    public BankAccount(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public static void setBankName(String bankName) {
        BankName = bankName;
    }

    public void deposit (Double amount){
        balance += amount;
    }

    public void withdraw (Double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("ERROR: You can't withdraw more than your savings.");
    }

    public void getAccountInfo(){
        System.out.println("------------------------------");
        System.out.println("Bank name: " + BankName);
        System.out.println("Account number: " + AccountNumber);
        System.out.println("Balance: " + balance);
    }

}
