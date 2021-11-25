package Homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        System.out.println(da.isEmpty());

        for (int i = 1; i < 10; i++) {
            da.add(i);
        }

        int[] numbers = {11,22,33,44,55,66};
        da.add(numbers);
        da.print();
        System.out.println();

        System.out.println(da.isExist(0));


    }
}


