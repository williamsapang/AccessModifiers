package dev;

import qa.QaClass;

public class MyClass extends QaClass{

    public static void main (String[] args){
        MyClass myClass = new MyClass();
        myClass.myClassmethod();

    }
    public void myClassmethod(){
        myMethod();
    }
}
