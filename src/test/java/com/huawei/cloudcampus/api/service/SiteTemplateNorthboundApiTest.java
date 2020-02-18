/*
 * 站点模板管理
 * 站点模板第三方接口说明。 
 *
 * OpenAPI spec version: 1.2.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.model.BindingSiteListDto;
import com.huawei.cloudcampus.api.model.CommonDto;
import com.huawei.cloudcampus.api.model.CreateSiteTempDto;
import com.huawei.cloudcampus.api.model.CreateSiteTempResponseDto;
import com.huawei.cloudcampus.api.model.DeleteSiteTempDto;
import com.huawei.cloudcampus.api.model.DeleteSiteTempResponseDto;
import com.huawei.cloudcampus.api.model.GetSiteListDto;
import com.huawei.cloudcampus.api.model.GetSiteTempDto;
import com.huawei.cloudcampus.api.model.GetSiteTempResponseDto;
import com.huawei.cloudcampus.api.model.SiteTemplateAndSiteListResponseDto;
import com.huawei.cloudcampus.api.model.UpdateSiteTempDto;
import com.huawei.cloudcampus.api.model.UpdateSiteTempResponseDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SiteTemplateNorthboundApi
 */
@Ignore
public class SiteTemplateNorthboundApiTest {

    private final SiteTemplateNorthboundApi api = new SiteTemplateNorthboundApi();

    
    /**
     * 创建站点模板
     *
     * ## 典型场景 ##  提供创建站点模板接口。 ## 接口功能 ##  创建站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSiteTemplateTest() throws ApiException {
        CreateSiteTempDto body = null;
        CreateSiteTempResponseDto response = api.addSiteTemplate(body);

        // TODO: test validations
    }
    
    /**
     * 绑定一个或多个站点到站点模板
     *
     * ## 典型场景 ##  提供绑定一个或多个站点到站点模板接口。 ## 接口功能 ##  绑定一个或多个站点到站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bindSiteTemplateTest() throws ApiException {
        String siteTemplateId = null;
        BindingSiteListDto body = null;
        SiteTemplateAndSiteListResponseDto response = api.bindSiteTemplate(siteTemplateId, body);

        // TODO: test validations
    }
    
    /**
     * 删除站点模板
     *
     * ## 典型场景 ##  提供删除站点模板接口。 ## 接口功能 ##  删除站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSiteTemplatesTest() throws ApiException {
        DeleteSiteTempDto body = null;
        DeleteSiteTempResponseDto response = api.deleteSiteTemplates(body);

        // TODO: test validations
    }
    
    /**
     * 根据站点模板ID查询绑定的站点
     *
     * ## 典型场景 ##  提供根据站点模板ID查询绑定的站点接口。 ## 接口功能 ##  根据站点模板ID查询绑定的站点。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBindingSiteListTest() throws ApiException {
        String siteTemplateId = null;
        Integer pageSize = null;
        Integer pageIndex = null;
        String sort = null;
        GetSiteListDto response = api.getBindingSiteList(siteTemplateId, pageSize, pageIndex, sort);

        // TODO: test validations
    }
    
    /**
     * 根据站点ID查询绑定的站点模板
     *
     * ## 典型场景 ##  提供根据站点ID查询绑定的站点模板接口。 ## 接口功能 ##  根据站点ID查询绑定的站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBindingSiteTemplateTest() throws ApiException {
        String siteId = null;
        GetSiteTempDto response = api.getBindingSiteTemplate(siteId);

        // TODO: test validations
    }
    
    /**
     * 查询站点模板
     *
     * ## 典型场景 ##  提供查询站点模板接口。 ## 接口功能 ##  查询站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteTemplatesTest() throws ApiException {
        Integer pageSize = null;
        Integer pageIndex = null;
        String sort = null;
        GetSiteTempResponseDto response = api.getSiteTemplates(pageSize, pageIndex, sort);

        // TODO: test validations
    }
    
    /**
     * 站点模板解绑定一个或多个站点
     *
     * ## 典型场景 ##  提供站点模板解绑定一个或多个站点接口。 ## 接口功能 ##  站点模板解绑定一个或多个站点。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unbindSiteTemplateTest() throws ApiException {
        String siteTemplateId = null;
        BindingSiteListDto body = null;
        SiteTemplateAndSiteListResponseDto response = api.unbindSiteTemplate(siteTemplateId, body);

        // TODO: test validations
    }
    
    /**
     * 修改站点模板
     *
     * ## 典型场景 ##  提供修改站点模板接口。 ## 接口功能 ##  修改站点模板。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSiteTemplateTest() throws ApiException {
        String siteTemplateId = null;
        UpdateSiteTempDto body = null;
        UpdateSiteTempResponseDto response = api.updateSiteTemplate(siteTemplateId, body);

        // TODO: test validations
    }
    
}