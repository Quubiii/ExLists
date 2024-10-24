import java.util.Scanner;
import java.math.*;

public class List2 {

    public boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;
    }
    public int Max(int num1, int num2, int num3) {
        int max = Math.max(num1, Math.max(num2, num3));
        return max;
    }
    /*public int Factorial(int number) {
        for(int i = number; i > 0; i--) {
            
        }
    }*/
    public void Task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 1.");
        System.out.println("Enter the first integer");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second integer");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of given integers: "+sum);
    }
    public void Task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 2.");
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        if(isEven(num)){
            System.out.println("Number is EVEN.");
        } else {
            System.out.println("Number is ODD.");
        }

    }
    public void Task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 3.");
        System.out.println("Enter 1st integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter 3rd integer: ");
        int num3 = scanner.nextInt();

        System.out.println("The biggest of given integers: "+ Max(num1, num2, num3));
    }
    public void Task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 4.");
        System.out.println("Enter the type of equation you want to use [+, -, *, /]");
        char Equation = scanner.nextLine().charAt(0);
        System.out.println("Integer 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Integer 2: ");
        int num2 = scanner.nextInt();
        int result = 0;
        switch(Equation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 == 0) {
                    System.out.println("You cannot divide by 0!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Incorrect operation!");
        }

        System.out.println("Result: " + result);
    }
    public static void main(String[] args) {
        List2 List2 = new List2();
        //List2.Task1();
        //List2.Task2();
        //List2.Task3();
        //List2.Task4();
    }
}
