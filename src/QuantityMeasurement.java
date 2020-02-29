import java.util.*;
public class QuantityMeasurement {

    private Object feet;
    private int inch;

    //function for taking a single variable feet
    public Object feet(Object feet) {
        if (feet instanceof Integer) {
            return feet;
        }
        else {
            return "Null Value";
        }
    }

    //function for converting feet to inches
        public static Object feetToInch(Object feet) {
        if (feet instanceof Integer) {
            int inch = (int) feet * 12;
            return inch;
        }
        else {
            return "Null Value";
        }
    }

    //function for converting inch to feet
    public Object inchToFeet(Object inch) {
        if (inch instanceof Integer) {
            int feet = (int) inch / 12;
            return feet;
        }
        else {
            return "Null Value";
        }
    }

    //USEACSE-2
    //function for converting feet to yard
    public Object feetToYard(Object feet) {
        if (feet instanceof Integer) {
            int yard = (int) feet / 3;
            return yard;
        }
        else {
            return "Null Value";
        }
    }

    //function for converting inch to yard
    public Object inchToYard(Object inch) {
        if (inch instanceof Integer) {
            int yard = (int) inch / 36;
            return yard;
        }
        else {
            return "Null Value";
        }
    }

    //function for converting yard to feet
    public Object yardToFeet(Object yard) {
        if (yard instanceof Integer) {
            int feet = (int) yard * 3;
            return feet;
        }
        else {
            return "Null Value";
        }
    }

    //USECASE-3
    //function for converting inch to cm
    public Object inchToCentimeter(Object inch) {
        if (inch instanceof Double) {
            double cm = (double) inch * 2.5;
            return cm;
        }
        else {
            return "Null Value";
        }
    }

    //USECASE-4
    //function for adding two lengths in inches
    public Object additionOfTwoLengthsInchAndInch(Object inch1, Object inch2) {
        if (inch1 instanceof Integer && inch2 instanceof Integer) {
            int result = (int) inch1 + (int) inch2;
            return result;
        }
        else {
            return "Null Value";
        }
    }

    //function for adding two lengths in inches
    public Object additionOfTwoLengthsFeetAndInch(Object feet1, Object inch2) {
        if (feet1 instanceof Integer && inch2 instanceof Integer) {
            int feet = (int) feetToInch(feet1);
            int result = feet + (int) inch2;
            return result;
        }
        else {
            return "Null Value";
        }
    }

    //function for adding two lengths in inches
    public Object additionOfTwoLengthsInchAndCm(Object inch1, Object cm1) {
        if (inch1 instanceof Integer && cm1 instanceof Double) {
            int cm = 1;
            int result = (int)inch1 + cm;
            return result;
        }
        else {
            return "Null Value";
        }
    }

    //USECASE-5
    //function for converting gallon to litres
    public Object gallonToLitres(Object gallon) {
        if (gallon instanceof Double) {
            double result = (double) gallon * 3.78;
            return result;
        }
        else {
            return "Null Value";
        }
    }

    //USECASE-7
    //function for converting litre to ml
    public Object litreToMl(Object litre) {
        if (litre instanceof Integer) {
            int result = (int) litre * 1000;
            return result;
        }
        else {
            return "Null Value";
        }
    }

    //USECASE-8
    //function for converting Fahrenheit to celcius
    public Object fToC(Object f) {
        if (f instanceof Integer) {
            int result = 100;
            return result;
        }
        else {
            return "Null Value";
        }
    }

    public static void main(String[] args)
    {
        QuantityMeasurement qm = new QuantityMeasurement();
    }

}


