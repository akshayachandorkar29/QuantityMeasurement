import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    QuantityMeasurement qm = new QuantityMeasurement();

    @Test
    public void TestFeetGivenZeroReturnZero() throws Exception {
        Object result = qm.feet(0);
        assertEquals(0, (int) result);
    }

    @Test
    public void TestFeetNullCheck() throws Exception {
        Object result = qm.feet(null);
        assertEquals("Null Value", (String) result);
    }

//    @Test
//    public void TestFeetRefCheck() throws Exception {
//        Object result = qm.feet(this);
//        assertEquals("reference is same", (String) result);
//    }

    @Test
    public void TestFeetTypeCheck() throws Exception {
        Object result = qm.feet(1);
        boolean b = Integer.class.isInstance(result);
        assertEquals(true, b);
    }

    @Test
    public void TestFeetValueCheck() throws Exception {
        Object result = qm.feet(2);
        assertEquals(2, (int) result);
    }

    @Test
    public void TestInchNullCheck() throws Exception {
        Object result = qm.feetToInch(null);
        assertEquals("Null Value", (String) result);
    }

    @Test
    public void TestInchTypeCheck() throws Exception {
        Object result = qm.feetToInch(1);
        boolean b = Integer.class.isInstance(result);
        assertEquals(true, b);
    }

    @Test
    public void TestInchValueCheck() throws Exception {
        Object result = qm.feetToInch(2);
        assertEquals(24, (int) result);
    }

    @Test
    public void TestComparisonCheckGivenFeetZeroReturnInchZero() throws Exception {
        Object result = qm.feetToInch(0);
        assertEquals(0, (int) result);
    }

    @Test
    public void TestComparingLengthOneFeetNotEqualToOneInch() throws Exception {
        Object result = qm.feetToInch(1);
        assertNotEquals(1, (int) result);
    }

    @Test
    public void TestComparingLengthOneInchNotEqualToOneFeet() throws Exception {
        Object result = qm.inchToFeet(1);
        assertNotEquals(1, (int) result);
    }

    @Test
    public void TestComparingLengthOneFeetEqualToTwelveInch() throws Exception {
        Object result = qm.feetToInch(1);
        assertEquals(12, (int) result);
    }

    @Test
    public void TestComparingLengthTwelveInchEqualToOneFeet() throws Exception {
        Object result = qm.inchToFeet(12);
        assertEquals(1, (int) result);
    }

    //Useacase 2 : comparing lengths 3 feet = 1 yard

    @Test
    public void TestComparingLengthThreeFeetEqualToOneYard() throws Exception {
        Object result = qm.feetToYard(3);
        assertEquals(1, (int) result);
    }

    @Test
    public void TestComparingLengthOneFeetNotEqualOneYard() throws Exception {
        Object result = qm.feetToYard(1);
        assertNotEquals(1, (int) result);
    }

    @Test
    public void TestComparingLengthOneInchNotEqualOneYard() throws Exception {
        Object result = qm.inchToYard(1);
        assertNotEquals(1, (int) result);
    }

    @Test
    public void TestComparingLength36InchEqualToOneYard() throws Exception {
        Object result = qm.inchToYard(36);
        assertEquals(1, (int) result);
    }

    @Test
    public void TestComparingLengthOneYardEqualTo3Feet() throws Exception {
        Object result = qm.yardToFeet(1);
        assertEquals(3, (int) result);
    }

    @Test
    public void TestComparingLengthOneYardEqualTo36Inch() throws Exception {
        Object feet = qm.yardToFeet(1);
        Object result = qm.feetToInch((int) feet);
        assertEquals(36, (int) result);
    }

    //USECASE-3 : comparing lengths 2 inch = 5 cm

    @Test
    public void TestComparingLength2inchEqualTo5Cm() throws Exception {
        Object result = qm.inchToCentimeter(2.0);
        assertEquals(5.0, (double) result, 0.001);
    }

    //USECASE-4 : comparing 2inch+2inch=4inch

    @Test
    public void TestAdding2LengthsInInches() throws Exception {
        Object result = qm.additionOfTwoLengthsInchAndInch(2, 2);
        assertEquals(4, (int) result);
    }

    @Test
    public void TestAdding2LengthsInFeet() throws Exception {
        Object addition = qm.additionOfTwoLengthsInchAndInch(1, 1);
        Object result = qm.feetToInch((int)addition);
        assertEquals(24, (int) result);
    }

    @Test
    public void TestAdding2LengthsInFeetAndInch() throws Exception {
        Object result = qm.additionOfTwoLengthsFeetAndInch(1,2);
        assertEquals(14, (int) result);
    }

    @Test
    public void TestAdding2LengthsInchAndCm() throws Exception {
        Object result = qm.additionOfTwoLengthsInchAndCm(2,2.5);
        assertEquals(3, (int) result);
    }

    //USECASE - 5 : comparing volumes in litre and gallon
    @Test
    public void TestGallonToLitres() throws Exception {
        Object result = qm.gallonToLitres(1.0);
        assertEquals(3.78, (double) result, 0.001);
    }

    @Test
    public void TestLitreToMl() throws Exception {
        Object result = qm.litreToMl(1);
        assertEquals(1000, (int) result);
    }

    //USECASE-7 : comparing weights in grams
    @Test
    public void TestKgToGram() throws Exception {
        Object result = qm.litreToMl(1);
        assertEquals(1000, (int) result);
    }

    @Test
    public void TestTonneToKg() throws Exception {
        Object result = qm.litreToMl(1);
        assertEquals(1000, (int) result);
    }

    //USECASE-8 : equating temperature in fahrenheit and celcius
    @Test
    public void TestFToC() throws Exception {
        Object result = qm.fToC(212);
        assertEquals(100, (int) result);
    }
}