import java.util.Scanner;

public class Tasks {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
//Task-1
        System.out.println("Task-1");
        System.out.println("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = sc.nextInt();

        String a = (firstNum == secondNum) ? "true" : "false";
        String b = (firstNum < secondNum) ? "true" : "false";
        String c = (firstNum <= secondNum) ? "true" : "false";
        String d = (firstNum > secondNum) ? "true" : "false";
        String e = (firstNum >= secondNum) ? "true" : "false";

        System.out.println("is 10 equal to 10? - " + a);
        System.out.println("is 10 less than 10? - " + b);
        System.out.println("is 10 less or equal to 10? - " + c);
        System.out.println("is 10 greater than 10? - " + d);
        System.out.println("is 10 greater or equal to 10? - " + e);

        //Task-2
        System.out.println("_____________________________________________________");

        System.out.println("Task-2");
        System.out.println("Enter first boolean value: ");
        boolean firstBooleanValue = sc.nextBoolean();
        System.out.println("Enter second boolean value: ");
        boolean secondBooleanValue = sc.nextBoolean();

        String a1 = (firstBooleanValue == secondBooleanValue) ? "true" : "false";
        System.out.println("Is b1 and b2 equal? - " + a1);

        //Task-3
        System.out.println("_____________________________________________________");

        System.out.println("Task-3");
        System.out.println("Enter the whole number: ");
        int wholeNumber = sc.nextInt();
        if (wholeNumber % 2 == 0) {
            System.out.println("true");
        } else
            System.out.println("false");

        //Task-4
        System.out.println("_____________________________________________________");

        System.out.println("Task-4");
        System.out.println("Enter the new whole number: ");
        int wholeNumber1 = sc.nextInt();
        if (wholeNumber1 % 2 == 1) {
            System.out.println("true");
        } else
            System.out.println("false");

        //Task-5
        System.out.println("_____________________________________________________");

        System.out.println("Task-5");
        System.out.println("Enter the boolean value: ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("Opposite of " + '"' + booleanValue + '"' + " is " + '"' + !booleanValue + '"');

        //Task-6
        System.out.println("_____________________________________________________");

        System.out.println("Task-6");
        System.out.println("Enter the first whole number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the second whole number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber == secondNumber || (firstNumber < 0 && secondNumber > 0) || (firstNumber > 100 && secondNumber > 100)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}
