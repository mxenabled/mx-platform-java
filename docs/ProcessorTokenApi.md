# ProcessorTokenApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkRealTimeAccountBalance**](ProcessorTokenApi.md#checkRealTimeAccountBalance) | **POST** /account/check_balance | Check Real Time Account Balance (Processors Only) |
| [**deprecatedRequestPaymentProcessorAuthorizationCode**](ProcessorTokenApi.md#deprecatedRequestPaymentProcessorAuthorizationCode) | **POST** /payment_processor_authorization_code | (Deprecated) Request an authorization code |
| [**getAccountOwnerInfo**](ProcessorTokenApi.md#getAccountOwnerInfo) | **GET** /account/transactions | Get account owner information (Processors Only) |
| [**listTokens**](ProcessorTokenApi.md#listTokens) | **GET** /tokens | View a List of Tokens |
| [**readAccountBalance**](ProcessorTokenApi.md#readAccountBalance) | **GET** /payment_account | Read the account balance (Processors Only) |
| [**requestAccountNumber**](ProcessorTokenApi.md#requestAccountNumber) | **GET** /account/account_numbers | Request an account number (Processors Only) |
| [**requestAuthorizationCode**](ProcessorTokenApi.md#requestAuthorizationCode) | **POST** /authorization_code | Request an authorization code |


<a id="checkRealTimeAccountBalance"></a>
# **checkRealTimeAccountBalance**
> MemberResponseBody checkRealTimeAccountBalance()

Check Real Time Account Balance (Processors Only)

Check the real-time account balance using your access token.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ProcessorTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProcessorTokenApi apiInstance = new ProcessorTokenApi(defaultClient);
    try {
      MemberResponseBody result = apiInstance.checkRealTimeAccountBalance();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorTokenApi#checkRealTimeAccountBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MemberResponseBody**](MemberResponseBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deprecatedRequestPaymentProcessorAuthorizationCode"></a>
# **deprecatedRequestPaymentProcessorAuthorizationCode**
> PaymentProcessorAuthorizationCodeResponseBody deprecatedRequestPaymentProcessorAuthorizationCode(paymentProcessorAuthorizationCodeRequestBody)

(Deprecated) Request an authorization code

(This endpoint is deprecated. Clients should use &#x60;/authorization_code&#x60;.) Clients use this endpoint to request an authorization_code according to a user, member, and account specified in the request body. Clients then pass this code to processors. Processor access is scoped only to the user/member/account specified in this request. Before requesting an authorization_code, clients must have verified the specified member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ProcessorTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ProcessorTokenApi apiInstance = new ProcessorTokenApi(defaultClient);
    PaymentProcessorAuthorizationCodeRequestBody paymentProcessorAuthorizationCodeRequestBody = new PaymentProcessorAuthorizationCodeRequestBody(); // PaymentProcessorAuthorizationCodeRequestBody | The scope for the authorization code.
    try {
      PaymentProcessorAuthorizationCodeResponseBody result = apiInstance.deprecatedRequestPaymentProcessorAuthorizationCode(paymentProcessorAuthorizationCodeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorTokenApi#deprecatedRequestPaymentProcessorAuthorizationCode");
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
| **paymentProcessorAuthorizationCodeRequestBody** | [**PaymentProcessorAuthorizationCodeRequestBody**](PaymentProcessorAuthorizationCodeRequestBody.md)| The scope for the authorization code. | |

### Return type

[**PaymentProcessorAuthorizationCodeResponseBody**](PaymentProcessorAuthorizationCodeResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getAccountOwnerInfo"></a>
# **getAccountOwnerInfo**
> ProcessorOwnerBody getAccountOwnerInfo()

Get account owner information (Processors Only)

Get account owner information (Processors Only)

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ProcessorTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProcessorTokenApi apiInstance = new ProcessorTokenApi(defaultClient);
    try {
      ProcessorOwnerBody result = apiInstance.getAccountOwnerInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorTokenApi#getAccountOwnerInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProcessorOwnerBody**](ProcessorOwnerBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTokens"></a>
# **listTokens**
> TokenResponseBody listTokens(tokenRequestBody)

View a List of Tokens

View a list of tokens that exist for a user, member, or account.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ProcessorTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ProcessorTokenApi apiInstance = new ProcessorTokenApi(defaultClient);
    TokenRequestBody tokenRequestBody = new TokenRequestBody(); // TokenRequestBody | 
    try {
      TokenResponseBody result = apiInstance.listTokens(tokenRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorTokenApi#listTokens");
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
| **tokenRequestBody** | [**TokenRequestBody**](TokenRequestBody.md)|  | [optional] |

### Return type

[**TokenResponseBody**](TokenResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readAccountBalance"></a>
# **readAccountBalance**
> PaymentAccountBody readAccountBalance()

Read the account balance (Processors Only)

Read the account balance (Processors Only)

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ProcessorTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProcessorTokenApi apiInstance = new ProcessorTokenApi(defaultClient);
    try {
      PaymentAccountBody result = apiInstance.readAccountBalance();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorTokenApi#readAccountBalance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentAccountBody**](PaymentAccountBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="requestAccountNumber"></a>
# **requestAccountNumber**
> ProcessorAccountNumberBody requestAccountNumber()

Request an account number (Processors Only)

Get account information such as routing number and account number, scoped to your access token.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ProcessorTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProcessorTokenApi apiInstance = new ProcessorTokenApi(defaultClient);
    try {
      ProcessorAccountNumberBody result = apiInstance.requestAccountNumber();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorTokenApi#requestAccountNumber");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProcessorAccountNumberBody**](ProcessorAccountNumberBody.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="requestAuthorizationCode"></a>
# **requestAuthorizationCode**
> AuthorizationCodeResponseBody requestAuthorizationCode(authorizationCodeRequestBody)

Request an authorization code

Clients use this endpoint to request an authorization code according to the parameters specified in the scope. Clients then pass this code to processors. Processor access is scoped only to the GUIDs and features specified in this request. Before requesting an authorization code which includes a member in the scope, clients must have verified that member.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.ProcessorTokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ProcessorTokenApi apiInstance = new ProcessorTokenApi(defaultClient);
    AuthorizationCodeRequestBody authorizationCodeRequestBody = new AuthorizationCodeRequestBody(); // AuthorizationCodeRequestBody | The scope for the authorization code.
    try {
      AuthorizationCodeResponseBody result = apiInstance.requestAuthorizationCode(authorizationCodeRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorTokenApi#requestAuthorizationCode");
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
| **authorizationCodeRequestBody** | [**AuthorizationCodeRequestBody**](AuthorizationCodeRequestBody.md)| The scope for the authorization code. | |

### Return type

[**AuthorizationCodeResponseBody**](AuthorizationCodeResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

