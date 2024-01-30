package com.arya.operators;

public class operator {
    public static void main(String[] args) {
        unaryOperator();
        bitwiseOperators();
    }
    static void unaryOperator(){
        int num1=10;
        int num2=20;
        int num3=30;
        int result=num1++ +num3+ --num2;
        System.out.println(result);
        System.out.println(num1);
        System.out.println(num2);
        unaryOperatorwithArgument(num3++);
    }
    static void unaryOperatorwithArgument(int num){
        System.out.println(num);
    }

    static void bitwiseOperators() {
        int num = 10;
        int result = 10 << 1;
        System.out.println(Integer.toBinaryString(result));
        System.out.println(result);
    }
}
