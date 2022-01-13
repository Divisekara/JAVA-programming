import java.util.Scanner;

public class JavaStdinStdout2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        double number2 = scanner.nextDouble();
        scanner.nextLine();
        String line = scanner.nextLine();
        // scanner.close();

        System.out.println("String: " + line);
        System.out.println("Double: " + number2);
        System.out.println("Int:" + number1);

    }
}

// next() can read the input till the space
// nextLine() read the input including space between the words unitl \n new line
// character.
