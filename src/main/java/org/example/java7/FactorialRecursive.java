package org.example.java7;

public class FactorialRecursive {
    public static int calculateFactorial(int number){
        if(number ==0 || number==1){
            return 1;
        }
        return number*calculateFactorial(number-1);
    }
    public static void main(String[] args) {
        int value = 5;
       int output =FactorialRecursive.calculateFactorial(value);
       System.out.println(output);
    }
}
