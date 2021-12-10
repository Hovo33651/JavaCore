package education.commands;

public interface GeneralCommands extends AdminUserCommands {

    String LOG_IN = "1";
    String REGISTER = "2";

    static void commands() {
        System.out.println("PRESS " + LOG_IN + " TO LOG IN");
        System.out.println("PRESS " + REGISTER + " TO REGISTER");
        System.out.println("PRESS " + EXIT + " TO EXIT");
    }
}
