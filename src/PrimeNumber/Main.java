package PrimeNumber;

public class Main {
    public static void main(String[] args) {
        int number = 23;
        boolean isPrime = true;

        if (number < 0) {
            System.out.println("Not a valid number");
            return;
        } else if (number == 1) {
            System.out.println("not a prime");
            return;
        } else if (number == 2) {
            System.out.println("Its a prime number");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Its a prime number");
        } else {
            System.out.println("Its not a prime number");
        }

    }
}
