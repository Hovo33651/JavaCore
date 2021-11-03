package Homework.dynamicArray;

public class DynamicArray {

    private int[] array = new int[10];
    private int size = 0;


    // ստուգել, եթե մասիվը դատարկ է՝ ավելացնել թվեր,
    // եթե դատարկ չէ՝ ավելացնել լենգթը extend() մեթոդով ու ավելացնել թվերը

    public void add(int value) {
        if (array[array.length - 1] != 0) {
            extend();
            array[size++] = value;
        } else {
            array[size++] = value;
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

    //տպել մասիվի էլեմենտները,բացառությամբ դատարկների

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


