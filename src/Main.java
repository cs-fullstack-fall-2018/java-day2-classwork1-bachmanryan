import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String names1 = "very awesome";
        String names2 = "";
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("How awesome is Kenn and Kevin");
        names2 = consoleInput.nextLine();

        while (! names2.equals(names1)){
            System.out.println("Nope");
            names1 = consoleInput.nextLine();
        }
    }
}
