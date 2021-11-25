package newhomework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        //Տպել մասիվի բոլոր էլեմենտները
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Տպեք մասիվի ամենամեծ թիվը
        int maxValue = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println(maxValue);

        //Տպեք մասիվի ամենափոքրը թիվը
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i])
                minValue = array[i];
        }
        System.out.println(minValue);


        //Տպեք մասիվի բոլոր զույգ էլեմենտները
        for (int i : array) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //Տպեք մասիվի բոլոր կենտ էլեմենտները
        for (int i : array) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //Տպեք զույգերի քանակը
        int evenValues = 0;
        for (int i : array) {
            if (i % 2 == 0)
                evenValues++;
        }
        System.out.println(evenValues);

        //Տպեք կենտերի քանակը
        int oddValues = 0;
        for (int i : array) {
            if (i % 2 != 0)
                oddValues++;
        }
        System.out.println(oddValues);

        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
        double average = (double) sum/ array.length;
        System.out.println(average);




    }
}


