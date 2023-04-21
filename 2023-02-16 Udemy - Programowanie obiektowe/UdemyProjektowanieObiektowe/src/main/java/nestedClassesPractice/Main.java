package nestedClassesPractice;

public class Main {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount(1000);

        System.out.println(bankAccount.getBalance());

        bankAccount.start(5);

        System.out.println(bankAccount.getBalance());
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    double getBalance(){
        return this.balance;
    }

    void start(double interestRate){
        Interest interest = new Interest(interestRate);
        interest.changeBalance(interestRate);
    }

    class Interest {
        private double interestRate;

        public Interest(double interestRate){
            this.interestRate = interestRate;
            this.changeBalance(interestRate);
        }

        void changeBalance(double interestRate){
            double interest = (balance * interestRate) /100;
            balance += interest;
        }
    }
}