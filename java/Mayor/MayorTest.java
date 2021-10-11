package mayor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class TestMayor extends TestCase {
  
  public void testGetMaxValue(){
    int a,b;    
    List<Integer> testList = new ArrayList<Integer>();
    testList.add(a);
    testList.add(b);
    assertTrue(Mayor.getMaxValue(testList) == Math.max(a,b));
  }
}


/**
 *
 * @author SebaFarias
 */
public class MayorTest {
    
    public MayorTest() {
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
     * Test of getMaxValue method, of class Mayor.
     */
    @Test
    public void testGetMaxValue() {
        
        System.out.println("getMaxValue MIN_VALUE vs MAX_VALUE");
        List<Integer> numeros = new ArrayList<>();
        int a = Integer.MIN_VALUE , b = Integer.MAX_VALUE;
        numeros.add(a);
        numeros.add(b);
        int expResult1 = Math.max(a, b);
        int result1 = Mayor.getMaxValue(numeros);
        assertEquals(expResult1, result1);
        
        System.out.println("getMaxValue same value");
        numeros = new ArrayList<>();
        numeros.add(b);
        numeros.add(b);
        int expResult2 = Math.max(a, b);
        int result2 = Mayor.getMaxValue(numeros);
        assertEquals(expResult2, result2);
    }    
}
