package OOP_concept_excercise.encapsulation;

/**Exercise 2: Bank Account Class
 1. Create a BankAccount class with the following private fields:
 - accountNumber (String)
 - balance (double)
 2. Add public getter methods for accountNumber and balance.
 3. Add a public setter method for balance that allows deposits and withdrawals:
 - For deposits, the balance should increase.
 - For withdrawals, the balance should decrease, but not go below 0.
 4. In the main method, create an instance of BankAccount, deposit some money, withdraw some money, and display the account balance.
 *
 */
//NOTE: DO IT AGAIN, YOU FORGOT "the balance should decrease, but not go below 0."
    //Make deposit and withdrawal seperate
class BankAccount {
    private String accountNumber;
    private double balance;



    //getter methods for accountNumber and balance
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    //setter methods for accountNumber and balance
    public String getAccountNumber(){
        return accountNumber;
    }


    void transactions(double deposit, double withdrawal){
        balance+=deposit - withdrawal;
    }

    public double getBalance(){
        return balance;
    }
}

class Exercise2 {
    public static void main(String[] args){

        BankAccount ba = new BankAccount();

        ba.setAccountNumber("A123456789");
        ba.setBalance(200.0);
        ba.transactions(150.50, 15.25);


        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());
    }
}