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
package com.qualinsight.plugins.sonarqube.badges.ws;

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
public class SVGImageColorTest {
    
    public SVGImageColorTest() {
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
     * Test of values method, of class SVGImageColor.
     */
    @Test
    public void testValues() {
        System.out.println("Test values");
        int expResult = 5;
        int result = SVGImageColor.values().length;
        assertEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class SVGImageColor.
     */
    @Test
    public void testValueOf() {
        System.out.println("Test valueOf");
        String arg0 = "RED";
        SVGImageColor expResult = SVGImageColor.RED;
        SVGImageColor result = SVGImageColor.valueOf(arg0);
        assertEquals(expResult, result);
    }

    /**
     * Test of hexColor method, of class SVGImageColor.
     */
    @Test
    public void testHexColor() {
        System.out.println("Test hexColor");
        SVGImageColor instance = SVGImageColor.RED;
        String expResult = "#c33";
        String result = instance.hexColor();
        assertEquals(expResult, result);
    }
    
}
