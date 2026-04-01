public class HelloApp {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("HELLO, WORLD!");
        } else {
            String names = String.join(", ", args);
            System.out.println("HELLO, " + names + " !!");
        }
    }
}