/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Client;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FakeClassnameTags123Api
 */
@Ignore
public class FakeClassnameTags123ApiTest {

    private final FakeClassnameTags123Api api = new FakeClassnameTags123Api();

    
    /**
     * To test class name in snake case
     *
     * To test class name in snake case
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testClassnameTest() throws ApiException {
        Client client = null;
        Client response = 
        api.testClassname(client);
        
        // TODO: test validations
    }
    
}
