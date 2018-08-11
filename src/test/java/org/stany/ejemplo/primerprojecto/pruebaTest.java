package org.stany.ejemplo.primerprojecto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stany
 */
public class pruebaTest {
    
    public pruebaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SepararNumeros method, of class prueba.
     * @throws java.lang.Exception
     */
    @Test
    public void testSepararNumeros() throws Exception {
        System.out.println("SepararNumeros");
        String cadena = "1+2-3";
        prueba instance = new prueba();
        String[] expResult = {"1","2","3"};
        String[] result = instance.SepararNumeros(cadena);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
        fail("The test case is a prototype.");
        }
        
    }
    
}
