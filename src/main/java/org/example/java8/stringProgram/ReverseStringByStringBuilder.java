package org.example.java8.stringProgram;

public class ReverseStringByStringBuilder {
    public static void main(String[] args) {
        String str = "Hello I am anil";
        StringBuilder sb = new StringBuilder(str);
        String reverseString =sb.reverse().toString();
        System.out.println(reverseString);
    }
}
