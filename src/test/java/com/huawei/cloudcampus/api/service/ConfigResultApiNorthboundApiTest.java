/*
 * 配置结果查询
 * 查询配置结果
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
import com.huawei.cloudcampus.api.model.BatchGetDto;
import com.huawei.cloudcampus.api.model.StateResponseDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigResultApiNorthboundApi
 */
@Ignore
public class ConfigResultApiNorthboundApiTest {

    private final ConfigResultApiNorthboundApi api = new ConfigResultApiNorthboundApi();

    
    /**
     * 获取配置结果
     *
     * ## 典型场景 ##    提供配置参数的接口，获取配置结果。 ## 接口功能 ##    获取配置结果。 ## 接口约束 ##    只有租户管理员获取token并建立会话后才能调用该接口。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigResultsTest() throws ApiException {
        BatchGetDto batchGetDto = null;
        StateResponseDto response = api.getConfigResults(batchGetDto);

        // TODO: test validations
    }
    
}
