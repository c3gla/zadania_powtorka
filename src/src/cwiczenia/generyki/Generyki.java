package cwiczenia.generyki;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Generyki {


    public static void main(String[] args) {

        Box<String> boxTest1 = new Box<>("Dane");
        Box<Integer> boxTest2 = new Box<>(5);

        System.out.println(boxTest1.getData() + " " + boxTest2.getData());

        Pair<Integer, String> pairTest1 = new Pair<>(2,"Test");

        System.out.println(pairTest1);

        List<String> listOfStrings = new ArrayList<>(List.of("Ryk","Syk","Delfin","Francuz"));
        List<Integer> listOfIntegers = new ArrayList<>(List.of(5,4, 10, 781, 2));

        System.out.println(findFirst(listOfStrings,a -> a.length() > 6));
        System.out.println(findFirst(listOfIntegers, (a) -> a > 5));
        System.out.println(max(listOfIntegers));
        System.out.println(max(listOfStrings));

    }

    public static <T> T findFirst(List<T> list, Predicate<T> condition) {

        for(T element : list){
            if (condition.test(element)) return element;
        }
        return null;
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        T max = list.getFirst();

        for(T element : list) {
            if(element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }
}

class Box<T> {

    private T data;

    public Box(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}

class Pair<K, V> {

    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + this.key + ", " + this.value + ")";
    }
}
