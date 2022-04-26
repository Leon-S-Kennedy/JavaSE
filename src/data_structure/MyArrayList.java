package data_structure;

import java.util.Arrays;

//在数组对象的基础上继续封装出顺序表对象
/*
需要满足以下条件
1）size<=array.length
2）有用的元素的下标为[0,size)
3)由于顺序表不允许出现空洞,可选的下标范围[0,size]
4)[size,array.length)都应该是无效的元素
*/
public class MyArrayList {
    private long[] array;     //  1）存元素的空间  2）空间的容量
    private int size;         //元素的个数

    private void expand() {
        if (size < array.length) {
            return;
        } else {
            int newlength = array.length * 2;
            long[] longs = Arrays.copyOf(array, newlength);
            Arrays.fill(longs, size, newlength, Long.MIN_VALUE);
            array = longs;
        }
    }

    public MyArrayList() {
        array = new long[2];
        size = 0;

        //理论上非必须
        Arrays.fill(array, Long.MIN_VALUE);
    }

    public void add(long e) {
        expand();
        //将元素放在size处
        array[size] = e;
        //让size变化也就是+1
        size++;
    }

    public void add(int index, long e) {
        if (index < 0 || index > size) {
            throw new RuntimeException();
        } else if (size == 0 || index == size) {
            add(e);
        } else {
            size++;
            expand();
            for (int i = size - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = e;
        }
    }

    public void delete(int index) {
        if (size == 0) {
            throw new RuntimeException("无元素可删！！！");
        }
        if (index < 0 || index >= size) {
            throw new RuntimeException("");
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void removeAll(long e) {
        int f;
        int t = 0;
        for (f = 0; f < size; f++) {
            if (array[f] != e) {
                array[t] = array[f];
                t++;
            }
        }
        size = t;
        Arrays.fill(array, t, f, Long.MIN_VALUE);
    }

    public int getSize() {
        return size;
    }

    public long get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException();
        }
        return array[index];
    }

    public void check() {
        if (array == null) {
            throw new RuntimeException();
        }
        if (array.length == 0) {
            throw new RuntimeException();
        }
        if (size < 0) {
            throw new RuntimeException();
        }
        if (size > array.length) {
            throw new RuntimeException();
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == Long.MIN_VALUE) {
                throw new RuntimeException();
            }
        }
        for (int i = size; i < array.length; i++) {
            if (array[i] != Long.MIN_VALUE) {
                throw new RuntimeException();
            }
        }
    }

/*
    public static void main(String[] args) {
        MyArrayList l1 = new MyArrayList();
        l1.add(1);
        l1.add(1);
    }
*/
}
