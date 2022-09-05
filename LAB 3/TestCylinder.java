import java.util.Scanner;
class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0;
        this.color = "Red";
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = "Red";
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}

class Cylinder extends Circle{

    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    public void display(Cylinder c, int i, int j) {
        if (this.getColor().equals(c.getColor()) && this.getArea() == c.getArea() && this.getVolume() == c.getVolume())
            System.out.println("Cylinder " + i + " and Cylinder " + j + " are similar ");
        else
            System.out.println("Cylinder " + i + " and Cylinder " + j + " are not similar ");
    }

}

public class TestCylinder{
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        Cylinder cy3 = new Cylinder(5.0, 2.0, "Red");
        System.out.println("\nCylinder 1:\t\tRadius : " +cy1.getRadius() +" \t\tHeight : " +cy1.getHeight() +" \t\tColor : " +cy1.getColor() +" \t\tBase Area : " +cy1.getArea() +" \t\tVolume : " +cy1.getVolume());
        System.out.println("Cylinder 2:\t\tRadius : " +cy2.getRadius() +" \t\tHeight : " +cy2.getHeight() +" \t\tColor : " +cy2.getColor() +" \t\tBase Area : " +cy2.getArea() +" \t\tVolume : " +cy2.getVolume());
        System.out.println("Cylinder 3:\t\tRadius : " +cy3.getRadius() +" \t\tHeight : " +cy3.getHeight() +" \t\tColor : " +cy3.getColor() +" \t\tBase Area : " +cy3.getArea() +" \t\tVolume : " +cy3.getVolume() + "\n\n");

        cy1.display(cy2,1, 2);
        cy2.display(cy3, 2, 3);
        cy3.display(cy1, 3, 1);

        }
    }
