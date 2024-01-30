package com.arya.loops;

public class loopstatement {
    public static void main(String[] args) {
        forloop();
        whileloop();
        dowhile();
        forEachloop();
    }

    static void forloop(){
        for(int i=0;i<10;i++){
            System.out.print(i);
        }
        System.out.println();
    }
    static void whileloop(){
        int i=0;
        while(i<10){
            System.out.print(i);
            i++;
        }
        System.out.println();
    }
    static void dowhile(){
        int i=0;
        do{
            System.out.print(i);
            i++;
        }while(i<10);
        System.out.println();
    }
    static void forEachloop(){
        char[] chArray={'1','2','3'};
        for(char ch:chArray){
            System.out.println(ch);
        }
        boolean[] booleanArray={true,false,false, true};

        for(boolean booleanVariable:booleanArray){
            System.out.println(booleanVariable);
        }
    }
}
