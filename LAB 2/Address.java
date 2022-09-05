import java.util.*;
public class Address
{
    String city, state, country;
    int street;
    public Address(int street, String city, String state, String country)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Student
{
    String usn;
    String name;
    Address addr;
    public Student(String usn, String name,Address addr)
    {
        this.usn = usn;
        this.name = name;
        this.addr = addr;

    }
}

class College
{
    String name;
    Address addr;
    College(String name, Address addr)
    {
        this.name = name;
        this.addr = addr;
    }
}

class Employee
{
    String name, eid;
    Address addr;
    Employee(String name, String eid, Address addr)
    {
        this.name = name;
        this.eid = eid;
        this.addr = addr;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];
        Address add[] = new Address[20];
        Student s[] = new Student[20];
        Employee E[] = new Employee[20];
        College c[] = new College[20];
        int ch;
        System.out.println("Enter\n 1. Student\n 2. Employees\n 3. College");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("\nEnter the number of students");
                int n = sc.nextInt();
                for(int i=0;i<n;i++)
                {
                    System.out.println("\n\nEnter Student " + (i + 1) + " Address details");
                    add[i] = new Address(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    System.out.println("Enter Student " + (i + 1) + " USN and NAME");
                    s[i] = new Student(sc.next(), sc.next(), add[i]);
                }
                for(int j = 0; j<n;j++)
                {
                    System.out.println("\nStudent " + (j+1) + " Details- \t USN: " + s[j].usn + "\t\tName: " + s[j].name + "\t\tStreet Number: " + s[j].addr.street + "\t\tCity: " + s[j].addr.city + "\t\tState: "+ s[j].addr.state + "\t\tCountry: " + s[j].addr.country);
                }
                break;
            case 2:System.out.println("\nEnter the number of Employee");
                int m = sc.nextInt();
                for(int i=0;i<m;i++)
                {
                    System.out.println("\n\nEnter Employee " + (i + 1) + " Address details");
                    add[i] = new Address(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    System.out.println("Enter Employee " + (i + 1) + " NAME and ID");
                    E[i] = new Employee(sc.next(), sc.next(), add[i]);
                }
                for(int j = 0; j<m;j++)
                {
                    System.out.println("\nEmployee " + (j+1) + " Details- \t ID: " +E[j].eid + "\t\tName: " + E[j].name + "\t\tStreet Number: " + E[j].addr.street + "\t\tCity: " + E[j].addr.city + "\t\tState: "+ E[j].addr.state + "\t\tCountry: " + E[j].addr.country);
                }
                break;
            case 3:System.out.println("\nEnter the number of Colleges");
                int p = sc.nextInt();
                for(int i=0;i<p;i++) {
                    System.out.println("\n\nEnter College " + (i + 1) + " Address details");
                    add[i] = new Address(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    System.out.println("Enter College " + (i + 1) + " NAME");
                    c[i] = new College(sc.next(), add[i]);
                }
                for(int j = 0; j<p;j++)
                {
                    System.out.println("\nCollege " + (j+1) + " Details- \t Name: " + c[j].name +"\t\tStreet Number: " + c[j].addr.street + "\t\tCity: " + c[j].addr.city + "\t\tState: "+ c[j].addr.state + "\t\tCountry: " + c[j].addr.country);
                }
                break;
            default: System.out.println("Please enter a valid option");
                System.exit(0);
                break;
        }
    }
}