package cwiczenia;

import java.util.*;

public class Kolekcje {

    Map<String, Integer> countWords(String text) {
        Map<String, Integer> map = new TreeMap<>();
        String[] textList = text.split(" ");

        for (String word : textList) {
            word = word.toLowerCase();
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }

        }

        return map;

    }

    List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> newSet = new LinkedHashSet<>(list);

        return new ArrayList<>(newSet);

    }

    Set<Integer> union(Set<Integer> a, Set<Integer> b){
        Set<Integer> copyA = new HashSet<>(a);
        Set<Integer> copyB = new HashSet<>(b);

        copyA.addAll(copyB);

        return copyA;
    }

    Set<Integer> intersection(Set<Integer> a, Set<Integer> b){
        Set<Integer> copyA = new HashSet<>(a);
        Set<Integer> copyB = new HashSet<>(b);

        copyA.retainAll(copyB);

        return copyA;
    }



    public void main(String[] args) {
        Map<String, Integer> mapTest = countWords("Ala ma kota ala ala kota");

        System.out.println(mapTest.entrySet());

        List<Integer> duplicates = removeDuplicates(List.of(4, 5, 3, 2, 2, 3, 4, 5, 6, 8));
        System.out.println(duplicates);

        Set<Integer> a = new HashSet<>(Set.of(1,2,3,4));
        Set<Integer> b = new HashSet<>(List.of(3,4,5));

        Set<Integer> un = union(a,b);
        Set<Integer> inter = intersection(a,b);

        System.out.println(un);
        System.out.println(inter);

    }
}
