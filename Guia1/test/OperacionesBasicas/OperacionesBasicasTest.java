/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesBasicas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ANDROID
 */
public class OperacionesBasicasTest {
    
    public OperacionesBasicasTest() {
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
     * Test of Sumar method, of class OperacionesBasicas.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas(10,5);
       assertTrue(instance.Sumar()==15);
    }

    /**
     * Test of Restar method, of class OperacionesBasicas.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        OperacionesBasicas instance = new OperacionesBasicas(10,5);
        assertTrue(instance.Restar()==5);
    }

    /**
     * Test of Multiplicar method, of class OperacionesBasicas.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(10,5);
        assertTrue(instance.Multiplicar()==50);
    }

    /**
     * Test of Dividir method, of class OperacionesBasicas.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas(10,5);
        assertTrue(instance.Dividir()==2);
    }
    
}
