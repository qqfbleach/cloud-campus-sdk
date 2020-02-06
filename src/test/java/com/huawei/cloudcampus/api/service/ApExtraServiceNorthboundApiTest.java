/*
 * 站点内AP增值服务配置
 * 站点内AP增值服务配置北向接口，主要特性： * 查询站点内AP增值服务配置。 * 修改站点内AP增值服务配置。 
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
import com.huawei.cloudcampus.api.model.ApExtraServiceInputDto;
import com.huawei.cloudcampus.api.model.ApExtraServiceResponseDto;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApExtraServiceNorthboundApi
 */
@Ignore
public class ApExtraServiceNorthboundApiTest {

    private final ApExtraServiceNorthboundApi api = new ApExtraServiceNorthboundApi();

    
    /**
     * 修改站点内AP增值服务配置
     *
     * ## 典型场景 ##    提供配置参数的接口，修改站点内AP增值服务配置。 ## 接口功能 ##    修改站点内AP增值服务配置。 ## 接口约束 ##    该接口必须在站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configTest() throws ApiException {
        UUID siteId = null;
        ApExtraServiceInputDto body = null;
        ApExtraServiceResponseDto response = api.config(siteId, body);

        // TODO: test validations
    }
    
    /**
     * 获取站点内AP增值服务配置
     *
     * ## 典型场景 ##    提供查询配置参数的接口，查询站点内AP增值服务配置。 ## 接口功能 ##    获取站点内AP增值服务配置。 ## 接口约束 ##    该接口必须在站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        UUID siteId = null;
        ApExtraServiceResponseDto response = api.getConfig(siteId);

        // TODO: test validations
    }
    
}
