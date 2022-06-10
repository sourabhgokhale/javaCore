package argument;

public class calcu {
	

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc = new Scanner (System.in);

        char operator;
        double number1 , number2 , result;

        Scanner input = new Scanner(System.in);

        System.out.println("Select operation -- + , - , * , /");

        operator = input.next().charAt(0);

        System.out.println("Enter First number ");
        number1= input.nextDouble();

        System.out.println("Enter second Number");
        number2= input.nextDouble();

        switch (operator){
            case '+':
                result= number1+number2;
                System.out.println(number1+ "+" + number2 + "=" + result);
                break;

            case '-':
                result = number1-number2;
                System.out.println((number1+ "-" + number2 + "="+ result));
                break;
            case '*' :
                result = number1*number2;
                System.out.println(number1+ "x"+ number2 + "="+ result);
                break;

            case '/':
                result = number1/number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
                break;
            default:
                System.out.println("Invalid Operator");
                break;

        }

            input.close();

        }

}



}
