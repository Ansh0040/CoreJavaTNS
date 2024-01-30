package com.arya.statements;

public class statement {
    public static void main(String[] args) {
        switchStatement();
        elseifladder();
        Valid();
        ternaryOperation();
    }
    static void Valid(){
        boolean isValid = true;
        if (isValid) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }}
        static void elseifladder() {
            int marks = 70;
            if (marks >= 90) {
                System.out.println("Grade A");
            } else if (marks >= 80) {
                System.out.println("Grade B");
            }
            else if(marks>=70){
                System.out.println("Grade C");
            }
            else if(marks>=40){
                System.out.println("Grade D");
            }
            else{
                System.out.println("Fail");
            }
        }

        static void switchStatement() {
            char ch = '1';
            switch (ch) {
                case '1':
                    System.out.println("Monday");
                    break;
                case '7':
                    System.out.println("Sunday");
                    break;
                case '8':
                    System.out.println("Sunday +");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
            static void ternaryOperation(){
                int num1=10;
                int num2=20;
                int num3=15;
//                int greater=(num1>num2)?num1:num2;
//                System.out.println("Greater number in num 1 and num 2 is :"+greater);
                //nested ternary opeation
                int greater=(num1>num2)?
                        ((num1>num3)?num1:num3):
                        ((num2>num3)?num2:num3);
                System.out.println("Greater number is:"+greater);
            }
        }


