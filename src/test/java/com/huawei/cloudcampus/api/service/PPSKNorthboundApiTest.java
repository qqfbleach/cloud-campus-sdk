/*
 * PPSK帐号配置
 * PPSK帐号管理北向接口，主要包括： · 创建PPSK帐号 · 修改PPSK帐号 · 删除PPSK帐号 · 查询PPSK帐号 
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
import com.huawei.cloudcampus.api.model.BaseResponseDto;
import com.huawei.cloudcampus.api.model.PPSKPostRequestDto;
import com.huawei.cloudcampus.api.model.PPSKPutRequestDto;
import com.huawei.cloudcampus.api.model.PpskDeleteResponseDto;
import com.huawei.cloudcampus.api.model.PpskGetResponseDto;
import com.huawei.cloudcampus.api.model.PpskPostOrPutResponseDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PPSKNorthboundApi
 */
@Ignore
public class PPSKNorthboundApiTest {

    private final PPSKNorthboundApi api = new PPSKNorthboundApi();

    
    /**
     * 新增PPSK帐号
     *
     * ## 典型场景 ##    在一个站点内，一次新增一个PPSK帐号。 ## 接口功能 ##    新增PPSK帐号。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPpskAccountTest() throws ApiException {
        String siteId = null;
        PPSKPostRequestDto body = null;
        PpskPostOrPutResponseDto response = api.createPpskAccount(siteId, body);

        // TODO: test validations
    }
    
    /**
     * 删除PPSK帐号
     *
     * ## 典型场景 ##    通过帐号名删除PPSK帐号信息。 ## 接口功能 ##    通过帐号名删除PPSK帐号信息。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePpskAccountTest() throws ApiException {
        String siteId = null;
        String account = null;
        PpskDeleteResponseDto response = api.deletePpskAccount(siteId, account);

        // TODO: test validations
    }
    
    /**
     * 查询PPSK帐号
     *
     * ## 典型场景 ##    通过帐号名、VLAN ID查询PPSK帐号信息。 ## 接口功能 ##    通过帐号名、VLAN ID查询PPSK帐号信息。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPpskAccountTest() throws ApiException {
        String siteId = null;
        String account = null;
        String ssidName = null;
        Integer vlan = null;
        Integer pageIndex = null;
        Integer pageSize = null;
        PpskGetResponseDto response = api.getPpskAccount(siteId, account, ssidName, vlan, pageIndex, pageSize);

        // TODO: test validations
    }
    
    /**
     * 修改PPSK帐号
     *
     * ## 典型场景 ##    修改PPSK帐号信息，包括PSK、VLAN ID和帐号描述信息。 ## 接口功能 ##    修改PPSK帐号信息。 ## 接口约束 ##    该接口支持北向操作管理员管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePpskAccountTest() throws ApiException {
        String siteId = null;
        String account = null;
        PPSKPutRequestDto body = null;
        PpskPostOrPutResponseDto response = api.updatePpskAccount(siteId, account, body);

        // TODO: test validations
    }
    
}
