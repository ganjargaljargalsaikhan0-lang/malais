package week05.session27.backend;

class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "орлого хийгдлээ");

        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            amount -= balance;
              System.out.println(amount + "зарлага хийгдлээ");
        return true;
        } else {
        System.out.println("Үлдэгдэл хүрэлцэхгүй! ");
        return false ;
        }
    }

    void displayInfo() {
        System.out.println("Данс  " + accountNumber + ": " + ownerName + "-" + balance + "₮");
    }

}

public class BankAccountFull {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("001", "Бат", 100000);
        BankAccount acc2 = new BankAccount("002", "Болд");

        // Анхны байдал
        System.out.println("=== Анхны байдал ===");
        acc1.displayInfo();
        acc2.displayInfo();

        // Гүйлгээ
        System.out.println("\n=== Гүйлгээ ===");
        acc2.deposit(50000);
        acc1.withdraw(30000);
        acc2.withdraw(100000); // Хүрэлцэхгүй

        // Эцсийн байдал
        System.out.println("\n=== Эцсийн байдал ===");
        acc1.displayInfo();
        acc2.displayInfo();
    }
}