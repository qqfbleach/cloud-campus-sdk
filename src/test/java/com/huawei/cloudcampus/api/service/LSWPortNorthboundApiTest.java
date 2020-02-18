/*
 * 交换机端口配置
 * LSW端口配置北向接口，主要特性： · 查询交换机所有接口信息 · 修改交换机以太接口配置 · 创建交换机Eth-Trunk接口 · 修改交换机Eth-Trunk接口 · 删除交换机Eth-Trunk接口 
 *
 * OpenAPI spec version: 1.4.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.huawei.cloudcampus.api.service;

import com.huawei.cloudcampus.api.ApiException;
import com.huawei.cloudcampus.api.model.EthTrunkResponseDto;
import com.huawei.cloudcampus.api.model.GetResponseDto;
import com.huawei.cloudcampus.api.model.LSWEthPortDto;
import com.huawei.cloudcampus.api.model.LSWEthTrunkPortDto;
import com.huawei.cloudcampus.api.model.PutResponseDto;
import com.huawei.cloudcampus.api.model.ResponseDto;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LSWPortNorthboundApi
 */
@Ignore
public class LSWPortNorthboundApiTest {

    private final LSWPortNorthboundApi api = new LSWPortNorthboundApi();

    
    /**
     * 修改交换机端口配置
     *
     * ## 典型场景 ##    提供配置参数的接口，修改交换机以太端口配置。 ## 接口功能 ##    修改交换机以太端口配置，支持同时配置多个端口。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configTest() throws ApiException {
        UUID deviceId = null;
        List<LSWEthPortDto> body = null;
        PutResponseDto response = api.config(deviceId, body);

        // TODO: test validations
    }
    
    /**
     * 创建交换机EthTrunk端口
     *
     * ## 典型场景 ##    提供配置参数的接口，创建交换机EthTrunk端口。 ## 接口功能 ##    创建交换机EthTrunk端口，可以同时配置此EthTrunk端口参数。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEthTrunkTest() throws ApiException {
        UUID deviceId = null;
        LSWEthTrunkPortDto body = null;
        EthTrunkResponseDto response = api.createEthTrunk(deviceId, body);

        // TODO: test validations
    }
    
    /**
     * 删除交换机EthTrunk端口
     *
     * ## 典型场景 ##    提供配置参数的接口，删除交换机EthTrunk端口。 ## 接口功能 ##    删除交换机EthTrunk端口。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEthTrunkTest() throws ApiException {
        UUID deviceId = null;
        String name = null;
        ResponseDto response = api.deleteEthTrunk(deviceId, name);

        // TODO: test validations
    }
    
    /**
     * 查询交换机端口配置
     *
     * ## 典型场景 ##    提供查询配置参数的接口，查询交换机端口配置。 ## 接口功能 ##    查询交换机端口配置（包括以太口和EthTrunk口）。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigTest() throws ApiException {
        UUID deviceId = null;
        GetResponseDto response = api.getConfig(deviceId);

        // TODO: test validations
    }
    
    /**
     * 修改交换机EthTrunk端口
     *
     * ## 典型场景 ##    提供配置参数的接口，修改交换机EthTrunk端口。 ## 接口功能 ##    修改交换机EthTrunk端口，可以同时配置此EthTrunk端口参数。 ## 接口约束 ##    该接口必须在租户内，存在交换机设备的站点内使用。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateEthTrunkTest() throws ApiException {
        UUID deviceId = null;
        String name = null;
        LSWEthTrunkPortDto body = null;
        EthTrunkResponseDto response = api.updateEthTrunk(deviceId, name, body);

        // TODO: test validations
    }
    
}