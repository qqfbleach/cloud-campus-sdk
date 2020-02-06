/*
 * 防火墙ASPF配置
 * 防火墙配置ASPF第三方接口，主要特性： · 查询ASPF配置 · 修改ASPF配置 
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
import com.huawei.cloudcampus.api.model.AspfConfigDto;
import com.huawei.cloudcampus.api.model.AspfConfigRespDto;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AspfNorthboundApi
 */
@Ignore
public class AspfNorthboundApiTest {

    private final AspfNorthboundApi api = new AspfNorthboundApi();

    
    /**
     * 查询ASPF配置
     *
     * ## 典型场景 ##    提供查询ASPF配置参数的接口。 ## 接口功能 ##    查询ASPF配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAspfConfigTest() throws ApiException {
        UUID siteId = null;
        AspfConfigRespDto response = api.getAspfConfig(siteId);

        // TODO: test validations
    }
    
    /**
     * 修改ASPF配置
     *
     * ## 典型场景 ##    提供修改ASPF配置参数的接口。 ## 接口功能 ##    修改ASPF配置。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyAspfConfigTest() throws ApiException {
        UUID siteId = null;
        AspfConfigDto body = null;
        AspfConfigRespDto response = api.modifyAspfConfig(siteId, body);

        // TODO: test validations
    }
    
}
