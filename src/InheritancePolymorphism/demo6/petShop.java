package InheritancePolymorphism.demo6;

public class petShop {
    public void foster(Pet pet){
        //pet.liuDog()
        if(pet instanceof Dog){
            //向下转型
            Dog dog=(Dog)pet;
            dog.liuDog();
        }
    }
}
