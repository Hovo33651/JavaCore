package newhomework.dynamicArray;

public class DynamicArray {

   private int[] array = new int[10];

    private int size = 0;

    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


   private  void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    int getByIndex(int index){
        if(index < 0 || index > array.length-1){
            return -1;
        }
        return array[index];
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }
}

