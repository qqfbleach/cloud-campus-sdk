/*
 * PoE电源状态查询
 * 查询设备PoE电源状态。 
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.model.GetPoePowerStateResp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetPoePowerStateApi
 */
@Ignore
public class GetPoePowerStateApiTest {

    private final GetPoePowerStateApi api = new GetPoePowerStateApi();

    
    /**
     * 查询PoE电源状态
     *
     * ## 典型场景 ##    查询PoE电源状态。 ## 接口功能 ##    查询PoE电源状态。 ## 接口约束 ##    北向接口管理员可以访问。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPoePowerStateTest() throws ApiException {
        String deviceId = null;
        GetPoePowerStateResp response = api.getPoePowerState(deviceId);

        // TODO: test validations
    }
    
}
