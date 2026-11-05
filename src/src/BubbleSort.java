import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int [] tab){
        for(int i = 0; i < tab.length - 1; ++i){
            for(int j = 0; j < tab.length - i - 1; j++){
                if(tab[j] > tab[j + 1]){
                    int c = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = c;
                }
            }
        }

        return tab;
    }

    public static void main(String[] args){

        int[] tab = {4, 1, 6, 3};
        System.out.println(Arrays.toString(bubbleSort(tab)));

    }
}
