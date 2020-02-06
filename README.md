# cloudcampusv3r19c00javasdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.huawei.cloudcampus.api</groupId>
    <artifactId>cloudcampusv3r19c00javasdk</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.huawei.cloudcampus.api:cloudcampusv3r19c00javasdk:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/cloudcampusv3r19c00javasdk-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.huawei.cloudcampus.api.*;
import com.huawei.cloudcampus.api.auth.*;
import com.huawei.cloudcampus.api.model.*;
import com.huawei.cloudcampus.api.service.PartitionPolicyApi;

import java.io.File;
import java.util.*;

public class PartitionPolicyApiExample {

    public static void main(String[] args) {
        
        PartitionPolicyApi apiInstance = new PartitionPolicyApi();
        String blockId = "85de427a-cf26-4fa8-8678-ee7dd192d012"; // String | CIS阻断/隔离ID，UUID格式。
        try {
            CisResponseDto result = apiInstance.deleteThreatDefense(blockId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PartitionPolicyApi#deleteThreatDefense");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/secm/public/services/fwaas/v1/threatdefense*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PartitionPolicyApi* | [**deleteThreatDefense**](docs/PartitionPolicyApi.md#deleteThreatDefense) | **DELETE** /secm/public/services/fwaas/v1/threatdefense/{blockId} | 撤销CIS阻断/隔离
*PartitionPolicyApi* | [**interdiction**](docs/PartitionPolicyApi.md#interdiction) | **POST** /secm/public/services/fwaas/v1/threatdefense/interdiction | 创建CIS阻断策略
*PartitionPolicyApi* | [**isolateVm**](docs/PartitionPolicyApi.md#isolateVm) | **POST** /secm/public/services/fwaas/v1/threatdefense/isolation | 创建CIS隔离策略
*PartitionPolicyApi* | [**queryHits**](docs/PartitionPolicyApi.md#queryHits) | **POST** /secm/public/services/fwaas/v1/threatdefense/policyhits | CIS策略命中率查询
*PartitionPolicyApi* | [**queryStatus**](docs/PartitionPolicyApi.md#queryStatus) | **GET** /secm/public/services/fwaas/v1/threatdefense/status/{blockId} | 查询阻断/隔离应用状态


## Documentation for Models

 - [CisResponseDto](docs/CisResponseDto.md)
 - [InterdictionDTO](docs/InterdictionDTO.md)
 - [IsolationDTO](docs/IsolationDTO.md)
 - [PolicyHitsDTO](docs/PolicyHitsDTO.md)
 - [PolicyHitsListBuilder](docs/PolicyHitsListBuilder.md)
 - [QueryHitsResponseDTO](docs/QueryHitsResponseDTO.md)
 - [QueryStatusResponseDTO](docs/QueryStatusResponseDTO.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



