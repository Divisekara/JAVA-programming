import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        String s = "Asitha \nindrajith \ndivisekara";
        System.out.println(s);
        Scanner scanner = new Scanner(s); // since we have already defined the varible inside the scanner object for
                                          // this we cant use system.in functions with this object.
        System.out.println(scanner.nextLine());

        System.out.println(scanner.nextLine());

        System.out.println(scanner.nextLine());

        double fnum, snum;
        Scanner numbers = new Scanner(System.in);
        fnum = numbers.nextDouble(); // you can only input numbers decimal or integers
        System.out.println(fnum);
    }

}
