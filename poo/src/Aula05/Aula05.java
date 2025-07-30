package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.setAccountNumber(2106);
        p1.setAccountOwner("Thiago");
        p1.openAccount("CC");

        BankAccount p2 = new BankAccount();
        p2.setAccountNumber(1014);
        p2.setAccountOwner("Gabriel");
        p2.openAccount("CP");

        p1.deposit(300);
        p2.deposit(500);

        p2.withdraw(100);

        p1.currentStatus();
        p2.currentStatus();
    }
}