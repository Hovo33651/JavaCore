package newhomework.practice;

public class Test {
    public static void main(String[] args) {

        PracticeHomework pc = new PracticeHomework();

        System.out.println(pc.calcAge(10));
        System.out.println(pc.convert(60));
        System.out.println(pc.isSameNum(7, 8));
        System.out.println(pc.lessThanOrEqualToZero(0));
        System.out.println(pc.maxLength(new int[25], new int[35]));
        System.out.println(pc.reverseBool(55 == 66));
        System.out.println(pc.nextNumber(30000));
    }
}
