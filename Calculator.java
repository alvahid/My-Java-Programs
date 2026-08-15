
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1,num2,result;
        char op;

        System.out.println("Only use +,-,*,/ as operators");

        System.out.print("Enter your first number: ");
        num1 = in.nextDouble();

        System.out.print("Enter your operator: ");
        op = in.next().charAt(0);

        System.out.print("Enter your second number: ");
        num2 = in.nextDouble();

        switch (op) {
            case '+':
                 result=num1+num2;
                System.out.println("Result: " +result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("Result: "+result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("Result: "+result);
                break;
            case'/':
                result=num1/num2;
                System.out.println("Result: "+result);
                break;
        }
        in.close();
    }
}
