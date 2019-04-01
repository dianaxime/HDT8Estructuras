/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DIANA
 */
public class VectorHeapTest {
    
    /*public VectorHeapTest() {
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
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        //System.out.println("add");
        //Object value = null;
        VectorHeap<Integer> instance = new VectorHeap<>();
        instance.add(50);
        instance.add(10);
        instance.add(5);
        instance.add(99);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        int expResult1 = 4;
        int result1 = instance.size();
        assertEquals(expResult1, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        //System.out.println("remove");
        VectorHeap<Integer> instance = new VectorHeap<>();
        //Object expResult = null;
        //Object result = instance.remove();
        instance.add(50);
        instance.add(10);
        instance.add(5);
        instance.add(99);
        int expResult = 5;
        int result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of isEmpty method, of class VectorHeap.
     */
    @Test
    public void testIsEmpty() {
        //System.out.println("isEmpty");
        VectorHeap instance = new VectorHeap();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        //System.out.println("size");
        VectorHeap instance = new VectorHeap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
    
    
}
