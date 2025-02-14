import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class MyFirstCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.asList("+", "-", "*", "/", "^", "√","sin","cos","log");
        System.out.print("please choose an operation: " + list);
        String choice = scanner.nextLine();
        double myNumber1=0;
        double myNumber2=0;
        if (!choice.equals("√")&&!choice.equals("sin")&&!choice.equals("cos")&&!choice.equals("log")) {
          myNumber1=CheckingNumbersInput.checkIn2(myNumber1);
          myNumber2=CheckingNumbersInput.checkIn3(myNumber2);
        } else  if (!choice.equals("sin")&&!choice.equals("cos")&&!choice.equals("log")){
            myNumber1=CheckingNumbersInput.checkIn(myNumber1);
        }else  if (!choice.equals("sin")&&!choice.equals("log")) {
            myNumber1=CheckingNumbersInput.checkIn(myNumber1);
        } else if (!choice.equals("log")){
            myNumber1=CheckingNumbersInput.checkIn(myNumber1);
        }else {
            myNumber1=CheckingNumbersInput.checkIn(myNumber1);
        }


        switch (choice){
                case "+":
                System.out.println(myNumber1+myNumber2);
                break;
                case "-":
                    System.out.println(myNumber1-myNumber2);
                    break;
                case "*":
                    System.out.println(myNumber1*myNumber2);
                break;
                case "/":
                    if ((myNumber2!=0)) {
                        System.out.println(myNumber1 / myNumber2);
                        break;
                    }else {
                        System.out.println("Eror: It is impossible to divide by zero!");
                        break;
                    }
            case "^":
                if (!(myNumber1<0&&myNumber2%1!=0)) {
                    System.out.println(Math.pow(myNumber1, myNumber2));
                    break;
                }else {
                    System.out.println("Error: It is not possible to calculate a power with a negative base and a decimal exponent");
                    break;
                }
            case "√":
                System.out.println(Math.sqrt(myNumber1));
                break;
            case "sin":
                System.out.println(Math.sin(myNumber1));
                break;
            case "cos":
                System.out.println(Math.cos(myNumber1));
                break;
            case "log":
                if (myNumber1 > 0) {
                    System.out.println(Math.log(myNumber1));
                } else {
                    System.out.println("Error: Logarithm is undefined for non-positive numbers.");
                }
                break;
            default:
                System.out.println("invalid operator!");
                break;


        }
        scanner.close();

    }
}