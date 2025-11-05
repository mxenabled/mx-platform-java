# MonthlyCashFlowProfileApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**readMonthlyCashFlowProfile**](MonthlyCashFlowProfileApi.md#readMonthlyCashFlowProfile) | **GET** /users/{user_guid}/monthly_cash_flow_profile | Read monthly cash flow profile |
| [**updateMonthlyCashFlowProfile**](MonthlyCashFlowProfileApi.md#updateMonthlyCashFlowProfile) | **PUT** /users/{user_guid}/monthly_cash_flow_profile | Update monthly cash flow profile |


<a id="readMonthlyCashFlowProfile"></a>
# **readMonthlyCashFlowProfile**
> MonthlyCashFlowResponseBody readMonthlyCashFlowProfile(userGuid)

Read monthly cash flow profile

Read monthly cash flow profile.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MonthlyCashFlowProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MonthlyCashFlowProfileApi apiInstance = new MonthlyCashFlowProfileApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      MonthlyCashFlowResponseBody result = apiInstance.readMonthlyCashFlowProfile(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonthlyCashFlowProfileApi#readMonthlyCashFlowProfile");
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
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

### Return type

[**MonthlyCashFlowResponseBody**](MonthlyCashFlowResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateMonthlyCashFlowProfile"></a>
# **updateMonthlyCashFlowProfile**
> MonthlyCashFlowResponseBody updateMonthlyCashFlowProfile(userGuid, monthlyCashFlowProfileRequestBody)

Update monthly cash flow profile

Use this endpoint to update the attributes of a &#x60;monthly_cash_flow_profile&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MonthlyCashFlowProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MonthlyCashFlowProfileApi apiInstance = new MonthlyCashFlowProfileApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    MonthlyCashFlowProfileRequestBody monthlyCashFlowProfileRequestBody = new MonthlyCashFlowProfileRequestBody(); // MonthlyCashFlowProfileRequestBody | 
    try {
      MonthlyCashFlowResponseBody result = apiInstance.updateMonthlyCashFlowProfile(userGuid, monthlyCashFlowProfileRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MonthlyCashFlowProfileApi#updateMonthlyCashFlowProfile");
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
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **monthlyCashFlowProfileRequestBody** | [**MonthlyCashFlowProfileRequestBody**](MonthlyCashFlowProfileRequestBody.md)|  | |

### Return type

[**MonthlyCashFlowResponseBody**](MonthlyCashFlowResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

