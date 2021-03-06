/*
 * 设备定时重启
 * · 创建或修改定时重启、延时重启设备任务 · 查询重启设备任务的状态 
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
import com.huawei.cloudcampus.api.model.GetRebootStatusResp;
import com.huawei.cloudcampus.api.model.PeriodRebootDeviceResp;
import com.huawei.cloudcampus.api.model.ReriodRebootDeviceParam;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PeriodRebootDeviceApi
 */
@Ignore
public class PeriodRebootDeviceApiTest {

    private final PeriodRebootDeviceApi api = new PeriodRebootDeviceApi();

    
    /**
     * 查询设备定时重启任务
     *
     * ## 典型场景 ##    查询重启任务状态。 ## 接口功能 ##    基于设备维度查询重启任务状态。 ## 接口约束 ##    北向接口管理员可以访问。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRebootTaskStatusTest() throws ApiException {
        String deviceId = null;
        GetRebootStatusResp response = api.getRebootTaskStatus(deviceId);

        // TODO: test validations
    }
    
    /**
     * 设置设备定时重启任务
     *
     * ## 典型场景 ##    提供创建或更新定时重启设备任务接口。 ## 接口功能 ##    基于设备维度创建或更新定时重启设备任务。 ## 接口约束 ##    北向接口管理员可以访问。 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void periodRebootDeviceTest() throws ApiException {
        String deviceId = null;
        ReriodRebootDeviceParam taskParam = null;
        PeriodRebootDeviceResp response = api.periodRebootDevice(deviceId, taskParam);

        // TODO: test validations
    }
    
}
