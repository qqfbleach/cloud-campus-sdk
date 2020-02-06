/*
 * CIS服务接口
 * CIS操作接口说明： 1、创建CIS隔离 2、创建CIS阻断 3、撤销CIS阻断/隔离 4、阻断隔离应用状态查询 5、CIS策略命中率查询 
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.model.CisResponseDto;
import com.huawei.cloudcampus.api.model.InterdictionDTO;
import com.huawei.cloudcampus.api.model.IsolationDTO;
import com.huawei.cloudcampus.api.model.PolicyHitsDTO;
import com.huawei.cloudcampus.api.model.QueryHitsResponseDTO;
import com.huawei.cloudcampus.api.model.QueryStatusResponseDTO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartitionPolicyApi
 */
@Ignore
public class PartitionPolicyApiTest {

    private final PartitionPolicyApi api = new PartitionPolicyApi();

    
    /**
     * 撤销CIS阻断/隔离
     *
     * ## 操作场景 ##   威胁解除，撤销阻断/隔离。 ## 接口功能 ##   撤销CIS阻断/隔离。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteThreatDefenseTest() throws ApiException {
        String blockId = null;
        CisResponseDto response = api.deleteThreatDefense(blockId);

        // TODO: test validations
    }
    
    /**
     * 创建CIS阻断策略
     *
     * ## 操作场景 ##   向防火墙/交换机下发阻断策略，阻断攻击源。 ## 接口功能 ##   创建CIS阻断策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void interdictionTest() throws ApiException {
        InterdictionDTO interdictionDTO = null;
        CisResponseDto response = api.interdiction(interdictionDTO);

        // TODO: test validations
    }
    
    /**
     * 创建CIS隔离策略
     *
     * ## 操作场景 ##   向防火墙/交换机下发创建隔离策略，隔离攻击源。 ## 接口功能 ##   创建CIS隔离策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void isolateVmTest() throws ApiException {
        IsolationDTO isolationDTO = null;
        CisResponseDto response = api.isolateVm(isolationDTO);

        // TODO: test validations
    }
    
    /**
     * CIS策略命中率查询
     *
     * ## 操作场景 ##   查询设定时间内CIS策略的命中率。 ## 接口功能 ##   CIS策略命中率查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryHitsTest() throws ApiException {
        PolicyHitsDTO policyHitsDTO = null;
        QueryHitsResponseDTO response = api.queryHits(policyHitsDTO);

        // TODO: test validations
    }
    
    /**
     * 查询阻断/隔离应用状态
     *
     * ## 操作场景 ##   查询阻断隔离策略的下发状态。 ## 接口功能 ##   阻断隔离应用状态查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryStatusTest() throws ApiException {
        String blockId = null;
        QueryStatusResponseDTO response = api.queryStatus(blockId);

        // TODO: test validations
    }
    
}
