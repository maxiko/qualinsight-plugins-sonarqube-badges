/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
