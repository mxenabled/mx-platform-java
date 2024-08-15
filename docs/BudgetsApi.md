# BudgetsApi

All URIs are relative to *https://api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersUserGuidBudgetsBudgetGuidDelete**](BudgetsApi.md#usersUserGuidBudgetsBudgetGuidDelete) | **DELETE** /users/{user_guid}/budgets/{budget_guid} | Delete a budget |
| [**usersUserGuidBudgetsBudgetGuidGet**](BudgetsApi.md#usersUserGuidBudgetsBudgetGuidGet) | **GET** /users/{user_guid}/budgets/{budget_guid} | Read a specific budget |
| [**usersUserGuidBudgetsBudgetGuidPut**](BudgetsApi.md#usersUserGuidBudgetsBudgetGuidPut) | **PUT** /users/{user_guid}/budgets/{budget_guid} | Update a specific budget |
| [**usersUserGuidBudgetsGeneratePost**](BudgetsApi.md#usersUserGuidBudgetsGeneratePost) | **POST** /users/{user_guid}/budgets/generate | Auto-generate budgets |
| [**usersUserGuidBudgetsGet**](BudgetsApi.md#usersUserGuidBudgetsGet) | **GET** /users/{user_guid}/budgets | List all budgets |
| [**usersUserGuidBudgetsPost**](BudgetsApi.md#usersUserGuidBudgetsPost) | **POST** /users/{user_guid}/budgets | Create a budget |


<a id="usersUserGuidBudgetsBudgetGuidDelete"></a>
# **usersUserGuidBudgetsBudgetGuidDelete**
> usersUserGuidBudgetsBudgetGuidDelete(userGuid, budgetGuid)

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
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    String budgetGuid = "budgetGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    try {
      apiInstance.usersUserGuidBudgetsBudgetGuidDelete(userGuid, budgetGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#usersUserGuidBudgetsBudgetGuidDelete");
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
| **userGuid** | **String**| The unique identifier for the budget. Defined by MX. | |
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

<a id="usersUserGuidBudgetsBudgetGuidGet"></a>
# **usersUserGuidBudgetsBudgetGuidGet**
> BudgetResponseBody usersUserGuidBudgetsBudgetGuidGet(budgetGuid, userGuid)

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
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String budgetGuid = "budgetGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    String userGuid = "userGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    try {
      BudgetResponseBody result = apiInstance.usersUserGuidBudgetsBudgetGuidGet(budgetGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#usersUserGuidBudgetsBudgetGuidGet");
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
| **budgetGuid** | **String**| The unique identifier for the budget. Defined by MX. | |
| **userGuid** | **String**| The unique identifier for the budget. Defined by MX. | |

### Return type

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidBudgetsBudgetGuidPut"></a>
# **usersUserGuidBudgetsBudgetGuidPut**
> BudgetResponseBody usersUserGuidBudgetsBudgetGuidPut(userGuid, budgetGuid, budgetUpdateRequestBody)

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
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    String budgetGuid = "budgetGuid_example"; // String | The unique identifier for the budget. Defined by MX.
    BudgetUpdateRequestBody budgetUpdateRequestBody = new BudgetUpdateRequestBody(); // BudgetUpdateRequestBody | 
    try {
      BudgetResponseBody result = apiInstance.usersUserGuidBudgetsBudgetGuidPut(userGuid, budgetGuid, budgetUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#usersUserGuidBudgetsBudgetGuidPut");
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
| **userGuid** | **String**| The unique identifier for the budget. Defined by MX. | |
| **budgetGuid** | **String**| The unique identifier for the budget. Defined by MX. | |
| **budgetUpdateRequestBody** | [**BudgetUpdateRequestBody**](BudgetUpdateRequestBody.md)|  | [optional] |

### Return type

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidBudgetsGeneratePost"></a>
# **usersUserGuidBudgetsGeneratePost**
> BudgetResponseBody usersUserGuidBudgetsGeneratePost(userGuid)

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
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user. Defined by MX.
    try {
      BudgetResponseBody result = apiInstance.usersUserGuidBudgetsGeneratePost(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#usersUserGuidBudgetsGeneratePost");
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

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidBudgetsGet"></a>
# **usersUserGuidBudgetsGet**
> BudgetResponseBody usersUserGuidBudgetsGet(userGuid)

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
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user. Defined by MX.
    try {
      BudgetResponseBody result = apiInstance.usersUserGuidBudgetsGet(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#usersUserGuidBudgetsGet");
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

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidBudgetsPost"></a>
# **usersUserGuidBudgetsPost**
> BudgetResponseBody usersUserGuidBudgetsPost(userGuid, budgetCreateRequestBody)

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
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BudgetsApi apiInstance = new BudgetsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user. Defined by MX.
    BudgetCreateRequestBody budgetCreateRequestBody = new BudgetCreateRequestBody(); // BudgetCreateRequestBody | 
    try {
      BudgetResponseBody result = apiInstance.usersUserGuidBudgetsPost(userGuid, budgetCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetsApi#usersUserGuidBudgetsPost");
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
| **budgetCreateRequestBody** | [**BudgetCreateRequestBody**](BudgetCreateRequestBody.md)|  | |

### Return type

[**BudgetResponseBody**](BudgetResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

