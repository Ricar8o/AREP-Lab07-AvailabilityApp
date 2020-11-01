package edu.escuelaing.arep.services;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.math.BigInteger;

import edu.escuelaing.arep.exceptions.PadovanException;

/**
 * Unit test for simple App.
 */
public class PadovanTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PadovanTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(PadovanTest.class);
    }

    /**
     * Test 0, 1 y 2
     */
    public void testInit() {
        PadovanNumber pNumber = new PadovanNumber();
        try {
            BigInteger test0 = pNumber.getNumber(0);
            assertEquals(BigInteger.ONE, test0 );
            BigInteger test1 = pNumber.getNumber(1);
            assertEquals(BigInteger.ONE, test1 );
            BigInteger test2 = pNumber.getNumber(2);
            assertEquals(BigInteger.ONE, test2 );
        } catch (PadovanException e) {
            e.printStackTrace();
        }
        
    }
    
    // Test for 10 term in Padovan sequence.
    public void testNumber10(){
        PadovanNumber pNumber = new PadovanNumber();
        try {
            BigInteger test10 = pNumber.getNumber(10);
            assertEquals(BigInteger.valueOf(12),test10);
        }catch(PadovanException e){
            e.printStackTrace();
        }
    }

    // Test for 22 term in Padovan sequence.
    public void testNumber22(){
        PadovanNumber pNumber = new PadovanNumber();
        try {
            BigInteger test22 = pNumber.getNumber(22);
            assertEquals(BigInteger.valueOf(351),test22);
        }catch(PadovanException e){
            e.printStackTrace();
        }
    }
}