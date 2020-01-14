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
package com.qualinsight.plugins.sonarqube.badges;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sonar.api.config.PropertyDefinition;

/**
 *
 * @author mignatenko
 */
public class BadgesPluginPropertiesTest {
    
    public BadgesPluginPropertiesTest() {
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
     * Test of properties method, of class BadgesPluginProperties.
     */
    @Test
    public void testProperties() {
        System.out.println("properties");
        int expResult = 3;
        //List<PropertyDefinition> expResult = new ArrayList<>();
        //expResult.add(PropertyDefinition.builder("qualinsight.badges.activation.gate").build());
        //expResult.add(PropertyDefinition.builder("qualinsight.badges.activation.measure").build());
        //expResult.add(PropertyDefinition.builder("qualinsight.badges.activation.ce_activity").build());
        List<PropertyDefinition> result = BadgesPluginProperties.properties();
        int size = result.size();
        assertEquals(expResult, size);
    }
    
}
