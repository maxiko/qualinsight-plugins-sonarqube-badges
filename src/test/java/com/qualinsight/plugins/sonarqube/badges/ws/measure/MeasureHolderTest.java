/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualinsight.plugins.sonarqube.badges.ws.measure;

import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageColor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author mignatenko
 */
public class MeasureHolderTest {
    
    public MeasureHolderTest() {
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
     * Test of metricName method, of class MeasureHolder.
     */
    @Test
    public void testMetricName() {
        System.out.println("Test metricName");
        MeasureHolder instance = new MeasureHolder("tests");
        String expResult = "unit tests";
        String result = instance.metricName();
        assertEquals(expResult, result);
    }

    /**
     * Test of value method, of class MeasureHolder.
     */
    @Test
    public void testValue() {
        System.out.println("Test value");
        MeasureHolder instance = new MeasureHolder("tests");
        String expResult = "N/A";
        String result = instance.value();
        assertEquals(expResult, result);
    }

    /**
     * Test of backgroundColor method, of class MeasureHolder.
     */
    @Test
    public void testBackgroundColor() {
        System.out.println("Test backgroundColor");
        MeasureHolder instance = new MeasureHolder("tests");
        SVGImageColor expResult = SVGImageColor.GRAY;
        SVGImageColor result = instance.backgroundColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBackgroundColor method, of class MeasureHolder.
     */
    @Test
    public void testSetBackgroundColor() {
        System.out.println("Test setBackgroundColor");
        SVGImageColor backgroundColor = SVGImageColor.GRAY;
        MeasureHolder instance = new MeasureHolder("tests");
        instance.setBackgroundColor(backgroundColor);
        assertNotNull(instance);
    }

    /**
     * Test of hashCode method, of class MeasureHolder.
     */
    @Test
    public void testHashCode() {
        System.out.println("Test hashCode");
        MeasureHolder instanceOne = new MeasureHolder("tests");
        MeasureHolder instanceTwo = new MeasureHolder("coverage");
        assertNotEquals(instanceOne.hashCode(), instanceTwo.hashCode());
    }

    /**
     * Test of equals method, of class MeasureHolder.
     */
    @Test
    public void testEquals() {
        System.out.println("Test equals");
        Object obj = null;
        MeasureHolder instance = new MeasureHolder("tests");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
