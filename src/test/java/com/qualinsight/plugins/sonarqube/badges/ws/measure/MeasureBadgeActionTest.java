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
package com.qualinsight.plugins.sonarqube.badges.ws.measure;

import com.qualinsight.plugins.sonarqube.badges.exception.SVGImageMinimizerException;
import com.qualinsight.plugins.sonarqube.badges.font.FontProviderLocator;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageGenerator;
import com.qualinsight.plugins.sonarqube.badges.ws.SVGImageMinimizer;
import org.junit.*;
import org.sonar.api.server.ws.WebService;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author mignatenko
 */
public class MeasureBadgeActionTest {
    
    public MeasureBadgeActionTest() {
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
     * Test of createOn method, of class MeasureBadgeAction.
     */
    @Test
    public void testCreateOn() throws SVGImageMinimizerException {
        System.out.println("Test createOn");
        SVGImageGenerator imageGenerator = new SVGImageGenerator(new FontProviderLocator());
        SVGImageMinimizer minimizer = new SVGImageMinimizer();
        WebService.Context context = new WebService.Context();
        final WebService.NewController controller = context.createController("api/badges");
        MeasureBadgeAction instance = new MeasureBadgeAction(new MeasureBadgeRequestHandler(new MeasureBadgeGenerator(imageGenerator,minimizer),null));
        instance.createOn(controller);
        assertNotNull(instance);
    }
    
}
