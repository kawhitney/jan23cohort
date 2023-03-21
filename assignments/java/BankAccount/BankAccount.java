import java.util.Random;

public class BankAccount {
    //? === ATTRIBUTES ===
    //# Static
    public static int numAccounts = 0;  // number of accounts created 
    public static double moneyTotal = 0.0;  // total amount of money stored in every account created
    //# NonStatic
    private long accNumber; // account number [long]
    private double checkingAcc; // checking balance [double]
    private double savingsAcc;  // savings balance [double]

    //? === METHODS ===
    //# Constructor
    public BankAccount(){
        this.accNumber = randAcc(); // call random account number
        this.checkingAcc = 10.0;
        this.savingsAcc = 0.0;
        BankAccount.numAccounts++; // increment users
    }

    //# Private   
    // return random a 10 digit account number
    private long randAcc(){
        // instance of Random class
        Random rand = new Random();
        // return random generated number between 1000000000 and 9999999999
        //                  (  max - min + 1  ) + min
        return rand.nextLong(9000000000L) + 1000000000L;
    }

    //# Getter NOTE: NO SETTERS
    // user checking account balance
    public double getChecking(){
        return this.checkingAcc;
    }
    // user saving account balance
    public double getSavings(){
        return this.savingsAcc;
    }

    //# Functions
    // deposit into savings or checking
    public void Deposit(String type, double amount){
        switch(type){
            case "checking":
                this.checkingAcc += amount;
                System.out.printf("$%.2f successfully added to %s Checking Account.%n\tNew total: $%.2f\n", amount, this.accNumber, this.checkingAcc);
                // add value into total amount
                BankAccount.moneyTotal += amount; 
                break;
            case "savings":
                this.savingsAcc += amount;
                System.out.printf("$%.2f successfully added to %s Savings Account.%n\tNew total: $%.2f\n", amount, this.accNumber, this.savingsAcc);
                // add value into total amount
                BankAccount.moneyTotal += amount;   
                break;
            default:
                System.out.printf("That type of account does not exist in account %s.%nPlease deposit in \"checking\" or \"savings\" only.%n", this.accNumber);
        }
    }

    // withdraw from savings or checking
    public void Withdrawal(String type, double amount){
        switch(type){
            case "checking":
                // do not allow withdrawal from larger than available
                if(this.checkingAcc >= amount){  
                    this.checkingAcc -= amount;
                    System.out.printf("$%.2f successfully withdrawn from %s Checking Account.%n\tNew total: $%.2f\n", amount, this.accNumber, this.checkingAcc);
                    // remove value from total amount
                    BankAccount.moneyTotal -= amount;
                }
                else{
                    System.out.printf("There are not enough funds in %s Checking Account to remove $%.2f.%n\tCurrent Balance: $%.2f\n", this.accNumber, amount, this.checkingAcc);
                }
                break;
            case "savings":
                // do not allow withdrawal from larger than available
                if(this.savingsAcc >= amount){
                    this.savingsAcc -= amount;
                    System.out.printf("$%.2f successfully withdrawn from %s Savings Account.%n\tNew total: $%.2f\n", amount, this.accNumber, this.savingsAcc);
                    // remove value from total amount
                    BankAccount.moneyTotal -= amount;
                }
                else{
                    System.out.printf("There are not enough funds in %s Savings Account to remove $%.2f.%n\tCurrent Balance: $%.2f\n", this.accNumber, amount, this.savingsAcc);
                } 
                break;
            default:
                System.out.printf("That type of account does not exist in account %s.%nPlease deposit in \"checking\" or \"savings\" only.%n", this.accNumber);
        }
    }

    // see total money from checking and saving
    public void printTotals(){
        System.out.printf("Account %s %n\tChecking: $%.2f %n\tSavings: $%.2f\n", this.accNumber, this.checkingAcc, this.savingsAcc);
    }
}
