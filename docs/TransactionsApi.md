# TransactionsApi

All URIs are relative to *https://api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersUserGuidAccountsAccountGuidTransactionsPost**](TransactionsApi.md#usersUserGuidAccountsAccountGuidTransactionsPost) | **POST** /users/{user_guid}/accounts/{account_guid}/transactions | Create manual transaction |


<a id="usersUserGuidAccountsAccountGuidTransactionsPost"></a>
# **usersUserGuidAccountsAccountGuidTransactionsPost**
> TransactionCreateResponseBody usersUserGuidAccountsAccountGuidTransactionsPost(userGuid, accountGuid, transactionCreateRequestBody)

Create manual transaction

This endpoint can only be used to create manual transactions that are under a manual account. This endpoint accepts the optional MX-Skip-Webhook header and skip_webhook parameter.

### Example
```java
// Import classes:
import com.mx.client.ApiClient;
import com.mx.client.ApiException;
import com.mx.client.Configuration;
import com.mx.client.auth.*;
import com.mx.client.models.*;
import com.mx.client.mx_platform_api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "userGuid_example"; // String | The unique identifier for the user.
    String accountGuid = "accountGuid_example"; // String | The unique identifier for the account.
    TransactionCreateRequestBody transactionCreateRequestBody = new TransactionCreateRequestBody(); // TransactionCreateRequestBody | 
    try {
      TransactionCreateResponseBody result = apiInstance.usersUserGuidAccountsAccountGuidTransactionsPost(userGuid, accountGuid, transactionCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#usersUserGuidAccountsAccountGuidTransactionsPost");
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
| **accountGuid** | **String**| The unique identifier for the account. | |
| **transactionCreateRequestBody** | [**TransactionCreateRequestBody**](TransactionCreateRequestBody.md)|  | |

### Return type

[**TransactionCreateResponseBody**](TransactionCreateResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

