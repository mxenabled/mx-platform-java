# TransactionsApi

All URIs are relative to *https://int-api.mx.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createManualTransaction**](TransactionsApi.md#createManualTransaction) | **POST** /users/{user_guid}/accounts/{account_guid}/transactions | Create manual transaction |
| [**createSplitTransactions**](TransactionsApi.md#createSplitTransactions) | **POST** /users/{user_guid}/transactions/{transaction_guid}/split | Create split transactions |
| [**deleteManualTransactions**](TransactionsApi.md#deleteManualTransactions) | **DELETE** /users/{user_guid}/transactions/{transaction_guid} | Delete manual transactions |
| [**deleteSplitTransactions**](TransactionsApi.md#deleteSplitTransactions) | **DELETE** /users/{user_guid}/transactions/{transaction_guid}/split | Delete split transactions |
| [**deleteTransactionRule**](TransactionsApi.md#deleteTransactionRule) | **DELETE** /users/{user_guid}/transaction_rules/{transaction_rule_guid} | Delete transaction rule |
| [**enhanceTransactions**](TransactionsApi.md#enhanceTransactions) | **POST** /transactions/enhance | Enhance transactions |
| [**extendHistory**](TransactionsApi.md#extendHistory) | **POST** /users/{user_guid}/members/{member_guid}/extend_history | Extend history |
| [**listTransactions**](TransactionsApi.md#listTransactions) | **GET** /users/{user_guid}/transactions | List transactions |
| [**listTransactionsByAccount**](TransactionsApi.md#listTransactionsByAccount) | **GET** /users/{user_guid}/accounts/{account_guid}/transactions | List transactions by account |
| [**listTransactionsByMember**](TransactionsApi.md#listTransactionsByMember) | **GET** /users/{user_guid}/members/{member_guid}/transactions | List transactions by member |
| [**listTransactionsByTag**](TransactionsApi.md#listTransactionsByTag) | **GET** /users/{user_guid}/tags/{tag_guid}/transactions | List transactions by tag |
| [**readTransaction**](TransactionsApi.md#readTransaction) | **GET** /users/{user_guid}/transactions/{transaction_guid} | Read transaction |
| [**repeatingTransactions**](TransactionsApi.md#repeatingTransactions) | **GET** /users/{user_guid}/repeating_transactions | List Repeating Transactions |
| [**specificRepeatingTransaction**](TransactionsApi.md#specificRepeatingTransaction) | **GET** /users/{user_guid}/repeating_transactions/{repeating_transaction_guid} | Get a Repeating Transaction |
| [**updateTransaction**](TransactionsApi.md#updateTransaction) | **PUT** /users/{user_guid}/transactions/{transaction_guid} | Update transaction |
| [**updateTransactionByAccount**](TransactionsApi.md#updateTransactionByAccount) | **PUT** /users/{user_guid}/members/{member_guid}/accounts/{account_guid}/transactions/{transaction_guid} | Update Transaction by Account |


<a id="createManualTransaction"></a>
# **createManualTransaction**
> TransactionCreateResponseBody createManualTransaction(userGuid, accountGuid, transactionCreateRequestBody)

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    TransactionCreateRequestBody transactionCreateRequestBody = new TransactionCreateRequestBody(); // TransactionCreateRequestBody | 
    try {
      TransactionCreateResponseBody result = apiInstance.createManualTransaction(userGuid, accountGuid, transactionCreateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createManualTransaction");
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

<a id="createSplitTransactions"></a>
# **createSplitTransactions**
> SplitTransactionsResponseBody createSplitTransactions(transactionGuid, userGuid, splitTransactionRequestBody)

Create split transactions

This endpoint creates two or more child transactions that are branched from a previous transaction. This endpoint allows you to link multiple categories, descriptions, and amounts to a parent transaction.  When a split transaction is created, the parent transaction&#39;s &#x60;has_been_split&#x60; field will automatically be updated to true and the child transactions&#39; &#x60;parent_guid&#x60; will have the transaction guid of the parent. The total amount of the child transactions must equal the amount of the parent transaction. Once a transaction has been split it can&#39;t be split again.    In order to re-split a transaction, it must first be un-split. This can be done by calling the Delete Split Transactions endpoint. Calling this endpoint will delete the existing child transactions and update the parent transaction&#39;s &#x60;has_been_split&#x60; field to false. You can then re-split the parent transaction by calling Create Split Transaction again. 

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    SplitTransactionRequestBody splitTransactionRequestBody = new SplitTransactionRequestBody(); // SplitTransactionRequestBody | 
    try {
      SplitTransactionsResponseBody result = apiInstance.createSplitTransactions(transactionGuid, userGuid, splitTransactionRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#createSplitTransactions");
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
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **splitTransactionRequestBody** | [**SplitTransactionRequestBody**](SplitTransactionRequestBody.md)|  | [optional] |

### Return type

[**SplitTransactionsResponseBody**](SplitTransactionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="deleteManualTransactions"></a>
# **deleteManualTransactions**
> deleteManualTransactions(userGuid, transactionGuid)

Delete manual transactions

Delete a manual transaction. In the path, use the manual transaction guid as the &#x60;transaction_guid&#x60;, such as &#x60;MAN-810828b0-5210-4878-9bd3-f4ce514f90c4&#x60;.

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    try {
      apiInstance.deleteManualTransactions(userGuid, transactionGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#deleteManualTransactions");
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
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |

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

<a id="deleteSplitTransactions"></a>
# **deleteSplitTransactions**
> deleteSplitTransactions(transactionGuid, userGuid)

Delete split transactions

This endpoint deletes all split transactions linked to a parent transaction, but it leaves the parent transaction active. This request will also update the parent transaction&#39;s has_been_split field to false. This endpoint accepts the optional MX-Skip-Webhook header.

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      apiInstance.deleteSplitTransactions(transactionGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#deleteSplitTransactions");
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
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
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
| **204** | No content |  -  |

<a id="deleteTransactionRule"></a>
# **deleteTransactionRule**
> deleteTransactionRule(transactionRuleGuid, userGuid)

Delete transaction rule

Use this endpoint to permanently delete a transaction rule based on its unique GUID.

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String transactionRuleGuid = "TXR-a080e0f9-a2d4-4d6f-9e03-672cc357a4d3"; // String | The unique id for a `transaction_rule`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      apiInstance.deleteTransactionRule(transactionRuleGuid, userGuid);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#deleteTransactionRule");
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
| **transactionRuleGuid** | **String**| The unique id for a &#x60;transaction_rule&#x60;. | |
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

<a id="enhanceTransactions"></a>
# **enhanceTransactions**
> EnhanceTransactionsResponseBody enhanceTransactions(enhanceTransactionsRequestBody)

Enhance transactions

Use this endpoint to categorize, cleanse, and classify transactions. These transactions are not persisted or stored on the MX platform. &lt;br /&gt;&lt;br /&gt;For more information on returned data, please see the [Enhanced Transactions fields guide](/api-reference/platform-api/reference/transactions-overview#enhanced-transactions).

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    EnhanceTransactionsRequestBody enhanceTransactionsRequestBody = new EnhanceTransactionsRequestBody(); // EnhanceTransactionsRequestBody | Transaction object to be enhanced
    try {
      EnhanceTransactionsResponseBody result = apiInstance.enhanceTransactions(enhanceTransactionsRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#enhanceTransactions");
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
| **enhanceTransactionsRequestBody** | [**EnhanceTransactionsRequestBody**](EnhanceTransactionsRequestBody.md)| Transaction object to be enhanced | |

### Return type

[**EnhanceTransactionsResponseBody**](EnhanceTransactionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="extendHistory"></a>
# **extendHistory**
> MemberResponseBody extendHistory(memberGuid, userGuid)

Extend history

Some institutions allow developers to access an extended transaction history with up to 24 months of data associated with a particular member. The process for fetching and then reading this extended transaction history is much like standard aggregation, and it may trigger multi-factor authentication.

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      MemberResponseBody result = apiInstance.extendHistory(memberGuid, userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#extendHistory");
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
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |

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
| **202** | Accepted |  -  |

<a id="listTransactions"></a>
# **listTransactions**
> TransactionsResponseBodyIncludes listTransactions(userGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, useCase, includes)

List transactions

Requests to this endpoint return a list of transactions associated with the specified &#x60;user&#x60;, across all members and accounts associated with that &#x60;user&#x60;. &lt;br /&gt;&lt;br /&gt;Enhanced transaction data may be requested using the &#x60;includes&#x60; parameter. To use this optional parameter, the value should include the optional metadata requested such as &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. For more information, see the [Optional Enhancement Query Parameter guide](/api-reference/platform-api/reference/transactions-overview#enhanced-transactions#optional-enhancement-query-parameter).

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    String fromDate = "2024-01-01"; // String | Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided.
    String toDate = "2024-03-31"; // String | Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions.
    String fromCreatedAt = "2024-01-01"; // String | Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toCreatedAt = "2024-03-31"; // String | Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String fromUpdatedAt = "2024-01-01"; // String | Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toUpdatedAt = "2024-03-31"; // String | Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String categoryGuid = "categoryGuid_example"; // String | Filter transactions belonging to specified `category_guid`.  For example, `?category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> categoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `category_guid[]` in url.  For example, `?category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String topLevelCategoryGuid = "topLevelCategoryGuid_example"; // String | Filter transactions belonging to specified `top_level_category_guid`. This must be top level category guid, use `category_guid` for subcategory guid.  For example, `?top_level_category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> topLevelCategoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `top_level_category_guid[]` in url. This must be top level category guid(s), use `category_guid` for subcategory guid(s).  For example, `?top_level_category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String useCase = "MONEY_MOVEMENT"; // String | The use case associated with the member. Valid values are `PFM` and `MONEY_MOVEMENT`. For example, you can append either `?use_case=PFM` or `?use_case=MONEY_MOVEMENT`.
    String includes = "repeating_transactions,merchants,classifications,geolocations"; // String | Options for enhanced transactions. This query parameter is optional. Possible additional metadata: `repeating_transactions`, `merchants`, `classifications`, `geolocations`. The query value is format sensitive. To retrieve all available enhancements, append:  `?includes=repeating_transactions,merchants,classifications,geolocations`.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   `?includes=repeating_transactions,geolocations`.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata. 
    try {
      TransactionsResponseBodyIncludes result = apiInstance.listTransactions(userGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, useCase, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactions");
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
| **fromDate** | **String**| Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided. | [optional] |
| **toDate** | **String**| Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions. | [optional] |
| **fromCreatedAt** | **String**| Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toCreatedAt** | **String**| Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **fromUpdatedAt** | **String**| Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toUpdatedAt** | **String**| Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **categoryGuid** | **String**| Filter transactions belonging to specified &#x60;category_guid&#x60;.  For example, &#x60;?category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **categoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;category_guid[]&#x60; in url.  For example, &#x60;?category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid** | **String**| Filter transactions belonging to specified &#x60;top_level_category_guid&#x60;. This must be top level category guid, use &#x60;category_guid&#x60; for subcategory guid.  For example, &#x60;?top_level_category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;top_level_category_guid[]&#x60; in url. This must be top level category guid(s), use &#x60;category_guid&#x60; for subcategory guid(s).  For example, &#x60;?top_level_category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **useCase** | **String**| The use case associated with the member. Valid values are &#x60;PFM&#x60; and &#x60;MONEY_MOVEMENT&#x60;. For example, you can append either &#x60;?use_case&#x3D;PFM&#x60; or &#x60;?use_case&#x3D;MONEY_MOVEMENT&#x60;. | [optional] |
| **includes** | **String**| Options for enhanced transactions. This query parameter is optional. Possible additional metadata: &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. The query value is format sensitive. To retrieve all available enhancements, append:  &#x60;?includes&#x3D;repeating_transactions,merchants,classifications,geolocations&#x60;.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   &#x60;?includes&#x3D;repeating_transactions,geolocations&#x60;.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata.  | [optional] |

### Return type

[**TransactionsResponseBodyIncludes**](TransactionsResponseBodyIncludes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTransactionsByAccount"></a>
# **listTransactionsByAccount**
> TransactionsResponseBodyIncludes listTransactionsByAccount(accountGuid, userGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, includes)

List transactions by account

Requests to this endpoint return a list of transactions associated with the specified account. &lt;br /&gt;&lt;br /&gt;Enhanced transaction data may be requested using the &#x60;includes&#x60; parameter.  To use this optional parameter, the value should include the optional metadata requested such as &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. For more information, see the [Optional Enhancement Query Parameter guide](/api-reference/platform-api/reference/transactions-overview#enhanced-transactions#optional-enhancement-query-parameter). 

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    String fromDate = "2024-01-01"; // String | Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided.
    String toDate = "2024-03-31"; // String | Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions.
    String fromCreatedAt = "2024-01-01"; // String | Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toCreatedAt = "2024-03-31"; // String | Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String fromUpdatedAt = "2024-01-01"; // String | Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toUpdatedAt = "2024-03-31"; // String | Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String categoryGuid = "categoryGuid_example"; // String | Filter transactions belonging to specified `category_guid`.  For example, `?category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> categoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `category_guid[]` in url.  For example, `?category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String topLevelCategoryGuid = "topLevelCategoryGuid_example"; // String | Filter transactions belonging to specified `top_level_category_guid`. This must be top level category guid, use `category_guid` for subcategory guid.  For example, `?top_level_category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> topLevelCategoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `top_level_category_guid[]` in url. This must be top level category guid(s), use `category_guid` for subcategory guid(s).  For example, `?top_level_category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String includes = "repeating_transactions,merchants,classifications,geolocations"; // String | Options for enhanced transactions. This query parameter is optional. Possible additional metadata: `repeating_transactions`, `merchants`, `classifications`, `geolocations`. The query value is format sensitive. To retrieve all available enhancements, append:  `?includes=repeating_transactions,merchants,classifications,geolocations`.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   `?includes=repeating_transactions,geolocations`.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata. 
    try {
      TransactionsResponseBodyIncludes result = apiInstance.listTransactionsByAccount(accountGuid, userGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactionsByAccount");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |
| **fromDate** | **String**| Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided. | [optional] |
| **toDate** | **String**| Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions. | [optional] |
| **fromCreatedAt** | **String**| Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toCreatedAt** | **String**| Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **fromUpdatedAt** | **String**| Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toUpdatedAt** | **String**| Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **categoryGuid** | **String**| Filter transactions belonging to specified &#x60;category_guid&#x60;.  For example, &#x60;?category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **categoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;category_guid[]&#x60; in url.  For example, &#x60;?category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid** | **String**| Filter transactions belonging to specified &#x60;top_level_category_guid&#x60;. This must be top level category guid, use &#x60;category_guid&#x60; for subcategory guid.  For example, &#x60;?top_level_category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;top_level_category_guid[]&#x60; in url. This must be top level category guid(s), use &#x60;category_guid&#x60; for subcategory guid(s).  For example, &#x60;?top_level_category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **includes** | **String**| Options for enhanced transactions. This query parameter is optional. Possible additional metadata: &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. The query value is format sensitive. To retrieve all available enhancements, append:  &#x60;?includes&#x3D;repeating_transactions,merchants,classifications,geolocations&#x60;.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   &#x60;?includes&#x3D;repeating_transactions,geolocations&#x60;.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata.  | [optional] |

### Return type

[**TransactionsResponseBodyIncludes**](TransactionsResponseBodyIncludes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTransactionsByMember"></a>
# **listTransactionsByMember**
> TransactionsResponseBodyIncludes listTransactionsByMember(memberGuid, userGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, includes)

List transactions by member

Requests to this endpoint return a list of transactions associated with the specified &#x60;member&#x60;, across all accounts associated with that &#x60;member&#x60;. &lt;br /&gt;&lt;br /&gt;Enhanced transaction data may be requested using the &#x60;includes&#x60; parameter. To use this optional parameter, the value should include the optional metadata requested such as &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. For more information, see the [Optional Enhancement Query Parameter guide](/api-reference/platform-api/reference/transactions-overview#enhanced-transactions#optional-enhancement-query-parameter).

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    String fromDate = "2024-01-01"; // String | Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided.
    String toDate = "2024-03-31"; // String | Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions.
    String fromCreatedAt = "2024-01-01"; // String | Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toCreatedAt = "2024-03-31"; // String | Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String fromUpdatedAt = "2024-01-01"; // String | Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toUpdatedAt = "2024-03-31"; // String | Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String categoryGuid = "categoryGuid_example"; // String | Filter transactions belonging to specified `category_guid`.  For example, `?category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> categoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `category_guid[]` in url.  For example, `?category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String topLevelCategoryGuid = "topLevelCategoryGuid_example"; // String | Filter transactions belonging to specified `top_level_category_guid`. This must be top level category guid, use `category_guid` for subcategory guid.  For example, `?top_level_category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> topLevelCategoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `top_level_category_guid[]` in url. This must be top level category guid(s), use `category_guid` for subcategory guid(s).  For example, `?top_level_category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String includes = "repeating_transactions,merchants,classifications,geolocations"; // String | Options for enhanced transactions. This query parameter is optional. Possible additional metadata: `repeating_transactions`, `merchants`, `classifications`, `geolocations`. The query value is format sensitive. To retrieve all available enhancements, append:  `?includes=repeating_transactions,merchants,classifications,geolocations`.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   `?includes=repeating_transactions,geolocations`.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata. 
    try {
      TransactionsResponseBodyIncludes result = apiInstance.listTransactionsByMember(memberGuid, userGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactionsByMember");
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
| **memberGuid** | **String**| The unique id for a &#x60;member&#x60;. | |
| **userGuid** | **String**| The unique identifier for a &#x60;user&#x60;, beginning with the prefix &#x60;USR-&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |
| **fromDate** | **String**| Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided. | [optional] |
| **toDate** | **String**| Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions. | [optional] |
| **fromCreatedAt** | **String**| Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toCreatedAt** | **String**| Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **fromUpdatedAt** | **String**| Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toUpdatedAt** | **String**| Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **categoryGuid** | **String**| Filter transactions belonging to specified &#x60;category_guid&#x60;.  For example, &#x60;?category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **categoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;category_guid[]&#x60; in url.  For example, &#x60;?category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid** | **String**| Filter transactions belonging to specified &#x60;top_level_category_guid&#x60;. This must be top level category guid, use &#x60;category_guid&#x60; for subcategory guid.  For example, &#x60;?top_level_category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;top_level_category_guid[]&#x60; in url. This must be top level category guid(s), use &#x60;category_guid&#x60; for subcategory guid(s).  For example, &#x60;?top_level_category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **includes** | **String**| Options for enhanced transactions. This query parameter is optional. Possible additional metadata: &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. The query value is format sensitive. To retrieve all available enhancements, append:  &#x60;?includes&#x3D;repeating_transactions,merchants,classifications,geolocations&#x60;.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   &#x60;?includes&#x3D;repeating_transactions,geolocations&#x60;.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata.  | [optional] |

### Return type

[**TransactionsResponseBodyIncludes**](TransactionsResponseBodyIncludes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="listTransactionsByTag"></a>
# **listTransactionsByTag**
> TransactionsResponseBodyIncludes listTransactionsByTag(userGuid, tagGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, useCase, includes)

List transactions by tag

Use this endpoint to get a list of all transactions associated with a particular tag according to the tag&#39;s unique GUID. This lists all transactions that have been assigned to a particular tag using the create tagging endpoint. &lt;br /&gt;&lt;br /&gt;Enhanced transaction data may be requested using the &#x60;includes&#x60; parameter. To use this optional parameter, the value should include the optional metadata requested such as &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. For more information, see the [Optional Enhancement Query Parameter guide](/api-reference/platform-api/reference/transactions-overview#enhanced-transactions#optional-enhancement-query-parameter).

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String tagGuid = "TAG-aef36e72-6294-4c38-844d-e573e80aed52"; // String | The unique id for a `tag`.
    Integer page = 1; // Integer | Results are paginated. Specify current page.
    Integer recordsPerPage = 10; // Integer | This specifies the number of records to be returned on each page. Defaults to `25`. The valid range is from `10` to `1000`. If the value exceeds `1000`, the default value of `25` will be used instead.
    String fromDate = "2024-01-01"; // String | Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided.
    String toDate = "2024-03-31"; // String | Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions.
    String fromCreatedAt = "2024-01-01"; // String | Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toCreatedAt = "2024-03-31"; // String | Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String fromUpdatedAt = "2024-01-01"; // String | Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String toUpdatedAt = "2024-03-31"; // String | Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months.
    String categoryGuid = "categoryGuid_example"; // String | Filter transactions belonging to specified `category_guid`.  For example, `?category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> categoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `category_guid[]` in url.  For example, `?category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String topLevelCategoryGuid = "topLevelCategoryGuid_example"; // String | Filter transactions belonging to specified `top_level_category_guid`. This must be top level category guid, use `category_guid` for subcategory guid.  For example, `?top_level_category_guid=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    List<String> topLevelCategoryGuid2 = Arrays.asList(); // List<String> | Filter transactions belonging to any specified `top_level_category_guid[]` in url. This must be top level category guid(s), use `category_guid` for subcategory guid(s).  For example, `?top_level_category_guid[]=CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874`.
    String useCase = "MONEY_MOVEMENT"; // String | The use case associated with the member. Valid values are `PFM` and `MONEY_MOVEMENT`. For example, you can append either `?use_case=PFM` or `?use_case=MONEY_MOVEMENT`.
    String includes = "repeating_transactions,merchants,classifications,geolocations"; // String | Options for enhanced transactions. This query parameter is optional. Possible additional metadata: `repeating_transactions`, `merchants`, `classifications`, `geolocations`. The query value is format sensitive. To retrieve all available enhancements, append:  `?includes=repeating_transactions,merchants,classifications,geolocations`.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   `?includes=repeating_transactions,geolocations`.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata. 
    try {
      TransactionsResponseBodyIncludes result = apiInstance.listTransactionsByTag(userGuid, tagGuid, page, recordsPerPage, fromDate, toDate, fromCreatedAt, toCreatedAt, fromUpdatedAt, toUpdatedAt, categoryGuid, categoryGuid2, topLevelCategoryGuid, topLevelCategoryGuid2, useCase, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listTransactionsByTag");
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
| **tagGuid** | **String**| The unique id for a &#x60;tag&#x60;. | |
| **page** | **Integer**| Results are paginated. Specify current page. | [optional] |
| **recordsPerPage** | **Integer**| This specifies the number of records to be returned on each page. Defaults to &#x60;25&#x60;. The valid range is from &#x60;10&#x60; to &#x60;1000&#x60;. If the value exceeds &#x60;1000&#x60;, the default value of &#x60;25&#x60; will be used instead. | [optional] |
| **fromDate** | **String**| Filter transactions from this date. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 120 days ago if not provided. | [optional] |
| **toDate** | **String**| Filter transactions to this date (at midnight). This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Defaults to 5 days forward from the day the request is made to capture pending transactions. | [optional] |
| **fromCreatedAt** | **String**| Filter transactions from the date the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toCreatedAt** | **String**| Filter transaction to the date in which the transaction was created. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **fromUpdatedAt** | **String**| Filter transactions from the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **toUpdatedAt** | **String**| Filter transactions to the date in which the transaction was updated. This only supports ISO 8601 format without timestamp (YYYY-MM-DD). Maximum date range limit is 6 months. | [optional] |
| **categoryGuid** | **String**| Filter transactions belonging to specified &#x60;category_guid&#x60;.  For example, &#x60;?category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **categoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;category_guid[]&#x60; in url.  For example, &#x60;?category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid** | **String**| Filter transactions belonging to specified &#x60;top_level_category_guid&#x60;. This must be top level category guid, use &#x60;category_guid&#x60; for subcategory guid.  For example, &#x60;?top_level_category_guid&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **topLevelCategoryGuid2** | [**List&lt;String&gt;**](String.md)| Filter transactions belonging to any specified &#x60;top_level_category_guid[]&#x60; in url. This must be top level category guid(s), use &#x60;category_guid&#x60; for subcategory guid(s).  For example, &#x60;?top_level_category_guid[]&#x3D;CAT-7829f71c-2e8c-afa5-2f55-fa3634b89874&#x60;. | [optional] |
| **useCase** | **String**| The use case associated with the member. Valid values are &#x60;PFM&#x60; and &#x60;MONEY_MOVEMENT&#x60;. For example, you can append either &#x60;?use_case&#x3D;PFM&#x60; or &#x60;?use_case&#x3D;MONEY_MOVEMENT&#x60;. | [optional] |
| **includes** | **String**| Options for enhanced transactions. This query parameter is optional. Possible additional metadata: &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. The query value is format sensitive. To retrieve all available enhancements, append:  &#x60;?includes&#x3D;repeating_transactions,merchants,classifications,geolocations&#x60;.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   &#x60;?includes&#x3D;repeating_transactions,geolocations&#x60;.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata.  | [optional] |

### Return type

[**TransactionsResponseBodyIncludes**](TransactionsResponseBodyIncludes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="readTransaction"></a>
# **readTransaction**
> TransactionsResponseBodyIncludes readTransaction(userGuid, transactionGuid, includes)

Read transaction

Requests to this endpoint will return the attributes of the specified &#x60;transaction&#x60;. To read a manual transaction, use the manual transaction guid in the path as the &#x60;transactionGuid&#x60;. &lt;br /&gt;&lt;br /&gt;Enhanced transaction data may be requested using the &#x60;includes&#x60; parameter. To use this optional parameter, the value should include the optional metadata requested such as &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. For more information, see the [Optional Enhancement Query Parameter guide](/api-reference/platform-api/reference/transactions-overview#enhanced-transactions#optional-enhancement-query-parameter).

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    String includes = "repeating_transactions,merchants,classifications,geolocations"; // String | Options for enhanced transactions. This query parameter is optional. Possible additional metadata: `repeating_transactions`, `merchants`, `classifications`, `geolocations`. The query value is format sensitive. To retrieve all available enhancements, append:  `?includes=repeating_transactions,merchants,classifications,geolocations`.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   `?includes=repeating_transactions,geolocations`.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata. 
    try {
      TransactionsResponseBodyIncludes result = apiInstance.readTransaction(userGuid, transactionGuid, includes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#readTransaction");
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
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **includes** | **String**| Options for enhanced transactions. This query parameter is optional. Possible additional metadata: &#x60;repeating_transactions&#x60;, &#x60;merchants&#x60;, &#x60;classifications&#x60;, &#x60;geolocations&#x60;. The query value is format sensitive. To retrieve all available enhancements, append:  &#x60;?includes&#x3D;repeating_transactions,merchants,classifications,geolocations&#x60;.    The query options may be combined to specific enhancements. For example, to request Repeating Transactions and Geolocation data, use:   &#x60;?includes&#x3D;repeating_transactions,geolocations&#x60;.  - Repeating Transactions: Identifies transactions with predictable recurrence patterns (e.g., Bill, Income, Subscription). - Merchants: Enriches transactions with merchant name. - Classifications: Provides more insight into the type of money movement that is occurring on the transaction, whether it be retail or investments. - Geolocation: Provides geographic metadata.  | [optional] |

### Return type

[**TransactionsResponseBodyIncludes**](TransactionsResponseBodyIncludes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="repeatingTransactions"></a>
# **repeatingTransactions**
> RepeatingTransactionsResponseBody repeatingTransactions(userGuid)

List Repeating Transactions

Retrieve a list of all recurring transactions for a user. &lt;br /&gt;&lt;br /&gt;For more see the [Repeating Transactions guide](repeating-transactions-overview.mdx).

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    try {
      RepeatingTransactionsResponseBody result = apiInstance.repeatingTransactions(userGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#repeatingTransactions");
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

[**RepeatingTransactionsResponseBody**](RepeatingTransactionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="specificRepeatingTransaction"></a>
# **specificRepeatingTransaction**
> RepeatingTransactionsResponseBody specificRepeatingTransaction(userGuid, repeatingTransactionGuid)

Get a Repeating Transaction

Get a Specific Repeating Transaction. &lt;br /&gt;&lt;br /&gt;List For more see the [Repeating Transactions guide](repeating-transactions-overview.mdx)

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String repeatingTransactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a recurring transaction.
    try {
      RepeatingTransactionsResponseBody result = apiInstance.specificRepeatingTransaction(userGuid, repeatingTransactionGuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#specificRepeatingTransaction");
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
| **repeatingTransactionGuid** | **String**| The unique id for a recurring transaction. | |

### Return type

[**RepeatingTransactionsResponseBody**](RepeatingTransactionsResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTransaction"></a>
# **updateTransaction**
> TransactionResponseBody updateTransaction(userGuid, transactionGuid, transactionUpdateRequestBody)

Update transaction

Use this endpoint to update a specific transaction according to its unique GUID.

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    TransactionUpdateRequestBody transactionUpdateRequestBody = new TransactionUpdateRequestBody(); // TransactionUpdateRequestBody | Transaction object with the fields to be updated.
    try {
      TransactionResponseBody result = apiInstance.updateTransaction(userGuid, transactionGuid, transactionUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#updateTransaction");
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
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **transactionUpdateRequestBody** | [**TransactionUpdateRequestBody**](TransactionUpdateRequestBody.md)| Transaction object with the fields to be updated. | |

### Return type

[**TransactionResponseBody**](TransactionResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.mx.api.v1+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="updateTransactionByAccount"></a>
# **updateTransactionByAccount**
> TransactionResponseBody updateTransactionByAccount(userGuid, memberGuid, accountGuid, transactionGuid, transactionUpdateRequestBody)

Update Transaction by Account

Use this endpoint to update a specific transaction according to its unique GUID.

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
    defaultClient.setBasePath("https://int-api.mx.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String userGuid = "USR-fa7537f3-48aa-a683-a02a-b18940482f54"; // String | The unique identifier for a `user`, beginning with the prefix `USR-`.
    String memberGuid = "MBR-7c6f361b-e582-15b6-60c0-358f12466b4b"; // String | The unique id for a `member`.
    String accountGuid = "ACT-06d7f44b-caae-0f6e-1384-01f52e75dcb1"; // String | The unique id for an `account`.
    String transactionGuid = "TRN-810828b0-5210-4878-9bd3-f4ce514f90c4"; // String | The unique id for a `transaction`.
    TransactionUpdateRequestBody transactionUpdateRequestBody = new TransactionUpdateRequestBody(); // TransactionUpdateRequestBody | Transaction object to be updated
    try {
      TransactionResponseBody result = apiInstance.updateTransactionByAccount(userGuid, memberGuid, accountGuid, transactionGuid, transactionUpdateRequestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#updateTransactionByAccount");
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
| **accountGuid** | **String**| The unique id for an &#x60;account&#x60;. | |
| **transactionGuid** | **String**| The unique id for a &#x60;transaction&#x60;. | |
| **transactionUpdateRequestBody** | [**TransactionUpdateRequestBody**](TransactionUpdateRequestBody.md)| Transaction object to be updated | |

### Return type

[**TransactionResponseBody**](TransactionResponseBody.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

