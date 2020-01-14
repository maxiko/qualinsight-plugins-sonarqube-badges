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

import com.qualinsight.plugins.sonarqube.badges.exception.SVGImageMinimizerException;
import com.qualinsight.plugins.sonarqube.badges.font.FontProviderLocator;
import com.qualinsight.plugins.sonarqube.badges.ws.ce.CeActivityBadgeAction;
import com.qualinsight.plugins.sonarqube.badges.ws.ce.CeActivityBadgeGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.ce.CeActivityBadgeRequestHandler;
import com.qualinsight.plugins.sonarqube.badges.ws.gate.QualityGateBadgeAction;
import com.qualinsight.plugins.sonarqube.badges.ws.gate.QualityGateBadgeGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.gate.QualityGateBadgeRequestHandler;
import com.qualinsight.plugins.sonarqube.badges.ws.measure.MeasureBadgeAction;
import com.qualinsight.plugins.sonarqube.badges.ws.measure.MeasureBadgeGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.measure.MeasureBadgeRequestHandler;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.sonar.api.server.ws.WebService;

/**
 *
 * @author mignatenko
 */
public class BadgesWebServiceTest {
    
    public BadgesWebServiceTest() {
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
     * Test of define method, of class BadgesWebService.
     */
    @Test
    public void testDefine() throws SVGImageMinimizerException {
        System.out.println("Test define");
        WebService.Context context = new WebService.Context();
        SVGImageGenerator imageGenerator = new SVGImageGenerator(new FontProviderLocator());
        SVGImageMinimizer minimizer = new SVGImageMinimizer();
        BadgesWebService instance = new BadgesWebService(
                new QualityGateBadgeAction(
                        new QualityGateBadgeRequestHandler(
                                new QualityGateBadgeGenerator(imageGenerator,minimizer),null)),
                new MeasureBadgeAction(
                        new MeasureBadgeRequestHandler(
                                new MeasureBadgeGenerator(imageGenerator,minimizer),null)),
                new CeActivityBadgeAction(
                        new CeActivityBadgeRequestHandler(
                                new CeActivityBadgeGenerator(imageGenerator,minimizer),null))
                );
        instance.define(context);
        assertNotNull(instance);
    }
    
}
