/*
 * 终端用户列表信息查询
 * · 站点维度终端用户列表查询 · 站点维度TopN终端流量数据查询 · 设备维度下终端用户信息查询 
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
import com.huawei.cloudcampus.api.model.StationDataResp;
import com.huawei.cloudcampus.api.model.TrafficStatisticDataResp;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StationOpenApiApi
 */
@Ignore
public class StationOpenApiApiTest {

    private final StationOpenApiApi api = new StationOpenApiApi();

    
    /**
     * 查询设备维度下终端用户信息
     *
     * ## 典型场景 ##    设备维度下终端用户信息查询接口。 ## 接口功能 ##    基于单设备查询用户列表。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryDeviceStationInfoTest() throws ApiException {
        UUID deviceId = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        String status = null;
        String terminalMac = null;
        String terminalIP = null;
        String ssid = null;
        String sortKey = null;
        String account = null;
        StationDataResp response = api.queryDeviceStationInfo(deviceId, pageIndex, pageSize, status, terminalMac, terminalIP, ssid, sortKey, account);

        // TODO: test validations
    }
    
    /**
     * 查询站点维度下终端用户信息
     *
     * ## 典型场景 ##    提供站点维度查询终端用户信息列表的接口。 ## 接口功能 ##    基于站点查询终端用户列表。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySiteStationInfoTest() throws ApiException {
        UUID siteId = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        String status = null;
        String terminalMac = null;
        String terminalIP = null;
        String ssid = null;
        String sortKey = null;
        String account = null;
        StationDataResp response = api.querySiteStationInfo(siteId, pageIndex, pageSize, status, terminalMac, terminalIP, ssid, sortKey, account);

        // TODO: test validations
    }
    
    /**
     * 查询站点维度下TopN终端流量数据
     *
     * ## 典型场景 ##    提供查询指定站点的按照终端流量大小的Top N终端数据。 ## 接口功能 ##    基于站点查询TopN终端流量数据。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryTrafficStatisticInfoTest() throws ApiException {
        UUID siteId = null;
        String deviceType = null;
        String timeDimension = null;
        Integer top = null;
        Long beginTime = null;
        Long endTime = null;
        TrafficStatisticDataResp response = api.queryTrafficStatisticInfo(siteId, deviceType, timeDimension, top, beginTime, endTime);

        // TODO: test validations
    }
    
}
