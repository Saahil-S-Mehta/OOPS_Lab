package P4.CSE;

public class ThirdSem {

    public void publicWelcome(){
        System.out.println("Welcome to P4.CSE dept - 3rd sem young budding Engineers       ***PUBLIC***");
    }

    private void privateWelcome(){
        System.out.println("Welcome to P4.CSE dept - 3rd sem young budding Engineers       ***PRIVATE***");
    }

    protected void protectedWelcome(){
        System.out.println("Welcome to P4.CSE dept - 3rd sem young budding Engineers       ***PROTECTED***");
    }

    void defaultWelcome(){
        System.out.println("Welcome to P4.CSE dept - 3rd sem young budding Engineers       ***DEFAULT***");
    }

    public static void main(String[] args){
        ThirdSem t = new ThirdSem();
        t.publicWelcome();
        t.privateWelcome();
        t.protectedWelcome();
        t.defaultWelcome();
    }
}
