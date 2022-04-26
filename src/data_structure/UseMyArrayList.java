package data_structure;

public class UseMyArrayList {
    //此处为断言
    private static void assertTrue(boolean cond){
        if(!cond){
            throw  new RuntimeException();
        }
    }
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.check();
        assertTrue(myArrayList.getSize()==0);
        myArrayList.add(0,100);
        myArrayList.check();
        assertTrue(myArrayList.getSize()==1);
        myArrayList.add(1,10);
        myArrayList.check();
        assertTrue(myArrayList.getSize()==2);
        myArrayList.add(1,50);
        myArrayList.check();
        assertTrue(myArrayList.getSize()==3);
        myArrayList.add(0,99);
        myArrayList.check();
        assertTrue(myArrayList.getSize()==4);
        myArrayList.add(2,2);
        myArrayList.check();

        assertTrue(myArrayList.getSize()==5);
        myArrayList.removeAll(50);
        myArrayList.check();


    }
}
