package Chapter5;

public class Break {

    public static void main(String[] args) {

        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("predshestvuyet operatoru break.");
                    if(t) break second;
                    System.out.println("ne budet rabotat");
                }
                System.out.println("ne budet rabotat");
            }
            System.out.println("sledueyt za blokom 2");
        }
    }
}
