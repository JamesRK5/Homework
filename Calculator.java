package homeworkclasscalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("What operation would you like to do, +, -, *, /?");
        Scanner inp=new Scanner(System.in);
        String op= inp.nextLine();
        System.out.println("What is the first number?");
        double num1=inp.nextDouble();
        System.out.println("What is the second number?");
        double num2=inp.nextDouble();
        DecimalFormat dfd= new DecimalFormat("0.00");
        switch (op){
            case "+":
                System.out.println(num1+op+num2+"="+(num1+num2));
                break;
            case "-":
                System.out.println(num1+op+num2+"="+(num1-num2));
                break;
            case "*":
                System.out.println(num1+op+num2+"="+dfd.format(num1*num2));
            case "/":
                System.out.println(num1+op+num2+"="+dfd.format(num1/num2));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
