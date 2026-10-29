import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args){

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int winningNumber = random.nextInt(11);

        while (true){
            int number = sc.nextInt();

            if (number == winningNumber) {
                System.out.println("WIN!");
                break;
            }

            else if(number < winningNumber) {
                System.out.println("Too low");
            }
            else if (number > winningNumber) {
                System.out.println("Too high");
            }

        }


    }
}
