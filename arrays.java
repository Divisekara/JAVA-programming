public class arrays {
    public static void main(String[] args) {
        // we use arrays to store list of objects. we can store any type of object in
        // array(primitive or reference type). all items(also called elements.) in an
        // array have the same type.

        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // another method to create java arrays.
        int[] numbers1 = { 1, 2, 3 };
        int var1 = 99;

        System.out.println(numbers);
        System.out.println("asitha" + "indrajtih" + 10 + 20 + var1); // all the variables converted into strings and
                                                                     // then concatenated with the strings
        System.out.println(10 + 20 + var1); // now the variables were considered as integers and then calculated the
                                            // summation pretty strange haa
        System.out.println(10 + 20 + var1 + "asitha indrajith"); // now even if we put a string at the end we couldnt
                                                                 // stop adding the integers together not as strings
        System.out.println(10 + 20 + "asitha indrajith" + 30 + var1); // integers before the string were added and after
                                                                      // the string were considered as strings and
                                                                      // concatednated them

    }

}
