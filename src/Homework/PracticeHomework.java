package Homework;

public class PracticeHomework {

    long convert(int minutes) {
        return minutes * 60;
    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNumber(int number) {
        return number + 1;
    }

    boolean equals = true;

    boolean isSameNum(int a, int b) {
        if (a != b) {
            equals = false;
        }
        return equals;
    }


    boolean lessThanOrEqualsToZero(int number) {
        if (number > 0) {
            return false;
        }else{
            return true;
        }
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        } else
            return array2.length;
    }


}
