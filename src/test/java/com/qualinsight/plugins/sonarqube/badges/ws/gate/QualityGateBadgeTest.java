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
package com.qualinsight.plugins.sonarqube.badges.ws.gate;

import com.qualinsight.plugins.sonarqube.badges.exception.SVGImageMinimizerException;
import com.qualinsight.plugins.sonarqube.badges.font.FontProviderLocator;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageColor;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageMinimizer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sonar.api.server.ws.WebService;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author mignatenko
 */
public class QualityGateBadgeTest {
    
    public QualityGateBadgeTest() {
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
     * Test of values method, of class QualityGateBadge.
     */
    @Test
    public void testValues() {
        System.out.println("Test values");
        int expResult = 6;
        int result = QualityGateBadge.values().length;
        assertEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class QualityGateBadge.
     */
    @Test
    public void testValueOf() {
        System.out.println("Test valueOf");
        String arg0 = "OK";
        QualityGateBadge expResult = QualityGateBadge.OK;
        QualityGateBadge result = QualityGateBadge.valueOf(arg0);
        assertEquals(expResult, result);
    }

    /**
     * Test of displayText method, of class QualityGateBadge.
     */
    @Test
    public void testDisplayText() throws SVGImageMinimizerException {
        System.out.println("Test displayText");
        QualityGateBadge instance = QualityGateBadge.OK;
        String expResult = "passing";
        String result = instance.displayText();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayBackgroundColor method, of class QualityGateBadge.
     */
    @Test
    public void testDisplayBackgroundColor() {
        System.out.println("Test displayBackgroundColor");
        QualityGateBadge instance = QualityGateBadge.OK;
        SVGImageColor expResult = SVGImageColor.GREEN;
        SVGImageColor result = instance.displayBackgroundColor();
        assertEquals(expResult, result);
    }
}
