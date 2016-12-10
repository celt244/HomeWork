//import java.util.Objects;

public class Calc {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static int sum(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static double minus(double a, int b) {
        return a - b;
    }

    public static int minus(String a, String b) {
        return Integer.parseInt(a) - Integer.parseInt(b);
    }

    public static int multiply (int a, int b) {
        return a * b;
    }

    public static double multiply(double a, int b) {
        return a * b;
    }

    public static int multiply(String a, String b) {
        return Integer.parseInt(a) * Integer.parseInt(b);
    }

    public static int division (int a, int b) {
        return a / b;
    }

    public static double division(double a, int b) {
        return a / b;
    }

    public static int division(String a, String b) {
        return Integer.parseInt(a) / Integer.parseInt(b);
    }
}
