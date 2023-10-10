package com.examples.oops;

public class Test {

    public static void main(String[] args) {

        Calculator calcObj = new Calculator();

        calcObj.firstNumber = 25;
        calcObj.secondNumber = 13;

        System.out.println("ADD Result: "+calcObj.add());
        System.out.println("Subtract Result: "+calcObj.subtract());
        System.out.println("Multiply Result: "+calcObj.multiply());
        System.out.println("Dividing Result: "+calcObj.divide());

        AdvancedCalculator advCalc = new AdvancedCalculator();//Obj Creation
        advCalc.firstNumber = 67;
        advCalc.secondNumber = 45;
        advCalc.angle = 30;

        System.out.println("ADDITION RESULT: "+advCalc.add());
        System.out.println("SUBTRACTION RESULT: "+advCalc.subtract());
        System.out.println("MULTIPLICATION RESULT: "+advCalc.multiply());
        System.out.println("DIVISION RESULT: "+advCalc.divide());
        System.out.println("SINE RESULT: "+advCalc.sineAngle());
        System.out.println("COSINE RESULT: "+advCalc.cosineAngle());
        System.out.println("TANGENT RESULT: "+advCalc.tangentAngle());

    }
}

//Data encapsulation - enclosing all the related components into a single entity
//Data Abstraction - hiding of implementation details
//Inheriteance - extedning the features of the base class
//Polymorphism - existing in many forms with same name

