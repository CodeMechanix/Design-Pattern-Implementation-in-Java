/*
The singleton pattern is one of the simplest design patterns.
This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.
This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
----------------------------------------------------
Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

The Singleton pattern solves two problems at the same time, violating the Single Responsibility Principle:
> Ensure that a class has just a single instance. Why would anyone want to control how many instances a class has? The most common reason for this is to control access to some shared resource—for example, a database or a file.
> Provide a global access point to that instance. Remember those global variables that you (all right, me) used to store some essential objects? While they’re very handy, they’re also very unsafe since any code can potentially overwrite the contents of those variables and crash the app.

-----------------------------------------------------
All implementations of the Singleton have these two steps in common:

1. Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
2. Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.
-----------------------------------------------------
Real-World Analogy
The government is an excellent example of the Singleton pattern. A country can have only one official government. Regardless of the personal identities of the individuals who form governments, the title, “The Government of X”, is a global point of access that identifies the group of people in charge.
-----------------------------------------------------

Link: https://refactoring.guru/design-patterns/singleton

 */
package com.codewithhasan.designpattern;

public class Singleton {

    // Create an object of Singleton
    private static Singleton instance = new Singleton();

    // Make the constructor private so that this class cannot be instantiated
    private Singleton(){}

    // Get the only object available
    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton - Hello World!");
    }
}
