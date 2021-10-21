package Chapter5;

public class FindPrime {

    public static void main(String[] args) {

        int num;
        boolean isPrime;

        num = 15;

        isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("parz tiv");
        else System.out.println("bard tiv");
    }
}
