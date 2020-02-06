/*
 * AP站点射频配置
 * AP站点射频配置第三方接口说明。 
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.model.DeviceRadioConfigResponsesDto;
import com.huawei.cloudcampus.api.model.FailedOperation;
import com.huawei.cloudcampus.api.model.GroupRadioConfigApiDto;
import com.huawei.cloudcampus.api.model.GroupRadioConfigResponsesDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApGroupRadioNorthboundApi
 */
@Ignore
public class ApGroupRadioNorthboundApiTest {

    private final ApGroupRadioNorthboundApi api = new ApGroupRadioNorthboundApi();

    
    /**
     * 查询站点下所有AP设备射频配置信息
     *
     * ## 典型场景 ##  提供查询站点下所有AP设备射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询站点下所有AP设备射频信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllDeviceRadioConfigTest() throws ApiException {
        String siteId = null;
        DeviceRadioConfigResponsesDto response = api.getAllDeviceRadioConfig(siteId);

        // TODO: test validations
    }
    
    /**
     * 查询AP站点射频配置信息
     *
     * ## 典型场景 ##  提供查询AP站点射频配置信息接口。&lt;br&gt; ## 接口功能 ##  查询AP站点射频配置信息。&lt;br&gt; ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;          
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupRadioConfigTest() throws ApiException {
        String siteId = null;
        GroupRadioConfigResponsesDto response = api.getGroupRadioConfig(siteId);

        // TODO: test validations
    }
    
    /**
     * 修改AP站点射频配置信息
     *
     * ## 典型场景 ##  提供修改AP射频配置信息接口。&lt;br&gt;  ## 接口功能 ##  修改AP站点射频配置信息。&lt;br&gt;  ## 接口约束 ## 该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。&lt;br&gt;          
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupRadioConfigTest() throws ApiException {
        String siteId = null;
        GroupRadioConfigApiDto groupRadioConfigApiDto = null;
        GroupRadioConfigResponsesDto response = api.updateGroupRadioConfig(siteId, groupRadioConfigApiDto);

        // TODO: test validations
    }
    
}
