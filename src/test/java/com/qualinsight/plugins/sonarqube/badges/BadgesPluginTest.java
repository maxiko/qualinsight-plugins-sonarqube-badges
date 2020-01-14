/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualinsight.plugins.sonarqube.badges;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sonar.api.Plugin;

/**
 *
 * @author mignatenko
 */
public class BadgesPluginTest {
    
    public BadgesPluginTest() {
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
     * Test of define method, of class BadgesPlugin.
     */
    @Test
    public void testDefine() {
        System.out.println("define");
        Plugin.Context context = null;
        BadgesPlugin instance = new BadgesPlugin();
        instance.define(context);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
