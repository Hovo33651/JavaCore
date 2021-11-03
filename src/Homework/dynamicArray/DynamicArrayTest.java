package Homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 0; i < 10; i++) {
            da.add(i);
        }
        da.print();

        System.out.println(da.getByIndex(0));
    }
}



