# RewardsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**creditCard**](RewardsApi.md#creditCard) | **GET** /credit_card_products/{credit_card_product_guid} | Read a Credit Card Product |
| [**fetchRewards**](RewardsApi.md#fetchRewards) | **POST** /users/{user_guid}/members/{member_guid}/fetch_rewards | Fetch Rewards |
| [**listRewards**](RewardsApi.md#listRewards) | **GET** /users/{user_guid}/members/{member_guid}/rewards | List Rewards |
| [**readRewards**](RewardsApi.md#readRewards) | **GET** /users/{user_guid}/members/{member_guid}/rewards/{reward_guid} | Read Reward |


<a id="creditCard"></a>
# **creditCard**
> CreditCardProductResponse creditCard(creditCardProductGuid)

Read a Credit Card Product

This endpoint returns the specified &#x60;credit_card_product&#x60; according to the unique GUID.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String creditCardProductGuid = "credit_card_product_guid"; // String | The required `credit_card_product_guid` can be found on the `account` object.
    try {
      CreditCardProductResponse result = apiInstance.creditCard(creditCardProductGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#creditCard");
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
| **creditCardProductGuid** | **String**| The required &#x60;credit_card_product_guid&#x60; can be found on the &#x60;account&#x60; object. | |

### Return type

[**CreditCardProductResponse**](CreditCardProductResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="fetchRewards"></a>
# **fetchRewards**
> MemberResponseBody fetchRewards(userGuid, memberGuid)

Fetch Rewards

Calling this endpoint initiates an aggregation-type event which will gather the member&#39;s rewards information, as well as account and transaction information. Rewards data is also gathered with daily background aggregations. Member and Rewards guids are defined by MX.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    try {
      MemberResponseBody result = apiInstance.fetchRewards(userGuid, memberGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#fetchRewards");
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

[**MemberResponseBody**](MemberResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listRewards"></a>
# **listRewards**
> RewardsResponseBody listRewards(userGuid, memberGuid)

List Rewards

Use this endpoint to list all the &#x60;rewards&#x60; associated with a specified &#x60;member&#x60;. Member guids are defined by MX.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    try {
      RewardsResponseBody result = apiInstance.listRewards(userGuid, memberGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#listRewards");
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

[**RewardsResponseBody**](RewardsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readRewards"></a>
# **readRewards**
> RewardResponseBody readRewards(userGuid, memberGuid, rewardGuid)

Read Reward

Use this endpoint to read a specific &#x60;reward&#x60; based on its unique GUID. Member and Rewards guids are defined by MX.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.RewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    RewardsApi apiInstance = new RewardsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String rewardGuid = "RWD-fa7537f3-48aa-a683-a02a-b324322f54"; // String | The unique identifier for the rewards. Defined by MX.
    try {
      RewardResponseBody result = apiInstance.readRewards(userGuid, memberGuid, rewardGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RewardsApi#readRewards");
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
| **rewardGuid** | **String**| The unique identifier for the rewards. Defined by MX. | |

### Return type

[**RewardResponseBody**](RewardResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

