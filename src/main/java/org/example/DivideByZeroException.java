package org.example;

public class DivideByZeroException extends Throwable{
    public DivideByZeroException(String divideByZero){
        System.out.println("cant divide 0");
    }
}
