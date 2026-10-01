import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter The First Number");
        int number1 = input.nextInt();

        System.out.print("Enter The Second Number");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;

        System.out.println("\n=====My Calculator=====");
        System.out.println("Number 1:\t" + number1);
        System.out.println("Number 2:\t" + number2);

        System.out.println("\nAddition:\t" + sum);
        System.out.println("Subtraction:\t" + difference);
        System.out.println("Multiplication:\t" + product);

        if (number2 != 0) {
            double quotient = (double) number1 / number2;
            System.out.println("Division:\t" + quotient);
        } else {
            System.out.println("Division:\tCannot divide by zero");
        }

        System.out.println("\n===== END =====");
        input.close();


    }
}
