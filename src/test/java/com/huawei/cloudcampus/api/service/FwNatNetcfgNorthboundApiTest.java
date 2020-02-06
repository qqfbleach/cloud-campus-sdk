/*
 * 防火墙设备NAT配置
 * 防火墙设备NAT配置第三方接口。
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
import com.huawei.cloudcampus.api.model.DeviceFwNatInfoDto;
import com.huawei.cloudcampus.api.model.FailedOperationDto;
import com.huawei.cloudcampus.api.model.FwNatDeleteDto;
import com.huawei.cloudcampus.api.model.FwNatDeleteResponseDto;
import com.huawei.cloudcampus.api.model.FwNatResponseDto;
import com.huawei.cloudcampus.api.model.GetFwNatResponseDto;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FwNatNetcfgNorthboundApi
 */
@Ignore
public class FwNatNetcfgNorthboundApiTest {

    private final FwNatNetcfgNorthboundApi api = new FwNatNetcfgNorthboundApi();

    
    /**
     * 创建防火墙设备NAT配置
     *
     * ## 典型场景 ##    提供创建防火墙设备NAT配置的接口。 ## 接口功能 ##    创建防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeviceFwNatConfigTest() throws ApiException {
        UUID deviceId = null;
        DeviceFwNatInfoDto deviceFwNatInfoDto = null;
        FwNatResponseDto response = api.createDeviceFwNatConfig(deviceId, deviceFwNatInfoDto);

        // TODO: test validations
    }
    
    /**
     * 删除防火墙设备NAT配置
     *
     * ## 典型场景 ##    提供删除防火墙设备NAT配置的接口。 ## 接口功能 ##    删除防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeviceFwNatConfigTest() throws ApiException {
        UUID deviceId = null;
        FwNatDeleteDto id = null;
        FwNatDeleteResponseDto response = api.deleteDeviceFwNatConfig(deviceId, id);

        // TODO: test validations
    }
    
    /**
     * 查询防火墙设备NAT配置
     *
     * ## 典型场景 ##    提供查询防火墙设备NAT配置的接口。 ## 接口功能 ##    查询防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceFwNatConfigTest() throws ApiException {
        UUID deviceId = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        GetFwNatResponseDto response = api.getDeviceFwNatConfig(deviceId, pageIndex, pageSize);

        // TODO: test validations
    }
    
    /**
     * 修改防火墙设备NAT配置
     *
     * ## 典型场景 ##    提供修改防火墙设备NAT配置的接口。 ## 接口功能 ##    修改防火墙设备NAT配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDeviceFwNatConfigTest() throws ApiException {
        UUID deviceId = null;
        DeviceFwNatInfoDto deviceFwNatInfoDto = null;
        FwNatResponseDto response = api.updateDeviceFwNatConfig(deviceId, deviceFwNatInfoDto);

        // TODO: test validations
    }
    
}
