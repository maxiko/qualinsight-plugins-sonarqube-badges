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

import com.qualinsight.plugins.sonarqube.badges.font.FontProvider;
import java.io.InputStream;

import com.qualinsight.plugins.sonarqube.badges.font.FontProviderLocator;
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
public class SVGImageGeneratorTest {
    
    public SVGImageGeneratorTest() {
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
     * Test of generateFor method, of class SVGImageGenerator.
     */
    @Test
    public void testGenerateFor() throws Exception {
        System.out.println("Test generateFor");
        SVGImageGenerator instance = new SVGImageGenerator(new FontProviderLocator());
        SVGImageData data = SVGImageData.Builder.instance(instance.fontProvider())
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();

        int expResult = 60;
        int result = instance.generateFor(data).read();
        assertEquals(expResult, result);
    }

    /**
     * Test of fontProvider method, of class SVGImageGenerator.
     */
    @Test
    public void testFontProvider() {
        System.out.println("Test fontProvider");
        SVGImageGenerator instance = new SVGImageGenerator(new FontProviderLocator());
        String expResult = "Dialog.plain";
        String result = instance.fontProvider().fontName();
        assertEquals(expResult, result);
    }
    
}
