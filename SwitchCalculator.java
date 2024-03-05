import java.util.Scanner;
public class SwitchCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your Choice: \n 1.Addition \n 2.Subraction \n 3.Multiplication \n 4.Division");
        System.out.println("*********************************\n");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("Enter the first number");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number");
                int num2 = sc.nextInt();
                System.out.println("The Answer is "+(num1 + num2));
            }
            break;
            case 2: {
                System.out.println("Enter the first number");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number");
                int num2 = sc.nextInt();
                System.out.println("The Answer is "+(num1 - num2));
            }
            break;
            case 3: {
                System.out.println("Enter the first number");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number");
                int num2 = sc.nextInt();
                System.out.println("The Answer is "+(num1 * num2));
            }
            break;
            case 4: {
                System.out.println("Enter the first number");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number");
                int num2 = sc.nextInt();
                System.out.println("The Answer is "+(num1 / num2));
            }
            break;
            default:{
                System.out.println("input mismatch");
            }
        }
    }
}
