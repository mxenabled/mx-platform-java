# MicrodepositsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMicrodeposit**](MicrodepositsApi.md#createMicrodeposit) | **POST** /users/{user_guid}/micro_deposits | Create or pre-initiate a microdeposit |
| [**deleteMicrodeposit**](MicrodepositsApi.md#deleteMicrodeposit) | **DELETE** /users/{user_guid}/micro_deposits/{micro_deposit_guid} | Delete a microdeposit |
| [**listUserMicrodeposits**](MicrodepositsApi.md#listUserMicrodeposits) | **GET** /users/{user_guid}/micro_deposits | List all microdeposits for a user |
| [**listUserVerifications**](MicrodepositsApi.md#listUserVerifications) | **GET** /users/{user_guid}/account_verifications | List all verifications for a user |
| [**readUserMicrodeposit**](MicrodepositsApi.md#readUserMicrodeposit) | **GET** /users/{user_guid}/micro_deposits/{micro_deposit_guid} | Read a microdeposit for a user |
| [**verifyMicrodeposit**](MicrodepositsApi.md#verifyMicrodeposit) | **PUT** /micro_deposits/{micro_deposit_guid}/verify | Verify a Microdeposit |


<a id="createMicrodeposit"></a>
# **createMicrodeposit**
> MicrodepositResponseBody createMicrodeposit(userGuid, microdepositRequestBody)

Create or pre-initiate a microdeposit

Use this endpoint to create or pre-initiate a microdeposit. The response will include the new microdeposit record with a status of &#x60;INITIATED&#x60; or &#x60;PREINITIATED&#x60; respectively.  To pre-initiate a microdeposit, you only need to set &#x60;email&#x60; (string), &#x60;first_name&#x60; (string), and &#x60;last_name&#x60; (string) in the request body.   Pre-initiating a microdeposit allows you to pass the end user&#39;s first name, last name, and email if this data has already been collected. If the end user selects an institution which requires the microdeposit flow, the pre-initiated &#x60;micro_deposit&#x60; will be used and the Connect Widget step that normally requests this info from the end user will be skipped. However, if the end user selects an institution which supports IAV, the pre-initiated &#x60;micro_deposit&#x60; will be deleted and IAV will be used instead. When requesting a Connect Widget URL after pre-initiating, make sure to set the &#x60;current_microdeposit_guid&#x60; to the resulting microdeposit&#39;s &#x60;guid&#x60; and set the &#x60;mode&#x60; to &#x60;verification&#x60;. If you use this enhanced flow, a &#x60;micro_deposit&#x60; should be pre-initiated for all connect sessions in verification mode. After pre-initiating a microdeposit, pass the GUID to the config as &#x60;current_microdeposit_guid&#x60; and set the &#x60;mode&#x60; to &#x60;verification&#x60; when requesting a Connect URL.  Pre-initiating a microdeposit is optional. If you choose to implement this flow, it should be used for all Connect Widget sessions in verification mode. 

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    MicrodepositRequestBody microdepositRequestBody = new MicrodepositRequestBody(); // MicrodepositRequestBody | 
    try {
      MicrodepositResponseBody result = apiInstance.createMicrodeposit(userGuid, microdepositRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#createMicrodeposit");
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

<a id="deleteMicrodeposit"></a>
# **deleteMicrodeposit**
> deleteMicrodeposit(microDepositGuid, userGuid)

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String microDepositGuid = "MIC-09ba578e-8448-4f7f-89e1-b62ff2517edb"; // String | The unique identifier for the microdeposit. Defined by MX.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      apiInstance.deleteMicrodeposit(microDepositGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#deleteMicrodeposit");
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
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

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

<a id="listUserMicrodeposits"></a>
# **listUserMicrodeposits**
> MicrodepositsResponseBody listUserMicrodeposits(userGuid)

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      MicrodepositsResponseBody result = apiInstance.listUserMicrodeposits(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#listUserMicrodeposits");
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

<a id="listUserVerifications"></a>
# **listUserVerifications**
> MicrodepositResponseBody listUserVerifications(userGuid)

List all verifications for a user

This endpoint returns a list of the account verifications associated with the user, as well as the status of those verifications. 

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      MicrodepositResponseBody result = apiInstance.listUserVerifications(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#listUserVerifications");
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

<a id="readUserMicrodeposit"></a>
# **readUserMicrodeposit**
> MicrodepositResponseBody readUserMicrodeposit(microDepositGuid, userGuid)

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String microDepositGuid = "MIC-09ba578e-8448-4f7f-89e1-b62ff2517edb"; // String | The unique identifier for the microdeposit. Defined by MX.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      MicrodepositResponseBody result = apiInstance.readUserMicrodeposit(microDepositGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#readUserMicrodeposit");
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
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

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

<a id="verifyMicrodeposit"></a>
# **verifyMicrodeposit**
> MicrodepositResponseBody verifyMicrodeposit(microDepositGuid, microdepositVerifyRequestBody)

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    MicrodepositsApi apiInstance = new MicrodepositsApi(defaultClient);
    String microDepositGuid = "MIC-09ba578e-8448-4f7f-89e1-b62ff2517edb"; // String | The unique identifier for the microdeposit. Defined by MX.
    MicrodepositVerifyRequestBody microdepositVerifyRequestBody = new MicrodepositVerifyRequestBody(); // MicrodepositVerifyRequestBody | 
    try {
      MicrodepositResponseBody result = apiInstance.verifyMicrodeposit(microDepositGuid, microdepositVerifyRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrodepositsApi#verifyMicrodeposit");
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

