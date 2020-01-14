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
import org.sonar.api.Plugin;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.internal.PluginContextImpl;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;


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
        SonarRuntime runtime = SonarRuntimeImpl.forSonarQube(Version.parse("7.9"), SonarQubeSide.SCANNER, SonarEdition.COMMUNITY);
        Plugin.Context context = new PluginContextImpl.Builder().setSonarRuntime(runtime).build();
        BadgesPlugin instance = new BadgesPlugin();
        instance.define(context);
    }
    
}
