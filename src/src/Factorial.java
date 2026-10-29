public class Factorial {

    public static int factorialNormal(int number) {

        if (number == 0) {
            return 1;
        }

        int result = number;

        while (number > 1) {
            number--;
            result *= number;
        }

        return result;
    }

    public static int factorialRecursion(int number) {

        if (number == 0) {
            return 1;
        }

        int result = number;

        if (number == 1){
            return number;
        } else {
            result *= factorialRecursion(number - 1);
        }

        return result;
    }




    public static void main(String[] args){

        System.out.println(factorialNormal(10));
        System.out.println(factorialRecursion(10));
    }
}
