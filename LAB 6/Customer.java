package OOPS_LAB.P6;

import java.util.Scanner;

class DemonetizationException extends Exception{

    float amount;

    DemonetizationException(float amount){
        this.amount = amount;
    }

    public String toString(){
        return "\nDeposite of old currency of (Rs." + amount + ") crosses Rs.5,000 and CANNOT be Deposited";
    }

}

class Account{

    float balance;

    Account(){
        balance = 500;
    }

    void Deposite(float amount, String currencyType){

        String currency = currencyType.toUpperCase();

        try{
            if(currency.equals("OLD") && amount > 5000){
                throw new DemonetizationException(amount);
            }
            balance = balance + amount;
        }

        catch(DemonetizationException e){
            System.out.println("" + e);
        }

    }

    void Withdraw(float amount){

        if(amount>balance){
            System.out.println("\nINSUFFICIENT FUNDS");
        }

        else if((balance-amount) < 500){
            System.out.println("\nCan't Withdraw (Minimum balance needs to be 500)");
        }

        else {
            balance = balance - amount;
        }

    }

    void getBalance(){
        System.out.println("\nCurrent Balance =" + balance);
    }

}

public class Customer {

    public static void main(String[] args){

        int choice;
        float amt;
        String cType;
        Scanner sc = new Scanner(System.in);
        Account ob = new Account();

        while(true){

            System.out.println("\n\n************************************************\n\n");
            System.out.println("1.DEPOSITE");
            System.out.println("2.WITHDRAW");
            System.out.println("3.GET BALANCE");
            System.out.println("4.EXIT\n");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1: System.out.println("\nEnter the amount to DEPOSITE and CURRENCY TYPE");
                        amt = sc.nextInt();
                        cType = sc.next();
                        ob.Deposite(amt, cType);
                        break;

                case 2: System.out.println("\nEnter the amount to withdraw");
                        amt = sc.nextInt();
                        ob.Withdraw(amt);
                        ob.getBalance();
                        break;

                case 3: ob.getBalance();
                        break;

                default: System.exit(0);

            }


        }

    }

}
