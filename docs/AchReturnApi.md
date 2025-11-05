# AchReturnApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createACHReturn**](AchReturnApi.md#createACHReturn) | **POST** /ach_returns | Create ACH Return |
| [**listACHRetruns**](AchReturnApi.md#listACHRetruns) | **GET** /ach_returns | List ACH Returns |
| [**readACHRetrun**](AchReturnApi.md#readACHRetrun) | **GET** /ach_returns/{ach_return_guid} | Read ACH Return |


<a id="createACHReturn"></a>
# **createACHReturn**
> ACHReturnResponseBody createACHReturn(acHReturnCreateRequestBody)

Create ACH Return

:::warning The features documented here are in a beta state, and this documentation is considered draft material subject to frequent change. :::  Use this endpoint to create an ACH return in our system. 

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.AchReturnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AchReturnApi apiInstance = new AchReturnApi(defaultClient);
    ACHReturnCreateRequestBody acHReturnCreateRequestBody = new ACHReturnCreateRequestBody(); // ACHReturnCreateRequestBody | ACH return object to be created.
    try {
      ACHReturnResponseBody result = apiInstance.createACHReturn(acHReturnCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AchReturnApi#createACHReturn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **acHReturnCreateRequestBody** | [**ACHReturnCreateRequestBody**](ACHReturnCreateRequestBody.md)| ACH return object to be created. | |

### Return type

[**ACHReturnResponseBody**](ACHReturnResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listACHRetruns"></a>
# **listACHRetruns**
> ACHReturnsResponseBody listACHRetruns(institutionGuid, returnedAt, resolvedStatusAt, returnCode, returnStatus, page, recordsPerPage)

List ACH Returns

:::warning The features documented here are in a beta state, and this documentation is considered draft material subject to frequent change. :::  Use this endpoint to get all ACH returns. 

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.AchReturnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AchReturnApi apiInstance = new AchReturnApi(defaultClient);
    String institutionGuid = "institutionGuid_example"; // String | The identifier for the institution associated with the ACH return. Defined by MX.
    String returnedAt = "2025-02-13T18:09:00+00:00"; // String | The date and time when the return was reported by the Receiving Financial Depository Institution (RDFI) in ISO 8601 format without timestamp.
    String resolvedStatusAt = "2025-02-13T18:09:00+00:00"; // String | The date and time when the return was resolved by the Receiving Financial Depository Institution (RDFI) in ISO 8601 format without timestamp
    String returnCode = "returnCode_example"; // String | The associated ACH return code and notice of change code. See [Return Codes](/api-reference/platform-api/reference/ach-return-fields#return-codes) for a complete list.
    String returnStatus = "SUBMITTED"; // String | The status of the return. See [Return Statuses](/api-reference/platform-api/reference/ach-return-fields#return-status) for a complete list.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `100`. If the value exceeds `100`, the default value of `25` will be used instead.
    try {
      ACHReturnsResponseBody result = apiInstance.listACHRetruns(institutionGuid, returnedAt, resolvedStatusAt, returnCode, returnStatus, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AchReturnApi#listACHRetruns");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **institutionGuid** | **String**| The identifier for the institution associated with the ACH return. Defined by MX. | [optional] |
| **returnedAt** | **String**| The date and time when the return was reported by the Receiving Financial Depository Institution (RDFI) in ISO 8601 format without timestamp. | [optional] |
| **resolvedStatusAt** | **String**| The date and time when the return was resolved by the Receiving Financial Depository Institution (RDFI) in ISO 8601 format without timestamp | [optional] |
| **returnCode** | **String**| The associated ACH return code and notice of change code. See [Return Codes](/api-reference/platform-api/reference/ach-return-fields#return-codes) for a complete list. | [optional] |
| **returnStatus** | **String**| The status of the return. See [Return Statuses](/api-reference/platform-api/reference/ach-return-fields#return-status) for a complete list. | [optional] |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;100&#x60;. If the value exceeds &#x60;100&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**ACHReturnsResponseBody**](ACHReturnsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readACHRetrun"></a>
# **readACHRetrun**
> ACHReturnResponseBody readACHRetrun(achReturnGuid)

Read ACH Return

:::warning The features documented here are in a beta state, and this documentation is considered draft material subject to frequent change. :::  Use this endpoint to get an ACH return by its &#x60;guid&#x60; or &#x60;id&#x60;. 

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.AchReturnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AchReturnApi apiInstance = new AchReturnApi(defaultClient);
    String achReturnGuid = "achReturnGuid_example"; // String | The unique identifier (`guid`) for the ACH return. Defined by MX.
    try {
      ACHReturnResponseBody result = apiInstance.readACHRetrun(achReturnGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AchReturnApi#readACHRetrun");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **achReturnGuid** | **String**| The unique identifier (&#x60;guid&#x60;) for the ACH return. Defined by MX. | |

### Return type

[**ACHReturnResponseBody**](ACHReturnResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

