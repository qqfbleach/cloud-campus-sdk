/*
 * 设备升级
 * · 查询设备文件 · 创建站点升级 · 查询站点升级 · 查询设备升级 · 取消设备升级 · 删除站点升级 · 重新升级设备 
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
import com.huawei.cloudcampus.api.model.AvailableVersion;
import com.huawei.cloudcampus.api.model.CommonResponseBody;
import com.huawei.cloudcampus.api.model.DeviceDetailListRes;
import com.huawei.cloudcampus.api.model.PolicyConfig;
import com.huawei.cloudcampus.api.model.PolicyConfigRes;
import com.huawei.cloudcampus.api.model.PolicyDeviceCancelInputList;
import com.huawei.cloudcampus.api.model.PolicySiteCancelInputList;
import com.huawei.cloudcampus.api.model.ReupgradeRequestBody;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UpgradeOpenApiApi
 */
@Ignore
public class UpgradeOpenApiApiTest {

    private final UpgradeOpenApiApi api = new UpgradeOpenApiApi();

    
    /**
     * 取消设备升级
     *
     * ## 典型场景 ##    取消设备升级。 ## 接口功能 ##    取消设备升级。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelPolicyTest() throws ApiException {
        PolicyDeviceCancelInputList policyDeviceCancelInputList = null;
        CommonResponseBody response = api.cancelPolicy(policyDeviceCancelInputList);

        // TODO: test validations
    }
    
    /**
     * 删除站点升级
     *
     * ## 典型场景 ##    删除多站点升级计划。 ## 接口功能 ##    删除多站点升级计划。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。    建议先取消所有站点下正在升级的设备。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelSitePolicyTest() throws ApiException {
        PolicySiteCancelInputList policySiteCancelInputList = null;
        CommonResponseBody response = api.cancelSitePolicy(policySiteCancelInputList);

        // TODO: test validations
    }
    
    /**
     * 创建站点升级
     *
     * ## 典型场景 ##    创建多站点升级计划。 ## 接口功能 ##    创建多站点升级计划。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void policyConfigurationTest() throws ApiException {
        PolicyConfig policyConfig = null;
        PolicyConfigRes response = api.policyConfiguration(policyConfig);

        // TODO: test validations
    }
    
    /**
     * 查询站点升级
     *
     * ## 典型场景 ##    查询站点升级计划概要。 ## 接口功能 ##    查询站点升级计划概要。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryPolicyTest() throws ApiException {
        UUID siteId = null;
        String deviceModel = null;
        PolicyConfigRes response = api.queryPolicy(siteId, deviceModel);

        // TODO: test validations
    }
    
    /**
     * 查询设备升级
     *
     * ## 典型场景 ##    查询站点下具体设备的升级状态。 ## 接口功能 ##    查询站点下具体设备的升级状态。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryPolicyDetailTest() throws ApiException {
        UUID siteId = null;
        String deviceModel = null;
        DeviceDetailListRes response = api.queryPolicyDetail(siteId, deviceModel);

        // TODO: test validations
    }
    
    /**
     * 查询设备文件
     *
     * ## 典型场景 ##    根据设备款型查询可用文件列表。 ## 接口功能 ##    根据设备款型查询可用文件列表。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryVersionTest() throws ApiException {
        String deviceModel = null;
        AvailableVersion response = api.queryVersion(deviceModel);

        // TODO: test validations
    }
    
    /**
     * 重新升级设备
     *
     * ## 典型场景 ##    升级失败的设备重新升级。 ## 接口功能 ##    升级失败的设备重新升级。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reUpgradeTest() throws ApiException {
        ReupgradeRequestBody reupgradeRequestBody = null;
        CommonResponseBody response = api.reUpgrade(reupgradeRequestBody);

        // TODO: test validations
    }
    
}
