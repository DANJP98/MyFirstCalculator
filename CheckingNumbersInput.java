import java.util.Scanner;
public class CheckingNumbersInput {
    public static double checkIn(Scanner scanner,String message) {
        double number;
        while (true){
            System.out.println(message);
            if(scanner.hasNextDouble()){
               number= scanner.nextDouble();
               scanner.nextLine();
               return number;
            }else {
                System.out.println("Error: enter only a number!");
                scanner.next();
            }
        }
    }
    public static int checkIn4(int click) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Click 1 to see the calculation history or 0 to exit!:");
            if (scanner.hasNextInt()) {
                click = scanner.nextInt();

                if (click==1||click==0){
                    break;
                }else {
                    System.out.println("Eror: enter only 1/0: ");
                }
            } else {
                System.out.println("Eror: enter only numbers (1/0): ");
                scanner.next();
            }
        }
        return click;
    }
}
