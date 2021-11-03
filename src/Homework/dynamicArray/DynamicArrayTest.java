package Homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        for (int i = 1; i < 11; i++) {
            da.add(i);
        }
          da.print();
        System.out.println();
        System.out.println(da.getByIndex(9));
    }
}



