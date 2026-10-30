package p06_passing_and_returning_object;

import java.util.Scanner;

class Account{
    long accountNumber;
    double accountBalance;

     Account(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
}

class Bank{
    static void displayAccountInfo(Account a){
        if (a != null){
            System.out.println("Account Number : " + a.accountNumber);
            System.out.println("Account Balance : " + a.accountBalance);
        }
    }

    static Account createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        long accNum = sc.nextLong();
        System.out.println("Enter Account Balance");
        double accBal = sc.nextDouble();
        Account a = new Account(accNum, accBal);
        return a;
    }
}
public class Program2 {
    public static void main(String[] args) {
        Account a1 = Bank.createAccount();
        Bank.displayAccountInfo(a1);
    }
}
