/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.choreo.connect.enforcer.security.jwt;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.wso2.carbon.apimgt.common.gateway.dto.JWTConfigurationDto;
import org.wso2.choreo.connect.enforcer.commons.model.APIConfig;
import org.wso2.choreo.connect.enforcer.commons.model.RequestContext;
import org.wso2.choreo.connect.enforcer.config.ConfigHolder;
import org.wso2.choreo.connect.enforcer.config.EnforcerConfig;
import org.wso2.choreo.connect.enforcer.config.dto.CacheDto;
@RunWith(PowerMockRunner.class)
@PrepareForTest({ConfigHolder.class})
@PowerMockIgnore("javax.management.*")
public class InternalAPIKeyAuthenticatiorTest {

    @Test
    public void extractInternalKeyTest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        PowerMockito.mockStatic(ConfigHolder.class);
        ConfigHolder configHolder = Mockito.mock(ConfigHolder.class);
        EnforcerConfig enforcerConfig = Mockito.mock(EnforcerConfig.class);
        CacheDto cacheDto = Mockito.mock(CacheDto.class);
        Mockito.when(cacheDto.isEnabled()).thenReturn(true);
        Mockito.when(enforcerConfig.getCacheDto()).thenReturn(cacheDto);
        JWTConfigurationDto jwtConfigurationDto = Mockito.mock(JWTConfigurationDto.class);
        Mockito.when(jwtConfigurationDto.isEnabled()).thenReturn(false);
        Mockito.when(enforcerConfig.getJwtConfigurationDto()).thenReturn(jwtConfigurationDto);
        Mockito.when(configHolder.getConfig()).thenReturn(enforcerConfig);
        Mockito.when(ConfigHolder.getInstance()).thenReturn(configHolder);

        String securityParam = "API-Key";

        String mockToken = "eyJraWQiOiJnYXRld2F5XUlMyNTYifQlzaGVyXC92MlwvYXBpc1wvaW50ZXJuYlzaGVyXC92XBpc1wvaW50ZXJuY." +
                "eyJzdWIiOiJhMzllYGV2OjQ0M1wvYXBpXC9hbVwvcHVibGlzaGVyXC92MlwvYXBpc1wvaW50ZXJuYWwta2V5Iiwia2V5dHlwZcl." +
                "cnZpY2VcL3YxLjAiLCJwdWJsaXNoZXIiOiJjaG9yZW9fZGV2X2FwaW1fYWRtaW4iLCJ2ZXJzaW9uIjoidj7MIXRnS-2UWHdrmd7";

        String secWebsocketProtocolHeader = "sec-websocket-protocol";

        // Test case to test for an Upgrade request sent from the choreo console
        // The token will be set to the sec-websocket-protocol header with c keyword
        // the value after choreo-internal-API-Key will be the token
        RequestContext.Builder builder = new RequestContext.Builder("/pets");
        builder.matchedAPI(new APIConfig.Builder("Petstore")
               .basePath("/choreo")
               .apiType("WS")
               .build());
        Map<String, String> headersMap = new HashMap<>();
        headersMap.put(
                secWebsocketProtocolHeader,
            "choreo-internal-API-Key, " + mockToken);
        builder.headers(headersMap);
        RequestContext requestContext = builder.build();
        InternalAPIKeyAuthenticator internalAPIKeyAuthenticator = new InternalAPIKeyAuthenticator(securityParam);
        Method extractInternalKeyMethod = InternalAPIKeyAuthenticator.class.getDeclaredMethod(
                "extractInternalKey",RequestContext.class);
        extractInternalKeyMethod.setAccessible(true);
        String internalKey = (String) extractInternalKeyMethod.invoke(internalAPIKeyAuthenticator, requestContext);
        Assert.assertEquals(internalKey, mockToken);

        // test case to test for Upgrade request sent with the API-Key header set
        RequestContext.Builder builder2 = new RequestContext.Builder("/pets");
        builder2.matchedAPI(new APIConfig.Builder("Petstore")
                .basePath("/choreo")
                .apiType("WS")
                .build());
        Map<String, String> headersMap2 = new HashMap<>();
        headersMap2.put(securityParam, mockToken);
        headersMap2.put(secWebsocketProtocolHeader, "chat");
        builder2.headers(headersMap2);
        RequestContext requestContext2 = builder.build();
        String internalKey2 = (String) extractInternalKeyMethod.invoke(internalAPIKeyAuthenticator, requestContext2);
        Assert.assertEquals(internalKey2, mockToken);

        // Test case to test for normal REST API HTTP Request
        RequestContext.Builder builder3 = new RequestContext.Builder("/pets");
        builder3.matchedAPI(new APIConfig.Builder("Petstore")
                .basePath("/choreo")
                .apiType("HTTP")
                .build());
        Map<String, String> headersMap3 = new HashMap<>();
        headersMap3.put(securityParam, mockToken);
        builder3.headers(headersMap3);
        RequestContext requestContext3 = builder.build();
        String internalKey3 = (String) extractInternalKeyMethod.invoke(internalAPIKeyAuthenticator, requestContext3);
        Assert.assertEquals(internalKey3, mockToken);
    }
}
