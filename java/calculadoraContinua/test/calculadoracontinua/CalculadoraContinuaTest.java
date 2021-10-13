/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracontinua;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SebaFarias
 */
public class CalculadoraContinuaTest {
    
    public CalculadoraContinuaTest() {
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
     * Test of main method, of class CalculadoraContinua.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraContinua.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class CalculadoraContinua.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        char operation = ' ';
        double num1 = 0.0;
        double num2 = 0.0;
        double expResult = 0.0;
        double result = CalculadoraContinua.getResult(operation, num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarTitulo method, of class CalculadoraContinua.
     */
    @Test
    public void testMostrarTitulo() {
        System.out.println("mostrarTitulo");
        CalculadoraContinua.mostrarTitulo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedir2valores method, of class CalculadoraContinua.
     */
    @Test
    public void testPedir2valores() {
        System.out.println("pedir2valores");
        Scanner leer = null;
        double[] expResult = null;
        double[] result = CalculadoraContinua.pedir2valores(leer);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirOperacion method, of class CalculadoraContinua.
     */
    @Test
    public void testPedirOperacion() {
        System.out.println("pedirOperacion");
        Scanner leer = null;
        char expResult = ' ';
        char result = CalculadoraContinua.pedirOperacion(leer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarResultado method, of class CalculadoraContinua.
     */
    @Test
    public void testMostrarResultado() {
        System.out.println("mostrarResultado");
        double res = 0.0;
        CalculadoraContinua.mostrarResultado(res);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirContinuar method, of class CalculadoraContinua.
     */
    @Test
    public void testPedirContinuar() {
        System.out.println("pedirContinuar");
        Scanner leer = null;
        boolean expResult = false;
        boolean result = CalculadoraContinua.pedirContinuar(leer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salir method, of class CalculadoraContinua.
     */
    @Test
    public void testSalir() {
        System.out.println("salir");
        Scanner leer = null;
        CalculadoraContinua.salir(leer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
