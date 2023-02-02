import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double j=fah();


            while (j > -460) {
                double d = celsius(j);
                display(d);
                j=fah();
            }


    }

    static double fah() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter tempature");
        double f = myObj.nextDouble();
        return f;
    }

    static double celsius(double a) {
        double d = (a-32) *.555;
        return d;
    }

    static void display(double a) {
        System.out.println(a);
    }
}