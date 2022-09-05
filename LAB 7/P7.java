package OOPS_LAB.P7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Market {
    ArrayList<String> stock = new ArrayList<>();
    int fruitsNumber;
    int salesCount;
    int sales = 0;
    String[] fruits = {"Apple", "0range", "Grape", "Watermelon", "Mango"}; //fruits to produce

    public Market(int fruitsNumber, int salesCount) {
        if (fruitsNumber > 0 && salesCount > 0) {
            this.fruitsNumber = fruitsNumber;
            this.salesCount= salesCount;
        } else {
            throw new IllegalArgumentException("Invalid Argument!");
        }
    }

    synchronized boolean isFull() {
        return stock.size() == this.fruitsNumber;
    }

    synchronized boolean isEmpty() {
        return stock.isEmpty();
    }

    public void farmer() throws InterruptedException {
        while (this.sales != this.salesCount) {
            synchronized (this) {
                while (isFull()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("\nF: Interruption");
                    }
                }
                String nextProd = fruits[(new Random()).nextInt(fruits.length)];
                stock.add(nextProd);
                if(this.sales != this.salesCount)
                    System.out.printf("\nFruit %s is added for SELLING.\n", nextProd);
                notify();
                Thread.sleep(1000);
            }
        }
    }

    public void consumer() throws InterruptedException {
        while (this.sales != this.salesCount) {
            synchronized (this) {
                while (isEmpty()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("\nC:\tInterrupt Encountered.");
                    }
                }
                String soldItem = stock.remove((new Random()).nextInt(stock.size()));
                System.out.printf("\nFruit %s is SOLD.\n", soldItem);
                this.sales++;
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

class Farmer extends Thread{
    Market market;
    Farmer(Market market){
        this.market = market;
    }

    public void run(){
        try {
            this.market.farmer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Customer extends Thread{
    Market market;
    Customer(Market market){
        this.market = market;
    }
    public void run(){
        try {
            this.market.consumer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class P7 {
    public static void main(String[] args) throws InterruptedException {
        int marketCapacity = 5;
        Market marketPlace = new Market(marketCapacity, 50);
        Farmer farmer = new Farmer(marketPlace);
        Customer customer = new Customer(marketPlace);
        farmer.start();
        customer.start();
        farmer.join();
        customer.join();
    }
}
