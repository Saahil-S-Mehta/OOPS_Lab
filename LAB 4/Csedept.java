package P4.RVCE;

import P4.CSE.ThirdSem;

public class Csedept extends ThirdSem {

    public void publicWelcome(){
        super.publicWelcome();
        System.out.println("Welcome to P4.CSE dept P4.RVCE        ***PUBLIC***");
    }

    private void privateWelcome(){
        //super.privateWelcome();
        System.out.println("Welcome to P4.CSE dept P4.RVCE        ***PRIVATE***");
    }

    protected void protectedWelcome(){
        super.protectedWelcome();
        System.out.println("Welcome to P4.CSE dept P4.RVCE        ***PROTECTED***");
    }

    void defaultWelcome(){
        //super.defaultWelcome();
        System.out.println("Welcome to P4.CSE dept P4.RVCE        ***DEFAULT***");
    }

    public static void main(String[] args){
        Csedept c = new Csedept();
        c.publicWelcome();
        c.privateWelcome();
        c.protectedWelcome();
        c.defaultWelcome();
    }
}
