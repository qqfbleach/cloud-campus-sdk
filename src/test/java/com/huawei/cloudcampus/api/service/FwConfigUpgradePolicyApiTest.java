/*
 * 防火墙特征库升级
 * 防火墙特征库升级接口 
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
import com.huawei.cloudcampus.api.model.ConfigPolicyResponse;
import com.huawei.cloudcampus.api.model.ConfigUpgradePolicyListDto;
import com.huawei.cloudcampus.api.model.GetPolicyResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FwConfigUpgradePolicyApi
 */
@Ignore
public class FwConfigUpgradePolicyApiTest {

    private final FwConfigUpgradePolicyApi api = new FwConfigUpgradePolicyApi();

    
    /**
     * 配置防火墙站点特征库升级策略
     *
     * ## 典型场景 ##   提供配置防火墙站点特征库升级策略接口。 ## 接口功能 ##   配置防火墙站点特征库升级策略。 ## 接口约束 ##   该接口必须在存在防火墙的站点下使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configUpgradePolicyTest() throws ApiException {
        ConfigUpgradePolicyListDto configUpgradePolicyListDto = null;
        ConfigPolicyResponse response = api.configUpgradePolicy(configUpgradePolicyListDto);

        // TODO: test validations
    }
    
    /**
     * 查询防火墙站点特征库升级策略
     *
     * ## 典型场景 ##   提供查询防火墙站点特征库升级策略接口。 ## 接口功能 ##   查询防火墙站点特征库升级策略。 ## 接口约束 ##   该接口必须在存在防火墙的站点下使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUpgradePolicyTest() throws ApiException {
        String siteId = null;
        GetPolicyResponse response = api.getUpgradePolicy(siteId);

        // TODO: test validations
    }
    
}
