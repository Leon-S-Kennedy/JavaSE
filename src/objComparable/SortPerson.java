package objComparable;

import java.util.Arrays;

public class SortPerson {
    public static void main(String[] args) {
        Person[] people= new Person[]{
                new Person("1",73,172,92),
                new Person("2",83,172,92),
                new Person("3",83,171,92),
                new Person("4",53,171,92),
                new Person("5",83,173,92),
                new Person("6",83,173,82),
                new Person("7",83,173,72)
        };
        Arrays.sort(people);
        //sort(people);

        for (Person person : people) {
            System.out.println(person.name);
        }
    }
    private static void sort(Person[] people) {
        for(int i=0;i<people.length-1;i++){
            for (int j = 0; j < people.length-i-1 ; j++) {
                int r=people[j].compareTo(people[j+1]);
                if(r>0){
                    Person t=people[j];
                    people[j]=people[j+1];
                    people[j+1]=t;
                }
            }
        }
    }
}
