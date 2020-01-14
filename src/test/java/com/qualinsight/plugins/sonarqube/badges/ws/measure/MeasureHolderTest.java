/*
 * qualinsight-plugins-sonarqube-badges
 * Copyright (c) 2015-2016, QualInsight
 * http://www.qualinsight.com/
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program. If not, you can retrieve a copy
 * from <http://www.gnu.org/licenses/>.
 */
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

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
