import java.util.Scanner;

public class StringReverse {





    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String reverseStr = new StringBuilder(str).reverse().toString();

        System.out.println(reverseStr);

    }
}
