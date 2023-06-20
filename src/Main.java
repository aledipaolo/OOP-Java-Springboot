public class Main {
    public static void main(String[] args) {
        BankAccount.setBankName("Intesa S. Paolo");

        BankAccount MarioRossi = new BankAccount(85743);
        BankAccount LuigiVerdi = new BankAccount(23467);
        BankAccount MarcoBianchi = new BankAccount(99834);

        MarioRossi.deposit(500.0);
        MarioRossi.withdraw(67.0);
        LuigiVerdi.deposit(676.0);
        LuigiVerdi.withdraw(145.0);
        MarcoBianchi.deposit(40.0);
        MarcoBianchi.withdraw(41.0); // operazione non possibile.

        // account info
        MarioRossi.getAccountInfo();
        LuigiVerdi.getAccountInfo();
        MarcoBianchi.getAccountInfo();
    }
}