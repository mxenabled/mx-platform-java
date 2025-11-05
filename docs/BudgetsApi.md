# BudgetsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoGenerateBudgets**](BudgetsApi.md#autoGenerateBudgets) | **POST** /users/{user_guid}/budgets/generate | Auto-generate budgets |
| [**createBudget**](BudgetsApi.md#createBudget) | **POST** /users/{user_guid}/budgets | Create a budget |
| [**deleteBudget**](BudgetsApi.md#deleteBudget) | **DELETE** /users/{user_guid}/budgets/{budget_guid} | Delete a budget |
| [**listAllBudgets**](BudgetsApi.md#listAllBudgets) | **GET** /users/{user_guid}/budgets | List all budgets |
| [**readSpecificBudget**](BudgetsApi.md#readSpecificBudget) | **GET** /users/{user_guid}/budgets/{budget_guid} | Read a specific budget |
| [**updateSpecificBudget**](BudgetsApi.md#updateSpecificBudget) | **PUT** /users/{user_guid}/budgets/{budget_guid} | Update a specific budget |


<a id="autoGenerateBudgets"></a>
# **autoGenerateBudgets**
> BudgetResponseBody autoGenerateBudgets(userGuid)

Auto-generate budgets

This endpoint will automatically create budgets for several categories based on existing transactions; these budgets are returned as an array. Specifically, budgets will only be generated if the &#x60;user&#x60; has at least one &#x60;transaction&#x60; in a given category during each of the two previous calendar months. For example, if the request is made on March 6, and there is at least one \&quot;Bills &amp; Utilities\&quot; &#x60;transaction&#x60; in both January and February, a budget will be generated for \&quot;Bills &amp; Utilities.\&quot; If there are two \&quot;Bills &amp; Utilities\&quot; transactions in February but none in January, no budget will be generated for that category. If budgets already exist for particular categories, new budgets will be generated and returned based on the available transactions. If one or more budgets remain unchanged, they will nevertheless be returned in the response. If no transaction data for the &#x60;user&#x60; meet the above criteria, a &#x60;422 Unprocessable Entity&#x60; error will be returned with status code 4221 along with the message, &#x60;There aren&#39;t enough transactions to automatically create any budgets&#x60;.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      BudgetResponseBody result = apiInstance.autoGenerateBudgets(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#autoGenerateBudgets");
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

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="createBudget"></a>
# **createBudget**
> BudgetResponseBody createBudget(userGuid, budgetCreateRequestBody)

Create a budget

Create a budget. This endpoint accepts the optional &#x60;MX-Skip-Webhook&#x60; header and &#x60;skip_webhook&#x60; parameter. You cannot create a duplicate budget. For example, if you attempt to create a budget for \&quot;Gas\&quot;, but that budget already exist, the request will fail. You can retrieve a list of all existing categories by using the List Categories endpoint.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    BudgetCreateRequestBody budgetCreateRequestBody = new BudgetCreateRequestBody(); // BudgetCreateRequestBody | 
    try {
      BudgetResponseBody result = apiInstance.createBudget(userGuid, budgetCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#createBudget");
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
| **budgetCreateRequestBody** | [**BudgetCreateRequestBody**](BudgetCreateRequestBody.md)|  | |

### Return type

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.mx.api.v1+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteBudget"></a>
# **deleteBudget**
> deleteBudget(userGuid, budgetGuid)

Delete a budget

Delete a budget.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String budgetGuid = "budgetGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    try {
      apiInstance.deleteBudget(userGuid, budgetGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#deleteBudget");
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
| **budgetGuid** | **String**| The unique identifier for the budget. Defined by MX. | |

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
| **204** | No content |  -  |

<a id="listAllBudgets"></a>
# **listAllBudgets**
> BudgetResponseBody listAllBudgets(userGuid)

List all budgets

List all budgets

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      BudgetResponseBody result = apiInstance.listAllBudgets(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#listAllBudgets");
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

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readSpecificBudget"></a>
# **readSpecificBudget**
> BudgetResponseBody readSpecificBudget(userGuid, budgetGuid)

Read a specific budget

Read a specific budget.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String budgetGuid = "budgetGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    try {
      BudgetResponseBody result = apiInstance.readSpecificBudget(userGuid, budgetGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#readSpecificBudget");
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
| **budgetGuid** | **String**| The unique identifier for the budget. Defined by MX. | |

### Return type

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateSpecificBudget"></a>
# **updateSpecificBudget**
> BudgetResponseBody updateSpecificBudget(userGuid, budgetGuid, budgetUpdateRequestBody)

Update a specific budget

Update a specific budget.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.BudgetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String budgetGuid = "budgetGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    BudgetUpdateRequestBody budgetUpdateRequestBody = new BudgetUpdateRequestBody(); // BudgetUpdateRequestBody | 
    try {
      BudgetResponseBody result = apiInstance.updateSpecificBudget(userGuid, budgetGuid, budgetUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#updateSpecificBudget");
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
| **budgetGuid** | **String**| The unique identifier for the budget. Defined by MX. | |
| **budgetUpdateRequestBody** | [**BudgetUpdateRequestBody**](BudgetUpdateRequestBody.md)|  | [optional] |

### Return type

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.mx.api.v1+json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

