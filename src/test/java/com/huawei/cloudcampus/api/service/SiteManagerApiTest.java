/*
 * 站点管理
 * 站点管理第三方接口。 场景：对站点增删改查操作的第三方接口。
 *
 * OpenAPI spec version: 1.3.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.model.CreateSiteDto;
import com.huawei.cloudcampus.api.model.CreateSiteOut;
import com.huawei.cloudcampus.api.model.DeleteSiteDto;
import com.huawei.cloudcampus.api.model.DeleteSiteOut;
import com.huawei.cloudcampus.api.model.QuerySitesOut;
import com.huawei.cloudcampus.api.model.UpdateSitesDto;
import com.huawei.cloudcampus.api.model.UpdateSitesOut;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SiteManagerApi
 */
@Ignore
public class SiteManagerApiTest {

    private final SiteManagerApi api = new SiteManagerApi();

    
    /**
     * 创建站点
     *
     * ## 典型场景 ## 根据站点名称和描述，创建站点。 ## 接口功能 ## 创建站点。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSitesTest() throws ApiException {
        CreateSiteDto createSiteDto = null;
        CreateSiteOut response = api.createSites(createSiteDto);

        // TODO: test validations
    }
    
    /**
     * 删除站点
     *
     * ## 典型场景 ## 根据站点ID列表，删除对应的站点。 ## 接口功能 ## 删除站点。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSitesTest() throws ApiException {
        DeleteSiteDto deleteSiteDto = null;
        DeleteSiteOut response = api.deleteSites(deleteSiteDto);

        // TODO: test validations
    }
    
    /**
     * 查询站点
     *
     * ## 典型场景 ## 传入页面索引和页面长度，查询站点信息。 ## 接口功能 ## 查询站点列表。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void querySitesTest() throws ApiException {
        Integer pageIndex = null;
        Integer pageSize = null;
        String name = null;
        QuerySitesOut response = api.querySites(pageIndex, pageSize, name);

        // TODO: test validations
    }
    
    /**
     * 修改站点
     *
     * ## 典型场景 ## 根据站点ID，修改站点的名称和描述信息。 ## 接口功能 ## 修改站点。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSiteTest() throws ApiException {
        String siteId = null;
        UpdateSitesDto updateSiteDto = null;
        UpdateSitesOut response = api.updateSite(siteId, updateSiteDto);

        // TODO: test validations
    }
    
}