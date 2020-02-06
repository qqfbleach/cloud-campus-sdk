/*
 * 设备出厂设置恢复
 * 设备恢复出厂设置第三方接口。
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
import com.huawei.cloudcampus.api.model.ResetDeviceRequest;
import com.huawei.cloudcampus.api.model.ResetDeviceResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResetNorthboundApi
 */
@Ignore
public class ResetNorthboundApiTest {

    private final ResetNorthboundApi api = new ResetNorthboundApi();

    
    /**
     * 批量恢复设备出厂设置
     *
     * ## 典型场景 ## 批量恢复设备出厂设置。 ## 接口功能 ## 批量恢复设备出厂设置，设备恢复出厂设置后，会从站点中移除。 ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。该接口为同步接口，接口耗时与设备网络状态有关，超时时间为1分钟。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetDeviceTest() throws ApiException {
        ResetDeviceRequest request = null;
        ResetDeviceResponse response = api.resetDevice(request);

        // TODO: test validations
    }
    
}
