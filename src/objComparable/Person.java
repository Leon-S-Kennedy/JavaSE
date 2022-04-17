package objComparable;

public class Person implements Comparable {

    public String name;
    public int age;
    public int height;
    public int weight;


    public Person(){

    }
    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
//        Person p=(Person) o;
//        if(this.height<p.height){
//            return -1;
//        }
//        else if(this.height>p.height){
//            return 1;
//        }
//        else{
//            return 0;
//        }
        Person p=(Person) o;
        if(this.height!=p.height){
            return this.height-p.height;
        }
        if(this.age!=p.age){
            return p.age-this.age;
        }
        return this.weight-p.weight;
    }

}
