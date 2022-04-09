package oop.demo;

public class Main {
    private static void swap(Student[] array,int i,int j){
        Student s=array[i];
        array[i]=array[j];
        array[j]=s;
    }
    private static void bubblesort(Student[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if(array[j].height>array[j+1].height){
                    swap(array,j,j+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] array={
                new Student("A",168),
                new Student("B",190),
                new Student("C",155),
                new Student("D",173),
                new Student("E",188),
        };
        extracted(array);
        System.out.println("=======================================");
        bubblesort(array);
        extracted(array);
    }

    private static void extracted(Student[] array) {
        for (Student student : array) {
            System.out.printf("%s %d\n",student.name, student.height);
        }
    }
}
