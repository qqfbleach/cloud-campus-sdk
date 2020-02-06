# PartitionPolicyApi

All URIs are relative to *https://localhost/secm/public/services/fwaas/v1/threatdefense*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteThreatDefense**](PartitionPolicyApi.md#deleteThreatDefense) | **DELETE** /secm/public/services/fwaas/v1/threatdefense/{blockId} | 撤销CIS阻断/隔离
[**interdiction**](PartitionPolicyApi.md#interdiction) | **POST** /secm/public/services/fwaas/v1/threatdefense/interdiction | 创建CIS阻断策略
[**isolateVm**](PartitionPolicyApi.md#isolateVm) | **POST** /secm/public/services/fwaas/v1/threatdefense/isolation | 创建CIS隔离策略
[**queryHits**](PartitionPolicyApi.md#queryHits) | **POST** /secm/public/services/fwaas/v1/threatdefense/policyhits | CIS策略命中率查询
[**queryStatus**](PartitionPolicyApi.md#queryStatus) | **GET** /secm/public/services/fwaas/v1/threatdefense/status/{blockId} | 查询阻断/隔离应用状态


<a name="deleteThreatDefense"></a>
# **deleteThreatDefense**
> CisResponseDto deleteThreatDefense(blockId)

撤销CIS阻断/隔离

## 操作场景 ##   威胁解除，撤销阻断/隔离。 ## 接口功能 ##   撤销CIS阻断/隔离。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PartitionPolicyApi;


PartitionPolicyApi apiInstance = new PartitionPolicyApi();
String blockId = "85de427a-cf26-4fa8-8678-ee7dd192d012"; // String | CIS阻断/隔离ID，UUID格式。
try {
    CisResponseDto result = apiInstance.deleteThreatDefense(blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionPolicyApi#deleteThreatDefense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockId** | **String**| CIS阻断/隔离ID，UUID格式。 |

### Return type

[**CisResponseDto**](CisResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="interdiction"></a>
# **interdiction**
> CisResponseDto interdiction(interdictionDTO)

创建CIS阻断策略

## 操作场景 ##   向防火墙/交换机下发阻断策略，阻断攻击源。 ## 接口功能 ##   创建CIS阻断策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PartitionPolicyApi;


PartitionPolicyApi apiInstance = new PartitionPolicyApi();
InterdictionDTO interdictionDTO = new InterdictionDTO(); // InterdictionDTO | 创建CIS阻断输入。
try {
    CisResponseDto result = apiInstance.interdiction(interdictionDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionPolicyApi#interdiction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interdictionDTO** | [**InterdictionDTO**](InterdictionDTO.md)| 创建CIS阻断输入。 |

### Return type

[**CisResponseDto**](CisResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="isolateVm"></a>
# **isolateVm**
> CisResponseDto isolateVm(isolationDTO)

创建CIS隔离策略

## 操作场景 ##   向防火墙/交换机下发创建隔离策略，隔离攻击源。 ## 接口功能 ##   创建CIS隔离策略。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PartitionPolicyApi;


PartitionPolicyApi apiInstance = new PartitionPolicyApi();
IsolationDTO isolationDTO = new IsolationDTO(); // IsolationDTO | 创建CIS隔离输入。
try {
    CisResponseDto result = apiInstance.isolateVm(isolationDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionPolicyApi#isolateVm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **isolationDTO** | [**IsolationDTO**](IsolationDTO.md)| 创建CIS隔离输入。 |

### Return type

[**CisResponseDto**](CisResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryHits"></a>
# **queryHits**
> QueryHitsResponseDTO queryHits(policyHitsDTO)

CIS策略命中率查询

## 操作场景 ##   查询设定时间内CIS策略的命中率。 ## 接口功能 ##   CIS策略命中率查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PartitionPolicyApi;


PartitionPolicyApi apiInstance = new PartitionPolicyApi();
PolicyHitsDTO policyHitsDTO = new PolicyHitsDTO(); // PolicyHitsDTO | CIS策略命中率查询输入。
try {
    QueryHitsResponseDTO result = apiInstance.queryHits(policyHitsDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionPolicyApi#queryHits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyHitsDTO** | [**PolicyHitsDTO**](PolicyHitsDTO.md)| CIS策略命中率查询输入。 |

### Return type

[**QueryHitsResponseDTO**](QueryHitsResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryStatus"></a>
# **queryStatus**
> QueryStatusResponseDTO queryStatus(blockId)

查询阻断/隔离应用状态

## 操作场景 ##   查询阻断隔离策略的下发状态。 ## 接口功能 ##   阻断隔离应用状态查询。 ## 接口约束 ##   拥有北向管理员角色的用户才有权限使用。 

### Example
```java
// Import classes:
//import com.huawei.cloudcampus.api.ApiException;
//import com.huawei.cloudcampus.api.service.PartitionPolicyApi;


PartitionPolicyApi apiInstance = new PartitionPolicyApi();
String blockId = "85de427a-cf26-4fa8-8678-ee7dd192d012"; // String | CIS阻断/隔离ID，UUID格式。
try {
    QueryStatusResponseDTO result = apiInstance.queryStatus(blockId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartitionPolicyApi#queryStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blockId** | **String**| CIS阻断/隔离ID，UUID格式。 |

### Return type

[**QueryStatusResponseDTO**](QueryStatusResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

