import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in); // this variable is for the scanner
        double fnum, snum, answer; // double means numbers
        System.out.println("Enter first number: ");
        fnum = bucky.nextDouble();
        System.out.println("Enter second number: ");
        snum = bucky.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}
