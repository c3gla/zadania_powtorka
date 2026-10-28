import java.util.Scanner;

public class isPrime {

    public static boolean isPrimeChecker(int number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        System.out.print("Type number: ");
        int digit = sc.nextInt();

        System.out.println(isPrimeChecker(digit));

        sc.close();


    }
}
