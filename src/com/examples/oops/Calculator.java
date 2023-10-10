package com.examples.oops;

public class Calculator {
    public double firstNumber;  //instance variable, class variables, properties
    public double secondNumber;

    //Methods or Behaviours
    public double add(){ //Method Signature
        double result = firstNumber + secondNumber; //local variable
        return result;
    }

    public double add(double thirdNumber){
        return firstNumber+secondNumber+thirdNumber;
    }
    public double subtract(){
        return firstNumber - secondNumber;
    }

    public double multiply(){
        return firstNumber * secondNumber;
    }

    public double divide(){
        return firstNumber / secondNumber;
    }
}
