package MethodOverriding;

/**
 * Write a superclass Bank with a method getInterestRate().
 * Override this method in subclasses SavingsAccount and LoanAccount to provide different interest rates.
 */

class Bank {

    void getInterestRate(){
        System.out.println("Interest Rate is 4%");
    }
}

class SavingsAccount extends Bank {

    @Override
    void getInterestRate(){
        System.out.println("Interest Rate is 5%");

    }
}

class LoanAccount extends Bank {

    @Override
    void getInterestRate() {
        System.out.println("Interset rate is 6%");
    }
}


public class Exercise2 {
    public static void main(String[] args){
        Bank b = new LoanAccount ();//Here the Bank class is storing object from loanAccount, so we get loanAccount's value
        b.getInterestRate();

        Bank bsup = new Bank (); //Here the Bank class is storing object Bank in the variable, so we get superclass value
        bsup.getInterestRate();

        Bank c = new SavingsAccount();//Here the Bank class is storing object from SavingAccount, so we get savingAccount's value
        c.getInterestRate();



    }
}
