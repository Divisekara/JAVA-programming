public class operators {

    public static void main(String[] args) {
        byte var1 = 1;
        short var2 = 2;
        int var3 = 3; // mainly using
        long var4 = 4;
        float var5 = 5; // only used when numbers are decimal fractions
        double var6 = 6; // using so much
        char var7 = 7;
        boolean var8 = true; // using often working with states
        boolean var9 = false;

        System.out.println(var9);

        // we enclose characters with single quotes and strings with double quotes.
        // the default integer type in java is int.
        // the default floating point type is double
        // in java there are 8 primitive types and all the other types are reference
        // types which are also called as non primitive types.

        // to use reference type we need to allocate memory using the new operator. the
        // memory gets automatically released when no longer used.
        String name = "asitha";
        System.out.println(name);
        // even if strings are reference type we dont need to allocate memory using new
        // operator. since we have to use strings a lot inside a program.

        // strings are immutable - cant be changed or modify
        // everytime we change or modify a string then the string method will return a
        // new string and used string will remain unchanged. these kind of string
        // methods are. .replace .toUpperCase, toLowerCase.

        System.out.println(name.startsWith("asi")); // whether the string is starting with the sub string given
        System.out.println(name.endsWith("the")); // whether the string is ending with the subs string given as the
                                                  // arguement
        System.out.println(name.length()); // length of the string
        System.out.println(name.indexOf("ith")); // returining the first occurance of the given character/substring in
                                                 // the string.
        String replacing = name.replace("i", "sex"); // replace method will not change the existing string but it will
                                                     // return a string with replacement
        System.out.println(replacing);

        String upper = name.toUpperCase(); // converting the string all characters into uppercase
        System.out.println(upper);

        String lower = "SHANTHI".toLowerCase(); // converting all the string characters into lowercase.
        System.out.println(lower);

    }

}