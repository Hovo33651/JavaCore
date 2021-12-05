package education.commands;

public interface GeneralCommands {

    String LOG_IN = "1";
    String REGISTER = "2";
    String QUIT = "0";

    static void commands() {
        System.out.println("PRESS " + LOG_IN + " TO LOG IN");
        System.out.println("PRESS " + REGISTER + " TO REGISTER");
        System.out.println("PRESS " + QUIT + " TO EXIT");
    }
}
