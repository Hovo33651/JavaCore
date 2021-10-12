package Chapter5;

public class Switch {
    public static void main(String[] args) {

        int month = 4;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "to winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "to spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "to summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "to autumn";
                break;
            default:
                season = "to fictional months";
        }
        System.out.println("April belongs " + season + ".");
    }
}
