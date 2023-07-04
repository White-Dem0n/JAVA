package com.demon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hi There!!");

        String line = "Yeah it is me, yours loving, Harsh";
        System.out.println(line);

        //  datatypes

        int a = 007;
        float b = 0.07f;
        boolean isAdult = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(isAdult);

        // operators

        int num1 = 48, num2 = 77;


        System.out.print("The sum of num1 and num2 is ");
        System.out.println(num1 + num2);

        System.out.print("The minus of num1 and num2 is ");
        System.out.println(num1 - num2);

        System.out.print("The multiplication of num1 and num2 is ");
        System.out.println(num1 * num2);

        System.out.print("The devidation of num1 and num2 is ");
        System.out.println(num1 / num2);

        System.out.print("The difference of num1 and num2 is ");
        System.out.println(num1 % num2);

        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(--num1);


        num1 -= 8; num2 += 3;
        num1 *= 2; num2 /= 4;
        num1 %= 40;
        System.out.println(num1);
        System.out.println(num2);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = scan.nextInt();
        System.out.println(age);

        int i = 0;
        while(i<100){
            System.out.println(i++);
        }

        int j=0;
        do {
            System.out.println(j++);
        }while (j<100);


        int x;
        for(x=1;x<10;x++){

            if (x>3){
                break;
            }
            else {
                System.out.println(x);

            }
        }

        int [] marks = {99,56,78,36,88};
        for(int y:marks) {
            System.out.println(i);
        }

        float num11,num22;
        System.out.println("Enter first number");
        Scanner scan3 = new Scanner(System.in);
        num11 = scan3.nextFloat();

        System.out.println("Enter second number");
        Scanner scan2 = new Scanner(System.in);
        num22 = scan2.nextFloat();

        System.out.println(num11);
        System.out.println(num22);

        String instuctions = "Enter 0 for addition, 1 for subtractin, 2 for multiplication, 3 for devidation, 4 for persantage";
        System.out.println(instuctions);


        int input = scan.nextInt();

        switch(input){
            case 0:
                System.out.println("Adding the numbers");
                System.out.print("The value is ");
                System.out.println(num1 + num2);
                break;

            case 1:
                System.out.println("Subtracting the numbers");
                System.out.print("The value is ");
                System.out.println(num1 - num2);
                break;

            case 2:
                System.out.println("Multiplyinging the numbers");
                System.out.print("The value is ");
                System.out.println(num1 * num2);
                break;

            case 3:
                System.out.println("Deviding the numbers");
                System.out.print("The value is ");
                System.out.println(num1 / num2);
                break;

            case 4:
                System.out.println("Difference of the numbers");
                System.out.print("The value is ");
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Don't enter invalid input Bitch");
        }

    }
}

