package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Q1
//        System.out.print("Input the first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Input the second number: ");
//        int num2 = input.nextInt();
//        System.out.print("Input the third number: ");
//        int num3 = input.nextInt();
//
//        double smallest = compairNumbers(num1, num2, num3);
//        System.out.println("The smallest Value: "+ smallest);

        //Q2
//        checkNumberSign(10);
//        checkNumberSign(-10);
//        checkNumberSign(0);

        //Q3
//        System.out.println("1. A Password must have at least eight characters.");
//        System.out.println("2. A password consists of only letters and digits.");
//        System.out.println("3. A password must contain at least two digits.   ");
//        System.out.print("(You are agreeing to the above Terms and Conditions)\nInput a password: ");
//        String password = input.nextLine();
//        isValidPassword(password);



    }

    public static double compairNumbers(double num1, double num2, double num3){

        if(num1 < num2 && num1 < num3)
            return num1;
        else if(num2 < num3)
            return num2;
        else
            return num3;

    }

    public static void checkNumberSign(int num){

        if(num > 0)
            System.out.println("Positive");
        else if(num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }

    public static void isValidPassword(String password) {

        boolean isLengthOk = password.length() >= 8;

        boolean onlyCharactersAndDigits = true;
        for(char c: password.toCharArray())
            if(!Character.isLetterOrDigit(c)) {
                onlyCharactersAndDigits = false;
                break;
            }


        int digitCounter = 0;
        for (char c: password.toCharArray()){
            if(Character.isDigit(c))
                digitCounter++;
        }
        boolean atLeastTwoDigits = digitCounter >= 2;


        boolean passwordRules = (isLengthOk && onlyCharactersAndDigits && atLeastTwoDigits);

        if(passwordRules)
            System.out.println("Password is valid: " + password);
        else
            System.out.println("Password is invalid: " + password);
    }

}