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
public class SVGImageDataTest {
    
    public SVGImageDataTest() {
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
     * Test of valueText method, of class SVGImageData.
     */
    @Test
    public void testValueText() {
        System.out.println("Test valueText");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "10";
        String result = instance.valueText();
        assertEquals(expResult, result);
    }

    /**
     * Test of labelText method, of class SVGImageData.
     */
    @Test
    public void testLabelText() {
        System.out.println("Test labelText");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "bugs";
        String result = instance.labelText();
        assertEquals(expResult, result);
    }

    /**
     * Test of valueBackgroundColor method, of class SVGImageData.
     */
    @Test
    public void testValueBackgroundColor() {
        System.out.println("Test valueBackgroundColor");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        SVGImageColor expResult = SVGImageColor.RED;
        SVGImageColor result = instance.valueBackgroundColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of labelBackgroundColor method, of class SVGImageData.
     */
    @Test
    public void testLabelBackgroundColor() {
        System.out.println("Test labelBackgroundColor");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        SVGImageColor expResult = SVGImageColor.DARK_GRAY;
        SVGImageColor result = instance.labelBackgroundColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of labelWidth method, of class SVGImageData.
     */
    @Test
    public void testLabelWidth() {
        System.out.println("Test labelWidth");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "38";
        String result = instance.labelWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of valueWidth method, of class SVGImageData.
     */
    @Test
    public void testValueWidth() {
        System.out.println("Test valueWidth");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "25";
        String result = instance.valueWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of totalWidth method, of class SVGImageData.
     */
    @Test
    public void testTotalWidth() {
        System.out.println("Test totalWidth");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "63";
        String result = instance.totalWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of labelHalfWidth method, of class SVGImageData.
     */
    @Test
    public void testLabelHalfWidth() {
        System.out.println("Test labelHalfWidth");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "19";
        String result = instance.labelHalfWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of valueHalfWidth method, of class SVGImageData.
     */
    @Test
    public void testValueHalfWidth() {
        System.out.println("Test valueHalfWidth");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "50";
        String result = instance.valueHalfWidth();
        assertEquals(expResult, result);
    }

    /**
     * Test of fontFamily method, of class SVGImageData.
     */
    @Test
    public void testFontFamily() {
        System.out.println("fontFamily");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        String expResult = "DejaVu Sans,Verdana,Sans PT,Lucida Grande,Tahoma,Helvetica,Arial,sans-serif";
        String result = instance.fontFamily();
        assertEquals(expResult, result);
    }

    /**
     * Test of template method, of class SVGImageData.
     */
    @Test
    public void testTemplate() {
        System.out.println("template");
        FontProvider fontProvider = new SVGImageGenerator(new FontProviderLocator()).fontProvider();
        SVGImageData instance = SVGImageData.Builder.instance(fontProvider)
                .withTemplate(SVGImageTemplate.FLAT)
                .withLabelText("bugs")
                .withLabelBackgroundColor(SVGImageColor.DARK_GRAY)
                .withValueText("10")
                .withValueBackgroundColor(SVGImageColor.RED)
                .build();
        SVGImageTemplate expResult = SVGImageTemplate.FLAT;
        SVGImageTemplate result = instance.template();
        assertEquals(expResult, result);
    }
    
}
