# MicrodepositsApi

All URIs are relative to *https://api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**microDepositsMicrodepositGuidVerifyPut**](MicrodepositsApi.md#microDepositsMicrodepositGuidVerifyPut) | **PUT** /micro_deposits/{microdeposit_guid}/verify | Verify a Microdeposit |
| [**usersUserGuidMicroDepositsGet**](MicrodepositsApi.md#usersUserGuidMicroDepositsGet) | **GET** /users/{user_guid}/micro_deposits | List all microdeposits for a user |
| [**usersUserGuidMicroDepositsMicroDepositGuidDelete**](MicrodepositsApi.md#usersUserGuidMicroDepositsMicroDepositGuidDelete) | **DELETE** /users/{user_guid}/micro_deposits/{micro_deposit_guid} | Delete a microdeposit |
| [**usersUserGuidMicroDepositsMicroDepositGuidGet**](MicrodepositsApi.md#usersUserGuidMicroDepositsMicroDepositGuidGet) | **GET** /users/{user_guid}/micro_deposits/{micro_deposit_guid} | Read a microdeposit for a user |
| [**usersUserGuidMicroDepositsPost**](MicrodepositsApi.md#usersUserGuidMicroDepositsPost) | **POST** /users/{user_guid}/micro_deposits | Create a microdeposit |


<a id="microDepositsMicrodepositGuidVerifyPut"></a>
# **microDepositsMicrodepositGuidVerifyPut**
> MicrodepositResponseBody microDepositsMicrodepositGuidVerifyPut(microdepositGuid, microdepositVerifyRequestBody)

Verify a Microdeposit

Use this endpoint to verify the amounts deposited into the account during a microdeposit verification. The verification has not successfully completed until the &#x60;status&#x60; is &#x60;VERIFIED&#x60;. Poll the &#x60;/users/{user_guid}/micro_deposits/{micro_deposit_guid}&#x60; (read microdeposit) endpoint until you see this status or an error state.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MicrodepositsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String microdepositGuid = "microdepositGuid_example"; // String | The unique identifier for the microdeposit. Defined by MX.
    MicrodepositVerifyRequestBody microdepositVerifyRequestBody = new MicrodepositVerifyRequestBody(); // MicrodepositVerifyRequestBody | 
    try {
      MicrodepositResponseBody result = apiInstance.microDepositsMicrodepositGuidVerifyPut(microdepositGuid, microdepositVerifyRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#microDepositsMicrodepositGuidVerifyPut");
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
| **microdepositGuid** | **String**| The unique identifier for the microdeposit. Defined by MX. | |
| **microdepositVerifyRequestBody** | [**MicrodepositVerifyRequestBody**](MicrodepositVerifyRequestBody.md)|  | [optional] |

### Return type

[**MicrodepositResponseBody**](MicrodepositResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidMicroDepositsGet"></a>
# **usersUserGuidMicroDepositsGet**
> MicrodepositsResponseBody usersUserGuidMicroDepositsGet(userGuid)

List all microdeposits for a user

Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MicrodepositsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user. Defined by MX.
    try {
      MicrodepositsResponseBody result = apiInstance.usersUserGuidMicroDepositsGet(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#usersUserGuidMicroDepositsGet");
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
| **userGuid** | **String**| The unique identifier for the user. Defined by MX. | |

### Return type

[**MicrodepositsResponseBody**](MicrodepositsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidMicroDepositsMicroDepositGuidDelete"></a>
# **usersUserGuidMicroDepositsMicroDepositGuidDelete**
> usersUserGuidMicroDepositsMicroDepositGuidDelete(microDepositGuid, userGuid)

Delete a microdeposit

Use this endpoint to delete the specified microdeposit.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MicrodepositsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String microDepositGuid = "MIC-09ba578e-8448-4f7f-89e1-b62ff2517edb"; // String | The unique identifier for the microdeposit. Defined by MX.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for a `user`.
    try {
      apiInstance.usersUserGuidMicroDepositsMicroDepositGuidDelete(microDepositGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#usersUserGuidMicroDepositsMicroDepositGuidDelete");
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
| **microDepositGuid** | **String**| The unique identifier for the microdeposit. Defined by MX. | |
| **userGuid** | **String**| The unique id for a &#x60;user&#x60;. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |

<a id="usersUserGuidMicroDepositsMicroDepositGuidGet"></a>
# **usersUserGuidMicroDepositsMicroDepositGuidGet**
> MicrodepositResponseBody usersUserGuidMicroDepositsMicroDepositGuidGet(userGuid, microDepositGuid)

Read a microdeposit for a user

Use this endpoint to read the attributes of a specific microdeposit according to its unique GUID. &lt;br&gt;&lt;/br&gt; Webhooks for microdeposit status changes are triggered when a status changes. The actual status of the microdeposit guid updates every minute. You may force a status update by calling the read microdeposit endpoint.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MicrodepositsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user. Defined by MX.
    String microDepositGuid = "microDepositGuid_example"; // String | The unique identifier for the microdeposit. Defined by MX.
    try {
      MicrodepositResponseBody result = apiInstance.usersUserGuidMicroDepositsMicroDepositGuidGet(userGuid, microDepositGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#usersUserGuidMicroDepositsMicroDepositGuidGet");
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
| **userGuid** | **String**| The unique identifier for the user. Defined by MX. | |
| **microDepositGuid** | **String**| The unique identifier for the microdeposit. Defined by MX. | |

### Return type

[**MicrodepositResponseBody**](MicrodepositResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidMicroDepositsPost"></a>
# **usersUserGuidMicroDepositsPost**
> MicrodepositResponseBody usersUserGuidMicroDepositsPost(userGuid, microdepositRequestBody)

Create a microdeposit

Use this endpoint to create a microdeposit. The response will include the new microdeposit record with a status of INITIATED.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.MicrodepositsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user. Defined by MX.
    MicrodepositRequestBody microdepositRequestBody = new MicrodepositRequestBody(); // MicrodepositRequestBody | 
    try {
      MicrodepositResponseBody result = apiInstance.usersUserGuidMicroDepositsPost(userGuid, microdepositRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#usersUserGuidMicroDepositsPost");
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
| **userGuid** | **String**| The unique identifier for the user. Defined by MX. | |
| **microdepositRequestBody** | [**MicrodepositRequestBody**](MicrodepositRequestBody.md)|  | |

### Return type

[**MicrodepositResponseBody**](MicrodepositResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

