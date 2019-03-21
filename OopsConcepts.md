# OOPS CONCEPTS

Inheritance: - Inheritance is an integral part of OOPs which lets the properties of one class to be inherited by the other. It basically, helps in reusing the code and establish a relationship between different classes.

As we know, a child inherits the properties from his parents. A similar concept is followed in Java, where we have two classes:
1. Parent class ( Super or Base class )
2. Child class ( Subclass or Derived class )
A class which inherits the properties is known as Child Class whereas a class whose properties are inherited is known as Parent class.

Now, to inherit a class we need to use extends keyword. In the below example, class Son is the child class and class Mom is the parent class. The class Son is inheriting the properties and methods of Mom class.

class Son extends Mom
{
//your code
}

Types of Inheritance in Java
-- Single Inheritance: - one class inherits the properties of another. It enables a derived class to inherit the properties and behavior from a single parent class. This will, in turn, enable code reusability as well as add new features to the existing code.

-- Multi-level Inheritance
When a class is derived from a class which is also derived from another class, i.e. a class having more than one parent class but at different levels, such type of inheritance is called Multilevel Inheritance.

-- Hierarchical Inheritance
When a class has more than one child classes (subclasses) or in other words, more than one child classes have the same parent class, then such kind of inheritance is known as hierarchical.

-- Hybrid Inheritance
Hybrid inheritance is a combination of two or more types of inheritance.

Now that we know what is Inheritance and its various types, let’s move further and see some of the important rules that should be considered while inheriting classes.

Rules of Inheritance in Java

RULE 1: Multiple Inheritance is NOT permitted in Java.

Multiple inheritance refers to the process where one child class tries to extend more than one parent class.

class Demo1
{
//code here
}
class Demo2
{
//code here
}
class Demo3 extends Demo1, Demo2
{
//code here
}
class Launch
{
public static void main(String args[])
{
//code here
}

In the above code, Demo3 is a child class which is trying to inherit two parent classes Demo1 and Demo2. This is not permitted as it results in a diamond problem and leads to ambiguity.

NOTE: Multiple inheritance is not supported in Java but you can still achieve it using interfaces.

RULE 2: Cyclic Inheritance is NOT permitted in Java.

It is a type of inheritance in which a class extends itself and form a loop itself. Now think if a class extends itself or in any way, if it forms cycle within the user-defined classes, then is there any chance of extending the Object class. That is the reason it is not permitted in Java.

class Demo1 extends Demo2
{
//code here
}
class Demo2 extends Demo1
{
//code here
}

In the above code, both the classes are trying to inherit each other’s characters which is not permitted as it leads to ambiguity.

RULE 3: Private members do NOT get inherited.

RULE 4: Constructors cannot be Inherited in Java.




Encapsulation: - Encapsulation in Java is a mechanism of wrapping up the data and code together as a single unit.
In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class.

Polymorphism: - Polymorphism means taking many forms, where 'poly' means many and 'morph' means forms. Polymorphism is the ability of a variable, function or object to take multiple forms. The most common use of polymorphism in OOPs occur when a parent class is used to refer a child class object. Polymorphism is also achieved through function overloading.

Polymorphism in Java is of two types:
-- Run time polymorphism
-- Compile time polymorphism

Run time polymorphism: - In Java, runtime polymorphism refers to a process in which a call to an overridden method is resolved at runtime rather than at compile-time. In this, a reference variable is used to call an overridden method of a superclass at run time. Method overriding is an example of run time polymorphism.

Compile time polymorphism: - In Java, compile time polymorphism refers to a process in which a call to an overloaded method is resolved at compile time rather than at run time. Method overloading is an example of compile time polymorphism. Method Overloading is a feature that allows a class to have two or more methods having the same name but the arguments passed to the methods are different.




Abstraction: - Abstraction is the methodology of hiding the implementation details from the user and only providing the functionality to the users. Let’s see this real-life example of a car where i’ll help you understand what exactly abstraction is.
If you consider the case of this car, here the mechanic is repairing a certain function in a car. But the user or you can say driver doesn’t want to know about these things, he just wants his car back in a working condition. So here, you basically segregate the implementation and show the other person what he actually wants to see and that exactly refers to abstraction.

Interface: - Interface in Java is a blueprint of a class or you can say it is a collection of abstract methods and static constants. In an interface, each method is public and abstract but it does not contain any constructor. Along with abstraction, interface also helps to achieve multiple inheritance in Java.
Note: You can achieve 100% abstraction using interfaces.
So an interface basically is a group of related methods with empty bodies.





