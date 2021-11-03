package Homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 1; i < 11; i++) {
            da.add(i);
        }
        da.print();
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print(da.getByIndex(i) + " ");
        }
    }
}


