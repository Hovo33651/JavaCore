package Chapter7;

public class Recursion2 {
    public static void main(String[] args) {

        RecTest ob = new RecTest(10);
        int x = 0;

        for (int i = 0; i < 10; i++)
            ob.values[i] = i;


        ob.printArray(10);
    }
}

