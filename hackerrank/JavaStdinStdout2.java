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
// we can do the string reading using the class bufferReader class as welll

// Scanner.nextInt() method does not read the new line character so we have to
// use another nextLine in order to read he newline character of that input.
// also the nextDouble may behave in the sam way.
// so make sure to put a nexLine after reading an integer or double.
// anothe good solution is to read the line numbers using the nextLine and then
// convert them into the integers or doubles using parseInt or parseDouble
// methods.
