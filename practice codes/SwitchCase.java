import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        switch (age) { // this is the key variable for the switch case.
            case 1:
                System.out.println("Still a baby haa");
                break;
            case 10:
                System.out.println("Still in grade 5 workd hard");
                break;
            case 20:
                System.out.println("Jeewithee tharuna kale...");
                break;
            case 25:
                System.out.println("Earn money as much as possible");
                break;
            default:
                System.out.println("Everything is uncertain you will die one day");
                break;
        }
    }

}

// make sure to put break keyword for just run the relevant case
