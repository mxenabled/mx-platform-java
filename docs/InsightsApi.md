# InsightsApi

All URIs are relative to *https://api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAccountsInsight**](InsightsApi.md#listAccountsInsight) | **GET** /users/{user_guid}/insights/{insight_guid}/accounts | List all accounts associated with an insight. |
| [**listCategoriesInsight**](InsightsApi.md#listCategoriesInsight) | **GET** /users/{user_guid}/insights/{insight_guid}/categories | List all categories associated with an insight. |
| [**listInsightsByAccount**](InsightsApi.md#listInsightsByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/insights | List insights by account |
| [**listInsightsUser**](InsightsApi.md#listInsightsUser) | **GET** /users/{user_guid}/insights | List all insights for a user. |
| [**listMerchantsInsight**](InsightsApi.md#listMerchantsInsight) | **GET** /users/{user_guid}/insights/{insight_guid}/merchants | List all merchants associated with an insight. |
| [**listScheduledPaymentsInsight**](InsightsApi.md#listScheduledPaymentsInsight) | **GET** /users/{user_guid}/insights/{insight_guid}/scheduled_payments | List all scheduled payments associated with an insight |
| [**listTransactionsInsight**](InsightsApi.md#listTransactionsInsight) | **GET** /users/{user_guid}/insights/{insight_guid}/transactions | List all transactions associated with an insight. |
| [**readInsightsUser**](InsightsApi.md#readInsightsUser) | **GET** /users/{user_guid}/insights{insight_guid} | Read a specific insight. |
| [**updateInsight**](InsightsApi.md#updateInsight) | **PUT** /users/{user_guid}/insights{insight_guid} | Update insight |


<a id="listAccountsInsight"></a>
# **listAccountsInsight**
> AccountsResponseBody listAccountsInsight(userGuid, insightGuid, page, recordsPerPage)

List all accounts associated with an insight.

Use this endpoint to list all the accounts associated with the insight.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-1234-abcd"; // String | The unique identifier for the user. Defined by MX.
    String insightGuid = "BET-1234-abcd"; // String | The unique identifier for the insight. Defined by MX.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      AccountsResponseBody result = apiInstance.listAccountsInsight(userGuid, insightGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listAccountsInsight");
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
| **insightGuid** | **String**| The unique identifier for the insight. Defined by MX. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**AccountsResponseBody**](AccountsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listCategoriesInsight"></a>
# **listCategoriesInsight**
> CategoriesResponseBody listCategoriesInsight(userGuid, insightGuid, page, recordsPerPage)

List all categories associated with an insight.

Use this endpoint to list all the categories associated with the insight.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-1234-abcd"; // String | The unique identifier for the user. Defined by MX.
    String insightGuid = "BET-1234-abcd"; // String | The unique identifier for the insight. Defined by MX.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      CategoriesResponseBody result = apiInstance.listCategoriesInsight(userGuid, insightGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listCategoriesInsight");
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
| **insightGuid** | **String**| The unique identifier for the insight. Defined by MX. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**CategoriesResponseBody**](CategoriesResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInsightsByAccount"></a>
# **listInsightsByAccount**
> InsightsResponseBody listInsightsByAccount(accountGuid, userGuid, page, recordsPerPage)

List insights by account

Use this endpoint to list all insights associated with a specified account GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String accountGuid = "ACT-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for the `account`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique id for the `user`.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      InsightsResponseBody result = apiInstance.listInsightsByAccount(accountGuid, userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listInsightsByAccount");
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
| **accountGuid** | **String**| The unique id for the &#x60;account&#x60;. | |
| **userGuid** | **String**| The unique id for the &#x60;user&#x60;. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**InsightsResponseBody**](InsightsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listInsightsUser"></a>
# **listInsightsUser**
> InsightsResponseBody listInsightsUser(userGuid, page, recordsPerPage)

List all insights for a user.

Use this endpoint to list all the insights associated with the user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-1234-abcd"; // String | The unique identifier for the user. Defined by MX.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      InsightsResponseBody result = apiInstance.listInsightsUser(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listInsightsUser");
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
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**InsightsResponseBody**](InsightsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listMerchantsInsight"></a>
# **listMerchantsInsight**
> MerchantsResponseBody listMerchantsInsight(userGuid, insightGuid, page, recordsPerPage)

List all merchants associated with an insight.

Use this endpoint to list all the merchants associated with the insight.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-1234-abcd"; // String | The unique identifier for the user. Defined by MX.
    String insightGuid = "BET-1234-abcd"; // String | The unique identifier for the insight. Defined by MX.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      MerchantsResponseBody result = apiInstance.listMerchantsInsight(userGuid, insightGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listMerchantsInsight");
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
| **insightGuid** | **String**| The unique identifier for the insight. Defined by MX. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**MerchantsResponseBody**](MerchantsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listScheduledPaymentsInsight"></a>
# **listScheduledPaymentsInsight**
> ScheduledPaymentsResponseBody listScheduledPaymentsInsight(userGuid, insightGuid, page, recordsPerPage)

List all scheduled payments associated with an insight

Use this endpoint to list all the scheduled payments associated with the insight.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-1234-abcd"; // String | The unique identifier for the user. Defined by MX.
    String insightGuid = "BET-1234-abcd"; // String | The unique identifier for the insight. Defined by MX.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      ScheduledPaymentsResponseBody result = apiInstance.listScheduledPaymentsInsight(userGuid, insightGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listScheduledPaymentsInsight");
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
| **insightGuid** | **String**| The unique identifier for the insight. Defined by MX. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**ScheduledPaymentsResponseBody**](ScheduledPaymentsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTransactionsInsight"></a>
# **listTransactionsInsight**
> TransactionsResponseBody listTransactionsInsight(userGuid, insightGuid, page, recordsPerPage)

List all transactions associated with an insight.

Use this endpoint to list all the transactions associated with the insight.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-1234-abcd"; // String | The unique identifier for the user. Defined by MX.
    String insightGuid = "BET-1234-abcd"; // String | The unique identifier for the insight. Defined by MX.
    Integer page = 1; // Integer | Specify current page.
    Integer recordsPerPage = 10; // Integer | Specify records per page.
    try {
      TransactionsResponseBody result = apiInstance.listTransactionsInsight(userGuid, insightGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#listTransactionsInsight");
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
| **insightGuid** | **String**| The unique identifier for the insight. Defined by MX. | |
| **page** | **Integer**| Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| Specify records per page. | [optional] |

### Return type

[**TransactionsResponseBody**](TransactionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readInsightsUser"></a>
# **readInsightsUser**
> InsightResponseBody readInsightsUser(userGuid, insightGuid)

Read a specific insight.

Use this endpoint to read the attributes of a specific insight according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-1234-abcd"; // String | The unique identifier for the user. Defined by MX.
    String insightGuid = "BET-1234-abcd"; // String | The unique identifier for the insight. Defined by MX.
    try {
      InsightResponseBody result = apiInstance.readInsightsUser(userGuid, insightGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#readInsightsUser");
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
| **insightGuid** | **String**| The unique identifier for the insight. Defined by MX. | |

### Return type

[**InsightResponseBody**](InsightResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateInsight"></a>
# **updateInsight**
> InsightResponse updateInsight(userGuid, insightGuid, insightUpdateRequest)

Update insight

Use this endpoint to update the attributes of a particular insight according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.InsightsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    InsightsApi apiInstance = new InsightsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for the user. Defined by MX.
    String insightGuid = "BET-1234-abcd"; // String | The unique identifier for the insight. Defined by MX.
    InsightUpdateRequest insightUpdateRequest = new InsightUpdateRequest(); // InsightUpdateRequest | The insight to be updated (None of these parameters are required, but the user object cannot be empty.)
    try {
      InsightResponse result = apiInstance.updateInsight(userGuid, insightGuid, insightUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InsightsApi#updateInsight");
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
| **insightGuid** | **String**| The unique identifier for the insight. Defined by MX. | |
| **insightUpdateRequest** | [**InsightUpdateRequest**](InsightUpdateRequest.md)| The insight to be updated (None of these parameters are required, but the user object cannot be empty.) | |

### Return type

[**InsightResponse**](InsightResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

