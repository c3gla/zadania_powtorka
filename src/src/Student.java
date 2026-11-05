import java.util.Arrays;

public class Student {

    private String name;
    private int index;
    private int[] grades;

    Student(String name, int index, int[] grades){
        this.name = name;
        this.index = index;
        this.grades = grades;

    }

    public String getName(){
        return this.name;
    }

    public int getIndex(){
        return this.index;
    }

    public int[] getGrades(){
        return this.grades;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIndex(int index) {
        if (index <= 0)
            throw new IllegalArgumentException("Index have to be greater than zero!");
        this.index = index;
    }
    public void setGrades(int[] grades){
        this.grades = grades;
    }

    @Override
    public String toString(){
        return "Student: " + this.name + ", index: " + this.index + ", grades: " + Arrays.toString(this.grades);
    }

    public float getAvarage(){
        float sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

}


class Main{
    public static void main(String[] args){
        Student stud1 = new Student("John",3689, new int[]{4, 2, 5, 1});
        Student stud2 = new Student("Mark", 32561, new int[]{6,6,4,5,4});

        System.out.println(stud1);
        System.out.println(stud2);

        System.out.println(stud1.getAvarage());
        System.out.println(stud2.getAvarage());
    }
}
