//Demonstrating short circuit operator

public class ShortCircuitVSNormalOperator {
    public static void main(String[] args) {
        int n, d;

        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; // setting d to 0

        // the short circuit operator prevents 0 being divided by 0

        if (d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        //this is a normal operator
        //causes a divide by 0 error
        //because both expressions are being evaluated - 
        // 10 (n) % 0 (d)  -  how many times is 0 in 10? 
        if (d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

    }
}
