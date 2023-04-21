package exSaldoKonta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value to deposit to the account: ");
        double deposit = input.nextDouble();

        System.out.println("Please enter a value to withdraw from the account: ");
        double withdraw1 = input.nextDouble();

        System.out.println("Please enter a value to withdraw from the account: ");
        double withdraw2 = input.nextDouble();

        Account maciejMino = new Account();

        maciejMino.deposit(deposit);
        maciejMino.getBalance();
        maciejMino.withdraw(withdraw1);
        maciejMino.getBalance();
        maciejMino.withdraw(withdraw2);





    }
}


class Account {

    private double balance;

    public Account (){
        this.balance = 0;
    }



    public double deposit(double deposit){
        return this.balance += deposit;
    }

    public double withdraw(double withdraw){
        if (withdraw <= balance ) {
            return this.balance -= withdraw;
        } else {
            System.out.println("You do not have enough money to proceed the withdraw");
            System.out.println("Current account balance : " + this.balance);
            return this.balance;
        }

    }

    public void getBalance(){
        System.out.println("Current account balance : " + this.balance);

    }




}