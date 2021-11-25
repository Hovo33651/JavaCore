package Homework.dynamicArray;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;

    // ստուգել, եթե մասիվը դատարկ է՝ ավելացնել թվեր,
    // եթե դատարկ չէ՝ ավելացնել լենգթը extend() մեթոդով ու ավելացնել թվերը
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
        } else {
            if (array.length == size) {
                extend();
            }
            for (int i = size - 1; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }

    public void add(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }

    }

    // ստեղծէլ հին մասիվից 10-ով ավելի մեծ լենգթ-ով նոր մասիվ
    // հին մասիվի էլէմենտները գցել նորի մեջ
    // նոր մասիվի հղումը վերագրել հին մասիվին
    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    //եթե մուտքագրված index թիվը մեծ է մասսիվի լենգթից կամ փոքր է 0-ից՝ վերադարձնել -1
    //այլապես վերադարձնել մասիվի index-երորդ էլեմենտը
    int getByIndex(int index) {
        if (index > array.length - 1 || index < 0) {
            return -1;
        }
        return array[index];
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    //տպել մասիվի էլեմենտները,բացառությամբ դատարկների
    public void print() {
        System.out.print("array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public boolean isExist(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}




