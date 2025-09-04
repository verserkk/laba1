package demo.parallel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void testPlus() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, 2);
        a.plus(b);
        assertEquals(3.0, a.re, 1e-10);
        assertEquals(5.0, a.im, 1e-10);
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(2, 3);
        a.minus(b);
        assertEquals(3.0, a.re, 1e-10);
        assertEquals(4.0, a.im, 1e-10);
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(2, 3);
        Complex b = new Complex(1, 2);
        a.times(b);
        assertEquals(-4.0, a.re, 1e-10);
        assertEquals(7.0, a.im, 1e-10);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(4, 5);
        Complex b = new Complex(1, 2);
        a.divide(b);
        assertEquals(2.8, a.re, 1e-10);
        assertEquals(-0.6, a.im, 1e-10);
    }

    @Test
    public void testPower() {
        Complex a = new Complex(2, 3);
        a.power(2);
        assertEquals(-5.0, a.re, 1e-10);
        assertEquals(12.0, a.im, 1e-10);

        Complex b = new Complex(1, 1);
        b.power(0);
        assertEquals(1.0, b.re, 1e-10);
        assertEquals(0.0, b.im, 1e-10);
    }

    @Test
    public void testSin() {
        Complex a = new Complex(0, 0);
        Complex result = a.sin();
        assertEquals(0.0, result.re, 1e-10);
        assertEquals(0.0, result.im, 1e-10);

        Complex b = new Complex(Math.PI/2, 0);
        result = b.sin();
        assertEquals(1.0, result.re, 1e-10);
        assertEquals(0.0, result.im, 1e-10);
    }

    @Test
    public void testCos() {
        Complex a = new Complex(0, 0);
        Complex result = a.cos();
        assertEquals(1.0, result.re, 1e-10);
        assertEquals(0.0, result.im, 1e-10);

        Complex b = new Complex(Math.PI, 0);
        result = b.cos();
        assertEquals(-1.0, result.re, 1e-10);
        assertEquals(0.0, result.im, 1e-10);
    }

    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        assertEquals(25.0, a.lengthSQ(), 1e-10);
    }
}