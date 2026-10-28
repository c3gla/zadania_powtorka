import java.util.Scanner;

public class isPalindrom {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();
        str = str.replace(" ","");


        String strReversed = new StringBuilder(str).reverse().toString();

        if (str.equals(strReversed)){
            System.out.println("Palindrom");
        } else{
            System.out.println("Nie palindrom");
        }
    }

}
