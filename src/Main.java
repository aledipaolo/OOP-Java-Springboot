public class Main {
    public static void main(String[] args) {
        BankAccount.setBankName("Banca");

        BankAccount MarioRossi = new BankAccount();
        MarioRossi.deposit(5000.0);
        MarioRossi.withdraw(2000.0);

        System.out.println(MarioRossi.AccountNumber);

    }
}