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

import com.qualinsight.plugins.sonarqube.badges.font.FontProviderLocator;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageMinimizer;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageTemplate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author mignatenko
 */
public class QualityGateBadgeGeneratorTest {
    
    public QualityGateBadgeGeneratorTest() {
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
     * Test of svgImageInputStreamFor method, of class QualityGateBadgeGenerator.
     */
    @Test
    public void testSvgImageInputStreamFor() throws Exception {
        System.out.println("Test svgImageInputStreamFor");
        QualityGateBadge status = QualityGateBadge.OK;
        SVGImageTemplate template = SVGImageTemplate.FLAT;
        boolean blinkingValueBackgroundColor = false;
        SVGImageGenerator imageGenerator = new SVGImageGenerator(new FontProviderLocator());
        SVGImageMinimizer minimizer = new SVGImageMinimizer();
        QualityGateBadgeGenerator instance = new QualityGateBadgeGenerator(imageGenerator,minimizer);
        int expResult = 60;
        int result = instance.svgImageInputStreamFor(status, template, blinkingValueBackgroundColor).read();
        assertEquals(expResult, result);
    }
    
}
