public class TabValues {

    public static int maxValue(int[] numbers){
        int maxValue = numbers[0];

        for (int number : numbers) {
            if (maxValue < number) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    public static int minValue(int[] numbers){

        int minValue = numbers[0];

        for (int number : numbers){
            if (minValue > number){
                minValue = number;
            }
        }

        return minValue;
    }

    public static double avarageValue(int[] numbers){

        int avarageValue = 0;

        for (int number : numbers){
            avarageValue += number;
        }

        return (double) avarageValue / numbers.length;
    }

    public static void main(String[] args){

        int[] tab = {2, 6 ,24, 75, 4};

        System.out.println(maxValue(tab));
        System.out.println(minValue(tab));
        System.out.println(avarageValue(tab));
    }
}
