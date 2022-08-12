public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int. Truncation will occur as the .0 is lost
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i; // no loss of info, byte can hold value 100
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i; // info loss this time, a byte cannot hold value 257
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for X
        ch = (char) b; // cast between incompatible types char and byte
        System.out.println("ch: " + ch);

    }
}
