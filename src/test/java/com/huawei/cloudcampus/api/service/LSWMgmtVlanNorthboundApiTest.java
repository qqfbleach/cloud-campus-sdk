/*
 * 交换机管理VLAN配置
 * LSW管理VLAN配置北向接口，主要特性：  · 查询交换机管理VLAN配置信息 · 修改交换机管理VLAN配置 
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
import com.huawei.cloudcampus.api.model.MgmtVlanDto;
import com.huawei.cloudcampus.api.model.MgmtVlanResponseDto;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LSWMgmtVlanNorthboundApi
 */
@Ignore
public class LSWMgmtVlanNorthboundApiTest {

    private final LSWMgmtVlanNorthboundApi api = new LSWMgmtVlanNorthboundApi();

    
    /**
     * 修改站点内交换机的管理VLAN配置
     *
     * ## 典型场景 ##    提供配置参数的接口，修改交换机的管理VLAN配置。 ## 接口功能 ##    修改交换机管理VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。&lt;br&gt;    如果当前交换机设备的上行口为Access类型，则直接将defaultVLAN设置为当前管理VLAN。&lt;br&gt;    如果当前交换机设备的上行口为Trunk类型，则用户配置管理VLAN前需要同时放行旧管理VLAN和新管理VLAN。&lt;br&gt; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configTest() throws ApiException {
        String deviceId = null;
        MgmtVlanDto body = null;
        MgmtVlanResponseDto response = api.config(deviceId, body);

        // TODO: test validations
    }
    
    /**
     * 获取站点内交换机的管理VLAN配置
     *
     * ## 典型场景 ##    提供查询配置参数的接口，查询LSW的管理VLAN配置信息。 ## 接口功能 ##    获取管理VLAN配置。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        String deviceId = null;
        MgmtVlanResponseDto response = api.getConfig(deviceId);

        // TODO: test validations
    }
    
}