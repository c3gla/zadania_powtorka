package cwiczenia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;
    private int age;
    private double average;

    public Student(String name, int age, double avarage) {
        this.name = name;
        this.age = age;
        this.average = avarage;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "[name: " + name +
                ", age: " + age +
                ", average: " + average + "]";
    }


}


class Main2 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Maciej", 15, 4.21),
                new Student("Adam", 13, 5.00),
                new Student("Lipa", 14, 2.59),
                new Student("Mak", 14, 3.02),
                new Student("Marysia", 15, 5.00),
                new Student("Julka", 15, 4.87)));

        List<Student> students2 = students;


        System.out.println(students);
        students.sort(Comparator.comparingDouble(Student::getAverage).reversed());
        System.out.println(students);
        students.sort(Comparator.comparingDouble(Student::getAverage).reversed().thenComparing(Student::getName));
        System.out.println(students);

        students2.sort((a, b) -> {
            int wynik = Double.compare(b.getAverage(), a.getAverage());
            if (wynik == 0) {
                return a.getName().compareTo(b.getName());
            }
            return wynik;
        });
        System.out.println(students2);

    }
}
