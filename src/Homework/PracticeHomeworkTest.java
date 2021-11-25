package Homework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {

        PracticeHomework test = new PracticeHomework();

        System.out.println("15 minutes are " + test.convert(15) + " seconds");
        System.out.println("10 years are " + test.calcAge(10) + " days");
        System.out.println("next number of 100 is " + test.nextNumber(100));

        boolean sameNum = test.isSameNum(4, 6);
        System.out.println(sameNum);

        boolean equalsToZero = test.lessThanOrEqualsToZero(-1);
        System.out.println(equalsToZero);

        boolean reverse = test.reverseBool(false);
        System.out.println(reverse);

        int maxLength = test.maxLength(new int[25], new int[20]);
        System.out.println(maxLength);

        }


    }

