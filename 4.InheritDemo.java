import java.util.Scanner;

class Person {
    String name;

    Person(String n) {
        name = n;
    }

    void show() {
        System.out.println("Name   : " + name);
    }
}

class Employee extends Person {
    double salary;

    Employee(String n, double s) {
        super(n);
        salary = s;
    }

    void show() {
        super.show();
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    String dept;

    Manager(String n, double s, String d) {
        super(n, s);
        dept = d;
    }

    void show() {
        super.show();
        System.out.println("Dept   : " + dept);
    }
}

class Driver extends Employee {

    Driver(String n, double s) {
        super(n, s);
    }

    void show() {
        super.show();
        System.out.println("Overtime     : 3000.0");
        System.out.println("Total Salary : " + (salary + 3000));
    }
}

public class InheritDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of drivers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Driver[] drivers = new Driver[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Driver " + (i + 1));

            System.out.print("Enter driver name: ");
            String name = sc.nextLine();

            System.out.print("Enter basic salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            drivers[i] = new Driver(name, salary);
        }

        System.out.println("\n========== DRIVER DETAILS ==========");

        for (int i = 0; i < n; i++) {
            System.out.println("\nDriver " + (i + 1));
            System.out.println("-------------------------");
            drivers[i].show();
        }

        sc.close();
    }
}





OUPUT:
Enter number of drivers: 2

Enter details for Driver 1
Enter driver name: x
Enter basic salary: 200000

Enter details for Driver 2
Enter driver name: s
Enter basic salary: 23100000

========== DRIVER DETAILS ==========

Driver 1
-------------------------
Name   : x
Salary : 200000.0
Overtime     : 3000.0
Total Salary : 203000.0

Driver 2
-------------------------
Name   : s
Salary : 2.31E7
Overtime     : 3000.0
Total Salary : 2.3103
