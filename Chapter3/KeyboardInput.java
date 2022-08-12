package Chapter3;

public class KeyboardInput {
    public static void main(String[] args)
            throws java.io.IOException { // this line is necessary to hand input errors.

        char ch;

        System.out.println("Press a key followed by ENTER: ");

        ch = (char) System.in.read(); // get a char from console

        System.out.println("Your key is: " + ch);
    }
}
