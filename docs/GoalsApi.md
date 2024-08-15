# GoalsApi

All URIs are relative to *https://api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersUserGuidGoalsGet**](GoalsApi.md#usersUserGuidGoalsGet) | **GET** /users/{user_guid}/goals | List goals |
| [**usersUserGuidGoalsGoalGuidDelete**](GoalsApi.md#usersUserGuidGoalsGoalGuidDelete) | **DELETE** /users/{user_guid}/goals/{goal_guid} | Delete a goal |
| [**usersUserGuidGoalsGoalGuidGet**](GoalsApi.md#usersUserGuidGoalsGoalGuidGet) | **GET** /users/{user_guid}/goals/{goal_guid} | Read a goal |
| [**usersUserGuidGoalsGoalGuidPut**](GoalsApi.md#usersUserGuidGoalsGoalGuidPut) | **PUT** /users/{user_guid}/goals/{goal_guid} | Update a goal |
| [**usersUserGuidGoalsPost**](GoalsApi.md#usersUserGuidGoalsPost) | **POST** /users/{user_guid}/goals | Create a goal |
| [**usersUserGuidGoalsRepositionPut**](GoalsApi.md#usersUserGuidGoalsRepositionPut) | **PUT** /users/{user_guid}/goals/reposition | Reposition goals |


<a id="usersUserGuidGoalsGet"></a>
# **usersUserGuidGoalsGet**
> GoalsResponseBody usersUserGuidGoalsGet(userGuid, page, recordsPerAge)

List goals

List all goals a user can set.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.GoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    GoalsApi apiInstance = new GoalsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user.
    String page = "page_example"; // String | Results are returned in paginated sets, this is the page of the results you would like to view. Defaults to page 1 if no page is specified.
    String recordsPerAge = "recordsPerAge_example"; // String | The supported range is from 10 to 1000. If the records_per_page parameter is not specified or is outside this range, a default of 25 records per page will be used.
    try {
      GoalsResponseBody result = apiInstance.usersUserGuidGoalsGet(userGuid, page, recordsPerAge);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#usersUserGuidGoalsGet");
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
| **userGuid** | **String**| The unique identifier for the user. | |
| **page** | **String**| Results are returned in paginated sets, this is the page of the results you would like to view. Defaults to page 1 if no page is specified. | [optional] |
| **recordsPerAge** | **String**| The supported range is from 10 to 1000. If the records_per_page parameter is not specified or is outside this range, a default of 25 records per page will be used. | [optional] |

### Return type

[**GoalsResponseBody**](GoalsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidGoalsGoalGuidDelete"></a>
# **usersUserGuidGoalsGoalGuidDelete**
> usersUserGuidGoalsGoalGuidDelete(goalGuid, userGuid)

Delete a goal

Delete a goal.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.GoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    GoalsApi apiInstance = new GoalsApi(defaultClient);
    String goalGuid = "goalGuid_example"; // String | The unique identifier for a goal. Defined by MX.
    String userGuid = "userGuid_example"; // String | The unique identifier for a user.
    try {
      apiInstance.usersUserGuidGoalsGoalGuidDelete(goalGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#usersUserGuidGoalsGoalGuidDelete");
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
| **goalGuid** | **String**| The unique identifier for a goal. Defined by MX. | |
| **userGuid** | **String**| The unique identifier for a user. | |

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

<a id="usersUserGuidGoalsGoalGuidGet"></a>
# **usersUserGuidGoalsGoalGuidGet**
> GoalResponseBody usersUserGuidGoalsGoalGuidGet(goalGuid, userGuid)

Read a goal

Read a specific goal.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.GoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    GoalsApi apiInstance = new GoalsApi(defaultClient);
    String goalGuid = "goalGuid_example"; // String | The unique identifier for a goal. Defined by MX.
    String userGuid = "userGuid_example"; // String | The unique identifier for a user.
    try {
      GoalResponseBody result = apiInstance.usersUserGuidGoalsGoalGuidGet(goalGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#usersUserGuidGoalsGoalGuidGet");
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
| **goalGuid** | **String**| The unique identifier for a goal. Defined by MX. | |
| **userGuid** | **String**| The unique identifier for a user. | |

### Return type

[**GoalResponseBody**](GoalResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidGoalsGoalGuidPut"></a>
# **usersUserGuidGoalsGoalGuidPut**
> GoalResponseBody usersUserGuidGoalsGoalGuidPut(goalGuid, userGuid, updateGoalRequestBody)

Update a goal

This endpoint updates a specific goal.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.GoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    GoalsApi apiInstance = new GoalsApi(defaultClient);
    String goalGuid = "goalGuid_example"; // String | The unique identifier for a goal. Defined by MX.
    String userGuid = "userGuid_example"; // String | The unique identifier for a user.
    UpdateGoalRequestBody updateGoalRequestBody = new UpdateGoalRequestBody(); // UpdateGoalRequestBody | 
    try {
      GoalResponseBody result = apiInstance.usersUserGuidGoalsGoalGuidPut(goalGuid, userGuid, updateGoalRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#usersUserGuidGoalsGoalGuidPut");
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
| **goalGuid** | **String**| The unique identifier for a goal. Defined by MX. | |
| **userGuid** | **String**| The unique identifier for a user. | |
| **updateGoalRequestBody** | [**UpdateGoalRequestBody**](UpdateGoalRequestBody.md)|  | |

### Return type

[**GoalResponseBody**](GoalResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidGoalsPost"></a>
# **usersUserGuidGoalsPost**
> GoalResponseBody usersUserGuidGoalsPost(userGuid, goalRequestBody)

Create a goal

Create a goal. This endpoint accepts the optional &#x60;MX-Skip-Webhook&#x60; header and &#x60;skip_webhook&#x60; parameter.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.GoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    GoalsApi apiInstance = new GoalsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user.
    GoalRequestBody goalRequestBody = new GoalRequestBody(); // GoalRequestBody | 
    try {
      GoalResponseBody result = apiInstance.usersUserGuidGoalsPost(userGuid, goalRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#usersUserGuidGoalsPost");
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
| **userGuid** | **String**| The unique identifier for the user. | |
| **goalRequestBody** | [**GoalRequestBody**](GoalRequestBody.md)|  | |

### Return type

[**GoalResponseBody**](GoalResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="usersUserGuidGoalsRepositionPut"></a>
# **usersUserGuidGoalsRepositionPut**
> RepositionResponseBody usersUserGuidGoalsRepositionPut(userGuid, repositionRequestBody)

Reposition goals

This endpoint repositions goal priority levels. If one goal is set to a lower priority, then any other goals need to be adjusted accordingly.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.GoalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    GoalsApi apiInstance = new GoalsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user.
    RepositionRequestBody repositionRequestBody = new RepositionRequestBody(); // RepositionRequestBody | 
    try {
      RepositionResponseBody result = apiInstance.usersUserGuidGoalsRepositionPut(userGuid, repositionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GoalsApi#usersUserGuidGoalsRepositionPut");
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
| **userGuid** | **String**| The unique identifier for the user. | |
| **repositionRequestBody** | [**RepositionRequestBody**](RepositionRequestBody.md)|  | |

### Return type

[**RepositionResponseBody**](RepositionResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

