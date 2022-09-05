import java.util.*;

class complex
{
    int real, imaginary;
    complex()
    {

    }
    complex(int Real, int Imaginary)
    {
        real = Real;
        imaginary = Imaginary;
    }
    complex add(complex c1, complex c2)
    {
        complex temp = new complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    complex sub(complex c1, complex c2)
    {
        complex temp = new complex();
        temp.real = c1.real - c2.real;
        temp.imaginary = c1.imaginary - c2.imaginary;
        return temp;
    }
    void display()
    {
        if(imaginary >= 0)
            System.out.println(real + " + " + Math.abs(imaginary) + "i");
        else
            System.out.println(real + " - " + Math.abs(imaginary) + "i");
    }
}
public class Comp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int r, c, ch;
        boolean i=true;
        System.out.print("Enter first complex no:");
        r = scan.nextInt();
        c= scan.nextInt();
        complex c1=new complex(r,c);
        System.out.print("First complex no: ");
        c1.display();
        System.out.println();
        System.out.print("Enter second complex no:");
        r=scan.nextInt();
        c= scan.nextInt();
        complex c2=new complex(r,c);
        System.out.print("Second complex no: ");
        c2.display();
        System.out.println();

        complex c3=new complex();
        while(i) {
            System.out.println("\n1.ADD \n2.SUB \n3.EXIT \n");
            System.out.print("Enter your choice: ");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    c3 = c3.add(c1, c2);
                    System.out.print("Sum: ");
                    c3.display();
                    break;

                case 2:
                    c3 = c3.sub(c1, c2);
                    System.out.print("Difference: ");
                    c3.display();
                    break;


                default: i=false;
                    break;
            }
        }

    }
}