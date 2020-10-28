package com.codewithhasan.designpattern;

public class SingletonMain {

    public static void main(String[] args) {

        // Illegal Construct
        // Compile Time Error: The constructor Singleton() is not visible
        // Singleton obj = new Singleton();

        // Get the only object available
        Singleton ob = Singleton.getInstance();

        // Shot the message
        ob.showMessage();;
    }
}
