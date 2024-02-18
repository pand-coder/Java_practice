import java.util.Scanner;

public class Caluclator {
    public static void main(String[] args) {
        greet();
        System.out.println("Sum: " + sum());
        System.out.println("Difference: " + sub());
        System.out.println("Product: " + mul());
        System.out.println("Quotient: " + div());
        System.out.println("Modulus: " + mod());
        System.out.println("Sine: " + sin());
        System.out.println("Cosine: " + cos());
        System.out.println("Tangent: " + tan());
        System.out.println("Cosecant: " + cosec());
        System.out.println("Secant: " + sec());
        System.out.println("Cotangent: " + cot());
        System.out.println("Logartihm: " + log());

    }

    static void greet() {
        System.out.println("Welcome to Scientific Calculator");
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Addition");
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        return num1 + num2;
    }

    static int sub() {
        Scanner in = new Scanner(System.in);
        System.out.println("Subtraction");
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        return num1 - num2;
    }

    static int mul() {
        Scanner in = new Scanner(System.in);
        System.out.println("Multiplication");
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        return num1 * num2;
    }

    static int div() {
        Scanner in = new Scanner(System.in);
        System.out.println("Division");
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return num1 / num2;
    }

    static int mod() {
        Scanner in = new Scanner(System.in);
        System.out.println("Modulus");
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        if (num2 == 0) {
            System.out.println("Error: Modulus by zero");
            return 0;
        }
        return num1 % num2;
    }

    static double sin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Sine");
        System.out.print("Enter radians: ");
        double rad = Math.toRadians(in.nextDouble());
        return Math.sin(rad);
    }

    static double cos() {
        Scanner in = new Scanner(System.in);
        System.out.println("Cosine");
        System.out.print("Enter radians: ");
        double rad = Math.toRadians(in.nextDouble());
        return Math.cos(rad);
    }

    static double tan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Tangent");
        System.out.print("Enter radians: ");
        double rad = Math.toRadians(in.nextDouble());
        return Math.tan(rad);
    }

    static double cosec() {
        Scanner in = new Scanner(System.in);
        System.out.println("Cosecant");
        System.out.print("Enter radians: ");
        double rad = Math.toRadians(in.nextDouble());
        double sine = Math.sin(rad);
        if (sine == 0) {
            System.out.println("Error 404");
            return 0;
        }
        return 1 / sine;
    }
static double sec()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Secant");
    System.out.print("Enter radians: ");
    double rad = Math.toRadians(in.nextDouble());
    double cos = Math.cos(rad);
    if(cos==0)
    {
        System.out.println("Error 404");
        return 0;
    }
    return 1/cos;
}

    static double cot()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Cotangent");
        System.out.print("Enter radians: ");
        double rad = Math.toRadians(in.nextDouble());
        double tan = Math.tan(rad);
        if(tan==0)
        {
            System.out.println("Error 404");
            return 0;
        }
        return 1/tan;
    }

    static double log()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Logartihm");
        System.out.print("Enter the number");
        double num=in.nextDouble();
        System.out.print("Enter the base");
        double base=in.nextDouble();
        return Math.log(num)/ Math.log(base);
    }








}
