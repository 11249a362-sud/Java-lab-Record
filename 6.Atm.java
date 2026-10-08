Program:

class InvalidAmountException extends Exception {
    InvalidAmountException(String m) {
        super(m);
    }
}

class LowBalanceException extends Exception {
    LowBalanceException(String m) {
        super(m);
    }
}

// Third exception
class DailyLimitException extends Exception {
    DailyLimitException(String m) {
        super(m);
    }
}

public class Atm {

    static double balance = 5000;
    static double dailyWithdrawn = 0;
    static final double DAILY_LIMIT = 5000;

    static void withdraw(double amt)
            throws InvalidAmountException, LowBalanceException, DailyLimitException {

        if (amt % 100 != 0)
            throw new InvalidAmountException(
                amt + " is not a multiple of 100");

        if (amt > balance)
            throw new LowBalanceException(
                "Balance is only " + balance);

        if (dailyWithdrawn + amt > DAILY_LIMIT)
            throw new DailyLimitException(
                "Daily withdrawal limit of Rs. 5000 exceeded");

        balance = balance - amt;
        dailyWithdrawn = dailyWithdrawn + amt;

        System.out.println("Dispensed " + amt +
                ", balance " + balance +
                ", withdrawn today " + dailyWithdrawn);
    }

    public static void main(String[] args) {

        double[] tries = {2000, 350, 2000, 1500};

        for (double a : tries) {
            try {
                withdraw(a);
            }
            catch (Exception e) {
                System.out.println("Refused : " + e.getMessage());
            }
        }
    }
}

Output:

Dispensed 2000.0, balance 3000.0, withdrawn today 2000.0
Refused : 350.0 is not a multiple of 100
Dispensed 2000.0, balance 1000.0, withdrawn today 4000.0
Refused : Balance is only 1000.0
