# VerifiableCredentialsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountsData**](VerifiableCredentialsApi.md#getAccountsData) | **GET** /vc/users/{user_guid}/members/{member_guid}/accounts | Get Accounts Data |
| [**getIdentityData**](VerifiableCredentialsApi.md#getIdentityData) | **GET** /vc/users/{user_guid}/members/{member_guid}/customers | Get Identity Data |
| [**getTransactionsData**](VerifiableCredentialsApi.md#getTransactionsData) | **GET** /vc/users/{user_guid}/accounts/{account_guid}/transactions | Get Transactions Data |


<a id="getAccountsData"></a>
# **getAccountsData**
> VCResponse getAccountsData(userGuid, memberGuid)

Get Accounts Data

Get an MX-issued verifiable credential of a user&#39;s accounts data.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.VerifiableCredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    VerifiableCredentialsApi apiInstance = new VerifiableCredentialsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    try {
      VCResponse result = apiInstance.getAccountsData(userGuid, memberGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifiableCredentialsApi#getAccountsData");
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
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |

### Return type

[**VCResponse**](VCResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v2beta+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getIdentityData"></a>
# **getIdentityData**
> VCResponse getIdentityData(userGuid, memberGuid)

Get Identity Data

Get an MX-issued verifiable credential of a user&#39;s identity data.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.VerifiableCredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    VerifiableCredentialsApi apiInstance = new VerifiableCredentialsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    try {
      VCResponse result = apiInstance.getIdentityData(userGuid, memberGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifiableCredentialsApi#getIdentityData");
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
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |

### Return type

[**VCResponse**](VCResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v2beta+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTransactionsData"></a>
# **getTransactionsData**
> VCResponse getTransactionsData(userGuid, accountGuid, startTime, endTime)

Get Transactions Data

Get an MX-issued verifiable credential of a user&#39;s transaction data.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.VerifiableCredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    VerifiableCredentialsApi apiInstance = new VerifiableCredentialsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String startTime = "2015-09-20"; // String | Filter transactions from this date. Must be in the format YYYY-MM-DD. The range is limited to 1 year.
    String endTime = "2015-09-20"; // String | Filter transactions to this date. Must be in the format YYYY-MM-DD. The range is limited to 1 year.
    try {
      VCResponse result = apiInstance.getTransactionsData(userGuid, accountGuid, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerifiableCredentialsApi#getTransactionsData");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **startTime** | **String**| Filter transactions from this date. Must be in the format YYYY-MM-DD. The range is limited to 1 year. | [optional] |
| **endTime** | **String**| Filter transactions to this date. Must be in the format YYYY-MM-DD. The range is limited to 1 year. | [optional] |

### Return type

[**VCResponse**](VCResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v2beta+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

