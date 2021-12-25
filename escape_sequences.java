public class escape_sequences {
    public static void main(String[] args) {
        // lets see how escape characters will work
        // for escaping a backslash where backslach is the escaping character. pretty
        // funny ha.
        System.out.println("asitha\\indrajith\\divisekara"); // this escapes the escape character. where we can type
                                                             // down the escape character.
        System.out.println("asitha\"indrajith\"divisekara"); // printing the quotation mark since we cant use quotation
                                                             // mark inside strings
        System.out.println("asitha\nindrajith\ndivisekara"); // escaping to a new line
        System.out.println("asitha\tindrajith\tdivisekara"); // excaping a tab space

    }
}
