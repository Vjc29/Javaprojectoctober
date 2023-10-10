package com.examples.oops;

    public class AdvancedCalculator extends Calculator{
        double angle;

        public double sineAngle(){
            return Math.sin(angle);
        }

        public double cosineAngle(){
            return Math.cos(angle);
        }

        public double tangentAngle(){
            return Math.tan(angle);
        }
        public double divide(){
            if(secondNumber == 0 ){
                System.out.println("DIVIDE BY ZERO IS NOT APPLICABLE");
                return 0;
            }
            return firstNumber/secondNumber;
        }
    }

