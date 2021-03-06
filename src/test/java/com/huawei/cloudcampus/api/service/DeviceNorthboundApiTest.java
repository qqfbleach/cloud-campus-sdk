/*
 * 设备基本信息管理
 * 设备相关操作接口。 场景：对设备增删改查操作的第三方接口。
 *
 * OpenAPI spec version: 1.6.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.model.BatchModifyDeviceBean;
import com.huawei.cloudcampus.api.model.BatchModifyDeviceDto;
import com.huawei.cloudcampus.api.model.CommonResponseBean;
import com.huawei.cloudcampus.api.model.CreateDeviceBean;
import com.huawei.cloudcampus.api.model.CreateDeviceDto;
import com.huawei.cloudcampus.api.model.DeleteDeviceBean;
import com.huawei.cloudcampus.api.model.DeleteDeviceDto;
import com.huawei.cloudcampus.api.model.DeviceModelEntityList;
import com.huawei.cloudcampus.api.model.DeviceResponseBean;
import com.huawei.cloudcampus.api.model.GetDeviceModelEntityList;
import com.huawei.cloudcampus.api.model.GetDeviceResponseBean;
import com.huawei.cloudcampus.api.model.ModifyDeviceBean;
import com.huawei.cloudcampus.api.model.ModifyDeviceDto;
import com.huawei.cloudcampus.api.model.ReplaceDeviceDto;
import com.huawei.cloudcampus.api.model.ReplaceOriginalDeviceDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceNorthboundApi
 */
@Ignore
public class DeviceNorthboundApiTest {

    private final DeviceNorthboundApi api = new DeviceNorthboundApi();

    
    /**
     * 批量修改设备
     *
     * ## 典型场景 ## 批量修改设备的名称、站点等信息。 ## 接口功能 ##   批量修改设备。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchModifyDevicesTest() throws ApiException {
        BatchModifyDeviceDto batchModifyDeviceDto = null;
        BatchModifyDeviceBean response = api.batchModifyDevices(batchModifyDeviceDto);

        // TODO: test validations
    }
    
    /**
     * 创建设备
     *
     * ## 典型场景 ##  根据设备ESN、设备名称、设备描述、站点ID等进行设备创建。 ## 接口功能 ##  创建设备。 ## 接口约束 ##  该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDevicesTest() throws ApiException {
        CreateDeviceDto createDeviceDto = null;
        CreateDeviceBean response = api.createDevices(createDeviceDto);

        // TODO: test validations
    }
    
    /**
     * 删除设备
     *
     * ## 典型场景 ##  根据设备ID删除设备。 ## 接口功能 ##  删除设备。 ## 接口约束 ##  该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDevicesTest() throws ApiException {
        DeleteDeviceDto deviceIds = null;
        DeleteDeviceBean response = api.deleteDevices(deviceIds);

        // TODO: test validations
    }
    
    /**
     * 查询设备款型
     *
     * ## 典型场景 ## 在控制器上查询设备款型信息时使用。 ## 接口功能 ## 查询设备款型信息。 ## 接口约束 ## 该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeviceModelsTest() throws ApiException {
        DeviceModelEntityList response = api.getDeviceModels();

        // TODO: test validations
    }
    
    /**
     * 查询设备
     *
     * ## 典型场景 ##   查询设备信息。 ## 接口功能 ##   查询设备信息（真实设备和虚拟设备），包括所属站点、设备类型、设备名称、设备状态等拓扑信息，支持基于站点查询，支持基于字段排序。 ## 接口约束 ##   1、该接口支持租户下北向接口管理访问，必须在用户会话建立后使用;   2、若pageSize和pageIndex参数不传或者为非法参数，则默认按照pageSize&#x3D;1000，pageIndex&#x3D;1返回查询结果。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSiteDeviceTest() throws ApiException {
        Integer pageIndex = null;
        Integer pageSize = null;
        String neType = null;
        String deviceType = null;
        String siteId = null;
        String sort = null;
        String name = null;
        DeviceResponseBean response = api.getSiteDevice(pageIndex, pageSize, neType, deviceType, siteId, sort, name);

        // TODO: test validations
    }
    
    /**
     * 修改设备
     *
     * ## 典型场景 ##  修改设备基本信息时使用。 ## 接口功能 ##  修改设备基本信息。 ## 接口约束 ##  该接口必须在用户会话建立后使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyDevicesTest() throws ApiException {
        String deviceId = null;
        ModifyDeviceDto modifyDeviceDto = null;
        ModifyDeviceBean response = api.modifyDevices(deviceId, modifyDeviceDto);

        // TODO: test validations
    }
    
    /**
     * 替换设备
     *
     * ## 操作场景 ##  设备替换。 ## 接口功能 ##  设备替换。 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用， 替换前后设备款型必须一致。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceDeviceTest() throws ApiException {
        ReplaceDeviceDto replaceDeviceDto = null;
        CommonResponseBean response = api.replaceDevice(replaceDeviceDto);

        // TODO: test validations
    }
    
    /**
     * 替换设备款型
     *
     * ## 典型场景 ##  设备款型替换。 ## 接口功能 ##  支持替换款型，支持无ESN替换 ## 接口约束 ##  该接口支持租户下北向接口管理访问，必须在用户会话建立后使用， 替换前后设备款型必须一致。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void replaceOriginalDeviceTest() throws ApiException {
        ReplaceOriginalDeviceDto replaceOriginalDeviceDto = null;
        CommonResponseBean response = api.replaceOriginalDevice(replaceOriginalDeviceDto);

        // TODO: test validations
    }
    
}
