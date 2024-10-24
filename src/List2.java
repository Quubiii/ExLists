import java.util.Scanner;
import java.util.ArrayList;

public class List2 {

    public Scanner scanner = new Scanner(System.in);

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
    public int Factorial(int number) {
        int num = 1;
        for(int i = number; i > 0; i--) {
            num *= i;
        }
        return num;
    }
    public boolean isPrime(int number) {
        if(number == 0 || number == 1) {
            return true;
        }
        for(int i = 2; i <= number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void nOfFibonacci(int n) {
        int temp1 = 0;
        int temp2 = 1;

        System.out.print("First " + n + " numbers of Fibonacci sequence: [");
        for (int i = 0; i < n; i++) {
            System.out.print(temp1);
            if (i < n - 1) {
                System.out.print(", ");
            }
            int next = temp1 + temp2;
            temp1 = temp2;
            temp2 = next;
        }
        System.out.print("]");
    }
    public ArrayList<Integer> ArraySum(ArrayList<Integer> ArrayOfInts) {
        ArrayList<Integer> FinalList = new ArrayList<>();
        for(int i = 0; i < ArrayOfInts.size(); i++) {
            for(int j = i + 1; j < ArrayOfInts.size(); j++) {
                int num1 = ArrayOfInts.get(i);
                int num2 = ArrayOfInts.get(j);
                int sum = num1 + num2;
                FinalList.add(sum);
                System.out.println(num1 + " + " + num2 + " = " + sum);
            }
        }
        System.out.println(FinalList);
        return FinalList;
    }
    public void Task1() {
        System.out.println("Task 1.");
        System.out.println("Enter the first integer");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second integer");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of given integers: "+sum);
    }
    public void Task2() {
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
    public void Task5() {
        System.out.println("Task 5.");
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Factorial: " + Factorial(number));
    }
    public void Task6() {
        System.out.println("Task 6.");
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        String txtOption = "";
        if(!isPrime(number)) {
            txtOption = " not";
        }
        System.out.println("Number " + number + " is" + txtOption + " a prime number.");
    }
    public void Task7() {
        System.out.println("Task 7.");
        System.out.println("How many elements of Fibonacci sequence do you want to print? ");
        int n = scanner.nextInt();
        nOfFibonacci(n);
    }
    public void Task8() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Task 8.");
        System.out.println("Enter elements of an array, one by one, using enter. If you want to stop adding new elements, type stop.");
        while(true) {
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                list.add(num);
                System.out.println("Added " + num + " to an array.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter an integer or type \"stop\"");
            }
        }
        ArraySum(list);
    }

    public static void main(String[] args) {
        List2 List2 = new List2();
        //List2.Task1();
        //List2.Task2();
        //List2.Task3();
        //List2.Task4();
        //List2.Task5();
        //List2.Task6();
        //List2.Task7();
        //List2.Task8();
    }
}
