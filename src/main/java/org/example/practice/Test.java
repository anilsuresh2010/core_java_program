package org.example.practice;

public class Test {
    public static int calculateFactorial(int number){
        if(number ==0 || number == 1){
            return 1;
        }
        return number*calculateFactorial(number-1);
    }
    public static void main(String[] args) {
        int i = Test.calculateFactorial(5);
        System.out.println(i);
    }
}
