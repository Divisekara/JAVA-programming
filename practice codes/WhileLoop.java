public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter);
            if (counter == 6) {
                System.out.println("The satement is broke");
                break;
            }
            counter++;
        }
    }
}
