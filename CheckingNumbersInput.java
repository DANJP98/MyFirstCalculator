import java.util.Scanner;
public class CheckingNumbersInput {
    public static double checkIn(double myNumber1) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextDouble()) {
                myNumber1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Eror: enter only number: ");
                scanner.next();
            }
        }
        return myNumber1;
    }

    public static double checkIn2(double myNumber1) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number: ");
            if (scanner.hasNextDouble()) {
                myNumber1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Eror: enter only number: ");
                scanner.next();
            }
        }
        return myNumber1;
    }
    public static double checkIn3(double myNumber2) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter second number: ");
            if (scanner.hasNextDouble()) {
                myNumber2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Eror: enter only number: ");
                scanner.next();
            }
        }
        return myNumber2;
    }
}
