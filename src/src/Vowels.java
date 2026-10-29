public class Vowels {

    public static int numberOfVowels(String str){

        str = str.toLowerCase();
        int numberOfVowels = 0;

        for (Character c : str.toCharArray()) {
            if (c == 'a' || c.equals('e') || c.equals('i') || c.equals('o') || c.equals('u') ){
                numberOfVowels++;
            }
        }

        return numberOfVowels;
    }

    public static void main(String[] args){

        System.out.println(numberOfVowels("Dupa"));

    }
}
