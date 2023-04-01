import java.util.Scanner;

public class Calculator{

    public int add(int x, int y){
        int result = x + y;
        return result;
    }

    public int subtract(int x, int y){
        int result = x - y;
        return result;
    }

    public int multiply(int x, int y){
        int result = x * y;
        return result;
    }

    public int divide(int x, int y){
        int result = x/y;
        return result;
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String operatorString = null;
        int answer = 0;

        System.out.println("Choose one of the following numbers to perform an operation:");
        System.out.println("Type in 1 for addition");
        System.out.println("Type in 2 for subtraction");
        System.out.println("Type in 3 for multiplicaiton");
        System.out.println("Type in 4 for division");
        int operation = sc.nextInt();

        Calculator calcObject = new Calculator();

        System.out.println("Enter two numbers for the operation");
        System.out.println("Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Number 2: ");
        int num2 = sc.nextInt();
       
        sc.close();

        if(operation == 1){
            answer = calcObject.add(num1, num2);    
            operatorString = "+";
        } else if(operation == 2){
            answer = calcObject.subtract(num1, num2);
            operatorString = "-";
        } else if (operation == 3){
            answer = calcObject.multiply(num1, num2);
            operatorString = "x";
        } else if (operation == 4){
            answer = calcObject.divide(num1, num2);
            operatorString = "/";
        }

        System.out.println("Your calculation is " + num1 + operatorString + num2 + ".");
        System.out.println("The answer is " + answer + ".");

    }
}
