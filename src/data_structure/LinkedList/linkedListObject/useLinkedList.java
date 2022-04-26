package data_structure.LinkedList.linkedListObject;

public class useLinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.check();
        assertTrue(l1.size() == 0);
        l1.add(100);
        l1.add(100);
        l1.add(1);
        l1.add(100);
        l1.add(1);
        l1.add(1);
        l1.add(100);

        l1.check();
        assertTrue(l1.size()==7);

        l1.deleteAll(100);
        l1.check();
        assertTrue(l1.size()==3);

        l1.deleteAll(1);
        l1.check();
        assertTrue(l1.size()==0);






//        l1.add(1);
//
//        l1.add(0, 100);
//        l1.check();
//        assertTrue(l1.size() == 2);
//
//        l1.add(0, 200);
//        l1.check();
//        assertTrue(l1.size() == 3);
//
//        l1.add(2, 100);
//        l1.check();
//        assertTrue(l1.size() == 4);
//
//        l1.remove(3);
//        l1.check();
//        assertTrue(l1.size() == 3);
//
//        l1.remove(0);
//        l1.check();
//        assertTrue(l1.size() == 2);






/*
        l1.add(100);
        l1.check();
        assertTrue(l1.size()==1);

        l1.add(100);
        l1.check();
        assertTrue(l1.size()==2);

        l1.add(100);
        l1.check();
        assertTrue(l1.size()==3);

        l1.add(2,2);
        l1.check();
        assertTrue(l1.size()==4);
*/

    }

    private static void assertTrue(boolean condition) {
        if (!condition) {
            throw new RuntimeException("");
        }
    }
}
