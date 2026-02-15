package org.example.java17;

public interface PrivateMethodInInterface {
    private void show(){
        System.out.println("this is private method");
    }
    default void defaltMethod(){
        show();
    }
}
