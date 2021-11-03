package Homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;


    public void add(int value) {
        if (array[array.length - 1] != 0) {
            extend();
            array[size++] = value;
        } else {
            array[size++] = value;
        }
    }

    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    int getByIndex(int index) {
        if (index > array.length - 1 || index < 0) {
            return -1;
        }
        return array[index];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


