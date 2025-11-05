# SpendingPlanApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSpendingPlan**](SpendingPlanApi.md#createSpendingPlan) | **POST** /users/{user_guid}/spending_plans | Create spending plan |
| [**createSpendingPlanIterationItem**](SpendingPlanApi.md#createSpendingPlanIterationItem) | **POST** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations/current/iteration_items | Create spending plan iteration item |
| [**deleteSpendingPlan**](SpendingPlanApi.md#deleteSpendingPlan) | **DELETE** /users/{user_guid}/spending_plans/{spending_plan_guid} | Delete spending plan |
| [**deleteSpendingPlanAccount**](SpendingPlanApi.md#deleteSpendingPlanAccount) | **DELETE** /users/{user_guid}/spending_plans/{spending_plan_guid}/spending_plan_accounts/{spending_plan_account_guid} | Delete spending plan account |
| [**deleteSpendingPlanIterationItem**](SpendingPlanApi.md#deleteSpendingPlanIterationItem) | **DELETE** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations/current/iteration_items/{iteration_item_guid} | Delete spending plan iteration item |
| [**listSpendingPlanAccounts**](SpendingPlanApi.md#listSpendingPlanAccounts) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid}/spending_plan_accounts | List spending plan accounts |
| [**listSpendingPlanIterationItems**](SpendingPlanApi.md#listSpendingPlanIterationItems) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations/current/iteration_items | List spending plan iteration items |
| [**listSpendingPlanIterations**](SpendingPlanApi.md#listSpendingPlanIterations) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations | List spending plan iterations |
| [**listSpendingPlans**](SpendingPlanApi.md#listSpendingPlans) | **GET** /users/{user_guid}/spending_plans | List spending plans |
| [**readCurrentSpendingPlanIteration**](SpendingPlanApi.md#readCurrentSpendingPlanIteration) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations/current | Read current spending plan iteration |
| [**readSpendingPlanAccount**](SpendingPlanApi.md#readSpendingPlanAccount) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid}/spending_plan_accounts/{spending_plan_account_guid} | Read spending plan account |
| [**readSpendingPlanIteration**](SpendingPlanApi.md#readSpendingPlanIteration) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations/{iteration_number} | Read a spending plan iteration |
| [**readSpendingPlanIterationItem**](SpendingPlanApi.md#readSpendingPlanIterationItem) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations/current/iteration_items/{iteration_item_guid} | Read a spending plan iteration item |
| [**readSpendingPlanUser**](SpendingPlanApi.md#readSpendingPlanUser) | **GET** /users/{user_guid}/spending_plans/{spending_plan_guid} | Read a spending plan for a user |
| [**updateSpendingPlanIterationItem**](SpendingPlanApi.md#updateSpendingPlanIterationItem) | **PUT** /users/{user_guid}/spending_plans/{spending_plan_guid}/iterations/current/iteration_items/{iteration_item_guid} | Update a spending plan iteration item |


<a id="createSpendingPlan"></a>
# **createSpendingPlan**
> SpendingPlanResponse createSpendingPlan(userGuid)

Create spending plan

This endpoint creates a new &#x60;spending_plan&#x60; for the user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      SpendingPlanResponse result = apiInstance.createSpendingPlan(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#createSpendingPlan");
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

[**SpendingPlanResponse**](SpendingPlanResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createSpendingPlanIterationItem"></a>
# **createSpendingPlanIterationItem**
> SpendingPlanIterationItemResponse createSpendingPlanIterationItem(spendingPlanGuid, userGuid, spendingPlanIterationItemCreateRequestBody)

Create spending plan iteration item

This endpoint creates a new &#x60;spending_plan_iteration_item&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    SpendingPlanIterationItemCreateRequestBody spendingPlanIterationItemCreateRequestBody = new SpendingPlanIterationItemCreateRequestBody(); // SpendingPlanIterationItemCreateRequestBody | Iteration item to be created with required parameter (planned_amount)
    try {
      SpendingPlanIterationItemResponse result = apiInstance.createSpendingPlanIterationItem(spendingPlanGuid, userGuid, spendingPlanIterationItemCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#createSpendingPlanIterationItem");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **spendingPlanIterationItemCreateRequestBody** | [**SpendingPlanIterationItemCreateRequestBody**](SpendingPlanIterationItemCreateRequestBody.md)| Iteration item to be created with required parameter (planned_amount) | |

### Return type

[**SpendingPlanIterationItemResponse**](SpendingPlanIterationItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteSpendingPlan"></a>
# **deleteSpendingPlan**
> deleteSpendingPlan(userGuid, spendingPlanGuid)

Delete spending plan

Use this endpoint to delete a user&#39;s &#x60;spending_plan&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    try {
      apiInstance.deleteSpendingPlan(userGuid, spendingPlanGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#deleteSpendingPlan");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |

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

<a id="deleteSpendingPlanAccount"></a>
# **deleteSpendingPlanAccount**
> deleteSpendingPlanAccount(userGuid, spendingPlanGuid, spendingPlanAccountGuid)

Delete spending plan account

Use this endpoint to delete a &#x60;spending_plan_account&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    String spendingPlanAccountGuid = "ACT-e9f80fee-84da-7s7r-9a5e-0346g4279b4c"; // String | The unique ID for the specified account.
    try {
      apiInstance.deleteSpendingPlanAccount(userGuid, spendingPlanGuid, spendingPlanAccountGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#deleteSpendingPlanAccount");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **spendingPlanAccountGuid** | **String**| The unique ID for the specified account. | |

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

<a id="deleteSpendingPlanIterationItem"></a>
# **deleteSpendingPlanIterationItem**
> deleteSpendingPlanIterationItem(userGuid, spendingPlanGuid, iterationItemGuid)

Delete spending plan iteration item

Use this endpoint to delete a spending plan &#x60;iteration_item&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    String iterationItemGuid = "SII-a4dc1549-da28-1245-9c9c-53eee4cdfbe3"; // String | The unique ID for the `iteration_item`.
    try {
      apiInstance.deleteSpendingPlanIterationItem(userGuid, spendingPlanGuid, iterationItemGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#deleteSpendingPlanIterationItem");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **iterationItemGuid** | **String**| The unique ID for the &#x60;iteration_item&#x60;. | |

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

<a id="listSpendingPlanAccounts"></a>
# **listSpendingPlanAccounts**
> SpendingPlanAccountsResponse listSpendingPlanAccounts(userGuid, spendingPlanGuid, page, recordsPerPage)

List spending plan accounts

Use this endpoint to list all the spending plan accounts associated with the spending plan.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanAccountsResponse result = apiInstance.listSpendingPlanAccounts(userGuid, spendingPlanGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#listSpendingPlanAccounts");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanAccountsResponse**](SpendingPlanAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSpendingPlanIterationItems"></a>
# **listSpendingPlanIterationItems**
> SpendingPlanIterationItemsResponseBody listSpendingPlanIterationItems(userGuid, spendingPlanGuid, page, recordsPerPage)

List spending plan iteration items

Use this endpoint to list all the spending plan &#x60;iteration_items&#x60; associated with the &#x60;iteration&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanIterationItemsResponseBody result = apiInstance.listSpendingPlanIterationItems(userGuid, spendingPlanGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#listSpendingPlanIterationItems");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanIterationItemsResponseBody**](SpendingPlanIterationItemsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSpendingPlanIterations"></a>
# **listSpendingPlanIterations**
> SpendingPlanIterationsResponse listSpendingPlanIterations(userGuid, spendingPlanGuid, page, recordsPerPage)

List spending plan iterations

Use this endpoint to list all the spending plan &#x60;iterations&#x60; associated with the &#x60;spending_plan&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanIterationsResponse result = apiInstance.listSpendingPlanIterations(userGuid, spendingPlanGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#listSpendingPlanIterations");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanIterationsResponse**](SpendingPlanIterationsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listSpendingPlans"></a>
# **listSpendingPlans**
> SpendingPlansResponseBody listSpendingPlans(userGuid, page, recordsPerPage)

List spending plans

Use this endpoint to list all the spending plans associated with the user.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlansResponseBody result = apiInstance.listSpendingPlans(userGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#listSpendingPlans");
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
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlansResponseBody**](SpendingPlansResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readCurrentSpendingPlanIteration"></a>
# **readCurrentSpendingPlanIteration**
> SpendingPlanIterationResponse readCurrentSpendingPlanIteration(userGuid, spendingPlanGuid, page, recordsPerPage)

Read current spending plan iteration

Use this endpoint to read the attributes of the current spending plan &#x60;iteration&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanIterationResponse result = apiInstance.readCurrentSpendingPlanIteration(userGuid, spendingPlanGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#readCurrentSpendingPlanIteration");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanIterationResponse**](SpendingPlanIterationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readSpendingPlanAccount"></a>
# **readSpendingPlanAccount**
> SpendingPlanAccountResponse readSpendingPlanAccount(userGuid, spendingPlanGuid, spendingPlanAccountGuid, page, recordsPerPage)

Read spending plan account

Use this endpoint to read the attributes of a specific spending plan account according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    String spendingPlanAccountGuid = "ACT-e9f80fee-84da-7s7r-9a5e-0346g4279b4c"; // String | The unique ID for the specified account.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanAccountResponse result = apiInstance.readSpendingPlanAccount(userGuid, spendingPlanGuid, spendingPlanAccountGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#readSpendingPlanAccount");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **spendingPlanAccountGuid** | **String**| The unique ID for the specified account. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanAccountResponse**](SpendingPlanAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readSpendingPlanIteration"></a>
# **readSpendingPlanIteration**
> SpendingPlanIterationResponse readSpendingPlanIteration(userGuid, spendingPlanGuid, iterationNumber, page, recordsPerPage)

Read a spending plan iteration

Use this endpoint to read the attributes of a specific spending plan &#x60;iteration&#x60; according to its &#x60;iteration_number&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    Integer iterationNumber = 1; // Integer | The current iteration number for the spending plan `iteration`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanIterationResponse result = apiInstance.readSpendingPlanIteration(userGuid, spendingPlanGuid, iterationNumber, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#readSpendingPlanIteration");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **iterationNumber** | **Integer**| The current iteration number for the spending plan &#x60;iteration&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanIterationResponse**](SpendingPlanIterationResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readSpendingPlanIterationItem"></a>
# **readSpendingPlanIterationItem**
> SpendingPlanIterationItemResponse readSpendingPlanIterationItem(userGuid, spendingPlanGuid, iterationItemGuid, page, recordsPerPage)

Read a spending plan iteration item

Use this endpoint to read the attributes of a specific spending plan &#x60;iteration_item&#x60; according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    String iterationItemGuid = "SII-a4dc1549-da28-1245-9c9c-53eee4cdfbe3"; // String | The unique ID for the `iteration_item`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanIterationItemResponse result = apiInstance.readSpendingPlanIterationItem(userGuid, spendingPlanGuid, iterationItemGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#readSpendingPlanIterationItem");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **iterationItemGuid** | **String**| The unique ID for the &#x60;iteration_item&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanIterationItemResponse**](SpendingPlanIterationItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readSpendingPlanUser"></a>
# **readSpendingPlanUser**
> SpendingPlanResponse readSpendingPlanUser(userGuid, spendingPlanGuid, page, recordsPerPage)

Read a spending plan for a user

Use this endpoint to read the attributes of a specific spending plan according to its unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    try {
      SpendingPlanResponse result = apiInstance.readSpendingPlanUser(userGuid, spendingPlanGuid, page, recordsPerPage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#readSpendingPlanUser");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |

### Return type

[**SpendingPlanResponse**](SpendingPlanResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateSpendingPlanIterationItem"></a>
# **updateSpendingPlanIterationItem**
> SpendingPlanIterationItemResponse updateSpendingPlanIterationItem(userGuid, spendingPlanGuid, iterationItemGuid, spendingPlanIterationItemCreateRequestBody)

Update a spending plan iteration item

Use this endpoint to update an existing &#x60;spending_plan_iteration_item&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.SpendingPlanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    SpendingPlanApi apiInstance = new SpendingPlanApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String spendingPlanGuid = "SPL-e5f9a5bd-c5b3-4901-bdc0-62119b9db262"; // String | The unique ID for the `spending_plan`.
    String iterationItemGuid = "SII-a4dc1549-da28-1245-9c9c-53eee4cdfbe3"; // String | The unique ID for the `iteration_item`.
    SpendingPlanIterationItemCreateRequestBody spendingPlanIterationItemCreateRequestBody = new SpendingPlanIterationItemCreateRequestBody(); // SpendingPlanIterationItemCreateRequestBody | Iteration item to be updated with required parameter (planned_amount)
    try {
      SpendingPlanIterationItemResponse result = apiInstance.updateSpendingPlanIterationItem(userGuid, spendingPlanGuid, iterationItemGuid, spendingPlanIterationItemCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpendingPlanApi#updateSpendingPlanIterationItem");
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
| **spendingPlanGuid** | **String**| The unique ID for the &#x60;spending_plan&#x60;. | |
| **iterationItemGuid** | **String**| The unique ID for the &#x60;iteration_item&#x60;. | |
| **spendingPlanIterationItemCreateRequestBody** | [**SpendingPlanIterationItemCreateRequestBody**](SpendingPlanIterationItemCreateRequestBody.md)| Iteration item to be updated with required parameter (planned_amount) | |

### Return type

[**SpendingPlanIterationItemResponse**](SpendingPlanIterationItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

