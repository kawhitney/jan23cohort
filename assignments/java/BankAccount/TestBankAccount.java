public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount Katie = new BankAccount();
        BankAccount Juli = new BankAccount();
        BankAccount Melissa = new BankAccount();

        System.out.println("=".repeat(30));
        Katie.Deposit("checking", 1000.50);
        Katie.Deposit("savings", 950.53);
        System.out.println("=".repeat(30));

        System.out.println("=".repeat(30));
        Juli.Deposit("checking", 80.75);
        Juli.Deposit("savings", 7950.50);
        System.out.println("=".repeat(30));

        System.out.println("=".repeat(30));
        Melissa.Deposit("checking", 800.50);
        Melissa.Deposit("savings", 950.98);
        System.out.println("=".repeat(30));

        System.out.println("=".repeat(30));
        Katie.Withdrawal("checking", 500.00);
        System.out.println("=".repeat(30));
        Juli.Withdrawal("checking", 1025.00);
        System.out.println("=".repeat(30));
        Melissa.Withdrawal("savings", 1000.00);
        System.out.println("=".repeat(30));
        Juli.Withdrawal("savings", 1025.00);
        System.out.println("=".repeat(30));
        Katie.Withdrawal("saving", 300.00);
        System.out.println("=".repeat(30));

        System.out.println("=".repeat(30));
        Katie.printTotals();
        System.out.println("=".repeat(30));
        System.out.println("=".repeat(30));
        Juli.printTotals();
        System.out.println("=".repeat(30));
        System.out.println("=".repeat(30));
        Melissa.printTotals();
        System.out.println("=".repeat(30));
    }
}
