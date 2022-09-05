package P5;

import P5.Lion;
import P5.Snake;

public class Animals {

    public static void main(String[] args){

        Lion L1 = new Lion();
        Snake S1 = new Snake();

        L1.eat();
        L1.sound();
        L1.legs();

        System.out.println();

        S1.eat();
        S1.sound();
        S1.sleep();
    }
}
