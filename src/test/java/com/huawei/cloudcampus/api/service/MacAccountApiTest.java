/*
 * mac帐号管理
 * mac帐号管理
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
import com.huawei.cloudcampus.api.model.DataMacDto;
import com.huawei.cloudcampus.api.model.DeleteMacsOutput;
import com.huawei.cloudcampus.api.model.Ids;
import com.huawei.cloudcampus.api.model.MacDataList;
import com.huawei.cloudcampus.api.model.MacInputDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MacAccountApi
 */
@Ignore
public class MacAccountApiTest {

    private final MacAccountApi api = new MacAccountApi();

    
    /**
     * 创建mac账号
     *
     * ## 典型场景 ##    创建mac帐号。 ## 接口功能 ##    创建mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createMacAccountTest() throws ApiException {
        MacInputDto body = null;
        DataMacDto response = api.createMacAccount(body);

        // TODO: test validations
    }
    
    /**
     * 删除mac帐号
     *
     * ## 典型场景 ##    删除mac帐号。 ## 接口功能 ##    批量删除mac帐号。 ## 接口约束 ##    该接口支持北向操作管理员访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMacAccountTest() throws ApiException {
        Ids body = null;
        DeleteMacsOutput response = api.deleteMacAccount(body);

        // TODO: test validations
    }
    
    /**
     * 查询mac帐号
     *
     * ## 典型场景 ##    查询mac帐号。 ## 接口功能 ##    查询mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、pageSize默认按照1000进行分页。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMacAccountListTest() throws ApiException {
        Integer pageIndex = null;
        Integer pageSize = null;
        String searchName = null;
        String id = null;
        MacDataList response = api.getMacAccountList(pageIndex, pageSize, searchName, id);

        // TODO: test validations
    }
    
    /**
     * 修改mac帐号
     *
     * ## 典型场景 ##    修改mac帐号。 ## 接口功能 ##    修改mac帐号。 ## 接口约束 ##    1、该接口支持北向操作管理员访问，必须在用户会话建立后使用。    2、该接口为全量修改接口，按照最新的入参进行全量覆盖。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMacAccountTest() throws ApiException {
        String id = null;
        MacInputDto body = null;
        DataMacDto response = api.updateMacAccount(id, body);

        // TODO: test validations
    }
    
}
