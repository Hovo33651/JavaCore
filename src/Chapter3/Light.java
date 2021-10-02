package Chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 18600;
        days = 100000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("In " + days + " days ");
        System.out.println("the light travels " + distance + " miles");
    }

}
