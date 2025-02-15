import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class MyFirstCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> theListOfCalculations=new ArrayList<>();
        List<String> singleOperandOps = Arrays.asList("√", "sin", "cos", "log");
        String choice;
        int click=0;
        double sum=0;
        boolean x=true;
        double myNumber1=0;
        double myNumber2=0;
            while (x) {
                List<String> list = Arrays.asList("+", "-", "*", "/", "^", "√", "sin", "cos", "log", "(To stop typing <exit>");
                System.out.print("please choose an operation: " + list);
                choice = scanner.nextLine();
                if (!(choice.contains("exit"))) {
                    if (!singleOperandOps.contains(choice)) {
                         myNumber1 = CheckingNumbersInput.checkIn(scanner, "Enter first number: ");
                         myNumber2 = CheckingNumbersInput.checkIn(scanner, "Enter second number: ");
                    } else {
                         myNumber1 = CheckingNumbersInput.checkIn(scanner, "Enter number: ");
                    }


                    switch (choice) {
                        case "+":
                            System.out.println(myNumber1 + myNumber2);
                            sum=myNumber1 + myNumber2;

                            theListOfCalculations.add(myNumber1+"+"+myNumber2+"="+sum);
                            break;
                        case "-":
                            System.out.println(myNumber1 - myNumber2);
                            sum=myNumber1 - myNumber2;
                            theListOfCalculations.add(myNumber1+"-"+myNumber2+"="+sum);
                            break;
                        case "*":
                            System.out.println(myNumber1 * myNumber2);
                            sum=myNumber1 * myNumber2;
                            theListOfCalculations.add(myNumber1+"*"+myNumber2+"="+sum);
                            break;
                        case "/":
                            if ((myNumber2 != 0)) {
                                System.out.println(myNumber1 / myNumber2);
                                sum=myNumber1 / myNumber2;
                                theListOfCalculations.add(myNumber1+"/"+myNumber2+"="+sum);
                                break;
                            } else {
                                System.out.println("Eror: It is impossible to divide by zero!");
                                break;
                            }
                        case "^":
                            if (!(myNumber1 < 0 && myNumber2 % 1 != 0)) {
                                System.out.println(Math.pow(myNumber1, myNumber2));
                                sum=Math.pow(myNumber1, myNumber2);
                                theListOfCalculations.add(myNumber1+"^"+myNumber2+"="+sum);
                                break;
                            } else {
                                System.out.println("Error: It is not possible to calculate a power with a negative base and a decimal exponent");
                                break;
                            }
                        case "√":
                            System.out.println(Math.sqrt(myNumber1));
                            sum=Math.sqrt(myNumber1);
                            theListOfCalculations.add("√"+myNumber1+"="+sum);
                            break;
                        case "sin":
                            System.out.println(Math.sin(myNumber1));
                            sum=Math.sin(myNumber1);
                            theListOfCalculations.add("sin("+myNumber1+")="+sum);
                            break;
                        case "cos":
                            System.out.println(Math.cos(myNumber1));
                            sum=Math.cos(myNumber1);
                            theListOfCalculations.add("cos("+myNumber1+")="+sum);
                            break;
                        case "log":
                            if (myNumber1 > 0) {
                                System.out.println(Math.log(myNumber1));
                                sum=Math.log(myNumber1);
                                theListOfCalculations.add("log("+myNumber1+")="+sum);
                            } else {
                                System.out.println("Error: Logarithm is undefined for non-positive numbers.");
                            }
                            break;
                        default:
                            System.out.println("invalid operator!");
                            break;
                    }

                } else if (choice.contains("exit")) {
                    click=CheckingNumbersInput.checkIn4(click);
                      if(click==1){
                          System.out.println("\uD83D\uDCDC History of calculations:");
                          for (String record : theListOfCalculations) {
                              System.out.println(record);
                          }
                      }else {
                          break;
                      }
                    x=false;
                    System.out.println("Thanks for using the calculator! \uD83D\uDC4B\n");
                    break;
                }
            }

        scanner.close();

    }
}