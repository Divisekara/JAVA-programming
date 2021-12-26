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

        // constants(also called variables) have a fixed valu. Once we set them we
        // cannot change them.
        // by convention we use Capital letters to name constants. Multiple words can be
        // seperated using an underscore.

        // public static final double INTEREST_RATE = 0.04;

        // arithmetic expressions
        int x = 10 + 3;
        System.out.println(x);

        // addition
        int y = x + 2;
        y++; // this is increment operation
        System.out.println(y);
        x++; // this is increment operation
        System.out.println(x);
        x--; // this is decrement operation
        System.out.println(x);

        x = 10 * 3;
        x = 10 / 3;
        float var1 = 10 / 3;
        float var2 = 10 % 3;
        System.out.println(var1 + "this is division");
        System.out.println(var2 + "this is modulo division-modulous");

        // this is augmented assignment operator
        int var3 = 10;
        var3 += 10;
        System.out.println(var3);

        // the order of the operations will be BODMAS where prior is division and
        // multiplication and then addition and subtraction. before all of the
        // operations prior is

        // In java we have two types of casting
        // Implicit - happens automatically when we store a value in larger or more
        // precise data type
        // Explicit - we do it manually
        // Implicit casting happens because we try to store a short value (2 bytes) in
        // an int (4 bytes)

        // following is implicit casting
        short x_ = 1;
        int y_ = x_;
        System.out.println(y_);

        // usually we cant define same varibale name again.

        // following is explicit casting
        int x_1 = 1;
        short y_1 = (short) x;

        // to convert a string to a number we can use following methods.
        byte var4 = Byte.parseByte("1");
        short var5 = Short.parseShort("1");
        int var6 = Integer.parseInt("19");
        System.out.println(var6);
        System.out.println(var4);
    }
}
