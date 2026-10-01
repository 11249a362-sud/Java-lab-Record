import java.util.Scanner;

class Rebate {
    int days;
    double amount;
    double rebate;
    double finalAmount;

    void set(int d, double a) {
        days = d;
        amount = a;
    }

    void calculate() {
        if (days < 26) {
            rebate = amount * 0.10;
        } else {
            rebate = 0;
        }

        finalAmount = amount - rebate;
    }

    void show() {
        System.out.println("Days = " + days);
        System.out.println("Amount = " + amount);
        System.out.println("Rebate = " + rebate);
        System.out.println("Final Amount = " + finalAmount);
    }
}

public class RebateDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rebate r = new Rebate();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        r.set(days, amount);
        r.calculate();
        r.show();
        sc.close();
    }
}
OUTPUT:
Enter number of days: 2
Enter amount: 100
Days = 2
Amount = 100.0
Rebate = 10.0
Final Amount = 90.0

