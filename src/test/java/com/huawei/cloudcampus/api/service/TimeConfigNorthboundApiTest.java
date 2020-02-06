/*
 * 时间配置
 * 时间配置北向接口，主要特性： · 查询时区资源 · 查询时间配置信息（包括时区、夏令时和NTP） · 修改时间配置（包括时区、夏令时和NTP） 
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
import com.huawei.cloudcampus.api.model.TimeConfigDto;
import com.huawei.cloudcampus.api.model.TimeConfigRespDto;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeConfigNorthboundApi
 */
@Ignore
public class TimeConfigNorthboundApiTest {

    private final TimeConfigNorthboundApi api = new TimeConfigNorthboundApi();

    
    /**
     * 修改站点内时间配置
     *
     * ## 典型场景 ##    提供配置参数的接口，进行时间配置。 ## 接口功能 ##    修改时间配置。    配置NTP时，设备通过NTP进行时间同步；否则设备通过控制器进行时间同步。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configTest() throws ApiException {
        UUID siteId = null;
        TimeConfigDto body = null;
        TimeConfigRespDto response = api.config(siteId, body);

        // TODO: test validations
    }
    
    /**
     * 查询站点内时间配置
     *
     * ## 典型场景 ##    提供查询配置参数的接口，查询时间配置信息。 ## 接口功能 ##    获取时间配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        UUID siteId = null;
        TimeConfigRespDto response = api.getConfig(siteId);

        // TODO: test validations
    }
    
}
