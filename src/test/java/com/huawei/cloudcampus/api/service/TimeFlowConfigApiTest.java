/*
 * 上网时长流量策略
 * 上网时长流量策略编辑查询开放API。 
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
import com.huawei.cloudcampus.api.model.CommonTimeFlowConfigDto;
import com.huawei.cloudcampus.api.model.DeleteTimeFlowConfigOutputDto;
import com.huawei.cloudcampus.api.model.TimeFlowConfigCommon;
import com.huawei.cloudcampus.api.model.TimeFlowConfigDeleteDto;
import com.huawei.cloudcampus.api.model.TimeFlowConfigsOutputDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeFlowConfigApi
 */
@Ignore
public class TimeFlowConfigApiTest {

    private final TimeFlowConfigApi api = new TimeFlowConfigApi();

    
    /**
     * 新增计费策略
     *
     * ## 操作场景 ##  提供新增计费策略北向接口。 ## 接口功能 ##  为指定的租户的站点新增计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTimeFlowConfigTest() throws ApiException {
        TimeFlowConfigCommon body = null;
        TimeFlowConfigsOutputDto response = api.addTimeFlowConfig(body);

        // TODO: test validations
    }
    
    /**
     * 删除计费策略
     *
     * ## 操作场景 ##  提供删除计费策略北向接口。 ## 接口功能 ##  为指定的租户的站点删除计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void delTimeFlowConfigTest() throws ApiException {
        TimeFlowConfigDeleteDto body = null;
        DeleteTimeFlowConfigOutputDto response = api.delTimeFlowConfig(body);

        // TODO: test validations
    }
    
    /**
     * 查询计费策略
     *
     * ## 操作场景 ##  提供查询计费策略北向接口。 ## 接口功能 ##  查询计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTimeFlowConfigTest() throws ApiException {
        String siteId = null;
        String id = null;
        String timeFlowName = null;
        TimeFlowConfigsOutputDto response = api.getTimeFlowConfig(siteId, id, timeFlowName);

        // TODO: test validations
    }
    
    /**
     * 修改计费策略
     *
     * ## 操作场景 ##  提供修改计费策略北向接口。 ## 接口功能 ##  为指定的租户的站点修改计费策略。 ## 接口约束 ##  该接口支持北向管理员访问，必须在用户会话建立后使用。  
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyTimeFlowConfigTest() throws ApiException {
        String id = null;
        TimeFlowConfigCommon body = null;
        CommonTimeFlowConfigDto response = api.modifyTimeFlowConfig(id, body);

        // TODO: test validations
    }
    
}
